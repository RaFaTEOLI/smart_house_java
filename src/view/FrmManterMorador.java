/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CtrManterCasa;
import control.CtrManterMorador;
import control.CtrManterPessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Casa;
import model.Morador;
import model.Pessoa;


public class FrmManterMorador extends javax.swing.JFrame {
    
        CtrManterCasa ctrManterCasa;
        CtrManterPessoa ctrManterPessoa;
        CtrManterMorador ctrManterMorador;
        Pessoa pessoa;
        Casa casa;
        Morador morador;
        SimpleDateFormat df;
    /**
     * Creates new form FrmManterMoradores
     */
    public FrmManterMorador() {
        ctrManterPessoa = new CtrManterPessoa();
        ctrManterCasa = new CtrManterCasa();
        ctrManterMorador = new CtrManterMorador();
        casa = new Casa();
        pessoa = new Pessoa();
        morador = new Morador();
        df = new SimpleDateFormat();
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

        jLabelMorador = new javax.swing.JLabel();
        jCbxMoradores = new javax.swing.JComboBox();
        jCbxCasas = new javax.swing.JComboBox();
        jLabelCasa = new javax.swing.JLabel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jTxtDataCadastro = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstMoradores = new javax.swing.JList();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moradores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelMorador.setText("Morador:");

        jCbxCasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbxCasasMouseClicked(evt);
            }
        });
        jCbxCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxCasasActionPerformed(evt);
            }
        });

        jLabelCasa.setText("Casa:");

        jLabelDataCadastro.setText("Data Cadastro: ");

        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("##/##/####");
            mascara.setValidCharacters("0123456789");
            mascara.install(jTxtDataCadastro);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        jTxtDataCadastro.updateUI();

        jLstMoradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLstMoradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstMoradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstMoradores);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataCadastro)
                            .addComponent(jLabelCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMorador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCbxMoradores, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCbxCasas, 0, 197, Short.MAX_VALUE)
                                    .addComponent(jTxtDataCadastro))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMorador)
                    .addComponent(jCbxMoradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCasa)
                    .addComponent(jCbxCasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataCadastro)
                    .addComponent(jTxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //inicia os atributos
        
        ctrManterPessoa = new CtrManterPessoa();
        ctrManterCasa = new CtrManterCasa();
        ctrManterMorador = new CtrManterMorador();
        
        pessoa = new Pessoa();
        casa = new Casa();
        morador = new Morador();
        
        DefaultComboBoxModel modelComboCasas = new DefaultComboBoxModel();
        List listCasa = new ArrayList();
        listCasa = ctrManterCasa.carregarCasas();
        
        if (listCasa != null) {
            Iterator i = listCasa.iterator();
            while (i.hasNext()) {
                Casa casaList = (Casa) i.next();
                modelComboCasas.addElement(casaList);
            }
        }
        jCbxCasas.setModel(modelComboCasas);
        
        
        DefaultComboBoxModel modelComboMoradores = new DefaultComboBoxModel();
        List listPessoa = ctrManterPessoa.carregarPessoas();
        
        if (listPessoa != null) {
            Iterator j = listPessoa.iterator();
            while (j.hasNext()) {
                Pessoa pessoaList = (Pessoa) j.next();
                modelComboMoradores.addElement(pessoaList);
                System.out.println("LOG STATUS | Combo de Moradores: " + pessoaList);
            }
            jCbxMoradores.setModel(modelComboMoradores);
        }
        
        
        
        DefaultListModel listModelMorador = new DefaultListModel();
        List listMorador = new ArrayList();
        listMorador = ctrManterMorador.carregarMorador();
        
        if (listMorador != null) {
            Iterator i = listMorador.iterator();
            while (i.hasNext()) {
                Morador moradorList = (Morador) i.next();
                listModelMorador.addElement(moradorList);
                System.out.println("LOG STATUS | Lista de Moradores: " + moradorList);
            }
        }
        System.out.println("LOG STATUS | Lista de Moradores: " + listModelMorador);
        jLstMoradores.setModel(listModelMorador);
        
        //inicializa o formato das datas
        df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        // METODO DE CARREGAR DATA
        carregaDataAtual();   
        
    }//GEN-LAST:event_formWindowActivated

    private void jCbxCasasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbxCasasMouseClicked
      
    }//GEN-LAST:event_jCbxCasasMouseClicked

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIncluirMouseClicked
        pessoa = (Pessoa) jCbxMoradores.getSelectedItem();
        System.out.println("LOG STATUS | Pegando o ComboBox Moradores: " + jCbxMoradores.getSelectedItem());
        casa = (Casa) jCbxCasas.getSelectedItem();
        System.out.println("LOG STATUS | Pegando o ComboBox Casas: " + jCbxCasas.getSelectedItem());
        morador = new Morador();
        
        try {
            morador.setPessoaId(pessoa);
            morador.setCasaId(casa);
            System.out.println("LOG STATUS | Reformatando a data para inserir no banco de dados: " + df.parse(jTxtDataCadastro.getText()));
            morador.setDataCadastro(df.parse(jTxtDataCadastro.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FrmManterMorador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Data Incorreta!");
            return;
        }
        
        if (ctrManterMorador.gravarMorador(morador) == 1) {
            JOptionPane.showMessageDialog(this, "Morador cadastrado!");
        } else {
            JOptionPane.showMessageDialog(this, "Morador não cadastrado");
        }
    }//GEN-LAST:event_jBtnIncluirMouseClicked

    private void jCbxCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxCasasActionPerformed

    private void jLstMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstMoradoresMouseClicked
       morador = (Morador) jLstMoradores.getSelectedValue();
       if (morador != null) {
           jCbxMoradores.setSelectedItem(morador.getPessoaId());
           jCbxCasas.setSelectedItem(morador.getCasaId());
           jTxtDataCadastro.setText(df.format(morador.getDataCadastro()));
           int count;
           for (count = 0; count < jCbxMoradores.getModel().getSize(); count++) {
               if (((Morador)jCbxMoradores.getModel().getElementAt(count)).equals(morador.getMoradorId())) {
                   jCbxMoradores.setSelectedIndex(count);
                   break;
               }
           }
       } else {
           JOptionPane.showMessageDialog(null, "Morador não Encontrado!");
       }
       
    }//GEN-LAST:event_jLstMoradoresMouseClicked

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
        //recupera a casa selecionado
        morador = (Morador) jLstMoradores.getSelectedValue();
        //exclui
        if (ctrManterMorador.excluirMorador(morador)) {
                        
            JOptionPane.showMessageDialog(this, "Morador excluido!");
        } else {
            JOptionPane.showMessageDialog(this, "Morador não excluido!");
        }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
        casa = (Casa) jCbxCasas.getSelectedItem();
        pessoa = (Pessoa) jCbxMoradores.getSelectedItem();
       
      //  morador = (Morador) jTxtDataCadastro.getInstance(); 
        
        if (morador != null) {
            //atribui os valores
            
        if (ctrManterMorador.alterarMorador(morador)) {
              
                JOptionPane.showMessageDialog(this, "Morador alterado!");
            } else {
                JOptionPane.showMessageDialog(this, "Morador não persistido!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Morador não localizado!");
                 }
        
    }//GEN-LAST:event_jBtnAlterarMouseClicked

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed

    }//GEN-LAST:event_jBtnExcluirActionPerformed
        public void carregaDataAtual() {

            Calendar c = Calendar.getInstance();

            Date data = c.getTime();

            System.out.println("LOG STATUS | Data Atual Gerada: " + data);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println("LOG STATUS | Data Formatada: " + sdf.format(data));

            System.out.println("LOG STATUS | Setando Data Formatada no TextField: " + sdf.format(data));
            jTxtDataCadastro.setText(sdf.format(data));
        }

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
            java.util.logging.Logger.getLogger(FrmManterMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManterMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManterMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManterMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManterMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JComboBox jCbxCasas;
    private javax.swing.JComboBox jCbxMoradores;
    private javax.swing.JLabel jLabelCasa;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelMorador;
    private javax.swing.JList jLstMoradores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTxtDataCadastro;
    // End of variables declaration//GEN-END:variables
}
