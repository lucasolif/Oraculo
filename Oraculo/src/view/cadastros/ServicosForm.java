
package view.cadastros;

import javax.swing.JOptionPane;
import dao.ServicoDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Servico;


public class ServicosForm extends javax.swing.JInternalFrame {

    private ServicoDao servicoDao = new ServicoDao();
    private Servico servicoSelecionado;
    private List<Servico> listaServico;

    public ServicosForm() {
        initComponents();
        atualizarBotao(true);
        habilitarFormulario(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        painelTabela = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        painelFormulario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codServico = new javax.swing.JTextField();
        precoServico = new javax.swing.JTextField();
        descricaoServico = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        buscaServicos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro Serviços");

        btnAlterar.setBackground(new java.awt.Color(0, 102, 204));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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

        painelTabela.setAutoscrolls(true);

        tabelaServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Preço(R$)", "Codígo Serviço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelTabela.setViewportView(tabelaServicos);
        if (tabelaServicos.getColumnModel().getColumnCount() > 0) {
            tabelaServicos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaServicos.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaServicos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaServicos.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        painelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro Serviço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Preço (R$)");

        jLabel3.setText("Código Serviço");

        jLabel4.setText("Descrição");

        codServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        precoServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        descricaoServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codServico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(precoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        buscaServicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaServicosKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Serviços");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelTabela, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(buscaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar))))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(buscaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        atualizarBotao(false); //atualiza a visibilidade dos botões
        habilitarFormulario(true);
        descricaoServico.requestFocus();
        servicoSelecionado = null;
        
        //limpar o valor inserido no momento da busca
        atualizaBarraPesquisa(false);
        limparTabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Variável receber a quantidade de linhas da tabela
        int linhaTabela = tabelaServicos.getSelectedRow();
        
        //Verifica se foi selecionado algum serviço da lista
        if(linhaTabela < 0){
            JOptionPane.showMessageDialog(null, "Selecione um serviço", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o serviço
        servicoSelecionado = listaServico.get(linhaTabela);

        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o serviço "+servicoSelecionado.getDescricao()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            servicoDao.remover(servicoSelecionado.getCodigo());
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            atualizarTabela();
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
            
        String valorServicoSelecionado = null;
        //criando variável que recebe a linha da tabela de serviços.
        int linhaTabelaServico = tabelaServicos.getSelectedRow();
        
        //Verificando se foi selecionado algum serviço
        if(linhaTabelaServico < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma serviço", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizarBotao(false);
        habilitarFormulario(true);
        
        servicoSelecionado = listaServico.get(linhaTabelaServico);
        
        //Convertendo o valor Double em String, para que seja possível aparecer no campo.
        try {
            valorServicoSelecionado = Double.toString(servicoSelecionado.getValorUnitario());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        codServico.setText(servicoSelecionado.getCodAtividadeServico());
        precoServico.setText(valorServicoSelecionado);
        descricaoServico.setText(servicoSelecionado.getDescricao());
  
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        atualizarBotao(true);
        habilitarFormulario(false);
        
        String descricao = descricaoServico.getText();
        String codigo = codServico.getText();
        double preco = 0;
        
        try {
            preco = Double.parseDouble(precoServico.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor do serviço não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
   
        if(descricao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe uma descrição.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(codigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o código de Serviço.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
          
        if(servicoSelecionado == null){
            
            Servico servico = new Servico(descricao, codigo, preco);
         
            servicoDao.adicionar(servico);
            limparCampos();
            atualizaBarraPesquisa(true);

        }else{
            servicoSelecionado.setCodAtividadeServico(codigo);
            servicoSelecionado.setDescricao(descricao);
            servicoSelecionado.setValorUnitario(preco);
           
            servicoDao.alterar(servicoSelecionado);
            atualizarTabela();
            limparCampos();  
        }
        
        servicoSelecionado = null;
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        atualizarBotao(true);
        habilitarFormulario(false);
        servicoSelecionado = null;
        limparCampos();
        buscaServicos.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void buscaServicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaServicosKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
        }
    }//GEN-LAST:event_buscaServicosKeyPressed

    private void atualizarBotao(boolean status){
        btnAlterar.setEnabled(status);
        btnCadastrar.setEnabled(status);
        btnCancelar.setEnabled(!status);
        btnExcluir.setEnabled(status);
        btnPesquisar.setEnabled(status);
        btnSalvar.setEnabled(!status);
    }
    
    private void habilitarFormulario(boolean status){
        descricaoServico.setEnabled(status);
        codServico.setEnabled(status);
        precoServico.setEnabled(status);
    }
    
    private void limparCampos(){
        descricaoServico.setText("");
        codServico.setText("");
        precoServico.setText("");
        buscaServicos.setText("");
    }
    
    private void atualizaBarraPesquisa(boolean status){
        buscaServicos.setEnabled(status);
    }
    
    private void atualizarTabela(){
        int cont = 0;

        listaServico = servicoDao.consultarServico(buscaServicos.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaServicos.getModel();
        model.setNumRows(0);

        for(Servico serv : listaServico){
            Servico servico = listaServico.get(cont);
            model.addRow(new Object[]{serv.getCodigo(), serv.getDescricao(), serv.getValorUnitario(), serv.getCodAtividadeServico()});

            cont++;
        }    
    }
    
    private void limparTabela(){
        //Primeiro a condição testa se a quantidade de colunas é maior que 0, depois, limpa os dados
        if(tabelaServicos.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaServicos.getModel();
            model.setRowCount(0);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField buscaServicos;
    private javax.swing.JTextField codServico;
    private javax.swing.JTextField descricaoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JScrollPane painelTabela;
    private javax.swing.JTextField precoServico;
    private javax.swing.JTable tabelaServicos;
    // End of variables declaration//GEN-END:variables

}
