/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.CategoriaDAO;
import Model.DAO.ProdutoDAO;
import Model.bean.Categoria;
import Model.bean.Produto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rayrisson
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        readTable();
        modelButton();
        menu();
        this.getContentPane().setBackground(Color.WHITE);
        CategoriaDAO cdao = new CategoriaDAO();
        jtProdutos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtProdutos.getTableHeader().setOpaque(false);
        jtProdutos.getTableHeader().setBackground(new Color(32, 136, 203));
        jtProdutos.getTableHeader().setForeground(new Color(255, 255, 255));
        jtProdutos.setRowHeight(25);
        for(Categoria cat : cdao.read()){
            cbCategoria.addItem(cat);
        }
        
    }
    
    public void modelButton(){
        buttonCadastrar.setContentAreaFilled(false);
        buttonCadastrar.setOpaque(true);
        buttonCadastrar.setBackground(new Color(32,136,203));
        buttonAtualizar.setContentAreaFilled(false);
        buttonAtualizar.setOpaque(true);
        buttonAtualizar.setBackground(new Color(32,136,203));
        buttonDeletar.setContentAreaFilled(false);
        buttonDeletar.setOpaque(true);
        buttonDeletar.setBackground(new Color(32,136,203));
    }
    
    public void menu(){
        ImageIcon menu1 = new ImageIcon(getClass().getResource("/Images/scan2.png"));
        menu1.setImage(menu1.getImage().getScaledInstance(40, 40, 1));
        jLabel7.setIcon(menu1);
        ImageIcon menu2 = new ImageIcon(getClass().getResource("/Images/list.png"));
        menu2.setImage(menu2.getImage().getScaledInstance(40, 40, 1));
        jLabel6.setIcon(menu2);
        ImageIcon menu3 = new ImageIcon(getClass().getResource("/Images/customer.png"));
        menu3.setImage(menu3.getImage().getScaledInstance(40, 40, 1));
        jLabel8.setIcon(menu3);
        ImageIcon menu4 = new ImageIcon(getClass().getResource("/Images/online-shopping.png"));
        menu4.setImage(menu4.getImage().getScaledInstance(40, 40, 1));
        jLabel9.setIcon(menu4);
    }
    
    public void readTable(){
        DefaultTableModel model = (DefaultTableModel) jtProdutos.getModel();
        jtProdutos.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        for(Produto prod : pdao.read()){
            model.addRow(new Object[]{
                prod.getId(),
                prod.getCodBarras(),
                prod.getNome(),
                prod.getPreco(),
                prod.getQtd(),
                prod.getCategoria()
            });
        }
    }
    
    public void search(String nome){
        DefaultTableModel model = (DefaultTableModel) jtProdutos.getModel();
        jtProdutos.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        for(Produto prod : pdao.search(nome)){
            model.addRow(new Object[]{
                prod.getId(),
                prod.getCodBarras(),
                prod.getNome(),
                prod.getPreco(),
                prod.getQtd(),
                prod.getCategoria()
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        buttonCadastrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        buttonAtualizar = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(32, 136, 203));
        jPanel1.setPreferredSize(new java.awt.Dimension(56, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(32, 136, 203));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(32, 136, 203));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(32, 136, 203));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRODUTOS");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(115, 115, 115)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código de barras", "Nome", "Preço", "Quantidade", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.setFocusable(false);
        jtProdutos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtProdutos.setRowHeight(25);
        jtProdutos.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtProdutos.setShowVerticalLines(false);
        jtProdutos.getTableHeader().setReorderingAllowed(false);
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProdutos);

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 136, 203));
        jLabel4.setText("CATEGORIA");

        buttonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrar.setText("CADASTRAR");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 136, 203));
        jLabel1.setText("NOME");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 136, 203));
        jLabel5.setText("CÓDIGO DE BARRAS");

        buttonAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAtualizar.setText("ATUALIZAR");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 136, 203));
        jLabel2.setText("PREÇO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 136, 203));
        jLabel3.setText("QUANTIDADE");

        buttonDeletar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        buttonDeletar.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setText("DELETAR");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtd))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonDeletar))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(6, 6, 6)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(6, 6, 6)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAtualizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCadastrar)
                        .addComponent(buttonDeletar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if("".equals(txtNome.getText()) || "".equals(txtPreco.getText()) || "".equals(txtQtd.getText())){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios (Nome, Quantidade, Preço)");
        }else{
            Produto produto = new Produto();
            Categoria cat = (Categoria) cbCategoria.getSelectedItem();
            ProdutoDAO dao = new ProdutoDAO();
            produto.setNome(txtNome.getText());
            produto.setPreco(Double.parseDouble(txtPreco.getText()));
            produto.setQtd(Integer.parseInt(txtQtd.getText()));
            if(!"".equals(txtCodBarras.getText())){
                produto.setCodBarras(txtCodBarras.getText());
            }
            produto.setCategoria(cat);
            dao.create(produto);
            readTable();
            txtNome.setText("");
            txtPreco.setText("");
            txtQtd.setText("");
            txtCodBarras.setText("");
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
        if(jtProdutos.getSelectedRow() > (-1)){
            int iterator = 0;
            CategoriaDAO cdao = new CategoriaDAO();
            txtNome.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),2).toString());
            txtPreco.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),3).toString());
            txtQtd.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),4).toString());
            if(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),1) != null){
                txtCodBarras.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),1).toString());
            }
            for(Categoria cat : cdao.read()){
                iterator++;
                if(cat.getNome() == null ? jtProdutos.getValueAt(jtProdutos.getSelectedRow(),5).toString() == null : cat.getNome().equals(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),5).toString())){
                    cbCategoria.setSelectedIndex(iterator - 1);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jtProdutosMouseClicked

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        if(jtProdutos.getSelectedRow() > (-1)){
            Produto produto = new Produto();
            Categoria cat = (Categoria) cbCategoria.getSelectedItem();
            ProdutoDAO dao = new ProdutoDAO();
            produto.setNome(txtNome.getText());
            produto.setPreco(Double.parseDouble(txtPreco.getText()));
            produto.setQtd(Integer.parseInt(txtQtd.getText()));
            if(!"".equals(txtCodBarras.getText())){
                produto.setCodBarras(txtCodBarras.getText());
            }
            produto.setCategoria(cat);
            produto.setId((int) jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0));
            dao.update(produto);
            readTable();
            txtNome.setText("");
            txtPreco.setText("");
            txtQtd.setText("");
            txtCodBarras.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        }
    }//GEN-LAST:event_buttonAtualizarActionPerformed

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

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        if(jtProdutos.getSelectedRow() > (-1)){
            Produto produto = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            produto.setId((int) jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0));
            dao.delete(produto);
            readTable();
            txtNome.setText("");
            txtPreco.setText("");
            txtQtd.setText("");
            txtCodBarras.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(32,156,223));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(32,136,203));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(32,136,203));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(32,156,223));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(32,136,203));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(32,156,223));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        dispose();
        viewCategoria vcat = new viewCategoria();
        vcat.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        dispose();
        viewCliente vcli = new viewCliente();
        vcli.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        dispose();
        viewVenda vbuy = new viewVenda();
        vbuy.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JComboBox<Object> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
