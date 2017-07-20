package View;

import Dao.PerguntaDAO;
import Dao.RespostaDAO;
import Model.PerguntaM;
import Model.RespostaM;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Arquivo extends javax.swing.JInternalFrame {
    PerguntaM pergunta;
    RespostaM resposta;
    PerguntaDAO perguntaDAO;
    RespostaDAO respostaDAO;
    List<RespostaM> listaResposta;
    List<PerguntaM> listaPergunta;
    public Arquivo() {
        initComponents();
        perguntaDAO = new PerguntaDAO();
        respostaDAO = new RespostaDAO();
        listaResposta = new ArrayList<RespostaM>();
        listaPergunta = new ArrayList<PerguntaM>();
        this.setVisible(true);
        atualizaTabelaResposta();
        atualizaTabelaPergunta();
        desativacamposPergunta();
        desativacamposResposta();
        desativabotao();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDPergunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoPergunta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtComentarioPergunta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRespostaPergunta = new javax.swing.JTextField();
        btnNovoP = new javax.swing.JButton();
        btnSalvarP = new javax.swing.JButton();
        btnExcluirP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPergunta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIdResposta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescricaoResposta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResposta = new javax.swing.JTable();
        btnNovoR = new javax.swing.JButton();
        btnSalvarR = new javax.swing.JButton();
        btnExcluirR = new javax.swing.JButton();
        btnCancelarR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIDPerguntaResposta = new javax.swing.JTextField();
        btnSalvarResposta = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID");

        jLabel2.setText("Pergunta");

        jLabel3.setText("Comentario");

        jLabel4.setText("Resposta");

        btnNovoP.setText("NOVO");
        btnNovoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPActionPerformed(evt);
            }
        });

        btnSalvarP.setText("SALVAR");
        btnSalvarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPActionPerformed(evt);
            }
        });

        btnExcluirP.setText("EXCLUIR");
        btnExcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPActionPerformed(evt);
            }
        });

        btnCancelarP.setText("CANCELAR");
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });

        tblPergunta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerguntaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPergunta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(txtComentarioPergunta)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRespostaPergunta)
                                .addGap(234, 234, 234)))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescricaoPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComentarioPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRespostaPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovoP)
                            .addComponent(btnSalvarP)
                            .addComponent(btnExcluirP)
                            .addComponent(btnCancelarP)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(785, 171));

        jLabel5.setText("ID");

        jLabel6.setText("Descrição");

        tblResposta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblResposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRespostaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblResposta);

        btnNovoR.setText("NOVO");
        btnNovoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoRActionPerformed(evt);
            }
        });

        btnSalvarR.setText("SALVAR");
        btnSalvarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarRActionPerformed(evt);
            }
        });

        btnExcluirR.setText("EXCLUIR");
        btnExcluirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRActionPerformed(evt);
            }
        });

        btnCancelarR.setText("CANCELAR");
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Pergunta");

        btnSalvarResposta.setText("Salvar Resposta na Pergunta");
        btnSalvarResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovoR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarR))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDPerguntaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarResposta))))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtIDPerguntaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDescricaoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarResposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovoR)
                            .addComponent(btnSalvarR)
                            .addComponent(btnExcluirR)
                            .addComponent(btnCancelarR)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabelaPergunta(){
        pergunta = new PerguntaM();
        try {
                listaPergunta = perguntaDAO.ListaPergunta();
        } catch (Exception ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dados[][] = new String[listaPergunta.size()][4];
        int i = 0;
        for(PerguntaM pergunta : listaPergunta){
            dados[i][0] = String.valueOf(pergunta.getId());
            dados[i][1] = pergunta.getDescricao();
            dados[i][2] = pergunta.getComentario();
            dados[i][3] = String.valueOf(pergunta.getResposta_certa());
            i++;
        }
    String tituloColuna[] = {"ID Pergunta", "DescriÃ§Ã£o", "Comentario", "ID Resposta"};
    DefaultTableModel tabelapergunta = new DefaultTableModel();
    tabelapergunta.setDataVector(dados, tituloColuna);
    tblPergunta.setModel(new DefaultTableModel(dados,tituloColuna){
            boolean[] canEdit = new boolean[]{
                false,false,false,false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
    });
    tblPergunta.getColumnModel().getColumn(0).setPreferredWidth(30);
    tblPergunta.getColumnModel().getColumn(1).setPreferredWidth(300);
    tblPergunta.getColumnModel().getColumn(2).setPreferredWidth(100);
    tblPergunta.getColumnModel().getColumn(3).setPreferredWidth(30);
    
    DefaultTableCellRenderer Centro = new DefaultTableCellRenderer();
    Centro.setHorizontalAlignment(SwingConstants.CENTER);
    tblPergunta.getColumnModel().getColumn(0).setCellRenderer(Centro);
    tblPergunta.getColumnModel().getColumn(3).setCellRenderer(Centro);
    tblPergunta.setRowHeight(25);
    tblPergunta.updateUI();
    }

    public void atualizaTabelaResposta(){
        resposta = new RespostaM();
        try {
                listaResposta = respostaDAO.ListaResposta();
        } catch (Exception ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dados[][] = new String[listaResposta.size()][3];
        int i = 0;
        for(RespostaM resposta : listaResposta){
            dados[i][0] = String.valueOf(resposta.getId());
            dados[i][1] = resposta.getDescricao();
            dados[i][2] = String.valueOf(resposta.getId_pergunta());
            i++;
        }
    String tituloColuna[] = {"ID Resposta", "Resposta","ID Pergunta"};
    DefaultTableModel tabelaresposta = new DefaultTableModel();
    tabelaresposta.setDataVector(dados, tituloColuna);
    tblResposta.setModel(new DefaultTableModel(dados,tituloColuna){
            boolean[] canEdit = new boolean[]{
                false,false,false,false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
    });
    tblResposta.getColumnModel().getColumn(0).setPreferredWidth(30);
    tblResposta.getColumnModel().getColumn(1).setPreferredWidth(300);
    tblResposta.getColumnModel().getColumn(2).setPreferredWidth(30);
    
    DefaultTableCellRenderer Centro = new DefaultTableCellRenderer();
    Centro.setHorizontalAlignment(SwingConstants.CENTER);
    tblResposta.getColumnModel().getColumn(0).setCellRenderer(Centro);
    tblResposta.getColumnModel().getColumn(2).setCellRenderer(Centro);
    
    tblResposta.setRowHeight(25);
    tblResposta.updateUI();
    }
    
    
    private void btnNovoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPActionPerformed
        ativacamposPergunta();
        limpacamposPergunta();
        tblPergunta.setEnabled(false);
        btnNovoP.setEnabled(false);
        btnSalvarP.setEnabled(true);
        btnCancelarP.setEnabled(true);
    }//GEN-LAST:event_btnNovoPActionPerformed

    private void btnSalvarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPActionPerformed
        pergunta = new PerguntaM();
        pergunta.setDescricao(txtDescricaoPergunta.getText());
        pergunta.setComentario(txtComentarioPergunta.getText());
        try {
            txtIDPergunta.setText(String.valueOf(perguntaDAO.salvar(pergunta)));
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
            atualizaTabelaPergunta();
        } catch (Exception ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaPergunta();
        atualizaTabelaResposta();
        tblPergunta.setEnabled(true);
        desativabotao();
        btnNovoP.setEnabled(true);
        //botao novo resposta
        ativacamposResposta();
        limpacamposResposta();
        tblResposta.setEnabled(false);
        btnNovoR.setEnabled(false);
        btnSalvarR.setEnabled(true);
        btnCancelarR.setEnabled(true);
        btnSalvarResposta.setEnabled(true);
    }//GEN-LAST:event_btnSalvarPActionPerformed

    private void btnExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPActionPerformed
        if(txtIDPergunta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione uma Pergunta", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            pergunta.setId(Integer.parseInt(txtIDPergunta.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir? ");
            if(confirma ==0){
                try{
                    perguntaDAO.excluir(pergunta);
                    limpacamposPergunta();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                atualizaTabelaPergunta();
                atualizaTabelaResposta();
                desativabotao();
            }
        }
    }//GEN-LAST:event_btnExcluirPActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        desativabotao();
        limpacamposPergunta();
        desativacamposPergunta();
        tblPergunta.setEnabled(true);
        btnNovoP.setEnabled(true);
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void tblPerguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerguntaMouseClicked
        btnExcluirP.setEnabled(true);
        tblPergunta.getTableHeader().setReorderingAllowed(false);
        txtIDPerguntaResposta.setText(tblPergunta.getValueAt(tblPergunta.getSelectedRow(),0).toString());
        txtIDPergunta.setText(tblPergunta.getValueAt(tblPergunta.getSelectedRow(),0).toString());
        txtDescricaoPergunta.setText(tblPergunta.getValueAt(tblPergunta.getSelectedRow(),1).toString());
        txtComentarioPergunta.setText(tblPergunta.getValueAt(tblPergunta.getSelectedRow(),2).toString());
        txtRespostaPergunta.setText(tblPergunta.getValueAt(tblPergunta.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tblPerguntaMouseClicked

    private void tblRespostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRespostaMouseClicked
        tblResposta.getTableHeader().setReorderingAllowed(false);
        txtIdResposta.setText(tblResposta.getValueAt(tblResposta.getSelectedRow(),0).toString());
        txtDescricaoResposta.setText(tblResposta.getValueAt(tblResposta.getSelectedRow(),1).toString());
        btnCancelarR.setEnabled(true);
    }//GEN-LAST:event_tblRespostaMouseClicked

    private void btnNovoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoRActionPerformed
        ativacamposResposta();
        limpacamposResposta();
        tblResposta.setEnabled(false);
        btnNovoR.setEnabled(false);
        btnSalvarR.setEnabled(true);
        btnCancelarR.setEnabled(true);
        btnSalvarResposta.setEnabled(true);
    }//GEN-LAST:event_btnNovoRActionPerformed

    private void btnSalvarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRActionPerformed
        resposta = new RespostaM();
        resposta.setDescricao(txtDescricaoResposta.getText());
        resposta.setId_pergunta(Integer.parseInt(txtIDPerguntaResposta.getText()));
        try {
            txtIdResposta.setText(String.valueOf(respostaDAO.salvar(resposta)));
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
            atualizaTabelaResposta();
        } catch (Exception ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaPergunta();
        atualizaTabelaResposta();
        tblResposta.setEnabled(true);
        desativabotao();
        btnNovoR.setEnabled(true);
    }//GEN-LAST:event_btnSalvarRActionPerformed

    private void btnExcluirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRActionPerformed
        if(txtIdResposta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione uma Resposta", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            resposta.setId(Integer.parseInt(txtIdResposta.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir? ");
            if(confirma ==0){
                try{
                    respostaDAO.excluir(resposta);
                    limpacamposPergunta();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                atualizaTabelaResposta();
                atualizaTabelaResposta();
                desativabotao();
            }
        }
    }//GEN-LAST:event_btnExcluirRActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        desativacamposResposta();
        limpacamposResposta();
        tblPergunta.setEnabled(true);
        desativabotao();
        tblResposta.setEnabled(true);
        btnNovoR.setEnabled(true);
    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void btnSalvarRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRespostaActionPerformed
        pergunta = new PerguntaM();
        pergunta.setId(Integer.parseInt(txtIDPerguntaResposta.getText()));
        pergunta.setResposta_certa(Integer.parseInt(txtIdResposta.getText()));
        if(txtIDPerguntaResposta.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "Selecione uma pergunta!");
        }else{
            try {
                perguntaDAO.alterar( pergunta.getId(),pergunta.getResposta_certa());
                JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                atualizaTabelaPergunta();
                atualizaTabelaResposta();
            } catch (Exception ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_btnSalvarRespostaActionPerformed

    
    public void ativacamposPergunta(){
        txtDescricaoPergunta.setEnabled(true);
        txtComentarioPergunta.setEnabled(true);
    }
    
    public void desativacamposPergunta(){
        txtDescricaoPergunta.setEnabled(false);
        txtComentarioPergunta.setEnabled(false);
        txtIDPergunta.setEnabled(false);
        txtIDPerguntaResposta.setEnabled(false);
       
    }
    
    public void ativacamposResposta(){
        txtDescricaoResposta.setEnabled(true);
        btnSalvarResposta.setEnabled(true);
    }
    public void desativacamposResposta(){
        txtDescricaoResposta.setEnabled(false);
        txtIdResposta.setEnabled(false);
        txtRespostaPergunta.setEnabled(false);
        btnSalvarResposta.setEnabled(false);
    }
    
    public void limpacamposPergunta(){
        txtIDPergunta.setText("");
        txtDescricaoPergunta.setText("");
        txtComentarioPergunta.setText("");
        txtRespostaPergunta.setText("");
    }
    public void limpacamposResposta(){
        txtIdResposta.setText("");
        txtDescricaoResposta.setText("");
        txtIDPerguntaResposta.setText("");
    }
    
    public void desativabotao(){
        btnSalvarP.setEnabled(false);
        btnSalvarR.setEnabled(false);
        btnExcluirP.setEnabled(false);
        btnExcluirR.setEnabled(false);
        btnCancelarP.setEnabled(false);
        btnCancelarR.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnExcluirP;
    private javax.swing.JButton btnExcluirR;
    private javax.swing.JButton btnNovoP;
    private javax.swing.JButton btnNovoR;
    private javax.swing.JButton btnSalvarP;
    private javax.swing.JButton btnSalvarR;
    private javax.swing.JButton btnSalvarResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPergunta;
    private javax.swing.JTable tblResposta;
    private javax.swing.JTextField txtComentarioPergunta;
    private javax.swing.JTextField txtDescricaoPergunta;
    private javax.swing.JTextField txtDescricaoResposta;
    private javax.swing.JTextField txtIDPergunta;
    private javax.swing.JTextField txtIDPerguntaResposta;
    private javax.swing.JTextField txtIdResposta;
    private javax.swing.JTextField txtRespostaPergunta;
    // End of variables declaration//GEN-END:variables
}
