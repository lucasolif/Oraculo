/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.cadastros;


import dao.TipoCadastroDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Data;
import model.TipoCadastro;

/**
 *
 * @author Lucas Oliveira
 */
public class TipoCadastroForm extends javax.swing.JInternalFrame {

    
    private TipoCadastroDao tipoCadastroDao = new TipoCadastroDao();
    private Data data = new Data();
    private TipoCadastro tipoCadastroSelec;
    private List<TipoCadastro> listaTipoCadastro;

    public TipoCadastroForm() {
        initComponents();
        atualizarBotoes(false);
        tipoCadastro.setEnabled(false);
        habilitarFormulario(false);
    }


    @SuppressWarnings("unchecked")  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        tipoCadastro = new javax.swing.JTextField();
        codTipoCadastro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTipoCadastro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        descricaoTiposCadastro = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Tipos de Cadastro");
        setToolTipText("");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tipoCadastro.setEditable(false);

        codTipoCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codTipoCadastroKeyPressed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaTipoCadastro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaTipoCadastro);
        if (tabelaTipoCadastro.getColumnModel().getColumnCount() > 0) {
            tabelaTipoCadastro.getColumnModel().getColumn(0).setResizable(false);
            tabelaTipoCadastro.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaTipoCadastro.getColumnModel().getColumn(1).setResizable(false);
            tabelaTipoCadastro.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaTipoCadastro.getColumnModel().getColumn(2).setResizable(false);
            tabelaTipoCadastro.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        jLabel1.setText("Descrição");

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

        jLabel2.setText("Tipos de Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(descricaoTiposCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(codTipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codTipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoTiposCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void codTipoCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTipoCadastroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            atualizarTabela();
            atualizarBotoes(true);
        }
    }//GEN-LAST:event_codTipoCadastroKeyPressed

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
        int numLinhaSelec = tabelaTipoCadastro.getSelectedRow();
        
        //Verifica se foi selecionado algum cliente da lista
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione um tipo de cadastro a ser excluída", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Recebe o a linha que foi selecionada na tabela, ou seja, o cliente
        tipoCadastroSelec = listaTipoCadastro.get(numLinhaSelec);

        int confirm = JOptionPane.showConfirmDialog(null,"Excluir o Tipo Cadastro "+tipoCadastroSelec.getDescricao()+" ?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            tipoCadastroDao.remover(tipoCadastroSelec);
            atualizarTabela();
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            atualizarTabela();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Variável recebe o número da linha selecionado.
        int numLinhaSelec = tabelaTipoCadastro.getSelectedRow();
        
        //Verificando se foi selecionado algum estoque
        if(numLinhaSelec < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizarBotoes(true);
        habilitarFormulario(true);
        
        tipoCadastroSelec = listaTipoCadastro.get(numLinhaSelec);
        
        codTipoCadastro.setText(Integer.toString(tipoCadastroSelec.getCodigo()));
        tipoCadastro.setText(tipoCadastroSelec.getDescricao());
        descricaoTiposCadastro.setText(tipoCadastroSelec.getDescricao());
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String descricao = descricaoTiposCadastro.getText();
        String dataCadastro = data.conversaoData();
        
        if(tipoCadastroSelec == null){
            if(descricao.isEmpty()){
                JOptionPane.showMessageDialog(null, "Para cadastrar o tipo de cadastro, informe a descrição", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            TipoCadastro tipoCadastro = new TipoCadastro(descricao, dataCadastro);
            
            tipoCadastroDao.adicionar(tipoCadastro);
            limparFormulario();
            descricaoTiposCadastro.setText("");

        }else{
            
            tipoCadastroSelec.setDescricao(descricao);
   
            tipoCadastroDao.alterar(tipoCadastroSelec);
            descricaoTiposCadastro.setText("");
            atualizarTabela();

        }
        tipoCadastroSelec = null;
        atualizarBotoes(false);
        habilitarFormulario(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarFormulario(false);
        tipoCadastroSelec = null;
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
        descricaoTiposCadastro.setEnabled(status);
        codTipoCadastro.setEnabled(!status);
    }
    
    private void limparFormulario(){
        tipoCadastro.setText("");
        descricaoTiposCadastro.setText("");
        codTipoCadastro.setText("");
    }
    
    private void atualizarTabela(){

        listaTipoCadastro = tipoCadastroDao.consultarTpCadastro(codTipoCadastro.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaTipoCadastro.getModel();
        model.setNumRows(0);

        for(TipoCadastro tpCadastro : listaTipoCadastro){
            model.addRow(new Object[]{tpCadastro.getCodigo() , tpCadastro.getDescricao(), tpCadastro.getDataCadastro()});
        }

    }
    
    public void limparTabela(){
        if(tabelaTipoCadastro.getRowCount() > 0){
            DefaultTableModel model = (DefaultTableModel) tabelaTipoCadastro.getModel();
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
    private javax.swing.JTextField codTipoCadastro;
    private javax.swing.JTextField descricaoTiposCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTipoCadastro;
    private javax.swing.JTextField tipoCadastro;
    // End of variables declaration//GEN-END:variables
}
