
import dao.HibernateConfiguracao;
import view.FrmLogin;
import view.FrmManterCasa;
import view.FrmManterMorador;
import view.FrmManterPessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
public class Principal extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    public Principal() {
        HibernateConfiguracao configuracao = new HibernateConfiguracao();
        configuracao.criaSessionFactory();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnExibirPessoa = new javax.swing.JButton();
        jBtnExibirCasa = new javax.swing.JButton();
        jBtnExibirLogin = new javax.swing.JButton();
        jBtnExibirMorador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart House");

        jBtnExibirPessoa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnExibirPessoa.setText("Pessoas");
        jBtnExibirPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnExibirPessoa.setFocusPainted(false);
        jBtnExibirPessoa.setFocusable(false);
        jBtnExibirPessoa.setOpaque(false);
        jBtnExibirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirPessoaActionPerformed(evt);
            }
        });

        jBtnExibirCasa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnExibirCasa.setText("Casas");
        jBtnExibirCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirCasaActionPerformed(evt);
            }
        });

        jBtnExibirLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnExibirLogin.setText("Login");
        jBtnExibirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirLoginActionPerformed(evt);
            }
        });

        jBtnExibirMorador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnExibirMorador.setText("Moradores");
        jBtnExibirMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirMoradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBtnExibirPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExibirCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExibirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnExibirMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExibirPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExibirCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExibirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExibirMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExibirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirPessoaActionPerformed
        FrmManterPessoa telaPessoa = new FrmManterPessoa();
        telaPessoa.setVisible(true);
        telaPessoa.setLocationRelativeTo(this);
    }//GEN-LAST:event_jBtnExibirPessoaActionPerformed

    private void jBtnExibirCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirCasaActionPerformed
        FrmManterCasa telaCasa = new FrmManterCasa();
        telaCasa.setVisible(true);
        telaCasa.setLocationRelativeTo(this);
    }//GEN-LAST:event_jBtnExibirCasaActionPerformed

    private void jBtnExibirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirLoginActionPerformed
        FrmLogin telaLogin = new FrmLogin();
        telaLogin.setVisible(true);
        telaLogin.hideThings();
        telaLogin.setLocationRelativeTo(this);
    }//GEN-LAST:event_jBtnExibirLoginActionPerformed

    private void jBtnExibirMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirMoradorActionPerformed
        FrmManterMorador telaMorador = new FrmManterMorador();
        telaMorador.setVisible(true);
        telaMorador.setLocationRelativeTo(this);
    }//GEN-LAST:event_jBtnExibirMoradorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        telaPrincipal.setExtendedState(MAXIMIZED_BOTH);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExibirCasa;
    private javax.swing.JButton jBtnExibirLogin;
    private javax.swing.JButton jBtnExibirMorador;
    private javax.swing.JButton jBtnExibirPessoa;
    // End of variables declaration//GEN-END:variables
}
