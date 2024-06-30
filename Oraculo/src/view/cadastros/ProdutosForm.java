
package view.cadastros;

import dao.DadosFiscaisDao;
import model.Produto;
import dao.ProdutoDao;
import dao.UnidadeDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import model.DadosFiscais;
import model.Data;
import model.Entidades;
import model.Unidades;
import view.Home;


public class ProdutosForm extends javax.swing.JInternalFrame {

    private ProdutoDao produtoDao = new ProdutoDao();
    private DadosFiscaisDao dadosFiscaisDao = new DadosFiscaisDao();
    private UnidadeDao unidadeDao = new UnidadeDao();
    private Data data = new Data();
    private Produto produtoSelecionado;
    private List<Produto> listaProduto;

    public ProdutosForm() {
        initComponents();
        atualizarBotao(false);
        habilitarFormulario(false);
        carregarCst();
        carregarCsosn();
        carregarUnidade();
        codigoProduto.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroProdutos = new javax.swing.JDesktopPane();
        TelaCadastroProdutos = new javax.swing.JPanel();
        buscarProdutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        painelDadosFiscais = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ncmProduto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ipiProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cestProduto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cstProduto = new javax.swing.JComboBox<>();
        csosnProduto = new javax.swing.JComboBox<>();
        panelCustos = new javax.swing.JPanel();
        freteProduto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        precoVendaProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        outrasDespesaProduto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        descontoProduto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        custoProduto = new javax.swing.JFormattedTextField();
        margemLucroProduto = new javax.swing.JFormattedTextField();
        painelDadosCadastrais = new javax.swing.JPanel();
        unidadeProduto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descricaoProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        marcaProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codigoEanProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        codigoGtinProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pesoProduto = new javax.swing.JTextField();
        codigoBarrasProduto = new javax.swing.JTextField();
        codigoProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro Produtos");
        setAutoscrolls(true);

        buscarProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarProdutosKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Produtos");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
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

        btnCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        painelDadosFiscais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Fiscais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel10.setText("NCM*");

        jLabel11.setText("IPI (%)");

        ncmProduto.setText("000000000");

        jLabel12.setText("CST*");

        ipiProduto.setText("0");

        jLabel13.setText("CSOSN*");

        cestProduto.setText("0000000");

        jLabel21.setText("CEST*");

        javax.swing.GroupLayout painelDadosFiscaisLayout = new javax.swing.GroupLayout(painelDadosFiscais);
        painelDadosFiscais.setLayout(painelDadosFiscaisLayout);
        painelDadosFiscaisLayout.setHorizontalGroup(
            painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                        .addComponent(ncmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ipiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cestProduto))
                    .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                        .addComponent(cstProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(csosnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelDadosFiscaisLayout.setVerticalGroup(
            painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                        .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosFiscaisLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cstProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(csosnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cestProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(painelDadosFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ipiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelCustos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Custos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        freteProduto.setText("0.0");

        jLabel16.setText("Custo (R$)*");

        precoVendaProduto.setText("0.0");

        jLabel17.setText("Frete (R$)");

        outrasDespesaProduto.setText("0.0");

        jLabel18.setText("Margem Lucro (%)*");

        descontoProduto.setText("0.0");

        jLabel19.setText("Outras Depesas");

        jLabel20.setText("Preço Venda (R$)*");

        jLabel22.setText("Desconto (%)");

        custoProduto.setText("0.0");

        margemLucroProduto.setText("0.0");

        javax.swing.GroupLayout panelCustosLayout = new javax.swing.GroupLayout(panelCustos);
        panelCustos.setLayout(panelCustosLayout);
        panelCustosLayout.setHorizontalGroup(
            panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustosLayout.createSequentialGroup()
                .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(margemLucroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custoProduto)))
                .addGap(11, 11, 11)
                .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(freteProduto))
                    .addGroup(panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outrasDespesaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustosLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descontoProduto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustosLayout.setVerticalGroup(
            panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustosLayout.createSequentialGroup()
                .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(freteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(precoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(descontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(outrasDespesaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(margemLucroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosCadastrais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Cadastrais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Produto");

        jLabel4.setText("Marca");

        jLabel5.setText("Código EAN");

        jLabel6.setText("Código GTIN");

        jLabel7.setText("Unidade*");

        codigoEanProduto.setText("000000");

        jLabel8.setText("Peso (KG)");

        codigoGtinProduto.setText("000000");
        codigoGtinProduto.setToolTipText("");

        jLabel9.setText("Código de Barras");

        pesoProduto.setText("0.0");

        codigoBarrasProduto.setText("0000000000");

        codigoProduto.setEditable(false);

        javax.swing.GroupLayout painelDadosCadastraisLayout = new javax.swing.GroupLayout(painelDadosCadastrais);
        painelDadosCadastrais.setLayout(painelDadosCadastraisLayout);
        painelDadosCadastraisLayout.setHorizontalGroup(
            painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosCadastraisLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaProduto))
                    .addGroup(painelDadosCadastraisLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoEanProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoGtinProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        painelDadosCadastraisLayout.setVerticalGroup(
            painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCadastraisLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(codigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(pesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(unidadeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(codigoEanProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(codigoGtinProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(9, 9, 9))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "UN", "Marca", "NCM", "Cod Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabelaProdutos.setUpdateSelectionOnSort(false);
        tabelaProdutos.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(450);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        btnAlterar.setBackground(new java.awt.Color(0, 153, 255));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaCadastroProdutosLayout = new javax.swing.GroupLayout(TelaCadastroProdutos);
        TelaCadastroProdutos.setLayout(TelaCadastroProdutosLayout);
        TelaCadastroProdutosLayout.setHorizontalGroup(
            TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(painelDadosFiscais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCustos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        TelaCadastroProdutosLayout.setVerticalGroup(
            TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(buscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDadosFiscais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCustos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addGap(15, 15, 15))
        );

        painelCadastroProdutos.setLayer(TelaCadastroProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelCadastroProdutosLayout = new javax.swing.GroupLayout(painelCadastroProdutos);
        painelCadastroProdutos.setLayout(painelCadastroProdutosLayout);
        painelCadastroProdutosLayout.setHorizontalGroup(
            painelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelCadastroProdutosLayout.setVerticalGroup(
            painelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroProdutos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroProdutos)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //Atribuindo os dados inseridos nos formulario a variáveis
        String descProduto = descricaoProduto.getText();
        String codEan = codigoEanProduto.getText();
        String codGtin = codigoGtinProduto.getText();
        String marca = marcaProduto.getText();
        String codBarras = codigoBarrasProduto.getText();
        String ncm = ncmProduto.getText();
        String cst = cstProduto.getSelectedItem().toString().substring(0, 3);
        String cest = cestProduto.getText();
        String csosn = csosnProduto.getSelectedItem().toString().substring(0, 3);
        Double peso;
        Double ipi;
        Double valorFrete;
        Double margemLucro;
        Double outrasDespesas;
        Double desconto;
        Double custo;
        Double precoVenda;
        String dataCadastro = data.conversaoData();
        Unidades unidade = (Unidades) unidadeProduto.getSelectedItem();
       
        try{
            custo = Double.parseDouble(custoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Custo do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }         
        try{
            precoVenda = Double.parseDouble(precoVendaProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Preço de venda do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            peso = Double.parseDouble(pesoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Peso do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }         
        try{
            ipi = Double.parseDouble(ipiProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "IPI do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            valorFrete = Double.parseDouble(freteProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor do frete do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }         
        try{
            margemLucro = Double.parseDouble(margemLucroProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Margem de lucro do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        try{
            outrasDespesas = Double.parseDouble(outrasDespesaProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Outras despesas do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }         
        try{
            desconto = Double.parseDouble(descontoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Desconto do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
                       
        if(produtoSelecionado == null){
            Produto produto = new Produto(descProduto, codEan, codGtin, unidade, marca, codBarras, ncm, cst, cest, csosn, dataCadastro, peso, ipi, custo, valorFrete, margemLucro, outrasDespesas, precoVenda, desconto);
            
            //Chamando o método para cadastrarProduto os produtos na tabela produtos
            produtoDao.cadastrarProduto(produto);

            //Limpando os campos para inserir novos dados
            limparFormulario();
            habilitarFormulario(false);
            atualizarBotao(false);
 
        }else{
            alterandoDadosProduto(descProduto, codEan, codGtin, marca, unidade, codBarras, ncm, cst, cest, csosn, peso, ipi, custo, valorFrete, margemLucro, outrasDespesas, precoVenda, desconto);
            
            produtoDao.alterar(produtoSelecionado);
            limparFormulario(); //Limpando o fomrulário
            atualizarTabela(); //Atualizando tabela para que mostre os produtos com a alteração aplicada
            habilitarFormulario(false);
            
            produtoSelecionado = null;
        }
   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        habilitarFormulario(true);
        atualizarBotao(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void buscarProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarProdutosKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela(); 
            btnAlterar.setEnabled(true);
        }      
    }//GEN-LAST:event_buscarProdutosKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        atualizarTabela();
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparTabela();
        limparFormulario();
        atualizarBotao(false);
        habilitarFormulario(false);
        produtoSelecionado = null;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        //Variável receber a quantidade de linhas da tabela
        int linhaTabela = tabelaProdutos.getSelectedRow();
        
        //Verifica se foi selecionado algum serviço da lista
        if(linhaTabela < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o serviço
        produtoSelecionado = listaProduto.get(linhaTabela);
   
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o Produto "+produtoSelecionado.getDescricao()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            produtoDao.remover(produtoSelecionado.getCodigo());
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            atualizarTabela();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        //criando variável que recebe a linha da tabela de serviços.
        int linhaSelecionada = tabelaProdutos.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(linhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //atualizando o status dos botões
        atualizarBotao(true);
        habilitarFormulario(true);
        
        //variável que recebe a linha que foi selecionada na tabela
        produtoSelecionado = listaProduto.get(linhaSelecionada);
        
        //Convertendo os valores inteiros e doubles para String.
        String codProduto = Integer.toString(produtoSelecionado.getCodigo());
        String peso = Double.toString(produtoSelecionado.getPeso());
        String ipi = Double.toString(produtoSelecionado.getIpi());
        String custo = Double.toString(produtoSelecionado.getCusto());
        String valorFrete = Double.toString(produtoSelecionado.getFrete());
        String margemLucro = Double.toString(produtoSelecionado.getMargemLucro());
        String outrasDespesas = Double.toString(produtoSelecionado.getOutrasDespesas());
        String precoVenda = Double.toString(produtoSelecionado.getValorUnitario());
        String desconto = Double.toString(produtoSelecionado.getDesconto());
        
        //Se tando os valores nos campos para ser alterados.
        codigoProduto.setText(codProduto);
        descricaoProduto.setText(produtoSelecionado.getDescricao());
        marcaProduto.setText(produtoSelecionado.getMarca());
        unidadeProduto.setSelectedItem(produtoSelecionado.getUnidade());
        codigoBarrasProduto.setText(produtoSelecionado.getCodBarras());
        codigoEanProduto.setText(produtoSelecionado.getCodEan());
        codigoGtinProduto.setText(produtoSelecionado.getCodGtin());
        csosnProduto.setSelectedItem(produtoSelecionado.getCsosn());
        cstProduto.setSelectedItem(produtoSelecionado.getCst());
        ncmProduto.setText(produtoSelecionado.getNcm());
        cestProduto.setText(produtoSelecionado.getCest());
        pesoProduto.setText(peso);
        ipiProduto.setText(ipi);
        custoProduto.setText(custo);
        freteProduto.setText(valorFrete);
        margemLucroProduto.setText(margemLucro);
        outrasDespesaProduto.setText(outrasDespesas);
        precoVendaProduto.setText(precoVenda);
        descontoProduto.setText(desconto);
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void atualizarBotao(boolean status) {
        btnExcluir.setEnabled(status);
        btnCadastrar.setEnabled(!status);
        btnCancelar.setEnabled(status);
        btnSalvar.setEnabled(status);
        btnAlterar.setEnabled(status);
    }
    
    private void habilitarFormulario(boolean status){
        descricaoProduto.setEnabled(status);
        marcaProduto.setEnabled(status);
        precoVendaProduto.setEnabled(status);
        ncmProduto.setEnabled(status);
        ipiProduto.setEnabled(status);
        cstProduto.setEnabled(status);
        ncmProduto.setEnabled(status);
        csosnProduto.setEnabled(status);
        cstProduto.setEnabled(status);
        descontoProduto.setEnabled(status);
        custoProduto.setEnabled(status);
        freteProduto.setEnabled(status);
        outrasDespesaProduto.setEnabled(status);
        margemLucroProduto.setEnabled(status);
        cestProduto.setEnabled(status);
        codigoBarrasProduto.setEnabled(status);
        codigoEanProduto.setEnabled(status);
        codigoGtinProduto.setEnabled(status);
        pesoProduto.setEnabled(status);
        unidadeProduto.setEnabled(status);
        buscarProdutos.setEnabled(!status);
    }

    private void limparFormulario(){
        cestProduto.setText("0000000");
        codigoBarrasProduto.setText("000000000000000");
        codigoEanProduto.setText("00000");
        codigoGtinProduto.setText("00000");
        custoProduto.setText("0.00");
        descontoProduto.setText("0.00");
        descricaoProduto.setText("");
        freteProduto.setText("0.00");
        ipiProduto.setText("0.00");
        marcaProduto.setText("");
        margemLucroProduto.setText("0.00");
        ncmProduto.setText("0000000");
        outrasDespesaProduto.setText("0.00");
        pesoProduto.setText("0.00");
        precoVendaProduto.setText("0.00");
        unidadeProduto.setSelectedIndex(0);
        csosnProduto.setSelectedIndex(0);
        cstProduto.setSelectedIndex(0);
        codigoProduto.setText("");
    }

    private void alterandoDadosProduto(String descricaoProduto, String codEan, String codGtin, String marca, Unidades unidade, String codBarras, String ncm, String cst, String cest, String csosn, double peso, double ip, double custo, double valorFrete, double margemLucro, double outrasDespesas, double precoVenda, double desconto){
        
        produtoSelecionado.setDescricao(descricaoProduto);
        produtoSelecionado.setCodEan(codEan);
        produtoSelecionado.setCodGtin(codGtin);
        produtoSelecionado.setMarca(marca);
        produtoSelecionado.setUnidade(unidade);
        produtoSelecionado.setCodBarras(codBarras);
        produtoSelecionado.setNcm(ncm);
        produtoSelecionado.setCst(cst);
        produtoSelecionado.setCest(cest);
        produtoSelecionado.setCsosn(csosn);
        produtoSelecionado.setPeso(peso);
        produtoSelecionado.setIpi(ip);
        produtoSelecionado.setCusto(custo);
        produtoSelecionado.setFrete(valorFrete);
        produtoSelecionado.setMargemLucro(margemLucro);
        produtoSelecionado.setOutrasDespesas(outrasDespesas);
        produtoSelecionado.setValorUnitario(precoVenda);
        produtoSelecionado.setDesconto(desconto);
        
    }

    private void atualizarTabela(){

        listaProduto = produtoDao.consultarProduto(buscarProdutos.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        model.setNumRows(0);

        for(Produto prod : listaProduto){
            model.addRow(new Object[]{prod.getCodigo(), prod.getDescricao(), prod.getUnidade(), prod.getMarca(), prod.getNcm(),prod.getCodBarras()});

        }

    }
            
    private void limparTabela(){
        //Primeiro a condição testa se a quantidade de colunas é maior que 0, depois, limpa os dados
        if(tabelaProdutos.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
            model.setRowCount(0);
        }
    }
    
    private void carregarCsosn(){

        List<DadosFiscais> listaCsosn = dadosFiscaisDao.buscarCsosn();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)csosnProduto.getModel();
        modelo.removeAllElements();
        
        for(DadosFiscais csosn : listaCsosn){
            modelo.addElement(csosn);
        }

    }
 
    private void carregarCst(){
   
        List<DadosFiscais> listaCst = dadosFiscaisDao.buscarCst();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cstProduto.getModel();
        modelo.removeAllElements();
        
        for(DadosFiscais cst : listaCst){
            modelo.addElement(cst);
        }

    }
    
    private void carregarUnidade(){

        List<Unidades> listaUnidades = unidadeDao.consultarUnidades();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)unidadeProduto.getModel();
        modelo.removeAllElements();
        
        for(Unidades unidade : listaUnidades){
            modelo.addElement(unidade);
        }

    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaCadastroProdutos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField buscarProdutos;
    private javax.swing.JTextField cestProduto;
    private javax.swing.JTextField codigoBarrasProduto;
    private javax.swing.JTextField codigoEanProduto;
    private javax.swing.JTextField codigoGtinProduto;
    private javax.swing.JTextField codigoProduto;
    private javax.swing.JComboBox<String> csosnProduto;
    private javax.swing.JComboBox<String> cstProduto;
    private javax.swing.JFormattedTextField custoProduto;
    private javax.swing.JTextField descontoProduto;
    private javax.swing.JTextField descricaoProduto;
    private javax.swing.JTextField freteProduto;
    private javax.swing.JTextField ipiProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marcaProduto;
    private javax.swing.JFormattedTextField margemLucroProduto;
    private javax.swing.JTextField ncmProduto;
    private javax.swing.JTextField outrasDespesaProduto;
    private javax.swing.JDesktopPane painelCadastroProdutos;
    private javax.swing.JPanel painelDadosCadastrais;
    private javax.swing.JPanel painelDadosFiscais;
    private javax.swing.JPanel panelCustos;
    private javax.swing.JTextField pesoProduto;
    private javax.swing.JTextField precoVendaProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JComboBox<String> unidadeProduto;
    // End of variables declaration//GEN-END:variables

}
