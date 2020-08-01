/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.CategoriaDAO;
import Model.DAO.HistoricoVendasDAO;
import Model.DAO.ProdutoDAO;
import Model.bean.Categoria;
import Model.bean.HistoricoVendas;
import Model.bean.Produto;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rayrisson
 */
public class viewHistoricoVendas extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public viewHistoricoVendas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        readTable();
        this.getContentPane().setBackground(Color.WHITE);
        jtCategorias.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtCategorias.getTableHeader().setOpaque(false);
        jtCategorias.getTableHeader().setBackground(new Color(32, 136, 203));
        jtCategorias.getTableHeader().setForeground(new Color(255, 255, 255));
        jtCategorias.setRowHeight(25);
    }
    
    
    public void readTable(){
        DefaultTableModel model = (DefaultTableModel) jtCategorias.getModel();
        jtCategorias.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        HistoricoVendasDAO hvdao = new HistoricoVendasDAO();
        for(HistoricoVendas hv : hvdao.read()){
            String data = hv.getData().replaceAll("-", "/");
            String[] DT = data.split(" ");
            String[] s = DT[0].split("/"); 
            String novaData = s[2] + "/" + s[1] + "/" + s[0] + " " + DT[1];
            model.addRow(new Object[]{
                hv.getIdVenda(),
                hv.getNomeProduto(),
                hv.getQtd(),
                hv.getPagamento(),
                novaData,//getData(),
                hv.getNomeCliente(),
                hv.getCPF(),
            });
        }
    }
    
    public void search(String nome){
        DefaultTableModel model = (DefaultTableModel) jtCategorias.getModel();
        jtCategorias.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        HistoricoVendasDAO hvdao = new HistoricoVendasDAO();
        for(HistoricoVendas hv : hvdao.search(nome)){
            model.addRow(new Object[]{
                hv.getIdVenda(),
                hv.getNomeProduto(),
                hv.getQtd(),
                hv.getPagamento(),
                hv.getData(),
                hv.getNomeCliente(),
                hv.getCPF(),
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategorias = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jtCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venda", "Produto", "Quantidade", "Forma de Pagamento", "Data/Hora", "Cliente", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCategorias.setFocusable(false);
        jtCategorias.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtCategorias.setRowHeight(25);
        jtCategorias.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtCategorias.setShowVerticalLines(false);
        jtCategorias.getTableHeader().setReorderingAllowed(false);
        jtCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCategorias);
        if (jtCategorias.getColumnModel().getColumnCount() > 0) {
            jtCategorias.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtCategorias.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtCategorias.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtCategorias.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        txtPesquisar.setText("Pesquisar");
        txtPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesquisarFocusLost(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCategoriasMouseClicked

    }//GEN-LAST:event_jtCategoriasMouseClicked

    private void txtPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisarFocusGained
        if(txtPesquisar.getText().equals("Pesquisar")){
            txtPesquisar.setText("");
        }
    }//GEN-LAST:event_txtPesquisarFocusGained

    private void txtPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisarFocusLost
        if(txtPesquisar.getText().equals("")){
            txtPesquisar.setText("Pesquisar");
        }
    }//GEN-LAST:event_txtPesquisarFocusLost

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        search(txtPesquisar.getText());
    }//GEN-LAST:event_txtPesquisarKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHistoricoVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCategorias;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}