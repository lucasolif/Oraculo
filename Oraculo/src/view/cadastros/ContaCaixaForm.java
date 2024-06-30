
package view.cadastros;

import dao.ContaCaixaDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.ContaCaixa;
import model.Data;


public class ContaCaixaForm extends javax.swing.JInternalFrame {

    private ContaCaixaDao contaCaixaDao = new ContaCaixaDao();
    private Data data = new Data();
    private ContaCaixa contaCaixaSelec;
    private List<ContaCaixa> listaContaCaixa;

    public ContaCaixaForm() {
        initComponents();
        atualizarBotoes(false);
        descricaoContaCaixa.setEnabled(false);
        habilitarFormulario(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        descricaoContaCaixa = new javax.swing.JTextField();
        codContaCaixa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContaCaixa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        descricaoContaCaixaCadastro = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Contas Caixa");

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        descricaoContaCaixa.setEditable(false);
        descricaoContaCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        codContaCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        codContaCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codContaCaixaKeyPressed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contas Caixa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaContaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaContaCaixa);
        if (tabelaContaCaixa.getColumnModel().getColumnCount() > 0) {
            tabelaContaCaixa.getColumnModel().getColumn(0).setResizable(false);
            tabelaContaCaixa.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaContaCaixa.getColumnModel().getColumn(1).setResizable(false);
            tabelaContaCaixa.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaContaCaixa.getColumnModel().getColumn(2).setResizable(false);
            tabelaContaCaixa.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        jLabel1.setText("Descrição");

        btnCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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

        jLabel2.setText("Contas de Caixa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(308, 437, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(descricaoContaCaixaCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(codContaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descricaoContaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(7, 7, 7)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codContaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoContaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoContaCaixaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        atualizarBotoes(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        habilitarFormulario(true);
        limparTabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int numLinhaSelec = tabelaContaCaixa.getSelectedRow();
        
        //Verifica se foi selecionado algum cliente da lista
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma conta caixa a ser excluída", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o cliente
        contaCaixaSelec = listaContaCaixa.get(numLinhaSelec);
        
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir a conta caixa "+contaCaixaSelec.getDescricao()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            contaCaixaDao.remover(contaCaixaSelec);
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         //Variável recebe o número da linha selecionado.
        int numLinhaSelec = tabelaContaCaixa.getSelectedRow();
        
        //Verificando se foi selecionado algum estoque
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma conta caixa", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        habilitarFormulario(true);
        
        contaCaixaSelec = listaContaCaixa.get(numLinhaSelec);
        
        codContaCaixa.setText(Integer.toString(contaCaixaSelec.getCodigo()));
        descricaoContaCaixa.setText(contaCaixaSelec.getDescricao());
        descricaoContaCaixaCadastro.setText(contaCaixaSelec.getDescricao());
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String descricao = descricaoContaCaixaCadastro.getText();
        String dataCadastro = data.conversaoData();
               
        if(contaCaixaSelec == null){
            if(descricao.isEmpty()){
                JOptionPane.showMessageDialog(null, "Para cadastrar uma conta caixa, informe a descrição", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            ContaCaixa contaCaixa = new ContaCaixa(descricao, dataCadastro);
            contaCaixaDao.adicionar(contaCaixa);
            descricaoContaCaixaCadastro.setText("");            
        }else{  
            contaCaixaSelec.setDescricao(descricao);
           
            contaCaixaDao.alterar(contaCaixaSelec);
            limparFormulario();
            atualizarTabela();
            descricaoContaCaixaCadastro.setText("");
        }
        
        contaCaixaSelec = null;
        atualizarBotoes(false);
        habilitarFormulario(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       habilitarFormulario(false);
       contaCaixaSelec = null;
       limparFormulario();
       limparTabela();
        atualizarBotoes(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        atualizarTabela();
        atualizarBotoes(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void codContaCaixaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codContaCaixaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            atualizarBotoes(true);
            btnCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_codContaCaixaKeyPressed

    private void atualizarBotoes(boolean status){
        btnAlterar.setEnabled(status);
        btnCadastrar.setEnabled(!status);
        btnCancelar.setEnabled(status);
        btnExcluir.setEnabled(status);
        btnSalvar.setEnabled(status);
    }
    
    private void habilitarFormulario(boolean status){
        descricaoContaCaixaCadastro.setEnabled(status);
        codContaCaixa.setEnabled(!status);
    }
    
    private void limparFormulario(){
        descricaoContaCaixa.setText("");
        descricaoContaCaixaCadastro.setText("");
        codContaCaixa.setText("");
    }
    
    private void atualizarTabela(){

        listaContaCaixa = contaCaixaDao.consultarCaixa(codContaCaixa.getText());
        
        DefaultTableModel model = (DefaultTableModel) tabelaContaCaixa.getModel();
        model.setNumRows(0);

        for(ContaCaixa caixa : listaContaCaixa){
            model.addRow(new Object[]{caixa.getCodigo() , caixa.getDescricao(), caixa.getDataCadastro()});
        } 
    }
    
    public void limparTabela(){
        if(tabelaContaCaixa.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaContaCaixa.getModel();
            model.setRowCount(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField codContaCaixa;
    private javax.swing.JTextField descricaoContaCaixa;
    private javax.swing.JTextField descricaoContaCaixaCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaContaCaixa;
    // End of variables declaration//GEN-END:variables
}
