
package view.estoque;

import dao.EstoqueDao;
import dao.MovimentoEstoqueDao;
import dao.ProdutoDao;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Data;
import model.Entidades;
import model.Estoque;
import model.MovimentoEstoque;
import model.Produto;


public class MovimentacaoEstoqueForm extends javax.swing.JInternalFrame {
    
    private Data data = new Data();
    private EstoqueDao estoqueDao = new EstoqueDao();
    private ProdutoDao produtoDao = new ProdutoDao();
    private MovimentoEstoqueDao movimentoEstoqueDao = new MovimentoEstoqueDao();
    private Produto produtoSelecionado;
    private List<Produto> listaProdutos;
    private List<MovimentoEstoque> listaProdutosMovimento;

    public MovimentacaoEstoqueForm() {
        initComponents();
        habilitarFormulario(false);
        atualizarBotoes(true);
        carregarEstoques();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioEntradaSaida = new javax.swing.ButtonGroup();
        painelMovimentacaoEstoque = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelMovimentacao = new javax.swing.JPanel();
        observacaoMovimentacao = new javax.swing.JTextField();
        qtdProduto = new javax.swing.JSpinner();
        buscarProdutoMovimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxEstoqueEntrada = new javax.swing.JComboBox<>();
        comboBoxEstoqueSaida = new javax.swing.JComboBox<>();
        codProduto = new javax.swing.JTextField();
        descricaoProduto = new javax.swing.JTextField();
        checkBoxTransfEstoque = new javax.swing.JCheckBox();
        comboBoxMovimento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        ScrollPaneProd = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Movimentação Estoque");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(717, 680));

        painelMovimentacaoEstoque.setAutoscrolls(true);
        painelMovimentacaoEstoque.setPreferredSize(new java.awt.Dimension(705, 680));

        btnSalvar.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        panelMovimentacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Movimentação", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        qtdProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        buscarProdutoMovimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarProdutoMovimentoKeyPressed(evt);
            }
        });

        jLabel4.setText("Observação");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar Produto");

        jLabel2.setText("Estoque Destino");

        jLabel3.setText("Quantidade");

        jLabel6.setText("Estoque");

        codProduto.setEditable(false);
        codProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        descricaoProduto.setEditable(false);
        descricaoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descricaoProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        checkBoxTransfEstoque.setText("Transferência Entre Estoques");
        checkBoxTransfEstoque.setEnabled(false);

        comboBoxMovimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saída", "Entrada" }));

        jLabel1.setText("Movimento");

        javax.swing.GroupLayout panelMovimentacaoLayout = new javax.swing.GroupLayout(panelMovimentacao);
        panelMovimentacao.setLayout(panelMovimentacaoLayout);
        panelMovimentacaoLayout.setHorizontalGroup(
            panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarProdutoMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(checkBoxTransfEstoque)
                            .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(observacaoMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(comboBoxEstoqueSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(comboBoxEstoqueEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovimentacaoLayout.createSequentialGroup()
                        .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboBoxMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        panelMovimentacaoLayout.setVerticalGroup(
            panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(buscarProdutoMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, 0)
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(observacaoMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEstoqueSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMovimentacaoLayout.createSequentialGroup()
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMovimentacaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, 0)
                        .addGroup(panelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxEstoqueEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addComponent(checkBoxTransfEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSelecionar.setBackground(new java.awt.Color(0, 153, 255));
        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        tabelaProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "UNI", "Marca", "Cod Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPaneProd.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaProduto.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabelaProduto.getColumnModel().getColumn(3).setPreferredWidth(60);
            tabelaProduto.getColumnModel().getColumn(4).setPreferredWidth(90);
        }

        javax.swing.GroupLayout painelMovimentacaoEstoqueLayout = new javax.swing.GroupLayout(painelMovimentacaoEstoque);
        painelMovimentacaoEstoque.setLayout(painelMovimentacaoEstoqueLayout);
        painelMovimentacaoEstoqueLayout.setHorizontalGroup(
            painelMovimentacaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMovimentacaoEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMovimentacaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelMovimentacaoEstoqueLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(panelMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneProd, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        painelMovimentacaoEstoqueLayout.setVerticalGroup(
            painelMovimentacaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMovimentacaoEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneProd, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(painelMovimentacaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMovimentacaoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMovimentacaoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        atualizarTabela();
        atualizarBotoes(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparTabela();
        produtoSelecionado = null;
        limparFormulario();
        habilitarFormulario(false);
        atualizarBotoes(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        
        //Variável que recebe a linha da tabela de produtos
        int linhaTabelaProdutos = tabelaProduto.getSelectedRow();
        
        //Verificando se foi selecionado algum produto;
        if(linhaTabelaProdutos < 0){
            JOptionPane.showMessageDialog(null, "selecione um produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        habilitarFormulario(true);
        atualizarBotoes(false);
        
        produtoSelecionado = listaProdutos.get(linhaTabelaProdutos);
        
        String codigo = Integer.toString(produtoSelecionado.getCodigo());
        String descricao = produtoSelecionado.getDescricao();
        
        codProduto.setText(codigo);
        descricaoProduto.setText(descricao);
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void buscarProdutoMovimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarProdutoMovimentoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            atualizarBotoes(true);
        }
    }//GEN-LAST:event_buscarProdutoMovimentoKeyPressed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            atualizarBotoes(true);
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        int codigoProduto, quantidade;
        boolean tipoMovimento = true;
        String observacao = null, dataAtual = data.conversaoData();
        boolean transf = checkBoxTransfEstoque.isSelected();
 
        //Convertendo o código de produto em número inteiro
        try{
           codigoProduto = Integer.parseInt(codProduto.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Escolha um produto a ser movimentado", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        //Convertendo a quantidade em número inteiro
        try{
            quantidade = Integer.parseInt(qtdProduto.getValue().toString());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Informa a quantidade do produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Verificando se foi inserido uma observação
        try{
            observacao = observacaoMovimentacao.getText();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Informa uma observação para a movimentação", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Validando o tipo de movimento, se é entrada ou saída
        if(comboBoxMovimento.getSelectedIndex() == 0){
            tipoMovimento = false;
        }
        
 
        Produto produto = produtoSelecionado;
        Estoque estoque = (Estoque) comboBoxEstoqueSaida.getSelectedItem();
        
        MovimentoEstoque movimentacao = new MovimentoEstoque(quantidade, observacao, produto, estoque, tipoMovimento, dataAtual);
        movimentoEstoqueDao.movimentarProdutoEstoque(movimentacao);

        limparTabela();
        atualizarBotoes(true);
        habilitarFormulario(false);
        limparFormulario();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void habilitarFormulario(boolean status){
        observacaoMovimentacao.setEnabled(status);
        comboBoxEstoqueSaida.setEnabled(status);
        qtdProduto.setEnabled(status);
        qtdProduto.setValue(1);
        comboBoxMovimento.setEnabled(status);
        descricaoProduto.setEnabled(false);
        codProduto.setEnabled(false);
        comboBoxEstoqueEntrada.setEnabled(false);
    }

    private void atualizarBotoes(boolean status){
        btnCancelar.setEnabled(!status);
        btnSelecionar.setEnabled(status);
        btnSalvar.setEnabled(!status);
    }
    
    private void atualizarTabela(){
        int cont = 0;
        
        listaProdutos = produtoDao.consultarProduto(buscarProdutoMovimento.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
        model.setNumRows(0);

        for(Produto prod : listaProdutos){
            Produto produtos = listaProdutos.get(cont);
            model.addRow(new Object[] {prod.getCodigo(), prod.getDescricao(), prod.getUnidade(), prod.getMarca(), prod.getCodBarras()});

            cont++;
        }    
    }
    
    private void limparTabela(){
        //Primeiro a condição testa se a quantidade de colunas é maior que 0, depois, limpa os dados
        if(tabelaProduto.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setRowCount(0);
        }
    }
    
    private void limparFormulario(){
        codProduto.setText("");
        descricaoProduto.setText("");
        observacaoMovimentacao.setText("");
        qtdProduto.setValue(0);
        buscarProdutoMovimento.setText("");
    }
    
    private void carregarEstoques(){
    
        List<Estoque> listaEstoques = estoqueDao.buscarTipoEstoques();
        DefaultComboBoxModel estoqueSaida = (DefaultComboBoxModel)comboBoxEstoqueSaida.getModel();
        DefaultComboBoxModel estoqueEntrada = (DefaultComboBoxModel)comboBoxEstoqueEntrada.getModel();

        estoqueSaida.removeAllElements();
        estoqueEntrada.removeAllElements();

        for(Estoque estoque : listaEstoques){
            estoqueSaida.addElement(estoque);
            estoqueEntrada.addElement(estoque);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneProd;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JTextField buscarProdutoMovimento;
    private javax.swing.JCheckBox checkBoxTransfEstoque;
    private javax.swing.JTextField codProduto;
    private javax.swing.JComboBox<String> comboBoxEstoqueEntrada;
    private javax.swing.JComboBox<String> comboBoxEstoqueSaida;
    private javax.swing.JComboBox<String> comboBoxMovimento;
    private javax.swing.JTextField descricaoProduto;
    private javax.swing.ButtonGroup grupoRadioEntradaSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField observacaoMovimentacao;
    private javax.swing.JPanel painelMovimentacaoEstoque;
    private javax.swing.JPanel panelMovimentacao;
    private javax.swing.JSpinner qtdProduto;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
