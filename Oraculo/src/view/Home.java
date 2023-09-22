package view;


import view.cadastros.ClienteForm;
import Cadastros.ContasCaixa;
import Cadastros.FormasPagto;
import Cadastros.ServicosForm;
import view.cadastros.ProdutosForm;
import view.cadastros.UsuarioForm;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelHome = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        cadastros = new javax.swing.JMenu();
        cadastroCliente = new javax.swing.JMenuItem();
        cadastroProdutos = new javax.swing.JMenuItem();
        cadastroServicos = new javax.swing.JMenuItem();
        cadastroUsuarios = new javax.swing.JMenuItem();
        cadastroFormasPagamento = new javax.swing.JMenuItem();
        cadastroContaCaixas = new javax.swing.JMenuItem();
        vendas = new javax.swing.JMenu();
        vendasProdutos = new javax.swing.JMenuItem();
        vendasServiços = new javax.swing.JMenuItem();
        financeiro = new javax.swing.JMenu();
        financeiroMovimentoFinanceiro = new javax.swing.JMenuItem();
        financeiroContasPagar = new javax.swing.JMenuItem();
        financeiroContasReceber = new javax.swing.JMenuItem();
        financeiroExtratoCaixa = new javax.swing.JMenuItem();
        financeiroAvulsoPagarReceber = new javax.swing.JMenuItem();
        estoque = new javax.swing.JMenu();
        estoqueEstoque = new javax.swing.JMenuItem();
        estoqueMovimentacaoAvulsa = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        relatorioEstoque = new javax.swing.JMenuItem();
        relatorioVendas = new javax.swing.JMenuItem();
        relatorioContasPagar = new javax.swing.JMenuItem();
        relatorioContasReceber = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelHome.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout painelHomeLayout = new javax.swing.GroupLayout(painelHome);
        painelHome.setLayout(painelHomeLayout);
        painelHomeLayout.setHorizontalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        painelHomeLayout.setVerticalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        cadastros.setText("Cadastros");
        cadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cadastroCliente.setText("Clientes");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        cadastros.add(cadastroCliente);

        cadastroProdutos.setText("Produtos");
        cadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutosActionPerformed(evt);
            }
        });
        cadastros.add(cadastroProdutos);

        cadastroServicos.setText("Serviços");
        cadastroServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroServicosActionPerformed(evt);
            }
        });
        cadastros.add(cadastroServicos);

        cadastroUsuarios.setText("Usuários");
        cadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuariosActionPerformed(evt);
            }
        });
        cadastros.add(cadastroUsuarios);

        cadastroFormasPagamento.setText("Forma de Pagto");
        cadastroFormasPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFormasPagamentoActionPerformed(evt);
            }
        });
        cadastros.add(cadastroFormasPagamento);

        cadastroContaCaixas.setText("Contas Caixa");
        cadastroContaCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroContaCaixasActionPerformed(evt);
            }
        });
        cadastros.add(cadastroContaCaixas);

        menuBarra.add(cadastros);

        vendas.setText("Vendas");
        vendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        vendasProdutos.setText("Produtos");
        vendas.add(vendasProdutos);

        vendasServiços.setText("Serviços");
        vendas.add(vendasServiços);

        menuBarra.add(vendas);

        financeiro.setText("Financeiro");
        financeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        financeiroMovimentoFinanceiro.setText("Movimento Financeiro");
        financeiro.add(financeiroMovimentoFinanceiro);

        financeiroContasPagar.setText("Contas a Pagar");
        financeiro.add(financeiroContasPagar);

        financeiroContasReceber.setText("Contas a Receber");
        financeiro.add(financeiroContasReceber);

        financeiroExtratoCaixa.setText("Extrato de Caixa");
        financeiro.add(financeiroExtratoCaixa);

        financeiroAvulsoPagarReceber.setText("Lançamento Avulso Contas a Pagar/Receber");
        financeiro.add(financeiroAvulsoPagarReceber);

        menuBarra.add(financeiro);

        estoque.setText("Estoque");
        estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        estoqueEstoque.setText("Estoque");
        estoque.add(estoqueEstoque);

        estoqueMovimentacaoAvulsa.setText("Movimentação Avulsa");
        estoque.add(estoqueMovimentacaoAvulsa);

        menuBarra.add(estoque);

        relatorios.setText("Relatórios");
        relatorios.setContentAreaFilled(false);
        relatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        relatorioEstoque.setText("Es toque");
        relatorios.add(relatorioEstoque);

        relatorioVendas.setText("Vendas");
        relatorios.add(relatorioVendas);

        relatorioContasPagar.setText("Contas a Pagar");
        relatorios.add(relatorioContasPagar);

        relatorioContasReceber.setText("Contas a Receber");
        relatorios.add(relatorioContasReceber);

        menuBarra.add(relatorios);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Métodos para abrir a tela de cadastros
    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        ClienteForm cadastroCliente = new ClienteForm();
        painelHome.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void cadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutosActionPerformed
        ProdutosForm cadastroProdutos = new ProdutosForm();
        painelHome.add(cadastroProdutos);
        cadastroProdutos.setVisible(true);
    }//GEN-LAST:event_cadastroProdutosActionPerformed

    private void cadastroServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroServicosActionPerformed
        ServicosForm cadastroServicos = new ServicosForm();
        painelHome.add(cadastroServicos);
        cadastroServicos.setVisible(true);
    }//GEN-LAST:event_cadastroServicosActionPerformed

    private void cadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuariosActionPerformed
        UsuarioForm cadastroUsuario = new UsuarioForm();
        painelHome.add(cadastroUsuario);
        cadastroUsuario.setVisible(true);        
    }//GEN-LAST:event_cadastroUsuariosActionPerformed

    private void cadastroFormasPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFormasPagamentoActionPerformed
        FormasPagto cadastroFormaPagto = new FormasPagto();
        painelHome.add(cadastroFormaPagto);
        cadastroFormaPagto.setVisible(true);       
    }//GEN-LAST:event_cadastroFormasPagamentoActionPerformed

    private void cadastroContaCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroContaCaixasActionPerformed
        ContasCaixa cadastroContaCaixa = new ContasCaixa();
        painelHome.add(cadastroContaCaixa);
        cadastroContaCaixa.setVisible(true);
    }//GEN-LAST:event_cadastroContaCaixasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroContaCaixas;
    private javax.swing.JMenuItem cadastroFormasPagamento;
    private javax.swing.JMenuItem cadastroProdutos;
    private javax.swing.JMenuItem cadastroServicos;
    private javax.swing.JMenuItem cadastroUsuarios;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenu estoque;
    private javax.swing.JMenuItem estoqueEstoque;
    private javax.swing.JMenuItem estoqueMovimentacaoAvulsa;
    private javax.swing.JMenu financeiro;
    private javax.swing.JMenuItem financeiroAvulsoPagarReceber;
    private javax.swing.JMenuItem financeiroContasPagar;
    private javax.swing.JMenuItem financeiroContasReceber;
    private javax.swing.JMenuItem financeiroExtratoCaixa;
    private javax.swing.JMenuItem financeiroMovimentoFinanceiro;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JDesktopPane painelHome;
    private javax.swing.JMenuItem relatorioContasPagar;
    private javax.swing.JMenuItem relatorioContasReceber;
    private javax.swing.JMenuItem relatorioEstoque;
    private javax.swing.JMenuItem relatorioVendas;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenu vendas;
    private javax.swing.JMenuItem vendasProdutos;
    private javax.swing.JMenuItem vendasServiços;
    // End of variables declaration//GEN-END:variables
}
