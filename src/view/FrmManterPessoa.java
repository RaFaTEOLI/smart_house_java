/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CtrManterPessoa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author lab
 */
public class FrmManterPessoa extends javax.swing.JFrame {

    CtrManterPessoa ctrManterPessoa;
    Pessoa pessoa;
    /**
     * Creates new form FrmManterDepartamento
     */
    public FrmManterPessoa() {
        ctrManterPessoa = new CtrManterPessoa();
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

        jBtnIncluir = new javax.swing.JButton();
        jTxtNome = new javax.swing.JTextField();
        jTxtSobrenome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstPessoas = new javax.swing.JList();
        jBtnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pessoas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnIncluirMouseClicked(evt);
            }
        });

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jTxtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSobrenomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelSobrenome.setText("Sobrenome:");

        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });

        jLabelSenha.setText("Senha:");

        jLabelUsuario.setText("Usuário:");

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setToolTipText("");
        jBtnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExcluirMouseClicked(evt);
            }
        });

        jLstPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstPessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstPessoas);

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.setToolTipText("");
        jBtnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAlterarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSobrenome)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtUsuario)
                            .addComponent(jTxtSobrenome)
                            .addComponent(jTxtNome)
                            .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSobrenome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenha)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSobrenomeActionPerformed

    private void jBtnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIncluirMouseClicked
        if (validaCampos() == 1) {
           pessoa = new Pessoa();
           pessoa.setNome(jTxtNome.getText());
           pessoa.setSobrenome(jTxtSobrenome.getText());
           pessoa.setUsuario(jTxtUsuario.getText());
           pessoa.setSenha(jPasswordSenha.getText());
           
           if (ctrManterPessoa.gravarPessoa(pessoa) == 1) {
                jTxtNome.setText("");
                jTxtSobrenome.setText("");
                jTxtUsuario.setText("");
                jPasswordSenha.setText("");  
                JOptionPane.showMessageDialog(null, "Objeto persistido");
            } else {
                JOptionPane.showMessageDialog(null, "Objeto não persistido");
            } 
        }
        
    }//GEN-LAST:event_jBtnIncluirMouseClicked

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
        pessoa = (Pessoa) jLstPessoas.getSelectedValue();
        if (pessoa != null) {
            if (ctrManterPessoa.excluirPessoas(pessoa)) {
                jTxtNome.setText("");
                jTxtSobrenome.setText("");
                jTxtUsuario.setText("");
                jPasswordSenha.setText("");  
                JOptionPane.showMessageDialog(null, "Objeto Excluído");
            } else {
                JOptionPane.showMessageDialog(null, "Objeto não excluído");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o Objeto");
        }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void jLstPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstPessoasMouseClicked
        pessoa = (Pessoa) jLstPessoas.getSelectedValue();
         if (pessoa != null) { 
              jTxtNome.setText(pessoa.getNome());
              jTxtSobrenome.setText(pessoa.getSobrenome());
              jTxtUsuario.setText(pessoa.getUsuario());
              jPasswordSenha.setText(pessoa.getSenha());
         } else {
             JOptionPane.showMessageDialog(null, "Objeto não Encontrado!"); 
         }
    }//GEN-LAST:event_jLstPessoasMouseClicked

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
        pessoa = (Pessoa) jLstPessoas.getSelectedValue();
         if (pessoa != null) {
              jTxtNome.setText(pessoa.getNome());
              jTxtSobrenome.setText(pessoa.getSobrenome());
              jTxtUsuario.setText(pessoa.getUsuario());
              jPasswordSenha.setText(pessoa.getSenha());  
            if (ctrManterPessoa.alterarPessoa(pessoa)) {
                jTxtNome.setText("");
                jTxtSobrenome.setText("");
                jTxtUsuario.setText("");
                jPasswordSenha.setText("");  
                JOptionPane.showMessageDialog(null, "Objeto persistido");
            } else {
                JOptionPane.showMessageDialog(null, "Objeto não persistido");
            }
         } else {
             JOptionPane.showMessageDialog(null, "Objeto não localizado");
         }   
    }//GEN-LAST:event_jBtnAlterarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultListModel listModel = new DefaultListModel();
        List listPessoa = new ArrayList();
        listPessoa = ctrManterPessoa.carregarPessoas();
        if (listPessoa != null) {
            Iterator i = listPessoa.iterator();
            while (i.hasNext()) {
                Pessoa pessoaList = (Pessoa) i.next();
                listModel.addElement(pessoaList);
            }    
            jLstPessoas.setModel(listModel); 
        }  
    }//GEN-LAST:event_formWindowActivated

    public int validaCampos() {
        if (jTxtNome.getText() == null ||  jTxtSobrenome.getText() == null || jTxtUsuario.getText() == null || jPasswordSenha.getText() == null) {
            JOptionPane.showMessageDialog(null, "Favor Preencher Todos Os Campos!");
            return 2;
        } else {
            return 1;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmManterPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManterPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManterPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManterPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManterPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JList jLstPessoas;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSobrenome;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
