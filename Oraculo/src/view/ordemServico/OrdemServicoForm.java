
package view.ordemServico;

import dao.PessoasDao;
import dao.OrdemServicoDao;
import dao.ProdutoDao;
import dao.ServicoDao;
import dao.UnidadeDao;
import dao.UsuarioDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Checklist;
import model.Pessoa;
import model.Data;
import model.Endereco;
import model.OrdemServico;
import model.Produto;
import model.Servico;
import model.Unidades;
import model.Usuario;
import model.Veiculo;
import view.Home;
import view.LoginForm;


public class OrdemServicoForm extends javax.swing.JInternalFrame {

    private List<Pessoa> listaClienteFornecedor;
    private OrdemServicoDao osDao = new OrdemServicoDao();
    private PessoasDao clienteDao = new PessoasDao();
    private UnidadeDao unidadeDao = new UnidadeDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private ProdutoDao produtoDao = new ProdutoDao();
    private ServicoDao servicoDao = new ServicoDao();
    private OrdemServico osSelecionado;
    private Data data = new Data();
    LoginForm usuario = new LoginForm();
    private int numLinhaSelecionada; //Recebe o número da linha da tabela do produto;serviço que foi selecionado
    private boolean produtoSelecionado = false;
    private boolean servicoSelecionado = false;
    private int codAssoc = 0;
    
    public OrdemServicoForm() {
        initComponents();
        atualizarBotoes(false);
        habilitarFormulario(false);
        habilitarAbas(false);
        carregarUnidade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        painelAbasOS = new javax.swing.JTabbedPane();
        painelAberturaOS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buscarOSAberturaOS = new javax.swing.JTextField();
        btnOkBuscarOS = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeClienteAberturaOS = new javax.swing.JTextField();
        codClienteAberturaOS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fantasiaAberturaOS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpfCnpjAberturaOS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        celularAberturaOS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailAberturaOS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        logradouroAberturaOS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numEnderecoAberturaOS = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        bairroEnderecoAberturaOS = new javax.swing.JTextField();
        cidadeEnderecoAberturaOS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estadoEnderecoAberturaOS = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cepEnderecoAberturaOS = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        marcaVeiculoAberturaOS = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        placaVeiculoAberturaOS = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kmAtualVeiculoAberturaOS = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        chassiVeiculoAberturaOS = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        docVeiculoAberturaOS = new javax.swing.JTextField();
        modeloVeiculoAberturaOS = new javax.swing.JTextField();
        corVeiculoAberturaOS = new javax.swing.JTextField();
        anoVeiculoAberturaOS = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observAberturaOS = new javax.swing.JTextArea();
        btnSalvarOS = new javax.swing.JButton();
        btnCancelarOS = new javax.swing.JButton();
        btnCadatrarOS = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        codTecnicoAberturaOS = new javax.swing.JTextField();
        nomeTecnicoAberturaOS = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        prioridadeOSAberturaOS = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        statusOSAberturaOS = new javax.swing.JComboBox<>();
        btnAbrirOS = new javax.swing.JButton();
        btnExcluirOs = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        numOS = new javax.swing.JTextField();
        btnLimparForm = new javax.swing.JButton();
        painelProdutoOS = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutosOS = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        numOSProdutos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        statusOSProdutos = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        codProdutoOS = new javax.swing.JTextField();
        nomeProdutoOS = new javax.swing.JTextField();
        qtdProdutoOS = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        btnOkProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        totalProdutoOS = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        unidadeProdutoOS = new javax.swing.JComboBox<>();
        valorUniProdutoOS = new javax.swing.JTextField();
        valorTotalProdutoOS = new javax.swing.JTextField();
        btnExcluirProduto = new javax.swing.JButton();
        painelServicosOS = new javax.swing.JPanel();
        codServicoOS = new javax.swing.JTextField();
        totalServicoOS = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        statusOSServico = new javax.swing.JTextField();
        btnAlterarServico = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        btnOkServico = new javax.swing.JButton();
        numOSServico = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaServicoOS = new javax.swing.JTable();
        qtdServicosOS = new javax.swing.JSpinner();
        nomeServicosOS = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        valorTotalServicosOS = new javax.swing.JFormattedTextField();
        valorUniServicosOS = new javax.swing.JTextField();
        btnExcluirServico = new javax.swing.JButton();
        painelChekListOS = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        numOSChecklist = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        modeloVeiculoChecklist = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        placaVeiculoChecklist = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        statusOSChecklist = new javax.swing.JTextField();
        painelCheck = new javax.swing.JPanel();
        radioChecklist = new javax.swing.JCheckBox();
        calotasChecklist = new javax.swing.JCheckBox();
        antenaChecklist = new javax.swing.JCheckBox();
        manualChecklist = new javax.swing.JCheckBox();
        bateriaChecklist = new javax.swing.JCheckBox();
        documentosChecklist = new javax.swing.JCheckBox();
        acendedorChecklist = new javax.swing.JCheckBox();
        tapetesChecklist = new javax.swing.JCheckBox();
        chaveChecklist = new javax.swing.JCheckBox();
        trianguloChecklist = new javax.swing.JCheckBox();
        macacoChecklist = new javax.swing.JCheckBox();
        extintorChecklist = new javax.swing.JCheckBox();
        limpadorChecklist = new javax.swing.JCheckBox();
        arChecklist = new javax.swing.JCheckBox();
        painelVeiculoChecklist = new javax.swing.JCheckBox();
        combustivelChecklist = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        kmAtualChecklist = new javax.swing.JTextField();
        pneuTraseiroChecklist = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        pneuDianteiroChecklist = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        pneuEstepeChecklist = new javax.swing.JComboBox<>();
        iluminacaoChecklist = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        problemasInformadosChecklist = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        problemasEncontradoChecklist = new javax.swing.JTextArea();

        popupMenu1.setLabel("popupMenu1");

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Ordem de Serviço");
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(35000, 35000));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 650));

        painelAbasOS.setAutoscrolls(true);
        painelAbasOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelAbasOS.setMinimumSize(new java.awt.Dimension(100, 100));
        painelAbasOS.setPreferredSize(new java.awt.Dimension(1050, 660));

        painelAberturaOS.setPreferredSize(new java.awt.Dimension(1050, 660));

        jLabel2.setText("Buscar Nº OS");

        buscarOSAberturaOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarOSAberturaOSKeyPressed(evt);
            }
        });

        btnOkBuscarOS.setText("OK");
        btnOkBuscarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkBuscarOSActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setText("Cliente");

        nomeClienteAberturaOS.setEditable(false);
        nomeClienteAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        nomeClienteAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomeClienteAberturaOS.setEnabled(false);

        codClienteAberturaOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codClienteAberturaOSKeyPressed(evt);
            }
        });

        jLabel4.setText("Fantasia");

        fantasiaAberturaOS.setEditable(false);
        fantasiaAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        fantasiaAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fantasiaAberturaOS.setEnabled(false);

        jLabel5.setText("CPF/CNPJ");

        cpfCnpjAberturaOS.setEditable(false);
        cpfCnpjAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        cpfCnpjAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfCnpjAberturaOS.setEnabled(false);

        jLabel6.setText("Celular");

        celularAberturaOS.setEditable(false);
        celularAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        celularAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celularAberturaOS.setEnabled(false);

        jLabel7.setText("E-mail");

        emailAberturaOS.setEditable(false);
        emailAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        emailAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel8.setText("Logradouro");

        logradouroAberturaOS.setEditable(false);
        logradouroAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        logradouroAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setText("N º");

        jLabel10.setText("Bairro");

        bairroEnderecoAberturaOS.setEditable(false);
        bairroEnderecoAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        bairroEnderecoAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cidadeEnderecoAberturaOS.setEditable(false);
        cidadeEnderecoAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        cidadeEnderecoAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel12.setText("Cidade");

        jLabel13.setText("Estado");

        estadoEnderecoAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        estadoEnderecoAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estadoEnderecoAberturaOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "S", "SE", "TO", "DF" }));

        jLabel14.setText("CEP");

        cepEnderecoAberturaOS.setEditable(false);
        cepEnderecoAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        cepEnderecoAberturaOS.setDisabledTextColor(new java.awt.Color(230, 230, 230));
        cepEnderecoAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(codClienteAberturaOS)
                        .addGap(18, 18, 18)
                        .addComponent(nomeClienteAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fantasiaAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfCnpjAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celularAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logradouroAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numEnderecoAberturaOS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cidadeEnderecoAberturaOS, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(bairroEnderecoAberturaOS))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estadoEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cepEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeClienteAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codClienteAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fantasiaAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cpfCnpjAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(celularAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(emailAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(logradouroAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(numEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cepEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(estadoEnderecoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dados Veículo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel11.setText("Modelo");

        jLabel15.setText("Marca");

        jLabel16.setText("Placa Veículo");

        jLabel17.setText("Cor");

        jLabel18.setText("Ano Veículo");

        jLabel19.setText("KM Atual");

        jLabel21.setText("Chassi");

        jLabel22.setText("Nº CRLV");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chassiVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(docVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeloVeiculoAberturaOS)
                            .addComponent(corVeiculoAberturaOS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placaVeiculoAberturaOS, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(anoVeiculoAberturaOS))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaVeiculoAberturaOS)
                            .addComponent(kmAtualVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeloVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placaVeiculoAberturaOS)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmAtualVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chassiVeiculoAberturaOS)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docVeiculoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Observação/Defeito", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        observAberturaOS.setColumns(20);
        observAberturaOS.setLineWrap(true);
        observAberturaOS.setRows(5);
        jScrollPane1.setViewportView(observAberturaOS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        btnSalvarOS.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvarOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarOS.setText("Salvar");
        btnSalvarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarOSActionPerformed(evt);
            }
        });

        btnCancelarOS.setBackground(new java.awt.Color(255, 255, 0));
        btnCancelarOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarOS.setText("Cancelar");
        btnCancelarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOSActionPerformed(evt);
            }
        });

        btnCadatrarOS.setBackground(new java.awt.Color(153, 153, 153));
        btnCadatrarOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadatrarOS.setText("Cadastrar");
        btnCadatrarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadatrarOSActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dados Gerais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel20.setText("Técnico Responsável");

        codTecnicoAberturaOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codTecnicoAberturaOSKeyPressed(evt);
            }
        });

        nomeTecnicoAberturaOS.setEditable(false);
        nomeTecnicoAberturaOS.setBackground(new java.awt.Color(230, 230, 230));
        nomeTecnicoAberturaOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel23.setText("Prioridade");

        prioridadeOSAberturaOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Normal", "Alta", "Urgente" }));

        jLabel24.setText("Status");

        statusOSAberturaOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberta", "Em Execução", "Aguardando Cliente", "Aguardando Oficina", "Finalizada" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codTecnicoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTecnicoAberturaOS))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prioridadeOSAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusOSAberturaOS, 0, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(codTecnicoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTecnicoAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(prioridadeOSAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(statusOSAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbrirOS.setBackground(new java.awt.Color(255, 102, 0));
        btnAbrirOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbrirOS.setText("Abrir OS");
        btnAbrirOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirOSActionPerformed(evt);
            }
        });

        btnExcluirOs.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluirOs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirOs.setText("Excluir");
        btnExcluirOs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirOsActionPerformed(evt);
            }
        });

        jLabel41.setText("Nº OS");

        numOS.setEditable(false);
        numOS.setBackground(new java.awt.Color(230, 230, 230));
        numOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnLimparForm.setBackground(new java.awt.Color(0, 255, 204));
        btnLimparForm.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        btnLimparForm.setText("Limpar Formulário");
        btnLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAberturaOSLayout = new javax.swing.GroupLayout(painelAberturaOS);
        painelAberturaOS.setLayout(painelAberturaOSLayout);
        painelAberturaOSLayout.setHorizontalGroup(
            painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAberturaOSLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAberturaOSLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(buscarOSAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnOkBuscarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(painelAberturaOSLayout.createSequentialGroup()
                        .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimparForm)
                            .addGroup(painelAberturaOSLayout.createSequentialGroup()
                                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAbrirOS, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAberturaOSLayout.createSequentialGroup()
                                        .addComponent(btnCadatrarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluirOs, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        painelAberturaOSLayout.setVerticalGroup(
            painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAberturaOSLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(numOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelAberturaOSLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2))
                        .addComponent(buscarOSAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOkBuscarOS)))
                .addGap(13, 13, 13)
                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAberturaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarOS)
                        .addComponent(btnCadatrarOS)
                        .addComponent(btnAbrirOS)
                        .addComponent(btnExcluirOs))
                    .addComponent(btnCancelarOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnLimparForm)
                .addContainerGap())
        );

        painelAbasOS.addTab("Abertura OS", painelAberturaOS);

        painelProdutoOS.setPreferredSize(new java.awt.Dimension(1050, 660));

        tabelaProdutosOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaProdutosOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição Produto(s)", "UN", "Qtd", "Valor Uni", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane2.setViewportView(tabelaProdutosOS);
        if (tabelaProdutosOS.getColumnModel().getColumnCount() > 0) {
            tabelaProdutosOS.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaProdutosOS.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(1).setPreferredWidth(500);
            tabelaProdutosOS.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelaProdutosOS.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabelaProdutosOS.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabelaProdutosOS.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutosOS.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jLabel25.setText("Nº OS");

        numOSProdutos.setEditable(false);
        numOSProdutos.setBackground(new java.awt.Color(230, 230, 230));
        numOSProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel26.setText("Status OS");

        statusOSProdutos.setEditable(false);
        statusOSProdutos.setBackground(new java.awt.Color(230, 230, 230));

        jLabel27.setText("Produto");

        codProdutoOS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        codProdutoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codProdutoOSKeyPressed(evt);
            }
        });

        nomeProdutoOS.setEditable(false);

        qtdProdutoOS.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        qtdProdutoOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setText("Valor Uni");

        btnOkProduto.setBackground(new java.awt.Color(0, 204, 0));
        btnOkProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOkProduto.setText("OK");
        btnOkProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setBackground(new java.awt.Color(0, 153, 255));
        btnAlterarProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        jLabel30.setText("Valor Total Produtos");

        totalProdutoOS.setEditable(false);
        totalProdutoOS.setBackground(new java.awt.Color(230, 230, 230));
        totalProdutoOS.setText("0.0");
        totalProdutoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel42.setText("Valor Total");

        unidadeProdutoOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        valorUniProdutoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorUniProdutoOSKeyPressed(evt);
            }
        });

        valorTotalProdutoOS.setEditable(false);
        valorTotalProdutoOS.setBackground(new java.awt.Color(230, 230, 230));
        valorTotalProdutoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        valorTotalProdutoOS.setText("0.0");
        valorTotalProdutoOS.setToolTipText("");
        valorTotalProdutoOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorTotalProdutoOSMouseClicked(evt);
            }
        });

        btnExcluirProduto.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluirProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutoOSLayout = new javax.swing.GroupLayout(painelProdutoOS);
        painelProdutoOS.setLayout(painelProdutoOSLayout);
        painelProdutoOSLayout.setHorizontalGroup(
            painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoOSLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOSProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusOSProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelProdutoOSLayout.createSequentialGroup()
                        .addGroup(painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutoOSLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelProdutoOSLayout.createSequentialGroup()
                        .addComponent(codProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unidadeProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addGap(5, 5, 5)
                        .addComponent(valorUniProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnExcluirProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarProduto)))
                .addContainerGap())
        );
        painelProdutoOSLayout.setVerticalGroup(
            painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoOSLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(numOSProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(statusOSProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(unidadeProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(btnOkProduto)
                    .addComponent(valorUniProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotalProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarProduto)
                    .addComponent(btnExcluirProduto))
                .addGap(28, 28, 28)
                .addGroup(painelProdutoOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(totalProdutoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        painelAbasOS.addTab("Produtos", painelProdutoOS);

        painelServicosOS.setPreferredSize(new java.awt.Dimension(1050, 660));

        codServicoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codServicoOSKeyPressed(evt);
            }
        });

        totalServicoOS.setEditable(false);
        totalServicoOS.setBackground(new java.awt.Color(230, 230, 230));
        totalServicoOS.setText("0.0");
        totalServicoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel31.setText("Serviço");

        jLabel32.setText("Valor Total Serviços");

        statusOSServico.setEditable(false);
        statusOSServico.setBackground(new java.awt.Color(230, 230, 230));
        statusOSServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnAlterarServico.setBackground(new java.awt.Color(0, 153, 255));
        btnAlterarServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarServico.setText("Alterar");
        btnAlterarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarServicoActionPerformed(evt);
            }
        });

        jLabel33.setText("Status OS");

        btnOkServico.setBackground(new java.awt.Color(0, 204, 0));
        btnOkServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOkServico.setText("OK");
        btnOkServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkServicoActionPerformed(evt);
            }
        });

        numOSServico.setEditable(false);
        numOSServico.setBackground(new java.awt.Color(230, 230, 230));
        numOSServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel34.setText("Nº OS");

        jLabel35.setText("Valor Uni");

        tabelaServicoOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaServicoOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição Serviço(s)", "Qtd", "Valor Uni", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane3.setViewportView(tabelaServicoOS);
        if (tabelaServicoOS.getColumnModel().getColumnCount() > 0) {
            tabelaServicoOS.getColumnModel().getColumn(0).setResizable(false);
            tabelaServicoOS.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaServicoOS.getColumnModel().getColumn(1).setResizable(false);
            tabelaServicoOS.getColumnModel().getColumn(1).setPreferredWidth(500);
            tabelaServicoOS.getColumnModel().getColumn(2).setResizable(false);
            tabelaServicoOS.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelaServicoOS.getColumnModel().getColumn(3).setResizable(false);
            tabelaServicoOS.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabelaServicoOS.getColumnModel().getColumn(4).setResizable(false);
            tabelaServicoOS.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        qtdServicosOS.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        qtdServicosOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nomeServicosOS.setEditable(false);
        nomeServicosOS.setBackground(new java.awt.Color(230, 230, 230));

        jLabel43.setText("Valor Total");

        valorTotalServicosOS.setEditable(false);
        valorTotalServicosOS.setBackground(new java.awt.Color(230, 230, 230));
        valorTotalServicosOS.setText("0.0");
        valorTotalServicosOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        valorTotalServicosOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorTotalServicosOSMouseClicked(evt);
            }
        });

        valorUniServicosOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorUniServicosOSKeyPressed(evt);
            }
        });

        btnExcluirServico.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluirServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirServico.setText("Excluir");
        btnExcluirServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelServicosOSLayout = new javax.swing.GroupLayout(painelServicosOS);
        painelServicosOS.setLayout(painelServicosOSLayout);
        painelServicosOSLayout.setHorizontalGroup(
            painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelServicosOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelServicosOSLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOSServico, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusOSServico, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelServicosOSLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalServicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelServicosOSLayout.createSequentialGroup()
                        .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(painelServicosOSLayout.createSequentialGroup()
                                .addComponent(codServicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(qtdServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorUniServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnExcluirServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarServico)))
                .addContainerGap())
        );
        painelServicosOSLayout.setVerticalGroup(
            painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelServicosOSLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(numOSServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(statusOSServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtdServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)
                        .addComponent(valorUniServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)
                        .addComponent(valorTotalServicosOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOkServico)
                        .addComponent(btnAlterarServico)
                        .addComponent(btnExcluirServico))
                    .addGroup(painelServicosOSLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(4, 4, 4)
                        .addComponent(codServicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(painelServicosOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(totalServicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        painelAbasOS.addTab("Serviços", painelServicosOS);

        painelChekListOS.setPreferredSize(new java.awt.Dimension(1050, 660));

        jLabel37.setText("Nº OS");

        numOSChecklist.setEditable(false);
        numOSChecklist.setBackground(new java.awt.Color(230, 230, 230));
        numOSChecklist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel38.setText("Modelo Veículo");

        modeloVeiculoChecklist.setEditable(false);
        modeloVeiculoChecklist.setBackground(new java.awt.Color(230, 230, 230));
        modeloVeiculoChecklist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel39.setText("Placa");

        placaVeiculoChecklist.setEditable(false);
        placaVeiculoChecklist.setBackground(new java.awt.Color(230, 230, 230));
        placaVeiculoChecklist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel40.setText("Status OS");

        statusOSChecklist.setEditable(false);
        statusOSChecklist.setBackground(new java.awt.Color(230, 230, 230));
        statusOSChecklist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        painelCheck.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        radioChecklist.setText("Radio");

        calotasChecklist.setText("Calotas");

        antenaChecklist.setText("Antena");

        manualChecklist.setText("Manual");

        bateriaChecklist.setText("Bateria");

        documentosChecklist.setText("Documentos");

        acendedorChecklist.setText("Acendedor");

        tapetesChecklist.setText("Tapetes");

        chaveChecklist.setText("Chave");

        trianguloChecklist.setText("Triangulo");

        macacoChecklist.setText("Macaco");

        extintorChecklist.setText("Extintor");

        limpadorChecklist.setText("Limpador Vidro");

        arChecklist.setText("Ar Condicinado");

        painelVeiculoChecklist.setText("Painel ");

        combustivelChecklist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/1", "1/2", "1/4", "1/8", "1/6", "2/4", "3/4" }));

        jLabel47.setText("Nível Combustível");

        jLabel48.setText("Pneu Estepe");

        kmAtualChecklist.setEditable(false);
        kmAtualChecklist.setBackground(new java.awt.Color(230, 230, 230));
        kmAtualChecklist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pneuTraseiroChecklist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Bom", "Médio", "Velho" }));

        jLabel49.setText("KM Atual");

        jLabel50.setText("Pneus Traseiro");

        pneuDianteiroChecklist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Bom", "Médio", "Velho" }));

        jLabel51.setText("Pneus Dianteiro");

        pneuEstepeChecklist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Bom", "Médio", "Velho", "Sem" }));

        iluminacaoChecklist.setText("Iluminação");

        javax.swing.GroupLayout painelCheckLayout = new javax.swing.GroupLayout(painelCheck);
        painelCheck.setLayout(painelCheckLayout);
        painelCheckLayout.setHorizontalGroup(
            painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCheckLayout.createSequentialGroup()
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel48)
                            .addComponent(combustivelChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pneuDianteiroChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pneuTraseiroChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pneuEstepeChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmAtualChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documentosChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bateriaChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calotasChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(antenaChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acendedorChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tapetesChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(arChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(extintorChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpadorChecklist)
                        .addComponent(painelVeiculoChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chaveChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(macacoChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trianguloChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(iluminacaoChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        painelCheckLayout.setVerticalGroup(
            painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCheckLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel49)
                .addGap(0, 0, 0)
                .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCheckLayout.createSequentialGroup()
                        .addComponent(kmAtualChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47)
                        .addGap(0, 0, 0)
                        .addComponent(combustivelChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51)
                        .addGap(0, 0, 0)
                        .addComponent(pneuDianteiroChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addGap(0, 0, 0)
                        .addComponent(pneuTraseiroChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addGap(0, 0, 0)
                        .addComponent(pneuEstepeChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCheckLayout.createSequentialGroup()
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bateriaChecklist)
                            .addComponent(iluminacaoChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioChecklist)
                            .addComponent(extintorChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calotasChecklist)
                            .addComponent(limpadorChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(antenaChecklist)
                            .addComponent(arChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manualChecklist)
                            .addComponent(painelVeiculoChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentosChecklist)
                            .addComponent(chaveChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acendedorChecklist)
                            .addComponent(macacoChecklist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tapetesChecklist)
                            .addComponent(trianguloChecklist))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Problemas Informado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        problemasInformadosChecklist.setColumns(20);
        problemasInformadosChecklist.setRows(5);
        jScrollPane4.setViewportView(problemasInformadosChecklist);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Problemas Constatados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        problemasEncontradoChecklist.setColumns(20);
        problemasEncontradoChecklist.setRows(5);
        jScrollPane5.setViewportView(problemasEncontradoChecklist);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        javax.swing.GroupLayout painelChekListOSLayout = new javax.swing.GroupLayout(painelChekListOS);
        painelChekListOS.setLayout(painelChekListOSLayout);
        painelChekListOSLayout.setHorizontalGroup(
            painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelChekListOSLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelChekListOSLayout.createSequentialGroup()
                        .addGroup(painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelChekListOSLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOSChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloVeiculoChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaVeiculoChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusOSChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelChekListOSLayout.setVerticalGroup(
            painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelChekListOSLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOSChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloVeiculoChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaVeiculoChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(statusOSChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelChekListOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelChekListOSLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        painelAbasOS.addTab("Check List", painelChekListOS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAbasOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAbasOS, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadatrarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadatrarOSActionPerformed
        //Atualizando status botoes
        btnCadatrarOS.setEnabled(false);
        btnLimparForm.setEnabled(true);
        btnAbrirOS.setEnabled(true);
        btnSalvarOS.setEnabled(false);
        btnExcluirOs.setEnabled(false);
        
        //Habilitando o formulário
        habilitarFormulario(true);
        
        //Desabilitando a pesquisa de OS
        habilitarBusca(true);
         
    }//GEN-LAST:event_btnCadatrarOSActionPerformed

    private void btnAbrirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirOSActionPerformed
        if(codClienteAberturaOS.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro ao tentar abrir OS, informe um cliente", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        habilitarBusca(false);
        painelAbasOS.setEnabledAt(3, true);//Habilitando a aba do checklist
        atualizarBotoes(false);
        btnLimparForm.setEnabled(true);
        btnSalvarOS.setEnabled(true);
        
        //Inserindo infomação do veículo e número de OS da tela de abertura da OS, nas demais telas.
        statusOSProdutos.setText(statusOSAberturaOS.getSelectedItem().toString());
        statusOSServico.setText(statusOSAberturaOS.getSelectedItem().toString());
        statusOSChecklist.setText(statusOSAberturaOS.getSelectedItem().toString());
        modeloVeiculoChecklist.setText(modeloVeiculoAberturaOS.getText());
        placaVeiculoChecklist.setText(placaVeiculoAberturaOS.getText());
        kmAtualChecklist.setText(kmAtualVeiculoAberturaOS.getText());
        
    }//GEN-LAST:event_btnAbrirOSActionPerformed

    private void codClienteAberturaOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codClienteAberturaOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            listaClienteFornecedor = clienteDao.consultarNomeCodigo(codClienteAberturaOS.getText());
            if(listaClienteFornecedor.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cliente/Fornecedor não cadastrado. Cadastre o Cliente/Fornecedor", "Erro", JOptionPane.WARNING_MESSAGE);
            }else{
                for(Pessoa cli : listaClienteFornecedor){
                    codClienteAberturaOS.setText(Integer.toString(cli.getCodigo()));
                    nomeClienteAberturaOS.setText(cli.getRazaoSocial());
                    fantasiaAberturaOS.setText(cli.getNomeFantasia());
                    cpfCnpjAberturaOS.setText(cli.getCpfCnpj());
                    celularAberturaOS.setText(cli.getCelular());
                    emailAberturaOS.setText(cli.getEmail());
                    logradouroAberturaOS.setText(cli.getEndereco().getRua());
                    numEnderecoAberturaOS.setValue(Integer.parseInt(cli.getEndereco().getNumero()));
                    cepEnderecoAberturaOS.setText(cli.getEndereco().getCep());
                    bairroEnderecoAberturaOS.setText(cli.getEndereco().getBairro());
                    cidadeEnderecoAberturaOS.setText(cli.getEndereco().getCidade());
                    estadoEnderecoAberturaOS.setSelectedItem(cli.getEndereco().getEstado());
                }
            }
        }  
    }//GEN-LAST:event_codClienteAberturaOSKeyPressed

    private void btnSalvarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarOSActionPerformed

        if(osSelecionado == null){
            OrdemServico os = dadosFormOs(); 
            osDao.cadastrarOs(os);
        }else{
            List<Produto> produtos = produtosOs();
            List<Servico> servicos = servicoOs();
            OrdemServico os = dadosFormOs();

            os.setProdutos(produtos);
            os.setServicos(servicos);
            os.setNumOS(Integer.parseInt(numOS.getText()));
            os.setTotalProdutos(Double.parseDouble(totalProdutoOS.getText()));
            os.setTotalServicos(Double.parseDouble(totalServicoOS.getText()));
            os.setCodAssociacao(codAssoc);
            
            osDao.alterarOs(os);
            
        }
        
        atualizarBotoes(false);
        habilitarFormulario(false);
        habilitarAbas(false);
        carregarUnidade();
        osSelecionado = null;
        habilitarBusca(true);
        limparFormularioProduto();
        limparFormularioServico();
        limparFormulario();
        habilitarChecklist(true);
    }//GEN-LAST:event_btnSalvarOSActionPerformed

    private void codTecnicoAberturaOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTecnicoAberturaOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            listaClienteFornecedor = clienteDao.consultarNomeCodigo(codTecnicoAberturaOS.getText());
            if(listaClienteFornecedor.isEmpty()){
                JOptionPane.showMessageDialog(null, "Técnico não cadastrado. Cadastre o técnico", "Erro", JOptionPane.WARNING_MESSAGE);
            }else{
                for(Pessoa cli : listaClienteFornecedor){
                    codTecnicoAberturaOS.setText(Integer.toString(cli.getCodigo()));
                    nomeTecnicoAberturaOS.setText(cli.getRazaoSocial());
                }
            }
        }
    }//GEN-LAST:event_codTecnicoAberturaOSKeyPressed

    private void btnCancelarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOSActionPerformed
            OrdemServico os = dadosFormOs();
            String dataCancelamento = data.conversaoData();

            os.setNumOS(Integer.parseInt(numOS.getText()));
            os.setDataCancelamento(dataCancelamento);
            
            osDao.cancelarOs(os);
            
    }//GEN-LAST:event_btnCancelarOSActionPerformed

    private void btnOkBuscarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkBuscarOSActionPerformed
        habilitarFormulario(true);
        habilitarAbas(true);
        
        osSelecionado = osDao.consultarOs(buscarOSAberturaOS.getText());
        carregarDadosOs(osSelecionado);  

        btnCadatrarOS.setEnabled(false);
        btnLimparForm.setEnabled(true);
        btnAbrirOS.setEnabled(false);
        btnSalvarOS.setEnabled(true);
        btnExcluirOs.setEnabled(true);
    }//GEN-LAST:event_btnOkBuscarOSActionPerformed

    private void buscarOSAberturaOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarOSAberturaOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(buscarOSAberturaOS.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "Informe o número de uma OS", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
                
            }else{
                
                osSelecionado = osDao.consultarOs(buscarOSAberturaOS.getText());
                codAssoc = osSelecionado.getCodAssociacao();
                String statusOs = osSelecionado.getStatus();
                
                //Verificando se a OS existe e se está com status aberta
                if(osSelecionado == null){
                    JOptionPane.showMessageDialog(null, "OS não encontrada", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                    
                }else if(statusOs.equalsIgnoreCase("Aberta") || statusOs.equalsIgnoreCase("Em Execução") || statusOs.equalsIgnoreCase("Aguardando Cliente") || statusOs.equalsIgnoreCase("Aguardando Oficina") || statusOs.equalsIgnoreCase("Finalizada")){
                    
                    carregarDadosOs(osSelecionado);                   
                    
                    atualizarTotalServico();
                    atualizarTotalProduto();
                    habilitarFormulario(true);
                    habilitarAbas(true);

                    btnCadatrarOS.setEnabled(false);
                    btnLimparForm.setEnabled(true);
                    btnAbrirOS.setEnabled(false);
                    btnSalvarOS.setEnabled(true);
                    btnExcluirOs.setEnabled(true);
                    habilitarChecklist(false);
                    
                }else{
                    
                    carregarDadosOs(osSelecionado);
                    habilitarChecklist(false);
                    habilitarAbas(true);
                    habilitarFormulario(false);
                    atualizarBotoes(false);
                    btnCadatrarOS.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_buscarOSAberturaOSKeyPressed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        numLinhaSelecionada = tabelaProdutosOS.getSelectedRow(); //A variável recebe o número da linha que foi selecionada para alterar
        
        //Verificando se foi selecionado algum serviço
        if(numLinhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Atribuindo á variáveis, os valores do produto que fora escolhido na tabela
        int codPro = (int)tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 0);
        String descricao = ((String)tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 1));
        Unidades unidade = (Unidades) tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 2);
        int qtd = (int)tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 3);
        double valorUni = (double)tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 4);
        double valorTotal = (double)tabelaProdutosOS.getModel().getValueAt(numLinhaSelecionada, 5);
        
        //Setando nos campos, os valores do produto escolhido na tabela
        codProdutoOS.setText(Integer.toString(codPro));
        nomeProdutoOS.setText(descricao);
        qtdProdutoOS.setValue(qtd);
        valorUniProdutoOS.setText(Double.toString(valorUni));
        valorTotalProdutoOS.setText(Double.toString(valorTotal));
 
        produtoSelecionado = true;
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnOkProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkProdutoActionPerformed
        
        int codPro = Integer.parseInt(codProdutoOS.getText());
        String descricao = nomeProdutoOS.getText();
        Unidades unidade = (Unidades) unidadeProdutoOS.getSelectedItem();
        int qtd = Integer.parseInt(qtdProdutoOS.getValue().toString());
        double valorUni = Double.parseDouble(valorUniProdutoOS.getText());
        double valorTotal = Double.parseDouble(valorTotalProdutoOS.getText());
        
        Produto produto = new Produto(codPro, descricao, unidade, valorUni, qtd, valorTotal);
        
        boolean produtoDupli = verificarProdutoDuplicado(produto); //Verificando se o produto já está na tabela, e retornando um valor booleano
        
        if(produtoDupli == false){ //Se o produto não estiver ele adiciona o produto ou altera
            atualizarTabelaProduto(produto);//Passando o produto para o método que adiciona o produto na tabela
            limparFormularioProduto(); //Limpado os campos referente aos produtos e os seus dados
        }else{
            limparFormularioProduto(); //Limpado os campos referente aos produtos e os seus dados
        }
        
        atualizarTotalProduto();
        valorTotalProdutoOS.setText("0.0");
    }//GEN-LAST:event_btnOkProdutoActionPerformed

    private void btnAlterarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarServicoActionPerformed
        numLinhaSelecionada = tabelaServicoOS.getSelectedRow(); //A variável recebe o número da linha que foi selecionada para alterar
        
        //Verificando se foi selecionado algum serviço
        if(numLinhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Selecione um serviço", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Atribuindo á variáveis, os valores do produto que fora escolhido na tabela
        int codServ = (int)tabelaServicoOS.getModel().getValueAt(numLinhaSelecionada, 0);
        String descricao = ((String)tabelaServicoOS.getModel().getValueAt(numLinhaSelecionada, 1));
        int qtd = (int)tabelaServicoOS.getModel().getValueAt(numLinhaSelecionada, 2);
        double valorUni = (double)tabelaServicoOS.getModel().getValueAt(numLinhaSelecionada, 3);
        double valorTotal = (double)tabelaServicoOS.getModel().getValueAt(numLinhaSelecionada, 4);
        
        //Setando nos campos, os valores do produto escolhido na tabela
        codServicoOS.setText(Integer.toString(codServ));
        nomeServicosOS.setText(descricao);
        qtdServicosOS.setValue(qtd);
        valorUniServicosOS.setText(Double.toString(valorUni));
        valorTotalServicosOS.setText(Double.toString(valorTotal));
 
        servicoSelecionado = true;
    }//GEN-LAST:event_btnAlterarServicoActionPerformed

    private void btnOkServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkServicoActionPerformed
        int codServ = Integer.parseInt(codServicoOS.getText());
        String descricao = nomeServicosOS.getText();
        int qtd = Integer.parseInt(qtdServicosOS.getValue().toString());
        double valorUni = Double.parseDouble(valorUniServicosOS.getText());
        double valorTotal = Double.parseDouble(valorTotalServicosOS.getText());

        Servico servico = new Servico(codServ, descricao, valorUni, qtd, valorTotal);
        
        boolean servDuplic = verificarServicoDuplicado(servico); //Verificando se o serviço já está na tabela, e retornando um valor booleano
        
        if(servDuplic == false){ //Se o serviço não estiver na tabela ele adiciona ou altera
            atualizarTabelaServico(servico);//Passando o serviço para o método que adiciona-o na tabela
            limparFormularioServico(); //Limpado os campos referente aos serviços e os seus dados
        }else{
            limparFormularioServico(); //Limpado os campos referente aos serviços e os seus dados
        }
        
        atualizarTotalServico();
        valorTotalServicosOS.setText("0.0");
    }//GEN-LAST:event_btnOkServicoActionPerformed

    private void codProdutoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codProdutoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            String produto = codProdutoOS.getText();
            List<Produto> listaProdutos = new ArrayList<>();
        
            listaProdutos = produtoDao.consultarProduto(produto);

            for(Produto prod : listaProdutos){
                codProdutoOS.setText(Integer.toString(prod.getCodigo()));
                nomeProdutoOS.setText(prod.getDescricao());
                unidadeProdutoOS.setSelectedItem(prod.getUnidade().getDescricao());
                valorUniProdutoOS.setText(Double.toString(prod.getValorUnitario()));
            }
        }  
    }//GEN-LAST:event_codProdutoOSKeyPressed

    private void valorUniProdutoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUniProdutoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            int qtd = Integer.parseInt(qtdProdutoOS.getValue().toString());
            double valUni = Double.parseDouble(valorUniProdutoOS.getText());          
            double valTot = qtd * valUni;
            
            valorTotalProdutoOS.setText(Double.toString(valTot));
        }  
    }//GEN-LAST:event_valorUniProdutoOSKeyPressed

    private void valorTotalProdutoOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorTotalProdutoOSMouseClicked
        int qtd = Integer.parseInt(qtdProdutoOS.getValue().toString());
        double valUni = Double.parseDouble(valorUniProdutoOS.getText());          
        double valTot = qtd * valUni;

        valorTotalProdutoOS.setText(Double.toString(valTot));
    }//GEN-LAST:event_valorTotalProdutoOSMouseClicked

    private void codServicoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codServicoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            String servico = codServicoOS.getText();
            List<Servico> listaServico = new ArrayList<>();

            listaServico = servicoDao.consultarServico(servico);

            for(Servico serv : listaServico){
                codServicoOS.setText(Integer.toString(serv.getCodigo()));
                nomeServicosOS.setText(serv.getDescricao());
                valorUniServicosOS.setText(Double.toString(serv.getValorUnitario()));
            }
        } 
    }//GEN-LAST:event_codServicoOSKeyPressed

    private void valorTotalServicosOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorTotalServicosOSMouseClicked
       
        int qtd = Integer.parseInt(qtdServicosOS.getValue().toString());
        double valUni = Double.parseDouble(valorUniServicosOS.getText());          
        double valTot = qtd * valUni;

        valorTotalServicosOS.setText(Double.toString(valTot));
    }//GEN-LAST:event_valorTotalServicosOSMouseClicked

    private void valorUniServicosOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUniServicosOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB){
            int qtd = Integer.parseInt(qtdServicosOS.getValue().toString());
            double valUni = Double.parseDouble(valorUniServicosOS.getText());          
            double valTot = qtd * valUni;

            valorTotalServicosOS.setText(Double.toString(valTot));
        }
    }//GEN-LAST:event_valorUniServicosOSKeyPressed

    private void btnExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirServicoActionPerformed
        
        int numLinha = tabelaServicoOS.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(numLinha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um serviço a ser removido da OS", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o serviço selecionado da OS?", "Confirmar", JOptionPane.YES_NO_OPTION);      
        
        if(confirm == JOptionPane.YES_OPTION){
            
            int codServ = ((int)tabelaServicoOS.getModel().getValueAt(numLinha, 0));
            int codAssoc = osSelecionado.getCodAssociacao();
            
            DefaultTableModel model = (DefaultTableModel) tabelaServicoOS.getModel();
            model.removeRow(numLinha);
            
            osDao.excluirServico(codServ, codAssoc);
            atualizarTotalServico();
            
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
  
    }//GEN-LAST:event_btnExcluirServicoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int numLinha = tabelaProdutosOS.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(numLinha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto a ser removido da OS", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o produto selecionado da OS?", "Confirmar", JOptionPane.YES_NO_OPTION);      
        
        if(confirm == JOptionPane.YES_OPTION){
            
            int codProd = ((int)tabelaProdutosOS.getModel().getValueAt(numLinha, 0));
            int codAssoc = osSelecionado.getCodAssociacao();
            
            DefaultTableModel model = (DefaultTableModel) tabelaProdutosOS.getModel();
            model.removeRow(numLinha);
            
            osDao.excluirProduto(codProd, codAssoc);
            atualizarTotalProduto();
            
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnExcluirOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirOsActionPerformed
    
        //Verificando se foi digitado algum número da OS
        if(buscarOSAberturaOS.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o número da OS que será excluída/cancelada", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(osSelecionado.getStatus().equalsIgnoreCase("Aberta")){
            
            int confirm = JOptionPane.showConfirmDialog(null,"Excluir/Cancelar a ordem de serviço "+osSelecionado.getNumOS()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);      
            
            if(confirm == JOptionPane.YES_OPTION){
                osDao.excluirOs(osSelecionado);

            }else if(confirm == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }

            atualizarBotoes(false);
            habilitarFormulario(false);
            habilitarAbas(false);
            carregarUnidade();
            osSelecionado = null;
            habilitarBusca(true);
            limparFormularioProduto();
            limparFormularioServico();
            limparFormulario();
            habilitarChecklist(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Não é possível excluir a OS, pois está fechada", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        
    }//GEN-LAST:event_btnExcluirOsActionPerformed

    private void btnLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFormActionPerformed
        atualizarBotoes(false);
        habilitarFormulario(false);
        habilitarAbas(false);
        habilitarBusca(true);
        limparFormulario();
        habilitarChecklist(true);
    }//GEN-LAST:event_btnLimparFormActionPerformed

    //Atribui os valores do checklist para variáveis e adiciona no objeto Ordem Serviço, para ser cadastrado no banco
    private Checklist dadosChecklistOs(){
        
        String problemaInformado = problemasInformadosChecklist.getText();
        String problemaConstatado = problemasEncontradoChecklist.getText();
        String kmAtual = kmAtualChecklist.getText();
        String nivelCombustivel = combustivelChecklist.getSelectedItem().toString();
        String pneusDianteiro = pneuDianteiroChecklist.getSelectedItem().toString();
        String pneusTraseiros = pneuTraseiroChecklist.getSelectedItem().toString();
        String pneuEstepe = pneuEstepeChecklist.getSelectedItem().toString();
        int bateria = 0, radio = 0, calotas = 0, antenas = 0, antena = 0, manual = 0, documentos = 0, acendedor = 0, tapetes = 0, iluminacao = 0, extintor = 0, limpadorVidro = 0, arCondicionado = 0, painel = 0, chave = 0, macaco = 0, triangulo = 0;
        
        if(bateriaChecklist.isSelected()){
            bateria = 1;
        }
        if(radioChecklist.isSelected()){
            radio = 1;
        }
        if(calotasChecklist.isSelected()){
            calotas = 1;
        }
        if(antenaChecklist.isSelected()){
            antenas = 1;
        }
        if(manualChecklist.isSelected()){
            manual = 1;
        }
        if(documentosChecklist.isSelected()){
            documentos = 1;
        }
        if(acendedorChecklist.isSelected()){
            acendedor = 1;
        }
        if(tapetesChecklist.isSelected()){
            tapetes = 1;
        }
        if(iluminacaoChecklist.isSelected()){
            iluminacao = 1;
        }
        if(extintorChecklist.isSelected()){
            extintor = 1;
        }
        if(limpadorChecklist.isSelected()){
            limpadorVidro = 1;
        }        
        if(arChecklist.isSelected()){
            arCondicionado = 1;
        }
        if(painelVeiculoChecklist.isSelected()){
            painel = 1;
        }
        if(chaveChecklist.isSelected()){
            chave = 1;
        }
        if(macacoChecklist.isSelected()){
            macaco = 1;
        }
        if(trianguloChecklist.isSelected()){
            triangulo = 1;
        }
        
        Checklist checklist = new Checklist(bateria, radio, calotas, antenas, manual, documentos, acendedor, tapetes, iluminacao, arCondicionado, painel, chave, macaco, triangulo, extintor, limpadorVidro, problemaInformado, problemaConstatado, kmAtual, nivelCombustivel, pneusDianteiro, pneusTraseiros, pneuEstepe);
    
        return checklist;
        
    }
    
    //Atribui os valores do formulário para variáveis e adiciona no objeto Ordem Serviço, para ser cadastrado no banco
    private OrdemServico dadosFormOs(){

        //Atribuindo as variáveis os valores inseridos no formulário
        int codCliente = Integer.parseInt(codClienteAberturaOS.getText());
        String cpfCnpj = cpfCnpjAberturaOS.getText();
        String razaoSocial = nomeClienteAberturaOS.getText();
        String nomeFantasia = fantasiaAberturaOS.getText();
        String celular = celularAberturaOS.getText();
        String email = emailAberturaOS.getText();
        String logradouro = logradouroAberturaOS.getText();
        String numCasa = numEnderecoAberturaOS.getValue().toString();
        String bairro = bairroEnderecoAberturaOS.getText();
        String cep = cepEnderecoAberturaOS.getText();
        String cidade = cidadeEnderecoAberturaOS.getText();
        String estado = estadoEnderecoAberturaOS.getSelectedItem().toString();
        int codTecnico = Integer.parseInt(codTecnicoAberturaOS.getText());
        String nomeTecnico = nomeTecnicoAberturaOS.getText();
        String status = statusOSAberturaOS.getSelectedItem().toString();
        String observacao = observAberturaOS.getText();
        String modeloVeiculo = modeloVeiculoAberturaOS.getText();
        String corVeiculo = corVeiculoAberturaOS.getText();
        String placaVeiculo = placaVeiculoAberturaOS.getText();
        String anoVeiculo = anoVeiculoAberturaOS.getText();
        String marcaVeiculo = marcaVeiculoAberturaOS.getText();
        String kmVeiculo = kmAtualVeiculoAberturaOS.getText();
        String chassiVeiculo = chassiVeiculoAberturaOS.getText();
        String crlvVeiculo = docVeiculoAberturaOS.getText();
        String prioridadeOS = prioridadeOSAberturaOS.getSelectedItem().toString();
        String dataAbertura = data.conversaoData();
        
        
        //Istanciando os obejetos que serão inseridos no objeto OS
        Endereco endereco = new Endereco(logradouro, numCasa, cep, bairro, cidade, estado);
        Veiculo veiculo = new Veiculo(modeloVeiculo, corVeiculo, placaVeiculo, anoVeiculo, marcaVeiculo, kmVeiculo, chassiVeiculo, crlvVeiculo);
        Pessoa cliente = new Pessoa(razaoSocial, nomeFantasia, cpfCnpj, celular, email, endereco, codCliente);
        Pessoa tecnico = new Pessoa(nomeTecnico, codTecnico);    
        Checklist check = dadosChecklistOs();
        
        OrdemServico os = new OrdemServico(cliente, status, dataAbertura, observacao, tecnico, veiculo, prioridadeOS, check);
    
        return os;
    }
    
    //Percorre a a tabela de produtos e adiciona todos os produtos na lista para serem inseridos no banco de dados
    private List<Produto> produtosOs(){
        int cont = 0;
        int qtdLinhas = tabelaProdutosOS.getRowCount();
        List<Produto> listaProdutos = new ArrayList<>();
        
        for(int i = 0; i < qtdLinhas; i++){
            
            int codProduto = ((int)tabelaProdutosOS.getModel().getValueAt(i, 0));
            String descricao = (String) tabelaProdutosOS.getModel().getValueAt(i, 1);  
            Unidades unidade = (Unidades) tabelaProdutosOS.getModel().getValueAt(i, 2);
            int qtd = ((int)tabelaProdutosOS.getModel().getValueAt(i, 3));
            double valorUni = ((double)tabelaProdutosOS.getModel().getValueAt(i, 4));
            double valorTotal = ((double)tabelaProdutosOS.getModel().getValueAt(i, 5));
            
            Produto produtos = new Produto(codProduto, descricao, unidade, valorUni, qtd, valorTotal);
            
            listaProdutos.add(produtos);
        }  
        
        return listaProdutos;
    }
    
    //Percorre a a tabela de serviço e adiciona todos os serviços na lista para serem inseridos no banco de dados
    private List<Servico> servicoOs(){
        int cont = 0;
        int qtdLinhas = tabelaServicoOS.getRowCount();
        List<Servico> listaServico = new ArrayList<>();
        
        for(int i = 0; i < qtdLinhas; i++){
            int codServico = ((int) tabelaServicoOS.getModel().getValueAt(i, 0));
            String descricao = (String) tabelaServicoOS.getModel().getValueAt(i, 1);
            int qtd = ((int) tabelaServicoOS.getModel().getValueAt(i, 2));
            double valorUni = ((double) tabelaServicoOS.getModel().getValueAt(i, 3));
            double valorTotal = ((double) tabelaServicoOS.getModel().getValueAt(i, 4));

            Servico servico = new Servico(codServico, descricao, valorUni, qtd, valorTotal);
            listaServico.add(servico);
        }  
        
        return listaServico;
    }
    
    //Carrega os dados vindo do banco, e preeche o formulário com os dados.
    private void carregarDadosOs(OrdemServico os){
        
        codClienteAberturaOS.setText(Integer.toString(os.getCliente().getCodigo()));
        cpfCnpjAberturaOS.setText(os.getCliente().getCpfCnpj());
        nomeClienteAberturaOS.setText(os.getCliente().getRazaoSocial());
        fantasiaAberturaOS.setText(os.getCliente().getNomeFantasia());
        celularAberturaOS.setText(os.getCliente().getTelefone());;
        emailAberturaOS.setText(os.getCliente().getEmail());
        logradouroAberturaOS.setText(os.getCliente().getEndereco().getRua());
        numEnderecoAberturaOS.setValue(Integer.valueOf(os.getCliente().getEndereco().getNumero()));
        bairroEnderecoAberturaOS.setText(os.getCliente().getEndereco().getBairro());
        cepEnderecoAberturaOS.setText(os.getCliente().getEndereco().getCep());
        cidadeEnderecoAberturaOS.setText(os.getCliente().getEndereco().getCidade());
        estadoEnderecoAberturaOS.setSelectedItem(os.getCliente().getEndereco().getEstado().toString());
        codTecnicoAberturaOS.setText(Integer.toString(os.getTecnico().getCodigo()));
        nomeTecnicoAberturaOS.setText(os.getTecnico().getRazaoSocial());
        statusOSAberturaOS.setSelectedItem(os.getStatus().toString());
        observAberturaOS.setText(os.getObservacao());
        modeloVeiculoAberturaOS.setText(os.getVeiculo().getNomeVeiculo());
        corVeiculoAberturaOS.setText(os.getVeiculo().getCorVeiculo());
        placaVeiculoAberturaOS.setText(os.getVeiculo().getPlacaVeiculo());
        anoVeiculoAberturaOS.setText(os.getVeiculo().getAnoVeiculo());
        marcaVeiculoAberturaOS.setText(os.getVeiculo().getMarcaVeiculo());
        kmAtualVeiculoAberturaOS.setText(os.getVeiculo().getKmVeiculo());
        chassiVeiculoAberturaOS.setText(os.getVeiculo().getChassiVeiculo());
        docVeiculoAberturaOS.setText(os.getVeiculo().getCrlvVeiculo());
        prioridadeOSAberturaOS.setSelectedItem(os.getPrioridadeOS().toString());

        numOS.setText(Integer.toString(os.getNumOS()));
        numOSChecklist.setText(Integer.toString(os.getNumOS()));
        numOSProdutos.setText(Integer.toString(os.getNumOS()));
        numOSServico.setText(Integer.toString(os.getNumOS()));

        statusOSChecklist.setText(os.getStatus());
        statusOSProdutos.setText(os.getStatus());
        statusOSServico.setText(os.getStatus());

        placaVeiculoChecklist.setText(os.getVeiculo().getPlacaVeiculo());
        modeloVeiculoChecklist.setText(os.getVeiculo().getNomeVeiculo());

        carregarProdutos(os.getProdutos());
        carregarServicos(os.getServicos());
        carregarChecklist(os.getChecklist());
        
    }
    
    //Atualizar tabela de produtos com os dados obtido da consulta da OS
    private void carregarProdutos(List<Produto> listaProdutos){
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosOS.getModel();
        model.setNumRows(0);

        for(Produto prod : listaProdutos){
            model.addRow(new Object[]{prod.getCodigo(), prod.getDescricao(), prod.getUnidade(), prod.getQuantidade(), prod.getValorUnitario(), prod.getValorTotal()});
        }

    }
    
    //Atualizar tabela de serviço com os dados obtido da consulta da OS
    private void carregarServicos(List<Servico> listaServicos){

        DefaultTableModel model = (DefaultTableModel) tabelaServicoOS.getModel();
        model.setNumRows(0);

        for(Servico serv : listaServicos){
            model.addRow(new Object[]{serv.getCodigo(), serv.getDescricao(), serv.getQuantidade(), serv.getValorUnitario(), serv.getValorTotal()});
        }

    }
    
    //Carrega checklist com os dados obtidos da consulta da OS
    private void carregarChecklist(Checklist check){
                
        problemasInformadosChecklist.setText(check.getProblemaInformado());
        problemasEncontradoChecklist.setText(check.getProblemaConstatado());
        kmAtualChecklist.setText(check.getKmAtual());
        combustivelChecklist.setSelectedItem(check.getNivelCombustivel());
        pneuDianteiroChecklist.setSelectedItem(check.getPneusDianteiro());
        pneuTraseiroChecklist.setSelectedItem(check.getPneusTraseiro());
        pneuEstepeChecklist.setSelectedItem(check.getPneuEstepe());
        
        if(check.getBateria() == 1){
            bateriaChecklist.isSelected();
        }
        if(check.getRadio() == 1){
            radioChecklist.isSelected();
        }
        if(check.getCalotas() == 1){
            calotasChecklist.isSelected();
        }
        if(check.getAntena() == 1){
            antenaChecklist.isSelected();
        }
        if(check.getManual() == 1){
            manualChecklist.isSelected();
        }
        if(check.getDocumentos() == 1){
            documentosChecklist.isSelected();
        }
        if(check.getAcendedor() == 1){
            acendedorChecklist.isSelected();
        }
        if(check.getTapetes() == 1){
            tapetesChecklist.isSelected();
        }
        if(check.getIluminacao() == 1){
            iluminacaoChecklist.isSelected();
        }
        if(check.getExtintor() == 1){
            extintorChecklist.isSelected();
        }
        if(check.getLimpadorVidro() == 1){
            limpadorChecklist.isSelected();
        }        
        if(check.getArCondicionado() == 1){
            arChecklist.isSelected();
        }
        if(check.getPainel() == 1){
            painelVeiculoChecklist.isSelected();
        }
        if(check.getChaves() == 1){
            chaveChecklist.isSelected();
        }
        if(check.getMacaco() == 1){
            macacoChecklist.isSelected();
        }
        if(check.getTriangulo() == 1){
            trianguloChecklist.isSelected();
        }
        
    }
    
    //Atualizar tabela quando for adicionado ou alterado um produto
    private void atualizarTabelaProduto(Produto produto){
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosOS.getModel();
        
        if(produtoSelecionado){
            model.setValueAt(produto.getCodigo(), numLinhaSelecionada, 0);
            model.setValueAt(produto.getDescricao(), numLinhaSelecionada, 1);
            model.setValueAt(produto.getUnidade(), numLinhaSelecionada, 2);
            model.setValueAt(produto.getQuantidade(), numLinhaSelecionada, 3);
            model.setValueAt(produto.getValorUnitario(), numLinhaSelecionada, 4);
            model.setValueAt(produto.getValorTotal(), numLinhaSelecionada, 5);
        }else{
            model.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getUnidade(), produto.getQuantidade(), produto.getValorUnitario(), produto.getValorTotal()});
        }
        
        produtoSelecionado = false;
    }
    
    //Ao adicionar os produtos, verificam se eles já estão na tabela de produtos
    private boolean verificarProdutoDuplicado(Produto produto){
        
        int totalLinhas = tabelaProdutosOS.getRowCount();
        boolean prodDupli = false;
        
        for(int i = 0; i < totalLinhas; i++){
            int codProduto = ((int)tabelaProdutosOS.getModel().getValueAt(i, 0));
            
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
    
    //Atualiza o valor total de todos os produtos que consta na tabela
    private void atualizarTotalProduto(){
        double totalProduto = 0;
        int totalLinhas = tabelaProdutosOS.getRowCount(); //Recebe o total de linhas da tabela
    
        for(int i = 0; i < totalLinhas; i++){
            double valor = ((double)tabelaProdutosOS.getModel().getValueAt(i, 5));
            totalProduto += valor;  
        }
        
        totalProdutoOS.setText(Double.toString(totalProduto));
    }
    
    //Limpar o formulário de inserção dos produtos
    private void limparFormularioProduto(){
        codProdutoOS.setText("");
        nomeProdutoOS.setText("");
        valorUniProdutoOS.setText("");
        valorTotalProdutoOS.setText("");
        qtdProdutoOS.setValue(1);
    } 
    
    //Atualiza a tabela de serviços conformer as alterações e inserções
    private void atualizarTabelaServico(Servico servico){
        
        DefaultTableModel model = (DefaultTableModel) tabelaServicoOS.getModel();
        
        if(servicoSelecionado){
            model.setValueAt(servico.getCodigo(), numLinhaSelecionada, 0);
            model.setValueAt(servico.getDescricao(), numLinhaSelecionada, 1);
            model.setValueAt(servico.getQuantidade(), numLinhaSelecionada, 2);
            model.setValueAt(servico.getValorUnitario(), numLinhaSelecionada, 3);
            model.setValueAt(servico.getValorTotal(), numLinhaSelecionada, 4);
        }else{
            model.addRow(new Object[]{servico.getCodigo(), servico.getDescricao(), servico.getQuantidade(), servico.getValorUnitario(), servico.getValorTotal()});
        }
        
        servicoSelecionado = false;
    }
    
    //Ao adicionar um serviço, verifica se ele já está na tabela
    private boolean verificarServicoDuplicado(Servico servico){
        
        int totalLinhas = tabelaServicoOS.getRowCount();
        boolean servDupli = false;
        
        for(int i = 0; i < totalLinhas; i++){
            int codServico = ((int)tabelaServicoOS.getModel().getValueAt(i, 0));
            
            //Verifica se o codigo do produto que vai ser inserido, já consta na tabela
            if(codServico == servico.getCodigo() && servicoSelecionado == false){
                int confirm = JOptionPane.showConfirmDialog(null,"Serviço já foi adicionado. Alterar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    servicoSelecionado = true;
                    numLinhaSelecionada = i;
                    JOptionPane.showMessageDialog(null, "Serviço alterado");
                }else if(confirm == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    servDupli = true;
                }
            }

        }
        
        return  servDupli;
    }
    
    //Atualiza o valor total de todos os serviços que consta na tabela
    private void atualizarTotalServico(){
        double totalServico = 0;
        int totalLinhas = tabelaServicoOS.getRowCount(); //Recebe o total de linhas da tabela
    
        for(int i = 0; i < totalLinhas; i++){
            double valor = ((double)tabelaServicoOS.getModel().getValueAt(i, 4));
            totalServico += valor;  
        }
        
        totalServicoOS.setText(Double.toString(totalServico));
    }
    
    //Limpar o formulário de inserção dos serviços
    private void limparFormularioServico(){
        codServicoOS.setText("");
        nomeServicosOS.setText("");
        valorUniServicosOS.setText("");
        valorTotalServicosOS.setText("");
        qtdServicosOS.setValue(1);

    }
    
    //Carrega as unidades no JComboBox
    private void carregarUnidade(){
        
        List<Unidades> listaUnidades = unidadeDao.consultarUnidades();
        DefaultComboBoxModel modeloProduto = (DefaultComboBoxModel)unidadeProdutoOS.getModel();

        modeloProduto.removeAllElements();

        for(Unidades unidade : listaUnidades){
            modeloProduto.addElement(unidade);
        }
        
    }
    
    private void atualizarBotoes(boolean status){
        btnCadatrarOS.setEnabled(!status);
        btnLimparForm.setEnabled(status);
        btnAbrirOS.setEnabled(status);
        btnSalvarOS.setEnabled(status);
        btnExcluirOs.setEnabled(status);
        btnCancelarOS.setEnabled(status);
    }
    
    //Habilita o campo para buscar a OS, ele só fica desabilitado quando está cadastrando um OS
    public void habilitarBusca(boolean status){
        buscarOSAberturaOS.setEnabled(status);
        btnOkBuscarOS.setEnabled(status);
    }
    
    //Habilita o formulário para cadastrar e desabilita quando a OS não está aberta
    private void habilitarFormulario(boolean status){
        
        nomeClienteAberturaOS.setEnabled(status);
        codClienteAberturaOS.setEnabled(status);
        fantasiaAberturaOS.setEnabled(status);
        cpfCnpjAberturaOS.setEnabled(status);
        celularAberturaOS.setEnabled(status);
        emailAberturaOS.setEnabled(status);
        logradouroAberturaOS.setEnabled(status);
        numEnderecoAberturaOS.setEnabled(status);
        bairroEnderecoAberturaOS.setEnabled(status);
        cepEnderecoAberturaOS.setEnabled(status);
        cidadeEnderecoAberturaOS.setEnabled(status);
        estadoEnderecoAberturaOS.setEnabled(status);
        marcaVeiculoAberturaOS.setEnabled(status);
        placaVeiculoAberturaOS.setEnabled(status);
        anoVeiculoAberturaOS.setEnabled(status);
        kmAtualVeiculoAberturaOS.setEnabled(status);
        chassiVeiculoAberturaOS.setEnabled(status);
        docVeiculoAberturaOS.setEnabled(status);
        modeloVeiculoAberturaOS.setEnabled(status);
        corVeiculoAberturaOS.setEnabled(status);
        observAberturaOS.setEnabled(status);
        codTecnicoAberturaOS.setEnabled(status);
        nomeTecnicoAberturaOS.setEnabled(status);
        prioridadeOSAberturaOS.setEnabled(status);
        statusOSAberturaOS.setEnabled(status);
        tabelaProdutosOS.setEnabled(status);
        tabelaServicoOS.setEnabled(status);
        btnOkProduto.setEnabled(status);
        btnOkServico.setEnabled(status);
        btnExcluirProduto.setEnabled(status);
        btnExcluirServico.setEnabled(status);
        btnAlterarProduto.setEnabled(status);
        btnAlterarServico.setEnabled(status);
        problemasEncontradoChecklist.setEnabled(status);
        problemasInformadosChecklist.setEnabled(status);
    } 
    
    private void habilitarAbas(boolean status){
        painelAbasOS.setEnabledAt(1, status);
        painelAbasOS.setEnabledAt(2, status);
        painelAbasOS.setEnabledAt(3, status);
    }
    
    private void limparFormulario(){
        
        codClienteAberturaOS.setText("");
        cpfCnpjAberturaOS.setText("");
        nomeClienteAberturaOS.setText("");
        fantasiaAberturaOS.setText("");
        celularAberturaOS.setText("");
        emailAberturaOS.setText("");
        logradouroAberturaOS.setText("");
        numEnderecoAberturaOS.getValue().toString();
        bairroEnderecoAberturaOS.setText("");
        cepEnderecoAberturaOS.setText("");
        cidadeEnderecoAberturaOS.setText("");
        estadoEnderecoAberturaOS.setSelectedItem("");
        codTecnicoAberturaOS.setText("");
        nomeTecnicoAberturaOS.setText("");
        observAberturaOS.setText("");
        modeloVeiculoAberturaOS.setText("");
        corVeiculoAberturaOS.setText("");
        placaVeiculoAberturaOS.setText("");
        anoVeiculoAberturaOS.setText("1990");
        marcaVeiculoAberturaOS.setText("");
        kmAtualVeiculoAberturaOS.setText("");
        chassiVeiculoAberturaOS.setText("");
        docVeiculoAberturaOS.setText("");
        buscarOSAberturaOS.setText("");
        statusOSProdutos.setText("");
        statusOSServico.setText("");
        numOS.setText("");
        numOSChecklist.setText("");
        numOSProdutos.setText("");
        numOSServico.setText("");
  
        statusOSChecklist.setText("");
        problemasEncontradoChecklist.setText("");
        problemasInformadosChecklist.setText("");
        modeloVeiculoChecklist.setText("");
        placaVeiculoChecklist.setText("");
        kmAtualChecklist.setText("");
        combustivelChecklist.setSelectedIndex(0);
        pneuDianteiroChecklist.setSelectedIndex(0);
        pneuEstepeChecklist.setSelectedIndex(0);
        pneuTraseiroChecklist.setSelectedIndex(0);
        bateriaChecklist.setSelected(false);
        radioChecklist.setSelected(false);
        calotasChecklist.setSelected(false);
        antenaChecklist.setSelected(false);
        manualChecklist.setSelected(false);
        documentosChecklist.setSelected(false);
        acendedorChecklist.setSelected(false);
        tapetesChecklist.setSelected(false);
        iluminacaoChecklist.setSelected(false);
        extintorChecklist.setSelected(false);
        limpadorChecklist.setSelected(false);
        arChecklist.setSelected(false);
        painelVeiculoChecklist.setSelected(false);
        chaveChecklist.setSelected(false);
        macacoChecklist.setSelected(false);
        trianguloChecklist.setSelected(false);
        
        
    }
   
    //Método para desabiliar alguns dados do checklist, quando for consultado.
    private void habilitarChecklist(boolean status){

        kmAtualChecklist.setEnabled(status);
        combustivelChecklist.setEnabled(status);
        pneuDianteiroChecklist.setEnabled(status);
        pneuTraseiroChecklist.setEnabled(status);
        pneuEstepeChecklist.setEnabled(status);

        bateriaChecklist.setEnabled(status);
        radioChecklist.setEnabled(status);
        calotasChecklist.setEnabled(status);
        antenaChecklist.setEnabled(status);
        manualChecklist.setEnabled(status);
        documentosChecklist.setEnabled(status);
        acendedorChecklist.setEnabled(status);
        tapetesChecklist.setEnabled(status);
        iluminacaoChecklist.setEnabled(status);
        extintorChecklist.setEnabled(status);
        limpadorChecklist.setEnabled(status);
        arChecklist.setEnabled(status);
        painelVeiculoChecklist.setEnabled(status);
        chaveChecklist.setEnabled(status);
        macacoChecklist.setEnabled(status);
        trianguloChecklist.setEnabled(status);
        
    }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acendedorChecklist;
    private javax.swing.JTextField anoVeiculoAberturaOS;
    private javax.swing.JCheckBox antenaChecklist;
    private javax.swing.JCheckBox arChecklist;
    private javax.swing.JTextField bairroEnderecoAberturaOS;
    private javax.swing.JCheckBox bateriaChecklist;
    private javax.swing.JButton btnAbrirOS;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnAlterarServico;
    private javax.swing.JButton btnCadatrarOS;
    private javax.swing.JButton btnCancelarOS;
    private javax.swing.JButton btnExcluirOs;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnExcluirServico;
    private javax.swing.JButton btnLimparForm;
    private javax.swing.JButton btnOkBuscarOS;
    private javax.swing.JButton btnOkProduto;
    private javax.swing.JButton btnOkServico;
    private javax.swing.JButton btnSalvarOS;
    private javax.swing.JTextField buscarOSAberturaOS;
    private javax.swing.JCheckBox calotasChecklist;
    private javax.swing.JTextField celularAberturaOS;
    private javax.swing.JFormattedTextField cepEnderecoAberturaOS;
    private javax.swing.JTextField chassiVeiculoAberturaOS;
    private javax.swing.JCheckBox chaveChecklist;
    private javax.swing.JTextField cidadeEnderecoAberturaOS;
    private javax.swing.JTextField codClienteAberturaOS;
    private javax.swing.JTextField codProdutoOS;
    private javax.swing.JTextField codServicoOS;
    private javax.swing.JTextField codTecnicoAberturaOS;
    private javax.swing.JComboBox<String> combustivelChecklist;
    private javax.swing.JTextField corVeiculoAberturaOS;
    private javax.swing.JTextField cpfCnpjAberturaOS;
    private javax.swing.JTextField docVeiculoAberturaOS;
    private javax.swing.JCheckBox documentosChecklist;
    private javax.swing.JTextField emailAberturaOS;
    private javax.swing.JComboBox<String> estadoEnderecoAberturaOS;
    private javax.swing.JCheckBox extintorChecklist;
    private javax.swing.JTextField fantasiaAberturaOS;
    private javax.swing.JCheckBox iluminacaoChecklist;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField kmAtualChecklist;
    private javax.swing.JTextField kmAtualVeiculoAberturaOS;
    private javax.swing.JCheckBox limpadorChecklist;
    private javax.swing.JTextField logradouroAberturaOS;
    private javax.swing.JCheckBox macacoChecklist;
    private javax.swing.JCheckBox manualChecklist;
    private javax.swing.JTextField marcaVeiculoAberturaOS;
    private javax.swing.JTextField modeloVeiculoAberturaOS;
    private javax.swing.JTextField modeloVeiculoChecklist;
    private javax.swing.JTextField nomeClienteAberturaOS;
    private javax.swing.JTextField nomeProdutoOS;
    private javax.swing.JTextField nomeServicosOS;
    private javax.swing.JTextField nomeTecnicoAberturaOS;
    private javax.swing.JSpinner numEnderecoAberturaOS;
    private javax.swing.JTextField numOS;
    private javax.swing.JTextField numOSChecklist;
    private javax.swing.JTextField numOSProdutos;
    private javax.swing.JTextField numOSServico;
    private javax.swing.JTextArea observAberturaOS;
    private javax.swing.JTabbedPane painelAbasOS;
    private javax.swing.JPanel painelAberturaOS;
    private javax.swing.JPanel painelCheck;
    private javax.swing.JPanel painelChekListOS;
    private javax.swing.JPanel painelProdutoOS;
    private javax.swing.JPanel painelServicosOS;
    private javax.swing.JCheckBox painelVeiculoChecklist;
    private javax.swing.JFormattedTextField placaVeiculoAberturaOS;
    private javax.swing.JTextField placaVeiculoChecklist;
    private javax.swing.JComboBox<String> pneuDianteiroChecklist;
    private javax.swing.JComboBox<String> pneuEstepeChecklist;
    private javax.swing.JComboBox<String> pneuTraseiroChecklist;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> prioridadeOSAberturaOS;
    private javax.swing.JTextArea problemasEncontradoChecklist;
    private javax.swing.JTextArea problemasInformadosChecklist;
    private javax.swing.JSpinner qtdProdutoOS;
    private javax.swing.JSpinner qtdServicosOS;
    private javax.swing.JCheckBox radioChecklist;
    private javax.swing.JComboBox<String> statusOSAberturaOS;
    private javax.swing.JTextField statusOSChecklist;
    private javax.swing.JTextField statusOSProdutos;
    private javax.swing.JTextField statusOSServico;
    private javax.swing.JTable tabelaProdutosOS;
    private javax.swing.JTable tabelaServicoOS;
    private javax.swing.JCheckBox tapetesChecklist;
    private javax.swing.JFormattedTextField totalProdutoOS;
    private javax.swing.JFormattedTextField totalServicoOS;
    private javax.swing.JCheckBox trianguloChecklist;
    private javax.swing.JComboBox<String> unidadeProdutoOS;
    private javax.swing.JTextField valorTotalProdutoOS;
    private javax.swing.JFormattedTextField valorTotalServicosOS;
    private javax.swing.JTextField valorUniProdutoOS;
    private javax.swing.JTextField valorUniServicosOS;
    // End of variables declaration//GEN-END:variables
}
