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
        campoContato = new javax.swing.JTextField();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();

        painelCadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        painelCadastroCliente.add(painelTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 120, 34));

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

        painelCadastroCliente.add(painelOrientacaoSexual, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 178, -1, -1));

        campoCpfCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfCnpjActionPerformed(evt);
            }
        });
        painelCadastroCliente.add(campoCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 96, 164, -1));

        campoContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, 101, -1));

        campoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 142, 333, -1));

        campoRazaoSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 96, 243, -1));

        campoTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 237, 113, -1));

        campoCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, 115, -1));

        campoEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 237, 293, -1));

        campoDataNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 189, 103, -1));

        campoIM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 189, 140, -1));

        campoIE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 142, 200, -1));

        barraBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(barraBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 17, 433, -1));

        campoBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 369, 165, -1));

        campoNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 323, -1, -1));

        campoCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 369, 149, -1));

        campoComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 415, 421, -1));

        campoCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 323, 119, -1));

        jLabel1.setText("CPF/CNPJ*");
        painelCadastroCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 74, 62, -1));

        jLabel3.setText("Nome Fantasia *");
        painelCadastroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 74, -1, -1));

        jLabel5.setText("Razão Social *");
        painelCadastroCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 126, -1, -1));

        jLabel6.setText("RG");
        painelCadastroCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 173, 28, -1));

        jLabel2.setText("Telefone");
        painelCadastroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 221, -1, -1));

        jLabel4.setText("Celular *");
        painelCadastroCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 219, -1, -1));

        jLabel7.setText("Data Nascimento");
        painelCadastroCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 173, -1, -1));

        jLabel8.setText("Insc Municipal");
        painelCadastroCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 173, -1, -1));

        jLabel9.setText("Insc Estadual");
        painelCadastroCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 126, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Buscar");
        painelCadastroCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 47, 18));

        jLabel11.setText("E-mail");
        painelCadastroCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 220, -1, -1));

        jLabel12.setText("Logradouro");
        painelCadastroCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 307, -1, -1));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 323, 214, 18));

        jLabel14.setText("Número");
        painelCadastroCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 307, -1, -1));

        jLabel15.setText("CEP");
        painelCadastroCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 307, -1, -1));

        jLabel16.setText("Bairro");
        painelCadastroCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 353, -1, -1));

        jLabel17.setText("Cidade");
        painelCadastroCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 353, -1, -1));

        jLabel18.setText("Estado");
        painelCadastroCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 353, -1, -1));

        jLabel19.setText("Complemento");
        painelCadastroCliente.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 399, -1, -1));

        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "S", "SE", "TO", "DF" }));
        campoEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCadastroCliente.add(campoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 369, 83, 18));

        btnSalvar.setBackground(new java.awt.Color(0, 255, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelCadastroCliente.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 110, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        painelCadastroCliente.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed


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
    private javax.swing.JTextField campoContato;
    private javax.swing.JTextField campoCpfCnpj;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoIE;
    private javax.swing.JTextField campoIM;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoTelefone;
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
