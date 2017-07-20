package View;

import Dao.*;
import Model.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quizz extends javax.swing.JInternalFrame {
    PerguntaDAO perguntadao;
    RespostaDAO respostadao;
    List<PerguntaM> listapergunta;
    List<RespostaM> listaresposta;
    int contador = 0;

    public Quizz() throws SQLException {
        perguntadao = new PerguntaDAO();
        respostadao = new RespostaDAO();
        initComponents();
        this.setVisible(true);
        chamapergunta();
        lblFIM.setVisible(false);
        btnRecomecar.setVisible(false);
        btnavancar.setEnabled(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        Radio4 = new javax.swing.JRadioButton();
        lblCorreta = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        lblComentario1 = new javax.swing.JLabel();
        lblCorreta1 = new javax.swing.JLabel();
        lblFIM = new javax.swing.JLabel();
        btncorrigir = new javax.swing.JButton();
        btnavancar = new javax.swing.JButton();
        btnRecomecar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPergunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("Pergunta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPergunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 804, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Radio1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio1);
        Radio1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Radio1.setText("jRadioButton1");
        jPanel2.add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 690, -1));

        Radio2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio2);
        Radio2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Radio2.setText("jRadioButton2");
        jPanel2.add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 720, -1));

        Radio3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio3);
        Radio3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Radio3.setText("jRadioButton3");
        jPanel2.add(Radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 710, -1));

        Radio4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio4);
        Radio4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Radio4.setText("jRadioButton4");
        jPanel2.add(Radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 710, -1));

        lblCorreta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCorreta.setForeground(new java.awt.Color(51, 255, 51));
        lblCorreta.setText("Resposta Correta");
        jPanel2.add(lblCorreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 261, 204, 33));

        lblComentario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComentario.setText("Ajuda");
        jPanel2.add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 0, -1, -1));

        lblComentario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComentario1.setForeground(new java.awt.Color(255, 255, 255));
        lblComentario1.setText("Ajuda");
        jPanel2.add(lblComentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblCorreta1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCorreta1.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreta1.setText("-");
        jPanel2.add(lblCorreta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 261, 28, 33));

        lblFIM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFIM.setForeground(new java.awt.Color(51, 255, 51));
        lblFIM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/YouWin2.png"))); // NOI18N
        jPanel2.add(lblFIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 400, 180));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 804, -1));

        btncorrigir.setBackground(new java.awt.Color(153, 153, 216));
        btncorrigir.setText("Corrigir");
        btncorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncorrigirActionPerformed(evt);
            }
        });
        getContentPane().add(btncorrigir, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 406, 140, 50));

        btnavancar.setBackground(new java.awt.Color(161, 232, 161));
        btnavancar.setText("Avançar");
        btnavancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnavancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 406, 140, 50));

        btnRecomecar.setBackground(new java.awt.Color(255, 216, 101));
        btnRecomecar.setText("Recomeçar");
        btnRecomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomecarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecomecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 406, 140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void chamapergunta() throws SQLException{
        listapergunta = perguntadao.ListaQuizzPergunta();
        lblPergunta.setText(listapergunta.get(contador).getDescricao());
        listaresposta = respostadao.ListaQuizzResposta(listapergunta.get(contador).getId());
        Radio1.setText(listaresposta.get(0).getDescricao());
        Radio2.setText(listaresposta.get(1).getDescricao());
        Radio3.setText(listaresposta.get(2).getDescricao());
        Radio4.setText(listaresposta.get(3).getDescricao());
        lblComentario.setVisible(false);
        lblCorreta.setVisible(false);
    }
    
    private void btncorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncorrigirActionPerformed
        if(Radio1.isSelected()){
            if(listapergunta.get(contador).getResposta_certa() == listaresposta.get(0).getId()){
                lblCorreta.setVisible(true);
                btnavancar.setEnabled(true);
            }else{
                lblComentario.setVisible(true);
                lblComentario.setText("Ajuda:"+listapergunta.get(contador).getComentario());
            }
        }

        if(Radio2.isSelected()){
            if(listapergunta.get(contador).getResposta_certa() == listaresposta.get(1).getId()){
                lblCorreta.setVisible(true);
                btnavancar.setEnabled(true);
            }else{
                lblComentario.setVisible(true);
                lblComentario.setText("Ajuda:"+listapergunta.get(contador).getComentario());
            }
        }

        if(Radio3.isSelected()){
            if(listapergunta.get(contador).getResposta_certa() == listaresposta.get(2).getId()){
                lblCorreta.setVisible(true);
                btnavancar.setEnabled(true);
            }else{
                lblComentario.setVisible(true);
                lblComentario.setText("Ajuda:"+listapergunta.get(contador).getComentario());
            }
        }

        if(Radio4.isSelected()){
            if(listapergunta.get(contador).getResposta_certa() == listaresposta.get(3).getId()){
                lblCorreta.setVisible(true);
                btnavancar.setEnabled(true);
            }else{
                lblComentario.setVisible(true);
                lblComentario.setText("Ajuda:"+listapergunta.get(contador).getComentario());
            }
        }
    }//GEN-LAST:event_btncorrigirActionPerformed

    private void btnavancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavancarActionPerformed
        contador++;
        btnavancar.setEnabled(false);
        buttonGroup1.clearSelection();
        lblCorreta.setVisible(false);
        if(listapergunta.size() > contador){
            try {
                chamapergunta();
            } catch (SQLException ex) {
                Logger.getLogger(Quizz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            lblPergunta.setText("ParabÃ©ns VocÃª Finalizou Todas as QuestÃµes!!");
            btnRecomecar.setVisible(true);
            btnavancar.setVisible(false);
            btncorrigir.setVisible(false);
            Radio1.setVisible(false);
            Radio2.setVisible(false);
            Radio3.setVisible(false);
            Radio4.setVisible(false);
            lblFIM.setVisible(true);
            lblCorreta.setVisible(false);
            lblComentario.setVisible(false);

        }
    }//GEN-LAST:event_btnavancarActionPerformed

    private void btnRecomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomecarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecomecarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JRadioButton Radio4;
    private javax.swing.JButton btnRecomecar;
    private javax.swing.JButton btnavancar;
    private javax.swing.JButton btncorrigir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblComentario1;
    private javax.swing.JLabel lblCorreta;
    private javax.swing.JLabel lblCorreta1;
    private javax.swing.JLabel lblFIM;
    private javax.swing.JLabel lblPergunta;
    // End of variables declaration//GEN-END:variables
}
