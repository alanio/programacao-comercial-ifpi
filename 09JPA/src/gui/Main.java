/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.BD;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entities.Imovel;
import entities.Imovel;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author arch
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        //banco = new ImovelDAO();
        
        bd = new BD();
        
        /*try {
            bd = new BD();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/
        
        initComponents();        
        
        atualizaTabela();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopup = new javax.swing.JPopupMenu();
        menuExibir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuRemover = new javax.swing.JMenuItem();
        cadastrarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        imoveisTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        exportarMenuItem = new javax.swing.JMenuItem();
        importarMenuItem = new javax.swing.JMenuItem();
        ajudaMenu = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        menuExibir.setText("Exibir");
        menuExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExibirActionPerformed(evt);
            }
        });
        menuPopup.add(menuExibir);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        menuPopup.add(menuEditar);

        menuRemover.setText("Remover");
        menuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoverActionPerformed(evt);
            }
        });
        menuPopup.add(menuRemover);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        imoveisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Valor", "Tamanho(m²)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        imoveisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imoveisTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(imoveisTable);
        if (imoveisTable.getColumnModel().getColumnCount() > 0) {
            imoveisTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            imoveisTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            imoveisTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        arquivoMenu.setText("Arquivo");

        exportarMenuItem.setText("Exportar");
        exportarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarMenuItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(exportarMenuItem);

        importarMenuItem.setText("Importar");
        importarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarMenuItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(importarMenuItem);

        menuBar.add(arquivoMenu);

        ajudaMenu.setText("Ajuda");

        sobreMenuItem.setText("Sobre");
        sobreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuItemActionPerformed(evt);
            }
        });
        ajudaMenu.add(sobreMenuItem);

        menuBar.add(ajudaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarButton)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        this.imovel = new Imovel();
        
        ImovelForm imovelForm = new ImovelForm(this, imovel);
        imovelForm.setVisible(true);
        imovelForm.setVisible(false);
                
        if(this.imovel.getValor() != null){          
            bd.insert(imovel);
        }
        
        atualizaTabela();
    }//GEN-LAST:event_cadastrarButtonActionPerformed
     
    private void menuExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExibirActionPerformed
        int linhaSelecionada = imoveisTable.getSelectedRow();
        imovel = bd.selectAll().get(linhaSelecionada);
        ImovelForm imovelForm = new ImovelForm(this, imovel);
        imovelForm.setFields();
        imovelForm.setEditable(false);        
        imovelForm.setVisible(true);        
    }//GEN-LAST:event_menuExibirActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        int linhaSelecionada = imoveisTable.getSelectedRow();
        imovel = bd.selectAll().get(linhaSelecionada);        
        ImovelForm imovelForm = new ImovelForm(this, imovel);        
        imovelForm.setFields();        
        imovelForm.setVisible(true);
 
        bd.update(imovel);
        atualizaTabela();
    }//GEN-LAST:event_menuEditarActionPerformed

    private void menuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoverActionPerformed
        int linhaSelecionada = imoveisTable.getSelectedRow();
        imovel = bd.selectAll().get(linhaSelecionada);  
        //System.out.println(imovel.getId());
        bd.remove(imovel);
        atualizaTabela();        
    }//GEN-LAST:event_menuRemoverActionPerformed

    private void imoveisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imoveisTableMouseClicked
        if(evt.getButton()==3 && imoveisTable.getSelectedRow()!=-1){
              menuPopup.show(imoveisTable, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_imoveisTableMouseClicked

    private void exportarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarMenuItemActionPerformed
        /*try {           
            banco.exportFile();
        } catch (IOException ex) {
            System.err.println("Erro ao exportar");
        }*/
        
    }//GEN-LAST:event_exportarMenuItemActionPerformed

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "Versao 1.0", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sobreMenuItemActionPerformed

    private void importarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarMenuItemActionPerformed
        //banco.importFile();
        atualizaTabela();
    }//GEN-LAST:event_importarMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void atualizaTabela(){
        //necessario capturar e gerenciar o model da tabela
        DefaultTableModel tableModel = (DefaultTableModel) imoveisTable.getModel();
        
        // zera a tabela antes de atualiza-la
        tableModel.setNumRows(0);        

        //percorre o ArrayList e monta a tabela com os dados encontrados
        for(Imovel i : bd.selectAll()){                        
            String[] row = {
                i.getTipo(),
                String.valueOf(i.getValor()),
                String.valueOf(i.getTamanho())/*,
                i.getLocalizacao().getCidade(),
                i.getLocalizacao().getEstado(),
                i.getOcupadoStr(),
                String.valueOf(i.getId())*/
            };
            tableModel.addRow(row);     
        }
        //imoveisTable.setModel(tableModel);
    }    
    //imovel criado quando o Main eh executado e atualizado quando ImovelForm eh executado e finalizado
    private Imovel imovel;    
    private BD bd;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JMenuItem exportarMenuItem;
    private javax.swing.JTable imoveisTable;
    private javax.swing.JMenuItem importarMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExibir;
    private javax.swing.JPopupMenu menuPopup;
    private javax.swing.JMenuItem menuRemover;
    private javax.swing.JMenuItem sobreMenuItem;
    // End of variables declaration//GEN-END:variables
}
