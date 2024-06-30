
package view.estoque;

import dao.EstoqueDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.MovimentoEstoqueDao;
import dao.ProdutoDao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Estoque;
import model.MovimentoEstoque;
import model.Produto;
import view.Home;


public class ConsultaEstoqueForm extends javax.swing.JInternalFrame {
    
    private EstoqueDao estoqueDao = new EstoqueDao();
    private ProdutoDao produtoDao = new ProdutoDao();
    private MovimentoEstoque produtoSelecionado;
    private List<Produto> listaProdutos;

    public ConsultaEstoqueForm() {
        initComponents();
        carregarEstoques();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaConsultaEstoque = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        nomeFiltroProduto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkboxProdutoNegativo = new javax.swing.JCheckBox();
        comboBoxTipoEstoque = new javax.swing.JComboBox<>();
        codFiltroProduto = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Consulta Estoque");

        tabelaProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Marca", "UNI", "Qtd", "Preço(R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaProdutos.setName(""); // NOI18N
        tabelaConsultaEstoque.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(5);
            tabelaProdutos.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(15);
        }
        tabelaProdutos.getAccessibleContext().setAccessibleName("");

        btnBuscar.setBackground(new java.awt.Color(51, 255, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        nomeFiltroProduto.setEditable(false);

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Estoque");

        checkboxProdutoNegativo.setText("Não listar produtos negativos");

        codFiltroProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codFiltroProdutoKeyPressed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(0, 153, 255));
        btnOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaConsultaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkboxProdutoNegativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxTipoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(codFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTipoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGap(41, 41, 41)
                .addComponent(tabelaConsultaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(checkboxProdutoNegativo)
                    .addComponent(btnBuscar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Estoque estoque = new Estoque();
        estoque.setCodigo(comboBoxTipoEstoque.getSelectedIndex() + 1);
        estoque.setDescricao(comboBoxTipoEstoque.getSelectedItem().toString());
        
        Produto produto = new Produto();
        produto.setCodigo(Integer.parseInt(codFiltroProduto.getText()));
        produto.setDescricao(nomeFiltroProduto.getText());
        
        atualizarTabela(produto, estoque);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        limparTabela();
        checkboxProdutoNegativo.setSelected( false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        buscarProduto();
    }//GEN-LAST:event_btnOkActionPerformed

    private void codFiltroProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codFiltroProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarProduto();      
        }   
    }//GEN-LAST:event_codFiltroProdutoKeyPressed

    private void atualizarTabela(Produto produto, Estoque estoque){
        int cont = 0;
  
        listaProdutos = estoqueDao.consultarEstoque(produto, estoque);
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        model.setNumRows(0);

        for(Produto prod : listaProdutos){
            Produto produtos = listaProdutos.get(cont);
            model.addRow(new Object[]{prod.getCodigo() , prod.getDescricao(), prod.getMarca(), prod.getUnidade(), prod.getQuantidade(), prod.getValorUnitario()});

            cont++;
        }
    }
    
    private void buscarProduto(){
        
        String produto = codFiltroProduto.getText();
        List<Produto> listaProd = new ArrayList<>();
       
        listaProd = produtoDao.consultarProduto(produto);
        for(Produto prod : listaProd){
            codFiltroProduto.setText(Integer.toString(prod.getCodigo()));
            nomeFiltroProduto.setText(prod.getDescricao());
        }  
 
    }
    
    private void limparCampos(){
        nomeFiltroProduto.setText("");

    }
    
    private void limparTabela(){
        //Primeiro a condição testa se a quantidade de colunas é maior que 0, depois, limpa os dados
        if(tabelaProdutos.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
            model.setRowCount(0);
        }
    }
    
    private void carregarEstoques(){
     
        List<Estoque> listaEstoques = estoqueDao.buscarTipoEstoques();
        DefaultComboBoxModel estoqueSaida = (DefaultComboBoxModel)comboBoxTipoEstoque.getModel();

        estoqueSaida.removeAllElements();

        for(Estoque estoque : listaEstoques){
            estoqueSaida.addElement(estoque.getDescricao());
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox checkboxProdutoNegativo;
    private javax.swing.JTextField codFiltroProduto;
    private javax.swing.JComboBox<String> comboBoxTipoEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomeFiltroProduto;
    private javax.swing.JScrollPane tabelaConsultaEstoque;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables


}
