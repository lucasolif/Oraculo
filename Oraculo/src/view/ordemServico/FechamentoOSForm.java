/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.ordemServico;

import dao.ContaCaixaDao;
import dao.EstoqueDao;
import dao.FormaPagtoDao;
import dao.OrdemServicoDao;
import dao.UsuarioDao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import model.ContaCaixa;
import model.Data;
import model.Estoque;
import model.FormaPagto;
import model.OrdemServico;
import model.Usuario;
import model.Vendas;
import view.Home;


public class FechamentoOSForm extends javax.swing.JInternalFrame {
    
    private FormaPagtoDao formaPagtoDao = new FormaPagtoDao();
    private ContaCaixaDao contaCaixaDao = new ContaCaixaDao();
    private EstoqueDao estoqueDao = new EstoqueDao();
    private OrdemServicoDao osDao = new OrdemServicoDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private OrdemServico osSelecionado;
    private Data data = new Data();


    public FechamentoOSForm() {
        initComponents();
        carregarFormaPagto();
        carregarCaixa();
        carregarEstoques();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numOSFechamentoOS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalProdutoFechamentoOS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalServicoFechamentoOS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        formaPagtoFechamentoOS = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        qtdParcelasFechamentoOS = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        codClienteFechamentoOS = new javax.swing.JTextField();
        nomeClienteFechamentoOS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        valorPagoFechamentoOS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contaCaixaFechamentoOS = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        totalPagarFechamentoOS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        trocoFechamentoOS = new javax.swing.JTextField();
        btnConfirmarFechamentoOS = new javax.swing.JButton();
        btnCancelarFechamentoOS = new javax.swing.JButton();
        estoqueFechamentoOS = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        descontoFechamentoOS = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Fechamento OS");

        jLabel1.setText("Nº OS");

        numOSFechamentoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numOSFechamentoOSKeyPressed(evt);
            }
        });

        jLabel2.setText("Valor Total Produtos");

        totalProdutoFechamentoOS.setEditable(false);
        totalProdutoFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        totalProdutoFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setText("Valor Total Serviços");

        totalServicoFechamentoOS.setEditable(false);
        totalServicoFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        totalServicoFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setText("Forma Pagto");

        jLabel7.setText("Qtd Parcelas");

        qtdParcelasFechamentoOS.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        jLabel8.setText("Cliente");

        codClienteFechamentoOS.setEditable(false);
        codClienteFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        codClienteFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        nomeClienteFechamentoOS.setEditable(false);
        nomeClienteFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        nomeClienteFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setText("Valor Pago");

        valorPagoFechamentoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorPagoFechamentoOSKeyPressed(evt);
            }
        });

        jLabel4.setText("Conta Caixa");

        jLabel5.setText("Total a Pagar");

        totalPagarFechamentoOS.setEditable(false);
        totalPagarFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        totalPagarFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel10.setText("Troco");

        trocoFechamentoOS.setEditable(false);
        trocoFechamentoOS.setBackground(new java.awt.Color(230, 230, 230));
        trocoFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnConfirmarFechamentoOS.setBackground(new java.awt.Color(102, 255, 0));
        btnConfirmarFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmarFechamentoOS.setText("Confirmar");
        btnConfirmarFechamentoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarFechamentoOSActionPerformed(evt);
            }
        });

        btnCancelarFechamentoOS.setBackground(new java.awt.Color(255, 255, 0));
        btnCancelarFechamentoOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarFechamentoOS.setText("Cancelar");
        btnCancelarFechamentoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFechamentoOSActionPerformed(evt);
            }
        });

        jLabel11.setText("Estoque");

        jLabel12.setText("Desconto (R$)");

        descontoFechamentoOS.setText("0.0");
        descontoFechamentoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descontoFechamentoOSKeyPressed(evt);
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
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codClienteFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeClienteFechamentoOS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalProdutoFechamentoOS)
                            .addComponent(totalServicoFechamentoOS)
                            .addComponent(totalPagarFechamentoOS, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(trocoFechamentoOS)
                            .addComponent(descontoFechamentoOS))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formaPagtoFechamentoOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtdParcelasFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorPagoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addComponent(contaCaixaFechamentoOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(estoqueFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmarFechamentoOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarFechamentoOS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOSFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numOSFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codClienteFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalProdutoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formaPagtoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalServicoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(qtdParcelasFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descontoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorPagoFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalPagarFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(contaCaixaFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trocoFechamentoOS))
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmarFechamentoOS)
                        .addComponent(btnCancelarFechamentoOS))
                    .addComponent(estoqueFechamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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

    private void numOSFechamentoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOSFechamentoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(numOSFechamentoOS.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Informe o número de uma OS", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }else{
                osSelecionado = osDao.consultarOs(numOSFechamentoOS.getText());
                
                //Verificando se a OS existe e se está com status aberta
                if(osSelecionado == null){
                    JOptionPane.showMessageDialog(null, "OS não encontrada", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }else if(osSelecionado != null  && osSelecionado.getStatus().equalsIgnoreCase("Finalizada")){
                    carregarFormulario(osSelecionado);
                }else{
                    JOptionPane.showMessageDialog(null, "OS não está com status 'Finalizada'", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
    }//GEN-LAST:event_numOSFechamentoOSKeyPressed
        
    private void btnConfirmarFechamentoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarFechamentoOSActionPerformed
        fecharOs(); //Método que fecha OS
    }//GEN-LAST:event_btnConfirmarFechamentoOSActionPerformed

    private void btnCancelarFechamentoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFechamentoOSActionPerformed
        numOSFechamentoOS.setText("");
        codClienteFechamentoOS.setText("");
        nomeClienteFechamentoOS.setText("");
        totalProdutoFechamentoOS.setText("");
        totalServicoFechamentoOS.setText("");
        totalPagarFechamentoOS.setText("");
        trocoFechamentoOS.setText("");
        valorPagoFechamentoOS.setText("");
        qtdParcelasFechamentoOS.setValue(1);
    }//GEN-LAST:event_btnCancelarFechamentoOSActionPerformed

    private void valorPagoFechamentoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorPagoFechamentoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            double totalPagar = Double.parseDouble(totalPagarFechamentoOS.getText());
            double valorPago = Double.parseDouble(valorPagoFechamentoOS.getText());
            
            double troco = valorPago - totalPagar;
            
            trocoFechamentoOS.setText(Double.toString(troco));
        }
    }//GEN-LAST:event_valorPagoFechamentoOSKeyPressed

    private void descontoFechamentoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoFechamentoOSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            double totalProd = Double.parseDouble(totalProdutoFechamentoOS.getText());
            double totalServ = Double.parseDouble(totalServicoFechamentoOS.getText());
            double totalDesc = Double.parseDouble(descontoFechamentoOS.getText());
            double totalPagar = (totalProd + totalServ)-totalDesc;

            totalPagarFechamentoOS.setText(Double.toString(totalPagar));

        }
    }//GEN-LAST:event_descontoFechamentoOSKeyPressed

    private void carregarFormaPagto(){   
        List<FormaPagto> listaFormaPagto = formaPagtoDao.consultarFormaPagto();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)formaPagtoFechamentoOS.getModel();
        modelo.removeAllElements();
        
        for(FormaPagto formaPagto : listaFormaPagto){
            modelo.addElement(formaPagto);
        }
    }
    
    private void carregarCaixa(){
    
        List<ContaCaixa> listaCaixas = contaCaixaDao.consultarCaixa();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)contaCaixaFechamentoOS.getModel();
        modelo.removeAllElements();
        
        for(ContaCaixa caixa : listaCaixas){
            modelo.addElement(caixa);
        }
    }
    
    private void carregarEstoques(){
  
        List<Estoque> listaEstoques = estoqueDao.buscarTipoEstoques();
        DefaultComboBoxModel estoqueSaida = (DefaultComboBoxModel)estoqueFechamentoOS.getModel();

        estoqueSaida.removeAllElements();

        for(Estoque estoque : listaEstoques){
            estoqueSaida.addElement(estoque);
        }
    }
    
    private void carregarFormulario(OrdemServico os){
        
        double totalProd = os.getTotalProdutos();
        double totalServ = os.getTotalServicos();
        
        totalProdutoFechamentoOS.setText(Double.toString(totalProd));
        totalServicoFechamentoOS.setText(Double.toString(totalServ));

        codClienteFechamentoOS.setText(Integer.toString(os.getCliente().getCodigo()));
        nomeClienteFechamentoOS.setText(os.getCliente().getRazaoSocial());
    }
    
    public void fecharOs(){
        
        ContaCaixa contaCaixa = new ContaCaixa();
        FormaPagto formaPagto = new FormaPagto();
        Estoque estoque = new Estoque();
        Vendas venda = new Vendas();
        
        int qtdParcelas = Integer.parseInt(qtdParcelasFechamentoOS.getValue().toString());
        double totalVenda = Double.parseDouble(totalPagarFechamentoOS.getText());
        double desconto = Double.parseDouble(descontoFechamentoOS.getText());
        String dataFechamento = data.conversaoData();
        String tipoVenda = "OS "+osSelecionado.getNumOS();
        contaCaixa = ((ContaCaixa) contaCaixaFechamentoOS.getSelectedItem());
        formaPagto = (FormaPagto) formaPagtoFechamentoOS.getSelectedItem();
        estoque = (Estoque) estoqueFechamentoOS.getSelectedItem();
        
        venda.setCliente(osSelecionado.getCliente());
        venda.setContaCaixa(contaCaixa);
        venda.setFormaPagto(formaPagto);
        venda.setData(dataFechamento);
        venda.setTotalDesconto(desconto);
        venda.setParcelas(qtdParcelas);
        venda.setTotalVenda(totalVenda);
        venda.setTipoVenda(tipoVenda);
        venda.setEstoque(estoque);
        
        osSelecionado.setVenda(venda);
        osSelecionado.setDataFechamento(dataFechamento);
        osSelecionado.setStatus("Fechada");
        
        osDao.fechamentoOs(osSelecionado);
        
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarFechamentoOS;
    private javax.swing.JButton btnConfirmarFechamentoOS;
    private javax.swing.JTextField codClienteFechamentoOS;
    private javax.swing.JComboBox<String> contaCaixaFechamentoOS;
    private javax.swing.JTextField descontoFechamentoOS;
    private javax.swing.JComboBox<String> estoqueFechamentoOS;
    private javax.swing.JComboBox<String> formaPagtoFechamentoOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeClienteFechamentoOS;
    private javax.swing.JTextField numOSFechamentoOS;
    private javax.swing.JSpinner qtdParcelasFechamentoOS;
    private javax.swing.JTextField totalPagarFechamentoOS;
    private javax.swing.JTextField totalProdutoFechamentoOS;
    private javax.swing.JTextField totalServicoFechamentoOS;
    private javax.swing.JTextField trocoFechamentoOS;
    private javax.swing.JTextField valorPagoFechamentoOS;
    // End of variables declaration//GEN-END:variables
}
