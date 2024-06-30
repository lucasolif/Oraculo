
package view.cadastros;

import model.Pessoa;
import model.Endereco;
import dao.PessoasDao;
import dao.TipoCadastroDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Data;
import model.Entidades;
import model.TipoCadastro;
import model.Usuario;

public class PessoasForm extends javax.swing.JInternalFrame {
    
    private PessoasDao clienteFornecedorDao = new PessoasDao();
    private TipoCadastroDao tipoCadastroDao = new TipoCadastroDao();
    private Pessoa clienteSelecionado;
    private List<Pessoa> listaClienteFornecedor;
    private Data data = new Data();
    
    public PessoasForm() {
        initComponents();
        atualizarBotao(false);
        habilitarFormulario(false);
        campoCodCliente.setEnabled(false);
        carregarTipoCadastro();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPessoa = new javax.swing.ButtonGroup();
        tipoSexo = new javax.swing.ButtonGroup();
        painelCadastroCliente = new javax.swing.JDesktopPane();
        painelCadastro = new javax.swing.JPanel();
        buscaClienteFornecedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        dadosPessoaisCliente = new javax.swing.JPanel();
        campoCpfCnpj = new javax.swing.JTextField();
        campoRg = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoRazaoSocial = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tipoCadastro = new javax.swing.JComboBox<>();
        campoIM = new javax.swing.JTextField();
        campoIE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radioPessoaFisica = new javax.swing.JRadioButton();
        radioPessoaJuridica = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoCelular = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoDataNascimento = new javax.swing.JFormattedTextField();
        orientacaoSexual = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        campoCodCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JPanel();
        campoBairro = new javax.swing.JTextField();
        campoNum = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        campoCep = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Clientes/Fornecedor");
        setPreferredSize(new java.awt.Dimension(1181, 715));
        setRequestFocusEnabled(false);

        buscaClienteFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscaClienteFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaClienteFornecedorKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Buscar");

        btnPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        btnCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        dadosPessoaisCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        campoRg.setVerifyInputWhenFocusTarget(false);

        jLabel13.setText("Tipo de Cadastro*");

        jLabel1.setText("CPF/CNPJ*");

        jLabel3.setText("Nome Fantasia");

        jLabel5.setText("Razão Social *");

        jLabel2.setText("Telefone");

        jLabel4.setText("Celular *");

        jLabel7.setText("Data Nascimento*");

        jLabel8.setText("Insc Municipal");

        jLabel9.setText("Insc Estadual");

        jLabel11.setText("E-mail*");

        tipoPessoa.add(radioPessoaFisica);
        radioPessoaFisica.setText("Física");

        tipoPessoa.add(radioPessoaJuridica);
        radioPessoaJuridica.setText("Jurídica");

        jLabel21.setText("Tipo Pessoa");

        jLabel6.setText("RG");

        try {
            campoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        orientacaoSexual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));

        jLabel20.setText("Sexo");

        campoCodCliente.setEditable(false);

        jLabel22.setText("Código");

        javax.swing.GroupLayout dadosPessoaisClienteLayout = new javax.swing.GroupLayout(dadosPessoaisCliente);
        dadosPessoaisCliente.setLayout(dadosPessoaisClienteLayout);
        dadosPessoaisClienteLayout.setHorizontalGroup(
            dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                                    .addComponent(radioPessoaFisica)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioPessoaJuridica))
                                .addComponent(jLabel21))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCodCliente)
                                .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoIM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(campoIE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoDataNascimento))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(orientacaoSexual, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(tipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel11)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dadosPessoaisClienteLayout.setVerticalGroup(
            dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioPessoaJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)))
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoRg)
                            .addComponent(campoIE))))
                .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisClienteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(tipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPessoaisClienteLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orientacaoSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        enderecoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel12.setText("Logradouro*");

        jLabel14.setText("Número*");

        jLabel15.setText("CEP*");

        jLabel16.setText("Bairro*");

        jLabel17.setText("Cidade*");

        jLabel18.setText("Estado*");

        jLabel19.setText("Complemento");

        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "S", "SE", "TO", "DF" }));

        try {
            campoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout enderecoClienteLayout = new javax.swing.GroupLayout(enderecoCliente);
        enderecoCliente.setLayout(enderecoClienteLayout);
        enderecoClienteLayout.setHorizontalGroup(
            enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19)
                    .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(enderecoClienteLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(129, 129, 129)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(campoEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enderecoClienteLayout.setVerticalGroup(
            enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enderecoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enderecoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(campoEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes/Fornecedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jScrollPane1.setToolTipText("Clientes/Fornecedores");

        tabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CPF/CNPJ", "Razão Social", "Nome Fantasia", "Tipo Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(350);
            tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabelaCliente.getColumnModel().getColumn(4).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        btnAlterar.setBackground(new java.awt.Color(0, 102, 255));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaClienteFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar))
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelCadastroLayout.createSequentialGroup()
                            .addComponent(btnCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAlterar)
                            .addGap(9, 9, 9)
                            .addComponent(btnExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar))
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(dadosPessoaisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscaClienteFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dadosPessoaisCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        painelCadastroCliente.setLayer(painelCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        atualizarTabela();
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //Atribuindo os dados inseridos nos formulario a variáveis
        String nome = campoRazaoSocial.getText();
        String fantasia = campoNome.getText();
        String cpfCnpj = campoCpfCnpj.getText();
        String rg = campoRg.getText();
        String dataNascimento = campoDataNascimento.getText();
        String inscriMunicipal = campoIM.getText();
        String inscriEstadual = campoIE.getText();
        String telefone = campoTelefone.getText();
        String celular = campoCelular.getText();
        String email = campoEmail.getText();
        String rua = campoEndereco.getText();
        String numero = campoNum.getText();
        String cep = campoCep.getText();
        String bairro = campoBairro.getText();
        String cidade = campoCidade.getText();
        String estado = campoEstado.getSelectedItem().toString();
        String complemento = campoComplemento.getText();
        String sexo = orientacaoSexual.getSelectedItem().toString();
        String dataCadastro = data.conversaoData();
        String tipoPessoa = validarPessoa();
        TipoCadastro tpCadastro = (TipoCadastro) tipoCadastro.getSelectedItem();
        Endereco endereco = new Endereco(rua, numero, cep, bairro, cidade, estado, complemento);      
        
        if(clienteSelecionado == null){
            //Inserindo pessoa física no banco
            if(radioPessoaFisica.isSelected()){
                
                Pessoa pessoaFisica = new Pessoa(nome, fantasia, cpfCnpj, dataNascimento, rg, sexo, telefone, celular, email, tpCadastro, endereco, tipoPessoa);
                clienteFornecedorDao.adicionarPessoaFisica(pessoaFisica,dataCadastro);

                //Limpandos os campos que foram inseridos
                limparFormulario();
                habilitarFormulario(false); 
                
            }else if(radioPessoaJuridica.isSelected()){ //Inserido pessoa juridica no banco
                
                Pessoa pessoaJuridica = new Pessoa(nome, fantasia, cpfCnpj, telefone, celular, email, inscriEstadual, inscriEstadual, tpCadastro, endereco, tipoPessoa);   
                clienteFornecedorDao.adicionarPessoaJuridica(pessoaJuridica, dataCadastro);

                //Limpandos os campos que foram inseridos
                limparFormulario();
                habilitarFormulario(false);

            }else{
                JOptionPane.showMessageDialog(null, "Selecione o tipo de pessoa ( física ou juridica)");
                return;
            }
            
        }else{
            alterandoDadosCliente(tpCadastro, nome, fantasia, cpfCnpj, tipoPessoa, sexo, dataNascimento, inscriEstadual, inscriMunicipal, rg, telefone, celular, endereco);
            
            clienteFornecedorDao.alterar(clienteSelecionado, tipoPessoa);
            atualizarTabela();
            limparFormulario();     
        }
        
        //colocando a tela pra ficar igual ao momento de abertura
        clienteSelecionado = null;
        limparFormulario();
        limparTabela();
        atualizarBotao(false);
        habilitarFormulario(false);  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparTabela();
        limparFormulario();
        atualizarBotao(false);
        habilitarFormulario(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        atualizarBotao(true);
        habilitarFormulario(true);
        limparTabela();
        carregarTipoCadastro();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void buscaClienteFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaClienteFornecedorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            btnExcluir.setEnabled(true);      
        }       
    }//GEN-LAST:event_buscaClienteFornecedorKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       
        //criando variável que recebe a linha da tabela de serviços.
        int linhaSelecionada = tabelaCliente.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(linhaSelecionada < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma cliente ou fornecedor", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //atualizando o status dos botões
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        habilitarFormulario(true);
        
        //variável que recebe a linha que foi selecionada na tabela
        clienteSelecionado = listaClienteFornecedor.get(linhaSelecionada);
        
        campoCodCliente.setText(Integer.toString(clienteSelecionado.getCodigo()));
        campoNome.setText(clienteSelecionado.getNomeFantasia());
        campoRazaoSocial.setText(clienteSelecionado.getRazaoSocial());
        campoCpfCnpj.setText(clienteSelecionado.getCpfCnpj());
        campoRg.setText(clienteSelecionado.getRg());
        campoIE.setText(clienteSelecionado.getInscricaoEstadual());
        campoIM.setText(clienteSelecionado.getInscricaoMunicipal());
        campoDataNascimento.setText(clienteSelecionado.getDataNascimento());
        campoEmail.setText(clienteSelecionado.getEmail());
        campoTelefone.setText(clienteSelecionado.getTelefone());
        campoCelular.setText(clienteSelecionado.getCelular());
        campoEndereco.setText(clienteSelecionado.getEndereco().getRua());
        campoNum.setText(clienteSelecionado.getEndereco().getNumero());
        campoCep.setText(clienteSelecionado.getEndereco().getCep());
        campoBairro.setText(clienteSelecionado.getEndereco().getBairro());
        campoCidade.setText(clienteSelecionado.getEndereco().getCidade());
        campoEstado.setSelectedItem(clienteSelecionado.getEndereco().getEstado());
        campoComplemento.setText(clienteSelecionado.getEndereco().getComplemento());
        tipoCadastro.setSelectedItem(clienteSelecionado.getTipoCadastro().getDescricao().toString());
        orientacaoSexual.setSelectedItem(clienteSelecionado.getSexo());

        if(clienteSelecionado.getTipoPessoa().equalsIgnoreCase("fisica")){
            radioPessoaFisica.setSelected(true);
        }
        else{
            radioPessoaJuridica.setSelected(true);
        }    
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Variável receber a quantidade de linhas da tabela
        int linhaTabela = tabelaCliente.getSelectedRow();
        
        //Verifica se foi selecionado algum cliente da lista
        if(linhaTabela < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cliente ou fornecedor", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o cliente
        clienteSelecionado = listaClienteFornecedor.get(linhaTabela);
      
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o o cliente/fornecedor "+clienteSelecionado.getRazaoSocial()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            clienteFornecedorDao.remover(clienteSelecionado.getCodigo());
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            atualizarTabela();
        }    
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void atualizarBotao(boolean status){
        btnCadastrar.setEnabled(!status);
        btnCancelar.setEnabled(status);
        btnSalvar.setEnabled(status);
        btnExcluir.setEnabled(status);
        btnAlterar.setEnabled(!status);
    }
    
    public void habilitarFormulario(boolean status){
        
        campoCpfCnpj.setEnabled(status);
        campoRg.setEnabled(status);
        campoNome.setEnabled(status);
        campoRazaoSocial.setEnabled(status);
        campoTelefone.setEnabled(status);
        campoCelular.setEnabled(status);
        campoEmail.setEnabled(status);
        tipoCadastro.setEnabled(status);
        campoDataNascimento.setEnabled(status);
        campoIM.setEnabled(status);
        campoIE.setEnabled(status);
        campoBairro.setEnabled(status);
        campoNum.setEnabled(status);
        campoCidade.setEnabled(status);
        campoComplemento.setEnabled(status);
        campoCep.setEnabled(status);
        campoEndereco.setEnabled(status);
        campoEstado.setEnabled(status);
        radioPessoaFisica.setEnabled(status);
        radioPessoaJuridica.setEnabled(status);
        orientacaoSexual.setEnabled(status);
    }
    
    private String validarPessoa(){
        String tipo = "";
        
        if(radioPessoaFisica.isSelected()){
            tipo = "Fisica";
        }
        if(radioPessoaJuridica.isSelected()){
            tipo = "Juridica";
        }
        
        return tipo;
    }
    
    private void limparFormulario(){
        
        campoNome.setText("");
        campoRazaoSocial.setText("");
        campoCpfCnpj.setText("");
        campoRg.setText("");
        campoIE.setText("");
        campoIM.setText("");
        campoDataNascimento.setText("");
        campoEmail.setText("");
        campoTelefone.setText("");
        campoCelular.setText("");
        campoEndereco.setText("");
        campoNum.setText("");
        campoCep.setText("");
        campoBairro.setText("");
        campoCidade.setText("");
        campoEstado.setName("Estado");
        campoComplemento.setText("");
        radioPessoaFisica.setSelected(false);
        radioPessoaJuridica.setSelected(false);
    }
    
    private void atualizarTabela(){
        listaClienteFornecedor = clienteFornecedorDao.consultarNomeCodigo(buscaClienteFornecedor.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
        model.setNumRows(0);

        for(Pessoa cli : listaClienteFornecedor){      
            model.addRow(new Object[]{cli.getCodigo(),cli.getCpfCnpj(),cli.getRazaoSocial(),cli.getNomeFantasia(),cli.getTipoCadastro()});
        }
    }
    
    private void limparTabela(){
        //Primeiro a condição testa se a quantidade de colunas é maior que 0, depois, limpa os dados
        if(tabelaCliente.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setRowCount(0);
        }
    }
    
    private void alterandoDadosCliente(TipoCadastro tipoCadastro, String razaoSocial, String nomeFantasia, String cpfCnpj, String tipoPessoa, String sexo, String dataNascimento, String ie, String im, String rg, String telefone, String celular, Endereco endereco){
        
        clienteSelecionado.setTipoCadastro(tipoCadastro);
        clienteSelecionado.setRazaoSocial(razaoSocial);
        clienteSelecionado.setNomeFantasia(nomeFantasia);
        clienteSelecionado.setCpfCnpj(cpfCnpj);
        clienteSelecionado.setTipoPessoa(tipoPessoa);
        clienteSelecionado.setSexo(sexo);
        clienteSelecionado.setDataNascimento(dataNascimento);
        clienteSelecionado.setInscricaoEstadual(ie);
        clienteSelecionado.setInscricaoMunicipal(im);
        clienteSelecionado.setRg(rg);
        clienteSelecionado.setTelefone(telefone);
        clienteSelecionado.setCelular(celular);
        clienteSelecionado.setEndereco(endereco);
        
    }

    private void carregarTipoCadastro(){
   
        List<TipoCadastro> listaTipoCadastro = tipoCadastroDao.consultarTipoCadastro();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)tipoCadastro.getModel();
        modelo.removeAllElements();
        for(Entidades tpCadastro : listaTipoCadastro){
            modelo.addElement(tpCadastro);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField buscaClienteFornecedor;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCodCliente;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoCpfCnpj;
    private javax.swing.JFormattedTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoIE;
    private javax.swing.JTextField campoIM;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoRg;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JPanel dadosPessoaisCliente;
    private javax.swing.JPanel enderecoCliente;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orientacaoSexual;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JDesktopPane painelCadastroCliente;
    private javax.swing.JRadioButton radioPessoaFisica;
    private javax.swing.JRadioButton radioPessoaJuridica;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JComboBox<String> tipoCadastro;
    private javax.swing.ButtonGroup tipoPessoa;
    private javax.swing.ButtonGroup tipoSexo;
    // End of variables declaration//GEN-END:variables
}
