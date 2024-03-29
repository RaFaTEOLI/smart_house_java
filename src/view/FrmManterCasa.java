/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CtrManterCasa;
import control.CtrManterPessoa;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Casa;
import model.Pessoa;

public class FrmManterCasa extends javax.swing.JFrame {

    CtrManterCasa ctrManterCasa;
    CtrManterPessoa ctrManterPessoa;
    Casa casa;
    Pessoa pessoa;
    /**
     * Creates new form FrmManterCasa
     */
    public FrmManterCasa() {
        ctrManterPessoa = new CtrManterPessoa();
        ctrManterCasa = new CtrManterCasa();
        casa = new Casa();
        pessoa = new Pessoa();
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

        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelDono = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtCep = new javax.swing.JTextField();
        jCbxProprietarios = new javax.swing.JComboBox();
        jBtnIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstCasas = new javax.swing.JList();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Casas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelNome.setText("Nome: ");

        jLabelEndereco.setText("Endereço:");

        jLabelCidade.setText("Cidade:");

        jLabelCep.setText("CEP:");

        jLabelDono.setText("Proprietário:");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnderecoActionPerformed(evt);
            }
        });

        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });

        jTxtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCepActionPerformed(evt);
            }
        });

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLstCasas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLstCasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstCasasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstCasas);

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExcluirMouseClicked(evt);
            }
        });
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAlterarMouseClicked(evt);
            }
        });
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelDono)
                            .addComponent(jLabelCep))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtEndereco)
                            .addComponent(jTxtCep)
                            .addComponent(jCbxProprietarios, 0, 273, Short.MAX_VALUE)
                            .addComponent(jTxtCidade)
                            .addComponent(jTxtNome))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEndereco)
                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidade)
                            .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCep)
                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDono)
                            .addComponent(jCbxProprietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAlterar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEnderecoActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jTxtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCepActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        if (validarCampos() == 1) {
        pessoa = (Pessoa) jCbxProprietarios.getSelectedItem();
        casa = new Casa();
        // atribui valores
        casa.setNome(jTxtNome.getText());
        casa.setPessoa(pessoa);
        casa.setEndereco(jTxtEndereco.getText());
        casa.setCidade(jTxtCidade.getText());
        casa.setCep(jTxtCep.getText());
        System.out.println("LOG STATUS | Cadastrando Casa...");
        if (ctrManterCasa.gravarCasa(casa) == 1) {
            casa.setNome("");
            casa.setEndereco("");
            casa.setCidade("");
            casa.setCep("");
            JOptionPane.showMessageDialog(null, "Casa cadastrada!");
        } else {
            JOptionPane.showMessageDialog(null, "Casa não cadastrada");
        }
        }
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
        if (validarCampos() == 1) {
        //recupera a casa selecionado
        casa = (Casa) jLstCasas.getSelectedValue();
        //exclui o funcionario
        if (ctrManterCasa.excluirCasa(casa)) {
            casa.setNome("");
            casa.setEndereco("");
            casa.setCidade("");
            casa.setCep("");
            JOptionPane.showMessageDialog(this, "Casa excluida");
        } else {
            JOptionPane.showMessageDialog(this, "Casa não excluida");
        }
        }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         //inicia os atributos
        ctrManterCasa = new CtrManterCasa();
        ctrManterPessoa = new CtrManterPessoa();
        pessoa = new Pessoa();
        casa = new Casa();
        DefaultListModel listModel = new DefaultListModel();
        List listCasa = new ArrayList();
        listCasa = ctrManterCasa.carregarCasas();
        
        if (listCasa != null) {
            Iterator i = listCasa.iterator();
            while (i.hasNext()) {
                Casa casaList = (Casa) i.next();
                listModel.addElement(casaList);
            }
        }
        jLstCasas.setModel(listModel);
        
        //carrega combo de departamentos
        DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();
        List listPessoa = ctrManterPessoa.carregarPessoas();
        
        if (listPessoa != null) {
            Iterator j = listPessoa.iterator();
            while (j.hasNext()) {
                Pessoa pessoaList = (Pessoa) j.next();
                modelCombo.addElement(pessoaList);
            }
            jCbxProprietarios.setModel(modelCombo);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
        if (validarCampos() == 1) {
            
            casa = (Casa) jLstCasas.getSelectedValue();
            pessoa = (Pessoa) jCbxProprietarios.getSelectedItem();

            if (casa != null) {
                //atribui os valores
                casa.setNome(jTxtNome.getText());
                casa.setEndereco(jTxtEndereco.getText());
                casa.setCidade(jTxtCidade.getText());
                casa.setCep(jTxtCep.getText());
                casa.setPessoa(pessoa);

                //altera objeto
                if (ctrManterCasa.alterarCasa(casa)) {
                    casa.setNome("");
                    casa.setEndereco("");
                    casa.setCidade("");
                    casa.setCep("");
                    JOptionPane.showMessageDialog(this, "Casa alterada!");
                } else {
                    JOptionPane.showMessageDialog(this, "Casa não alterada!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Casa não localizada!");
            }
        }
    }//GEN-LAST:event_jBtnAlterarMouseClicked

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jLstCasasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstCasasMouseClicked
       casa = (Casa) jLstCasas.getSelectedValue();
       if (casa != null) {
            jTxtNome.setText(casa.getNome());
            jTxtEndereco.setText(casa.getEndereco());
            jTxtCidade.setText(casa.getCidade());
            jTxtCep.setText(casa.getCep());
            int count;
            for (count = 0; count < jCbxProprietarios.getModel().getSize(); count++) {
               if (((Pessoa)jCbxProprietarios.getModel().getElementAt(count)).equals(casa.getPessoa())) {
                   jCbxProprietarios.setSelectedIndex(count);
                   break;
               }
           }
       } else {
           JOptionPane.showMessageDialog(null, "Objeto não Encontrado!");
       }
    }//GEN-LAST:event_jLstCasasMouseClicked

    public int validarCampos() {
        System.out.println("LOG STATUS | Entrando no metodo de validação de campos...");
        System.out.println("LOG STATUS | jTxtNome: " + jTxtNome.getText());
        System.out.println("LOG STATUS | jTxtEndereco: " + jTxtEndereco.getText());
        System.out.println("LOG STATUS | jTxtCidade: " + jTxtCidade.getText());
        System.out.println("LOG STATUS | jTxtCep: " + jTxtCep.getText());
        if (jTxtNome.getText().isEmpty() ||  jTxtEndereco.getText().isEmpty() || jTxtCidade.getText().isEmpty() || jTxtCep.getText().isEmpty()) {
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
            java.util.logging.Logger.getLogger(FrmManterCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManterCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManterCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManterCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManterCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JComboBox jCbxProprietarios;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDono;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JList jLstCasas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
