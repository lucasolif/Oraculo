
package view.vendas;

import dao.PessoasDao;
import dao.ContaCaixaDao;
import dao.EstoqueDao;
import dao.FormaPagtoDao;
import dao.ProdutoDao;
import dao.VendasDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import model.ContaCaixa;
import model.Data;
import model.Entidades;
import model.Estoque;
import model.FormaPagto;
import model.Produto;
import model.Vendas;

public class pontoVendaForm extends javax.swing.JInternalFrame {

    PessoasDao clienteDao = new PessoasDao();
    ProdutoDao produtoDao = new ProdutoDao();
    ContaCaixaDao contaCaixaDao = new ContaCaixaDao();
    FormaPagtoDao formaPagtoDao = new FormaPagtoDao();
    EstoqueDao estoqueDao = new EstoqueDao();
    VendasDao vendaDao = new VendasDao();
    private Data data = new Data();
    private boolean produtoSelecionado = false; //Variável de controle pra saber se o produto é uma alteração
    private List<Produto> listaProduto;
    private int numLinhaSelecionada; //Recebe o número da linha da tabela, que foi selecionado o produto
    
    public pontoVendaForm() {
        initComponents();
        carregarCaixa();
        carregarFormaPagto();
        carregarEstoques();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pontoVenda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codProdutoVenda = new javax.swing.JTextField();
        descricaoProdutoVenda = new javax.swing.JTextField();
        detalhesProdutos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        qtdProdutoVenda = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        precoUnProdutoVenda = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        valorTotalProduto = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        descPctProduto = new javax.swing.JFormattedTextField();
        btnAdicionarProduto = new javax.swing.JButton();
        descRealProduto = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosVendas = new javax.swing.JTable();
        dadosCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnOkClienteVenda = new javax.swing.JButton();
        codClienteVenda = new javax.swing.JTextField();
        clienteVenda = new javax.swing.JFormattedTextField();
        cpfClienteVenda = new javax.swing.JFormattedTextField();
        dadosVenda = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        formaPagtoVenda = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        caixaVenda = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        descRealTotalVenda = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        descPctTotalVenda = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        qtdParcelasPagtoVenda = new javax.swing.JSpinner();
        valorPagoVenda = new javax.swing.JFormattedTextField();
        btnConcluirVenda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mostrarDescTotalReal = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        trocoVenda = new javax.swing.JFormattedTextField();
        mostrarTotalPagar = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        estoque = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Ponto de Venda");

        jLabel1.setText("Produto");

        codProdutoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codProdutoVendaKeyPressed(evt);
            }
        });

        descricaoProdutoVenda.setBackground(new java.awt.Color(230, 230, 230));

        detalhesProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Detalhes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setText("Quantidade");

        qtdProdutoVenda.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        qtdProdutoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        qtdProdutoVenda.setValue(1);

        jLabel4.setText("Preço Unitário (R$)");

        precoUnProdutoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precoUnProdutoVendaKeyPressed(evt);
            }
        });

        jLabel5.setText("Valo Total");

        valorTotalProduto.setEditable(false);
        valorTotalProduto.setBackground(new java.awt.Color(230, 230, 230));
        valorTotalProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        valorTotalProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorTotalProdutoMouseClicked(evt);
            }
        });
        valorTotalProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorTotalProdutoKeyPressed(evt);
            }
        });

        jLabel6.setText("Desconto Produtos");

        jLabel7.setText("R$");

        jLabel8.setText("%");

        descPctProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descPctProdutoKeyPressed(evt);
            }
        });

        btnAdicionarProduto.setBackground(new java.awt.Color(204, 204, 204));
        btnAdicionarProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        descRealProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descRealProdutoKeyPressed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 153, 255));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detalhesProdutosLayout = new javax.swing.GroupLayout(detalhesProdutos);
        detalhesProdutos.setLayout(detalhesProdutosLayout);
        detalhesProdutosLayout.setHorizontalGroup(
            detalhesProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesProdutosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(detalhesProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorTotalProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(qtdProdutoVenda)
                    .addComponent(jLabel4)
                    .addComponent(precoUnProdutoVenda)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(detalhesProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descRealProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descPctProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        detalhesProdutosLayout.setVerticalGroup(
            detalhesProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(qtdProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(precoUnProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addGroup(detalhesProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(descPctProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descRealProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(valorTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAdicionarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAlterar)
                .addGap(14, 14, 14))
        );

        tabelaProdutosVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço Uni", "Qtd", "Desc", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(tabelaProdutosVendas);
        if (tabelaProdutosVendas.getColumnModel().getColumnCount() > 0) {
            tabelaProdutosVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaProdutosVendas.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaProdutosVendas.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabelaProdutosVendas.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabelaProdutosVendas.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabelaProdutosVendas.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutosVendas.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        dadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dados Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel9.setText("Cliente");

        jLabel10.setText("CPF/CNPJ");

        btnOkClienteVenda.setText("OK");
        btnOkClienteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkClienteVendaActionPerformed(evt);
            }
        });

        codClienteVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codClienteVendaKeyPressed(evt);
            }
        });

        clienteVenda.setEditable(false);
        clienteVenda.setBackground(new java.awt.Color(230, 230, 230));
        clienteVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cpfClienteVenda.setEditable(false);
        cpfClienteVenda.setBackground(new java.awt.Color(230, 230, 230));
        cpfClienteVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout dadosClienteLayout = new javax.swing.GroupLayout(dadosCliente);
        dadosCliente.setLayout(dadosClienteLayout);
        dadosClienteLayout.setHorizontalGroup(
            dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosClienteLayout.createSequentialGroup()
                        .addComponent(codClienteVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosClienteLayout.createSequentialGroup()
                        .addComponent(cpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosClienteLayout.setVerticalGroup(
            dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnOkClienteVenda)
                    .addComponent(codClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dados Vendas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel11.setText("Forma Pagto");

        jLabel12.setText("Parcelas");

        jLabel13.setText("Caixa");

        jLabel18.setText("Desconto Total");

        descRealTotalVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descRealTotalVendaKeyPressed(evt);
            }
        });

        jLabel19.setText("R$");

        jLabel20.setText("%");

        descPctTotalVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descPctTotalVendaKeyPressed(evt);
            }
        });

        jLabel21.setText("Valor Pago");

        qtdParcelasPagtoVenda.setFocusable(false);
        qtdParcelasPagtoVenda.setValue(1);

        valorPagoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorPagoVendaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout dadosVendaLayout = new javax.swing.GroupLayout(dadosVenda);
        dadosVenda.setLayout(dadosVendaLayout);
        dadosVendaLayout.setHorizontalGroup(
            dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosVendaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formaPagtoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(8, 8, 8)
                        .addComponent(qtdParcelasPagtoVenda))
                    .addGroup(dadosVendaLayout.createSequentialGroup()
                        .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(caixaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosVendaLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(descRealTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosVendaLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descPctTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosVendaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorPagoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosVendaLayout.setVerticalGroup(
            dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosVendaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(formaPagtoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(qtdParcelasPagtoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(caixaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(valorPagoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(descRealTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(descPctTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConcluirVenda.setBackground(new java.awt.Color(0, 204, 0));
        btnConcluirVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConcluirVenda.setText("Concluir Venda");
        btnConcluirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirVendaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 51));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel22.setText("Troco (R$)");

        jLabel23.setText("Desconto Total");

        mostrarDescTotalReal.setEditable(false);
        mostrarDescTotalReal.setBackground(new java.awt.Color(230, 230, 230));
        mostrarDescTotalReal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        mostrarDescTotalReal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel24.setText("R$");

        trocoVenda.setEditable(false);
        trocoVenda.setBackground(new java.awt.Color(230, 230, 230));
        trocoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));
        trocoVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mostrarTotalPagar.setEditable(false);
        mostrarTotalPagar.setBackground(new java.awt.Color(230, 230, 230));
        mostrarTotalPagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        mostrarTotalPagar.setToolTipText("0");
        mostrarTotalPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel26.setText("Total Pagar (R$)");

        btnOk.setBackground(new java.awt.Color(255, 102, 0));
        btnOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        btnOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOkKeyPressed(evt);
            }
        });

        jLabel14.setText("Estoque");

        jLabel25.setText("R$");

        javax.swing.GroupLayout pontoVendaLayout = new javax.swing.GroupLayout(pontoVenda);
        pontoVenda.setLayout(pontoVendaLayout);
        pontoVendaLayout.setHorizontalGroup(
            pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontoVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pontoVendaLayout.createSequentialGroup()
                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pontoVendaLayout.createSequentialGroup()
                                .addComponent(codProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descricaoProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pontoVendaLayout.createSequentialGroup()
                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pontoVendaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detalhesProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pontoVendaLayout.createSequentialGroup()
                                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pontoVendaLayout.createSequentialGroup()
                                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addGroup(pontoVendaLayout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mostrarDescTotalReal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(trocoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mostrarTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(dadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pontoVendaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(dadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pontoVendaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnConcluirVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar)))))
                        .addContainerGap())))
        );
        pontoVendaLayout.setVerticalGroup(
            pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontoVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detalhesProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pontoVendaLayout.createSequentialGroup()
                        .addComponent(dadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26)
                            .addComponent(jLabel22)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarDescTotalReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(trocoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addComponent(dadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pontoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluirVenda)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pontoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pontoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparFormulario();
        limparTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int numLinha = tabelaProdutosVendas.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(numLinha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto a ser excluído", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o produto selecionado?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            
            DefaultTableModel model = (DefaultTableModel) tabelaProdutosVendas.getModel();
            model.removeRow(numLinha);
            atualizarTotalDescVenda();
            
            JOptionPane.showMessageDialog(null, "Produto Excluído");
            
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        numLinhaSelecionada = tabelaProdutosVendas.getSelectedRow(); //A variável recebe o número da linha que foi selecionada para alterar
        
        //Verificando se foi selecionado algum serviço
        if(numLinhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Atribuindo a variáveis, os valores do produto que fora escolhido na tabela
        String codPro = Integer.toString((int)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 0));
        String descricao = ((String)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 1));
        String precoUni = Double.toString((double)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 2));
        int qtd = (int)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 3);
        String desconto = Double.toString((double)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 4));
        String valorTotal = Double.toString((double)tabelaProdutosVendas.getModel().getValueAt(numLinhaSelecionada, 5));
        
        
        //Setando nos campos, os valores do produto escolhido na tabela
        codProdutoVenda.setText(codPro);
        descricaoProdutoVenda.setText(descricao);
        qtdProdutoVenda.setValue(qtd);
        precoUnProdutoVenda.setText(precoUni);
        descRealProduto.setText(desconto);
        valorTotalProduto.setText(valorTotal);
        
        //Atribuindo o valor "true" pra informar que é um produto que será alterado
        produtoSelecionado = true;
       
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
                
        Vendas venda = dadosVenda();//Chamando o méotod que coleta os dados da venda, tribunido á variável os dados da venda, para ser inserido no banco
      
        vendaDao.adicionarVenda(venda);
        limparTabela();
        limparFormulario();

    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    private void codClienteVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codClienteVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            
            List<Pessoa> listaCliente = new ArrayList<>();
            String cliente = codClienteVenda.getText();
            
            if(cliente.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cliente/Fornecedor não cadastrado. Cadastre o Cliente/Fornecedor", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            else{
                listaCliente = clienteDao.consultarNomeCodigo(cliente);

                for(Pessoa cli : listaCliente){
                    codClienteVenda.setText(Integer.toString(cli.getCodigo()));
                    clienteVenda.setText(cli.getRazaoSocial());
                    cpfClienteVenda.setText(cli.getCpfCnpj());
                }
            }
        }    
    }//GEN-LAST:event_codClienteVendaKeyPressed

    private void btnOkClienteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkClienteVendaActionPerformed
        List<Pessoa> listaCliente = new ArrayList<>();
        String cliente = codClienteVenda.getText();

        listaCliente = clienteDao.consultarNomeCodigo(cliente);

        for(Pessoa cli : listaCliente){
            codClienteVenda.setText(Integer.toString(cli.getCodigo()));
            clienteVenda.setText(cli.getNomeFantasia());
            cpfClienteVenda.setText(cli.getCpfCnpj());
        }
    }//GEN-LAST:event_btnOkClienteVendaActionPerformed

    private void codProdutoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codProdutoVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            String produto = codProdutoVenda.getText();
            List<Produto> listaProdutos = new ArrayList<>();
        
            listaProdutos = produtoDao.consultarProduto(produto);

            for(Produto prod : listaProdutos){
                codProdutoVenda.setText(Integer.toString(prod.getCodigo()));
                descricaoProdutoVenda.setText(prod.getDescricao());
                precoUnProdutoVenda.setText(Double.toString(prod.getValorUnitario()));
                descRealProduto.setText(Double.toString(prod.getDesconto()));
                descPctProduto.setText("0");
            }
        }  
    }//GEN-LAST:event_codProdutoVendaKeyPressed

    private void btnOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOkKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String produto = codProdutoVenda.getText();
            List<Produto> listaProdutos = new ArrayList<>();
        
            listaProdutos = produtoDao.consultarProduto(produto);

            for(Produto prod : listaProdutos){
                codProdutoVenda.setText(Integer.toString(prod.getCodigo()));
                descricaoProdutoVenda.setText(prod.getDescricao());
            }
        }  
    }//GEN-LAST:event_btnOkKeyPressed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String produto = codProdutoVenda.getText();
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos = produtoDao.consultarProduto(produto);

        for(Produto prod : listaProdutos){
            codProdutoVenda.setText(Integer.toString(prod.getCodigo()));
            descricaoProdutoVenda.setText(prod.getDescricao());
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        
        //Atribuindo os valores do formulário para as variáveis
        int codProduto = Integer.parseInt(codProdutoVenda.getText());
        String descricao = descricaoProdutoVenda.getText();
        int qtd = Integer.parseInt(qtdProdutoVenda.getValue().toString());
        double valorUni;
        double descontoReal = Double.parseDouble(descRealProduto.getText());
        double valorTotal = Double.parseDouble(valorTotalProduto.getText());
        
        //Testando se foi informado algum produto
        if(qtd == 0){
            JOptionPane.showMessageDialog(null, "Informe uma quantidade", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Testando se a quantidade foi inserida
        try{
            valorUni = Double.parseDouble(precoUnProdutoVenda.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }    
        
        //Setando os valores para o objeto produto
        Produto produto = new Produto();
        produto.setCodigo(codProduto);
        produto.setDescricao(descricao);
        produto.setValorUnitario(valorUni);
        produto.setQuantidade(qtd);
        produto.setDesconto(descontoReal);
        produto.setValorTotal(valorTotal);
        
        boolean produtoDupli = verificarProdutoDuplicado(produto); //Verificando se o produto já está na tabela, e retornando um valor booleano
        
        if(produtoDupli == false){ //Se o produto não estiver ele adiciona o produto ou altera
            atualizarTabela(produto);//Passando o produto para o método que adiciona o produto na tabela
            limparFormularioProduto(); //Limpado os campos referente aos produtos e os seus dados
        }else{
            limparFormularioProduto(); //Limpado os campos referente aos produtos e os seus dados
        }
        
        atualizarTotalDescVenda();//Métodos que percorre a tabela e soma o total dos produtos e total de desconto, e mostra no formulário
     
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed
   
    private void descPctProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descPctProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){

            if(descPctProduto.getText().isEmpty()){
                
                double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
                int quantidade = Integer.parseInt(qtdProdutoVenda.getValue().toString());

                descRealProduto.setText("0");
                descPctProduto.setText("0");
                valorTotalProduto.setText(Double.toString(valorProduto * quantidade));
            }else{
                double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
                double descontoPerc = Double.parseDouble(descPctProduto.getText());
                int quantidade = Integer.parseInt(qtdProdutoVenda.getValue().toString());


                String descReal = Double.toString((valorProduto * descontoPerc)/100);
                descRealProduto.setText(descReal);

                double descontoReal = Double.parseDouble(descRealProduto.getText());

                double valorTotal = (valorProduto - descontoReal) * quantidade;
                valorTotalProduto.setText(Double.toString(valorTotal));
            }
           
        }
    }//GEN-LAST:event_descPctProdutoKeyPressed

    private void descRealProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descRealProdutoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){

            if(descRealProduto.getText().isEmpty()){
                
                double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
                int quantidade = Integer.parseInt(qtdProdutoVenda.getValue().toString());

                descRealProduto.setText("0");
                descPctProduto.setText("0");
                valorTotalProduto.setText(Double.toString(valorProduto * quantidade));
            }else{
                double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
                double descontoReal = Double.parseDouble(descRealProduto.getText());
                int quantidade = Integer.parseInt(qtdProdutoVenda.getValue().toString());

                String descPct = Double.toString((descontoReal * 100)/valorProduto);
                descPctProduto.setText(descPct);

                double valorTotal = (valorProduto - descontoReal) * quantidade;
                valorTotalProduto.setText(Double.toString(valorTotal));
            }
           
        }
    }//GEN-LAST:event_descRealProdutoKeyPressed

    private void valorPagoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorPagoVendaKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
           
           double totalPagar = Double.parseDouble(mostrarTotalPagar.getText());
           double valorPago = Double.parseDouble(valorPagoVenda.getText());
           
           trocoVenda.setText(Double.toString(valorPago - totalPagar));
       }
    }//GEN-LAST:event_valorPagoVendaKeyPressed

    private void descRealTotalVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descRealTotalVendaKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){

            if(descRealTotalVenda.getText().isEmpty()){
                
                descRealTotalVenda.setText("0");
                descPctTotalVenda.setText("0");

            }else{
                double valorTotalVenda = Double.parseDouble(mostrarTotalPagar.getText());
                double descontoRealVenda = Double.parseDouble(descRealTotalVenda.getText());

                String descPct = Double.toString((descontoRealVenda * 100)/valorTotalVenda);
                descPctTotalVenda.setText(descPct);
                
                mostrarDescTotalReal.setText(Double.toString(descontoRealVenda));

            }
           
        }
    }//GEN-LAST:event_descRealTotalVendaKeyPressed

    private void descPctTotalVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descPctTotalVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){

            if(descPctTotalVenda.getText().isEmpty()){
                
                descRealTotalVenda.setText("0");
                descPctTotalVenda.setText("0");

            }else{
                double valorTotalVenda = Double.parseDouble(mostrarTotalPagar.getText());
                double descontoPerc = Double.parseDouble(descPctTotalVenda.getText());

                String descReal = Double.toString((valorTotalVenda * descontoPerc)/100);
                descRealTotalVenda.setText(descReal);
                
                mostrarDescTotalReal.setText(descReal); //Setando o valor do total desconto, quando for informado o valor total
            } 
        }
    }//GEN-LAST:event_descPctTotalVendaKeyPressed

    private void valorTotalProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorTotalProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){

            double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
            int quantidade = Integer.parseInt(qtdProdutoVenda.getValue().toString());

            double valorTotal = valorProduto * quantidade;
            valorTotalProduto.setText(Double.toString(valorTotal));
            descRealProduto.setText("0");
            descPctProduto.setText("0");

        }
    }//GEN-LAST:event_valorTotalProdutoKeyPressed

    private void precoUnProdutoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoUnProdutoVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            
            double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
            int qtd = Integer.parseInt(qtdProdutoVenda.getValue().toString());

            valorTotalProduto.setText(Double.toString(valorProduto * qtd));

        }
    }//GEN-LAST:event_precoUnProdutoVendaKeyPressed

    private void valorTotalProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorTotalProdutoMouseClicked
        double valorProduto = Double.parseDouble(precoUnProdutoVenda.getText());
        int qtd = Integer.parseInt(qtdProdutoVenda.getValue().toString());

        valorTotalProduto.setText(Double.toString(valorProduto * qtd));
    }//GEN-LAST:event_valorTotalProdutoMouseClicked

    private void habilitarFormulario(boolean status){
        
    }
    
    private void carregarFormaPagto(){

        List<FormaPagto> listaFormaPagto = formaPagtoDao.consultarFormaPagto();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)formaPagtoVenda.getModel();
        modelo.removeAllElements();
        
        for(FormaPagto formaPagto : listaFormaPagto){
            modelo.addElement(formaPagto);
        }
    }
    
    private void carregarCaixa(){   
        List<ContaCaixa> listaCaixas = contaCaixaDao.consultarCaixa();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)caixaVenda.getModel();
        modelo.removeAllElements();
        for(ContaCaixa caixa : listaCaixas){
            modelo.addElement(caixa);
        }
    }
    
    private void carregarEstoques(){

        List<Estoque> listaEstoques = estoqueDao.buscarTipoEstoques();
        DefaultComboBoxModel estoqueSaida = (DefaultComboBoxModel)estoque.getModel();

        estoqueSaida.removeAllElements();

        for(Estoque estoque : listaEstoques){
            estoqueSaida.addElement(estoque);
        }

    }
    
    private void atualizarTabela(Produto produto){
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosVendas.getModel();
        
        if(produtoSelecionado){
            model.setValueAt(produto.getCodigo(), numLinhaSelecionada, 0);
            model.setValueAt(produto.getDescricao(), numLinhaSelecionada, 1);
            model.setValueAt(produto.getValorUnitario(), numLinhaSelecionada, 2);
            model.setValueAt(produto.getQuantidade(), numLinhaSelecionada, 3);
            model.setValueAt(produto.getDesconto() * produto.getQuantidade(), numLinhaSelecionada, 4);
            model.setValueAt(produto.getValorTotal(), numLinhaSelecionada, 5);

        }else{       
            model.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getValorUnitario(), produto.getQuantidade(), produto.getDesconto()* produto.getQuantidade(),produto.getValorTotal()});
        }
        
        produtoSelecionado = false;

    }
    
    private void limparFormularioProduto(){
        codProdutoVenda.setText("");
        descricaoProdutoVenda.setText("");
        qtdProdutoVenda.setValue(1);
        precoUnProdutoVenda.setText("");
        descPctProduto.setText("");
        descRealProduto.setText("");
        valorTotalProduto.setText("");
    }
    
    private String formatarFloat(double numero){
        String retorno = "";
        DecimalFormat formatter = new DecimalFormat("#.00");
        try{
          retorno = formatter.format(numero);
        }catch(Exception ex){
          System.err.println("Erro ao formatar numero: " + ex);
        }
        return retorno;
    }
    
    private void atualizarTotalDescVenda(){
        
        double totalPagar = 0;
        double totalDesconto = 0;
        int totalLinhas = tabelaProdutosVendas.getRowCount(); //Recebe o total de linhas da tabela
    
        for(int i = 0; i < totalLinhas; i++){
            double valor = ((double)tabelaProdutosVendas.getModel().getValueAt(i, 5));
            double desconto = ((double)tabelaProdutosVendas.getModel().getValueAt(i, 4));

            
            totalDesconto += desconto; //Soma todos os descontos aplicados a cada produto
            totalPagar += valor; //Soma o total a pagar
            
            mostrarDescTotalReal.setText(Double.toString(totalDesconto));
            mostrarTotalPagar.setText(Double.toString(totalPagar));
        }
    
    }
    
    private void atualizarBotao(boolean status){
        btnAdicionarProduto.setEnabled(!status);
        btnAlterar.setEnabled(status);
        btnCancelar.setEnabled(!status);
        btnConcluirVenda.setEnabled(status);
        btnExcluir.setEnabled(status);
        btnOk.setEnabled(status);
        btnOkClienteVenda.setEnabled(status);
    }
    
    private boolean verificarProdutoDuplicado(Produto produto){
        
        int totalLinhas = tabelaProdutosVendas.getRowCount();
        boolean prodDupli = false;
        
        for(int i = 0; i < totalLinhas; i++){
            int codProduto = ((int)tabelaProdutosVendas.getModel().getValueAt(i, 0));
            
            //Verifica se o codigo do produto que vai ser inserido, já consta na tabela
            if(codProduto == produto.getCodigo() && produtoSelecionado == false){
                int confirm = JOptionPane.showConfirmDialog(null,"Produto já foi adicionado. Alterar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    produtoSelecionado = true;
                    numLinhaSelecionada = i;
                    JOptionPane.showMessageDialog(null, "Produto alterado");
                }else if(confirm == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    prodDupli = true;
                }
            }

        }
        
        return  prodDupli;
    }
    
    private void limparFormulario(){
        codProdutoVenda.setText("");
        descricaoProdutoVenda.setText("");
        qtdProdutoVenda.setValue(0);
        precoUnProdutoVenda.setText("");
        valorTotalProduto.setText("");
        descPctProduto.setText("");
        descPctTotalVenda.setText("");
        descRealProduto.setText("");
        descRealTotalVenda.setText("");
        descricaoProdutoVenda.setText("");
        clienteVenda.setText("");
        cpfClienteVenda.setText("");
        codClienteVenda.setText("");
        mostrarDescTotalReal.setText("");
        mostrarTotalPagar.setText("");
        trocoVenda.setText("");
        qtdParcelasPagtoVenda.setValue(0);
        valorPagoVenda.setText("");
    }
    
    private void limparTabela(){
        if(tabelaProdutosVendas.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaProdutosVendas.getModel();
            model.setRowCount(0);
        }
    }
    
    private Vendas dadosVenda(){
        
        String dataCadastro = data.conversaoData();
        String tipoVenda = "Venda Balcão";
        
        int totalLinhas = tabelaProdutosVendas.getRowCount();
        List<Produto> listaProdutos = new ArrayList<>();
        
        int qtdParcelas = (Integer)qtdParcelasPagtoVenda.getValue();
        double totalVenda = Double.parseDouble(mostrarTotalPagar.getText());
        double totalDesco = Double.parseDouble(mostrarDescTotalReal.getText());
        
        int codCliente = Integer.parseInt(codClienteVenda.getText());
        String nomeCliente = clienteVenda.getText();
        String cpfCnpj = cpfClienteVenda.getText();        
        
        for(int i = 0; i < totalLinhas; i++){
            
            int codProduto = ((int)tabelaProdutosVendas.getModel().getValueAt(i, 0));
            String descricao = ((String) tabelaProdutosVendas.getModel().getValueAt(i, 1));            
            double valorUni = ((double)tabelaProdutosVendas.getModel().getValueAt(i, 2));
            int qtd = ((int)tabelaProdutosVendas.getModel().getValueAt(i, 3));
            double desconto = ((double)tabelaProdutosVendas.getModel().getValueAt(i, 4));
            double valorTotal = ((double)tabelaProdutosVendas.getModel().getValueAt(i, 5));
            
            Produto produto = new Produto(codProduto, descricao, valorUni, qtd, desconto, valorTotal);
            listaProdutos.add(produto);
        }
        
        Estoque estoque = (Estoque) this.estoque.getSelectedItem();
        ContaCaixa contaCaixa = (ContaCaixa) caixaVenda.getSelectedItem();
        FormaPagto formaPagto = (FormaPagto) formaPagtoVenda.getSelectedItem();
        Pessoa cliente = new Pessoa(codCliente, nomeCliente, cpfCnpj);
        
        Vendas venda = new Vendas(qtdParcelas,tipoVenda, totalVenda, totalDesco, cliente, listaProdutos, contaCaixa, formaPagto, estoque, dataCadastro);
        
        
        return venda;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOkClienteVenda;
    private javax.swing.JComboBox<String> caixaVenda;
    private javax.swing.JFormattedTextField clienteVenda;
    private javax.swing.JTextField codClienteVenda;
    private javax.swing.JTextField codProdutoVenda;
    private javax.swing.JFormattedTextField cpfClienteVenda;
    private javax.swing.JPanel dadosCliente;
    private javax.swing.JPanel dadosVenda;
    private javax.swing.JFormattedTextField descPctProduto;
    private javax.swing.JFormattedTextField descPctTotalVenda;
    private javax.swing.JTextField descRealProduto;
    private javax.swing.JFormattedTextField descRealTotalVenda;
    private javax.swing.JTextField descricaoProdutoVenda;
    private javax.swing.JPanel detalhesProdutos;
    private javax.swing.JComboBox<String> estoque;
    private javax.swing.JComboBox<String> formaPagtoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField mostrarDescTotalReal;
    private javax.swing.JFormattedTextField mostrarTotalPagar;
    private javax.swing.JPanel pontoVenda;
    private javax.swing.JFormattedTextField precoUnProdutoVenda;
    private javax.swing.JSpinner qtdParcelasPagtoVenda;
    private javax.swing.JSpinner qtdProdutoVenda;
    private javax.swing.JTable tabelaProdutosVendas;
    private javax.swing.JFormattedTextField trocoVenda;
    private javax.swing.JFormattedTextField valorPagoVenda;
    private javax.swing.JFormattedTextField valorTotalProduto;
    // End of variables declaration//GEN-END:variables
}
