/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CtrManterCasa;
import control.CtrManterComodo;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Casa;
import model.Comodo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;


public class FrmManterComodo extends javax.swing.JFrame {

    /**
     * Creates new form FrmManterQuarto
     */
    CtrManterCasa ctrManterCasa;
    CtrManterComodo ctrManterComodo;
    Casa casa;
    Comodo comodo;
    
    
    public FrmManterComodo() {
        ctrManterCasa = new CtrManterCasa();
        ctrManterComodo = new CtrManterComodo();
        casa = new Casa();
        comodo = new Comodo();
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

        jLabelCasa = new javax.swing.JLabel();
        jCbxCasa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstComodo = new javax.swing.JList();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jLabelQuarto = new javax.swing.JLabel();
        jLabelAndar = new javax.swing.JLabel();
        jTxtQuarto = new javax.swing.JTextField();
        jTxtAndar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cômodos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelCasa.setText("Casa :");

        jLstComodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstComodoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstComodo);

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnIncluirMouseClicked(evt);
            }
        });
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

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

        jLabelQuarto.setText("Comodo:");

        jLabelAndar.setText("Andar :");

        jTxtQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuartoActionPerformed(evt);
            }
        });

        jTxtAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAndarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuarto)
                    .addComponent(jLabelAndar)
                    .addComponent(jLabelCasa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCbxCasa, 0, 278, Short.MAX_VALUE)
                    .addComponent(jTxtAndar)
                    .addComponent(jTxtQuarto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuarto)
                    .addComponent(jTxtQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAndar)
                    .addComponent(jTxtAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCasa)
                    .addComponent(jCbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        
        
        
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        
        
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jTxtQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuartoActionPerformed
         //recupera o funcionario selecionado

    }//GEN-LAST:event_jTxtQuartoActionPerformed

    private void jTxtAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAndarActionPerformed
       
        
    }//GEN-LAST:event_jTxtAndarActionPerformed

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
        comodo = (Comodo) jLstComodo.getSelectedValue();
        
        if(ctrManterComodo.excluirComodo(comodo)){
            comodo.setNome("");
            comodo.setAndar(0);
            JOptionPane.showMessageDialog(this, "Cômodo excluido");    
        }
         else {
            JOptionPane.showMessageDialog(this, "Cômodo não excluido");
        }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void jBtnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIncluirMouseClicked
        if (validarCampos() == 1) {
            casa = (Casa) jCbxCasa.getSelectedItem();
            comodo = new Comodo();
            // atribui valores
            comodo.setNome(jTxtQuarto.getText());
            int andar = Integer.parseInt(jTxtAndar.getText());
            comodo.setAndar(andar);
            comodo.setCasaId(casa);
       
            if(ctrManterComodo.gravarComodo(comodo) == 1){
                comodo.setNome("");
                comodo.setAndar(0);
                JOptionPane.showMessageDialog(null, "Cômodo cadastrado");         
            }
            else {
                JOptionPane.showMessageDialog(null, "Cômodo não cadastrado");
            }
        }
    }//GEN-LAST:event_jBtnIncluirMouseClicked

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
        comodo = (Comodo) jLstComodo.getSelectedValue();
        casa = (Casa) jCbxCasa.getSelectedItem();
        
        if (comodo != null){
            
        comodo.setNome(jTxtQuarto.getText());
        int andar = Integer.parseInt(jTxtAndar.getText());
        comodo.setAndar(andar);
        comodo.setCasaId(casa);
        
        if(ctrManterComodo.alterarComodo(comodo)){
            System.out.println("LOG STATUS - ComodoId: " + comodo.getComodoId());
            comodo.setNome("");
            comodo.setAndar(0);
                
            JOptionPane.showMessageDialog(this, "Cômodo alterado!");
                } else {
                JOptionPane.showMessageDialog(this, "Cômodo não alterado");
                }
                  } else {
            JOptionPane.showMessageDialog(this, "Cômodo não localizado");
        }
        
    }//GEN-LAST:event_jBtnAlterarMouseClicked

    private void jLstComodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstComodoMouseClicked
     
        comodo = (Comodo) jLstComodo.getSelectedValue();
         //apresenta os dados do funcionario
        if (comodo != null) {
               jTxtQuarto.setText(comodo.getNome());
               jTxtAndar.setText(String.valueOf(comodo.getAndar()));
               int count;
               
               for(count = 0; count< jCbxCasa.getModel().getSize(); count++){
                   if (((Casa)jCbxCasa.getModel().getElementAt(count)).equals(comodo.getCasaId())){
                        jCbxCasa.setSelectedIndex(count);
                        break;
                   }
                   
               }
        } else {
           JOptionPane.showMessageDialog(null, "Cômodo não encontrado!");
        } 
                   
    }//GEN-LAST:event_jLstComodoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        ctrManterComodo = new CtrManterComodo();
        ctrManterCasa = new CtrManterCasa();
        comodo = new Comodo();
        casa = new Casa();
        DefaultListModel listModel = new DefaultListModel();
        List listQuarto = new ArrayList();
        listQuarto = ctrManterComodo.carregarComodos();
        
        if(listQuarto !=null){
            Iterator i = listQuarto.iterator();
               while (i.hasNext()) {
                    Comodo quartoList = (Comodo) i.next();
                    listModel.addElement(quartoList);
            }
        }  
        
        jLstComodo.setModel(listModel);
        
        DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();
        
        List listCasa = ctrManterCasa.carregarCasas();
        
        if (listCasa !=null){
          Iterator j = listCasa.iterator();
          while(j.hasNext()){
            Casa casaList = (Casa) j.next();
            modelCombo.addElement(casaList);
          }
        jCbxCasa.setModel(modelCombo);
        }
    }//GEN-LAST:event_formWindowActivated

    public int validarCampos() {
        System.out.println("LOG STATUS | Entrando no metodo de validação de campos...");
        System.out.println("LOG STATUS | jTxtComodo: " + jTxtQuarto.getText());
        System.out.println("LOG STATUS | jTxtAndar: " + jTxtAndar.getText());
        
        if (!isNumeric(jTxtAndar.getText())) {
            JOptionPane.showMessageDialog(null, "Valor não númerico para andar!");
        }
        
        if (jTxtQuarto.getText().isEmpty() ||  jTxtAndar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor Preencher Todos Os Campos!");
            return 2;
        } else {
            return 1;
        }
    }
    
    public static boolean isNumeric(String strNum) {
        try {
           int num = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(FrmManterComodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManterComodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManterComodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManterComodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManterComodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JComboBox jCbxCasa;
    private javax.swing.JLabel jLabelAndar;
    private javax.swing.JLabel jLabelCasa;
    private javax.swing.JLabel jLabelQuarto;
    private javax.swing.JList jLstComodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAndar;
    private javax.swing.JTextField jTxtQuarto;
    // End of variables declaration//GEN-END:variables
}
