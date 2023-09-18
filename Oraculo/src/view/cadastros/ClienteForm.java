package view.cadastros;

import model.Empresa;
import model.Pessoa;
import model.Endereco;
import dao.ClienteDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteForm extends javax.swing.JInternalFrame {

    private ClienteDao cliente = new ClienteDao();

    public ClienteForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pessoFisicaJuridica = new javax.swing.ButtonGroup();
        orientacaoSexual = new javax.swing.ButtonGroup();
        painelCadastroCliente = new javax.swing.JPanel();
        painelTipoPessoa = new javax.swing.JPanel();
        btnPessoaFisica = new javax.swing.JRadioButton();
        btnPessoaJuridica = new javax.swing.JRadioButton();
        painelOrientacaoSexual = new javax.swing.JPanel();
        btnMasculino = new javax.swing.JRadioButton();
        btnFeminino = new javax.swing.JRadioButton();
        btnOutros = new javax.swing.JRadioButton();
        campoCpfCnpj = new javax.swing.JTextField();
        campoRg = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoRazaoSocial = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoDataNascimento = new javax.swing.JTextField();
        campoIM = new javax.swing.JTextField();
        campoIE = new javax.swing.JTextField();
        barraBusca = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoNum = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoCep = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();

        painelTipoPessoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelTipoPessoa.setLayout(new javax.swing.BoxLayout(painelTipoPessoa, javax.swing.BoxLayout.LINE_AXIS));

        pessoFisicaJuridica.add(btnPessoaFisica);
        btnPessoaFisica.setText("Física");
        btnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaFisicaActionPerformed(evt);
            }
        });
        painelTipoPessoa.add(btnPessoaFisica);

        pessoFisicaJuridica.add(btnPessoaJuridica);
        btnPessoaJuridica.setText("Júridica");
        btnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaJuridicaActionPerformed(evt);
            }
        });
        painelTipoPessoa.add(btnPessoaJuridica);

        painelOrientacaoSexual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        orientacaoSexual.add(btnMasculino);
        btnMasculino.setText("Masc");

        orientacaoSexual.add(btnFeminino);
        btnFeminino.setText("Fem");

        orientacaoSexual.add(btnOutros);
        btnOutros.setText("Outros");
        btnOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOrientacaoSexualLayout = new javax.swing.GroupLayout(painelOrientacaoSexual);
        painelOrientacaoSexual.setLayout(painelOrientacaoSexualLayout);
        painelOrientacaoSexualLayout.setHorizontalGroup(
            painelOrientacaoSexualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientacaoSexualLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnMasculino)
                .addGap(0, 0, 0)
                .addComponent(btnFeminino)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOutros)
                .addContainerGap())
        );
        painelOrientacaoSexualLayout.setVerticalGroup(
            painelOrientacaoSexualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientacaoSexualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOrientacaoSexualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOrientacaoSexualLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(painelOrientacaoSexualLayout.createSequentialGroup()
                        .addGroup(painelOrientacaoSexualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFeminino)
                            .addComponent(btnOutros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        campoCpfCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfCnpjActionPerformed(evt);
            }
        });

        campoRg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoRazaoSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoDataNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoIM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoIE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        barraBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF/CNPJ*");

        jLabel3.setText("Nome Fantasia *");

        jLabel5.setText("Razão Social *");

        jLabel6.setText("RG");

        jLabel2.setText("Telefone");

        jLabel4.setText("Celular *");

        jLabel7.setText("Data Nascimento");

        jLabel8.setText("Insc Municipal");

        jLabel9.setText("Insc Estadual");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Buscar");

        jLabel11.setText("E-mail");

        jLabel12.setText("Logradouro");

        jLabel14.setText("Número");

        jLabel15.setText("CEP");

        jLabel16.setText("Bairro");

        jLabel17.setText("Cidade");

        jLabel18.setText("Estado");

        jLabel19.setText("Complemento");

        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "S", "SE", "TO", "DF" }));
        campoEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalvar.setBackground(new java.awt.Color(0, 255, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(barraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(painelTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(272, 272, 272)
                .addComponent(jLabel9))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoIE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(campoIM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(painelOrientacaoSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addComponent(jLabel11))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel16)
                .addGap(146, 146, 146)
                .addComponent(jLabel17)
                .addGap(124, 124, 124)
                .addComponent(jLabel18))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(barraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(painelTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(campoCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(campoIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(painelOrientacaoSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)))
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, 0)
                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfCnpjActionPerformed

    private void btnOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutrosActionPerformed

    private void btnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPessoaJuridicaActionPerformed

    private void btnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPessoaFisicaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //Atribuindo os dados inseridos nos formulario a variáveis
        String nome = campoRazaoSocial.getText();
        String fatansia = campoNome.getText();
        int cpfCnpj;
        String rg = campoRg.getText();
        String dataNascimento = campoDataNascimento.getText();
        String telefone = campoTelefone.getText();
        String celular = campoCelular.getText();
        String email = campoEmail.getText();
        String endereco = campoEndereco.getText();
        String numero = campoNum.getText();
        String cep = campoCep.getText();
        String bairro = campoBairro.getText();
        String cidade = campoCidade.getText();
        String estado = campoEstado.getSelectedItem().toString();
        String complemento = campoComplemento.getText();
        String sexo;
        
        if(btnFeminino.isSelected()){
            sexo = "Feminino";
        }
        if(btnMasculino.isSelected()){
            sexo = "Masculino";
        }
        if(btnOutros.isSelected()){
            sexo = "Outros";
        }

        //Tratando as exceções dos dados que são números (inteiros e floats)
        try{
            cpfCnpj = Integer.parseInt(campoCpfCnpj.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "CPF não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraBusca;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JRadioButton btnFeminino;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.JRadioButton btnOutros;
    private javax.swing.JRadioButton btnPessoaFisica;
    private javax.swing.JRadioButton btnPessoaJuridica;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoCpfCnpj;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoIE;
    private javax.swing.JTextField campoIM;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup orientacaoSexual;
    private javax.swing.JPanel painelCadastroCliente;
    private javax.swing.JPanel painelOrientacaoSexual;
    private javax.swing.JPanel painelTipoPessoa;
    private javax.swing.ButtonGroup pessoFisicaJuridica;
    // End of variables declaration//GEN-END:variables
}
