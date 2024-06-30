
package view.cadastros;

import javax.swing.JOptionPane;
import dao.EstoqueDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Data;
import model.Estoque;


public class EstoqueForm extends javax.swing.JInternalFrame {

    private EstoqueDao estoqueDao = new EstoqueDao();
    private Estoque estoqueSelecionado;
    private List<Estoque> listaEstoque;
    private Data data = new Data();

    public EstoqueForm() {
        initComponents();
        habilitarFormulario(false);
        atualizarBotao(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descricaoEstoque = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        descricaoEstoqueCadastrar = new javax.swing.JTextField();
        codEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTiposEstoque = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro Estoque");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Tipo Estoque", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Buscar Estoque");

        descricaoEstoque.setEditable(false);
        descricaoEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descricaoEstoque.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome Estoque");

        codEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        codEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codEstoqueKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoEstoqueCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(codEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricaoEstoqueCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoques", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaTiposEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaTiposEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Data Cadastro"
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
        jScrollPane1.setViewportView(tabelaTiposEstoque);
        if (tabelaTiposEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaTiposEstoque.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaTiposEstoque.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaTiposEstoque.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        btnAlterar.setBackground(new java.awt.Color(0, 153, 255));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        habilitarFormulario(true);
        atualizarBotao(true);
        descricaoEstoque.setEnabled(false);
        codEstoque.setEnabled(false);
        btnBuscar.setEnabled(false);
        limparTabela();
        tabelaTiposEstoque.setEnabled(false);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //criando variável que recebe a linha da tabela de estoque.
        int linhaTabelaEstoque = tabelaTiposEstoque.getSelectedRow();
        
        //Verificando se foi selecionado algum estoque
        if(linhaTabelaEstoque < 0){
            JOptionPane.showMessageDialog(null, "Selecione um estoque", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizarBotao(true);
        habilitarFormulario(true);
        
        estoqueSelecionado = listaEstoque.get(linhaTabelaEstoque);
        
        descricaoEstoque.setText(estoqueSelecionado.getDescricao());
        descricaoEstoqueCadastrar.setText(estoqueSelecionado.getDescricao());
        codEstoque.setText(Integer.toString(estoqueSelecionado.getCodigo()));
        
        descricaoEstoque.setEnabled(false);
        btnBuscar.setEnabled(false);
        codEstoque.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        habilitarFormulario(false);
        atualizarBotao(false);
        
        String descricaoEstoque = descricaoEstoqueCadastrar.getText();
        String dataCadastro = data.conversaoData();
        
        if(estoqueSelecionado == null){
            if(descricaoEstoque.isEmpty()){
                JOptionPane.showMessageDialog(null, "Informe uma descrição", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Estoque estoque = new Estoque(descricaoEstoque, dataCadastro);

            estoqueDao.adicionar(estoque);
            descricaoEstoqueCadastrar.setText("");
        }else{
            estoqueSelecionado.setDescricao(descricaoEstoque);

            estoqueDao.alterar(estoqueSelecionado);
            limparFormulario();
            atualizarTabela();
            descricaoEstoqueCadastrar.setText("");
        }     
        
        estoqueSelecionado = null;
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       habilitarFormulario(false);
       estoqueSelecionado = null;
       limparFormulario();
       codEstoque.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       atualizarTabela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int numLinhaSelec = tabelaTiposEstoque.getSelectedRow();
        
        //Verifica se foi selecionado algum cliente da lista
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione um estoque a ser excluído", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o cliente
        estoqueSelecionado = listaEstoque.get(numLinhaSelec);
  
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o estoque?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            estoqueDao.remover(estoqueSelecionado);
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void codEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codEstoqueKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
        }
    }//GEN-LAST:event_codEstoqueKeyPressed

    public void habilitarFormulario(boolean status){
        descricaoEstoqueCadastrar.setEnabled(status);
        descricaoEstoque.setEnabled(status);
    }
    
    public void atualizarBotao(boolean status){
        btnAlterar.setEnabled(!status);
        btnCadastrar.setEnabled(!status);
        btnCancelar.setEnabled(status);
        btnSalvar.setEnabled(status);
        btnExcluir.setEnabled(status);
    }
    
    public void atualizarTabela(){
        listaEstoque = estoqueDao.consultarEstoque(descricaoEstoque.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaTiposEstoque.getModel();
        model.setNumRows(0);

        for(Estoque est : listaEstoque){
            model.addRow(new Object[]{est.getCodigo() , est.getDescricao(), est.getDataCadastro()});
        }
    }
    
    public void limparTabela(){
        if(tabelaTiposEstoque.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaTiposEstoque.getModel();
            model.setRowCount(0);
        }
    }
    
    public void limparFormulario(){
        codEstoque.setText("");
        descricaoEstoque.setText("");
        descricaoEstoqueCadastrar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField codEstoque;
    private javax.swing.JTextField descricaoEstoque;
    private javax.swing.JTextField descricaoEstoqueCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTiposEstoque;
    // End of variables declaration//GEN-END:variables
}
