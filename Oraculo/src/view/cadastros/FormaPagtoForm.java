/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.cadastros;

import dao.FormaPagtoDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Data;
import model.FormaPagto;

public class FormaPagtoForm extends javax.swing.JInternalFrame {
    private FormaPagtoDao formaPagtoDao = new FormaPagtoDao();
    private Data data = new Data();
    private FormaPagto formaPagtoSelec;
    private List<FormaPagto> listaFormaPagto;

    public FormaPagtoForm() {
        initComponents();
        atualizarBotoes(false);
        descricaoFormaPagto.setEnabled(false);
        habilitarFormulario(false);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codFormaPagto = new javax.swing.JTextField();
        descricaoFormaPagto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        descricaoFormaPagtoCadasto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFormaPagto = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Formas de Pagamento");

        codFormaPagto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codFormaPagtoKeyPressed(evt);
            }
        });

        descricaoFormaPagto.setEditable(false);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formas Pagto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaFormaPagto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tabelaFormaPagto);
        if (tabelaFormaPagto.getColumnModel().getColumnCount() > 0) {
            tabelaFormaPagto.getColumnModel().getColumn(0).setResizable(false);
            tabelaFormaPagto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaFormaPagto.getColumnModel().getColumn(1).setResizable(false);
            tabelaFormaPagto.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaFormaPagto.getColumnModel().getColumn(2).setResizable(false);
            tabelaFormaPagto.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        btnSalvar.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        jLabel2.setText("Forma de Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(7, 7, 7)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(descricaoFormaPagtoCadasto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descricaoFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel2))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoFormaPagtoCadasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codFormaPagtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codFormaPagtoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            atualizarBotoes(true);
        }
    }//GEN-LAST:event_codFormaPagtoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        atualizarTabela();
        atualizarBotoes(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        atualizarBotoes(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        habilitarFormulario(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int numLinhaSelec = tabelaFormaPagto.getSelectedRow();
        
        //Verifica se foi selecionado algum cliente da lista
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento a ser excluída", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o cliente
        formaPagtoSelec = listaFormaPagto.get(numLinhaSelec);
       
        int confirm = JOptionPane.showConfirmDialog(null,"Excluir a forma de pagamento "+formaPagtoSelec.getDescricao()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            formaPagtoDao.remover(formaPagtoSelec);
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            atualizarTabela();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Variável recebe o número da linha selecionado.
        int numLinhaSelec = tabelaFormaPagto.getSelectedRow();
        
        //Verificando se foi selecionado algum estoque
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizarBotoes(true);
        habilitarFormulario(true);
        
        formaPagtoSelec = listaFormaPagto.get(numLinhaSelec);
        
        codFormaPagto.setText(Integer.toString(formaPagtoSelec.getCodigo()));
        descricaoFormaPagto.setText(formaPagtoSelec.getDescricao());
        descricaoFormaPagtoCadasto.setText(formaPagtoSelec.getDescricao());
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String descricao = descricaoFormaPagtoCadasto.getText();
        String dataCadastro = data.conversaoData();
        
        if(formaPagtoSelec == null){
            if(descricao.isEmpty()){
                JOptionPane.showMessageDialog(null, "Para cadastrar uma forma de pagamento, informe a descrição", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            FormaPagto formaPagto = new FormaPagto(descricao, dataCadastro);
            
            formaPagtoDao.adicionar(formaPagto);
            descricaoFormaPagtoCadasto.setText("");
        }else{                 
            formaPagtoSelec.setDescricao(descricao);
     
            formaPagtoDao.alterar(formaPagtoSelec);
            limparFormulario();
            atualizarTabela();
            descricaoFormaPagtoCadasto.setText("");
        }
        
        formaPagtoSelec = null;
        atualizarBotoes(false);
        habilitarFormulario(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarFormulario(false);
        formaPagtoSelec = null;
        limparFormulario();
        limparTabela();
        atualizarBotoes(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void atualizarBotoes(boolean status){
        btnAlterar.setEnabled(status);
        btnCadastrar.setEnabled(!status);
        btnCancelar.setEnabled(status);
        btnExcluir.setEnabled(status);
        btnSalvar.setEnabled(status);
    }
    
    private void habilitarFormulario(boolean status){
        descricaoFormaPagtoCadasto.setEnabled(status);
        codFormaPagto.setEnabled(!status);
    }
    
    private void limparFormulario(){
        descricaoFormaPagto.setText("");
        descricaoFormaPagtoCadasto.setText("");
        codFormaPagto.setText("");
    }
    
    private void atualizarTabela(){
        int cont = 0;

        listaFormaPagto = formaPagtoDao.consultarFormaPagto(codFormaPagto.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaFormaPagto.getModel();
        model.setNumRows(0);

        for(FormaPagto pagto : listaFormaPagto){
            FormaPagto formaPagto = listaFormaPagto.get(cont);
            model.addRow(new Object[]{pagto.getCodigo() , pagto.getDescricao(), pagto.getDataCadastro()});

            cont++;
        }
    }
    
    public void limparTabela(){
        if(tabelaFormaPagto.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaFormaPagto.getModel();
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
    private javax.swing.JTextField codFormaPagto;
    private javax.swing.JTextField descricaoFormaPagto;
    private javax.swing.JTextField descricaoFormaPagtoCadasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFormaPagto;
    // End of variables declaration//GEN-END:variables
}
