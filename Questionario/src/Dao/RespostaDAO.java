package Dao;

import Model.RespostaM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.List;


public class RespostaDAO {
    PreparedStatement pst;
    String sql;
    
    public int salvar(RespostaM resposta)throws SQLException{
        int idResposta = 0;
        sql = "insert into resposta values(?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, 0);
        pst.setString(2, resposta.getDescricao());
        pst.setInt(3, resposta.getId_pergunta());
        pst.execute();
        ResultSet rs = pst.getGeneratedKeys();
        while(rs.next()){
            idResposta = rs.getInt(1);
        }
        pst.close();
        return idResposta;
    }
    
    static public void excluir(RespostaM resposta) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from resposta where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, resposta.getId());
        pst.execute();
        pst.close();
    }
    
    public List<RespostaM> ListaResposta()throws SQLException{
        List<RespostaM> listaRespostaM;
        listaRespostaM = new ArrayList<>();
        sql = "select * from resposta order by id";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaRespostaM.add(new RespostaM(
                                rs.getInt("id"),
                                rs.getString("descricao"),
                                rs.getInt("id_pergunta")));
        }
        pst.close();
        return listaRespostaM;
    }
    
    public List<RespostaM> ListaQuizzResposta(int idPergunta)throws SQLException{
        List<RespostaM> listaRespostaM;
        listaRespostaM = new ArrayList<>();
        sql = "select * from resposta where id_pergunta = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, idPergunta);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaRespostaM.add(new RespostaM(
                                rs.getInt("id"),
                                rs.getString("descricao"),
                                rs.getInt("id_pergunta")));
        }
        pst.close();
        return listaRespostaM;
    }
}
