package Dao;

import Model.PerguntaM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.List;


public class PerguntaDAO {
    
    public int salvar(PerguntaM pergunta)throws SQLException{
        PreparedStatement pst;
        String sql;
        int idPergunta = 0;
        sql = "insert into pergunta values(?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, 0);
        pst.setString(2, pergunta.getDescricao());
        pst.setString(3, pergunta.getComentario());
        pst.setInt(4,NULL);
        pst.execute();
        ResultSet rs = pst.getGeneratedKeys();
        while(rs.next()){
            idPergunta = rs.getInt(1);
        }
        pst.close();
    return idPergunta;
    }
    
    public void excluir(PerguntaM pergunta) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from pergunta where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, pergunta.getId());
        pst.execute();
        pst.close();
    }
    
          
    public void alterar(int idpergunta, int resposta ) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update pergunta set resposta_certa = ? where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, resposta);
        pst.setInt(2, idpergunta);
        pst.execute();
        pst.close();
    }
    
    public List<PerguntaM> ListaPergunta()throws SQLException{
        PreparedStatement pst;
        String sql;
        List<PerguntaM> listaPerguntaM;
        listaPerguntaM = new ArrayList<>();
        sql = "select * from pergunta order by id";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaPerguntaM.add(new PerguntaM(
                                rs.getInt("id"),
                                rs.getString("descricao"),
                                rs.getString("comentario"),
                                rs.getInt("resposta_certa")));
        }
        pst.close();
    return listaPerguntaM;
    }
        
    public List<PerguntaM> ListaQuizzPergunta()throws SQLException{
        PreparedStatement pst;
        String sql;
        List<PerguntaM> listaPerguntaM;
        listaPerguntaM = new ArrayList<>();
        sql = "select * from pergunta";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaPerguntaM.add(new PerguntaM(
                                rs.getInt("id"),
                                rs.getString("descricao"),
                                rs.getString("comentario"),
                                rs.getInt("resposta_certa")));
        }
        pst.close();
    return listaPerguntaM;
    }
}
