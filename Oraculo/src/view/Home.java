package view;


import javax.swing.JFrame;
import view.cadastros.EstoqueForm;
import view.cadastros.PessoasForm;
import view.cadastros.ContaCaixaForm;
import view.cadastros.CsosnForm;
import view.cadastros.CstForm;
import view.cadastros.FormaPagtoForm;
import view.cadastros.ServicosForm;
import view.cadastros.ProdutosForm;
import view.cadastros.TipoCadastroForm;
import view.cadastros.UnidadesForm;
import view.cadastros.UsuarioForm;
import view.vendas.pontoVendaForm;
import view.financeiro.MovimentoFinanceiroForm;
import view.financeiro.ContasPagarReceberForm;
import view.financeiro.ExtratoCaixaForm;
import view.estoque.ConsultaEstoqueForm;
import view.estoque.MovimentacaoEstoqueForm;
import view.estoque.MovimentacaoRealizadaForm;
import view.ordemServico.ConsultaOSForm;
import view.ordemServico.PainelOSForm;
import view.ordemServico.OrdemServicoForm;
import view.ordemServico.FechamentoOSForm;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        estoqueMovimentacaoRealizada.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelHome = new javax.swing.JDesktopPane();
        nomeUsuario = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        cadastros = new javax.swing.JMenu();
        cadastroClienteFornecedor = new javax.swing.JMenuItem();
        cadastroProdutos = new javax.swing.JMenuItem();
        cadastroServicos = new javax.swing.JMenuItem();
        cadastroUsuarios = new javax.swing.JMenuItem();
        cadastroEntidades = new javax.swing.JMenu();
        cadastroTipoEstoque = new javax.swing.JMenuItem();
        cadastroContaCaixa = new javax.swing.JMenuItem();
        cadastroFormaPagto = new javax.swing.JMenuItem();
        cadastroUnidades = new javax.swing.JMenuItem();
        cadastroTipoCadastro = new javax.swing.JMenuItem();
        cadastroCsosn = new javax.swing.JMenuItem();
        cadastroCst = new javax.swing.JMenuItem();
        vendas = new javax.swing.JMenu();
        pontoVenda = new javax.swing.JMenuItem();
        ordemServico = new javax.swing.JMenu();
        OSAbertura = new javax.swing.JMenuItem();
        OSPainel = new javax.swing.JMenuItem();
        OSConsulta = new javax.swing.JMenuItem();
        OSFechamento = new javax.swing.JMenuItem();
        financeiro = new javax.swing.JMenu();
        financeiroMovimentoFinanceiro = new javax.swing.JMenuItem();
        financeiroContasPagar = new javax.swing.JMenuItem();
        financeiroExtratoCaixa = new javax.swing.JMenuItem();
        estoque = new javax.swing.JMenu();
        estoqueConsultaEstoque = new javax.swing.JMenuItem();
        estoqueMovimentacaoAvulsa = new javax.swing.JMenuItem();
        estoqueMovimentacaoRealizada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Home"); // NOI18N

        painelHome.setBackground(new java.awt.Color(204, 204, 204));
        painelHome.setAutoscrolls(true);

        nomeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nomeUsuario.setIconTextGap(1);

        user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user.setText("Usuário:");

        painelHome.setLayer(nomeUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelHome.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelHomeLayout = new javax.swing.GroupLayout(painelHome);
        painelHome.setLayout(painelHomeLayout);
        painelHomeLayout.setHorizontalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHomeLayout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelHomeLayout.setVerticalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHomeLayout.createSequentialGroup()
                .addGap(0, 495, Short.MAX_VALUE)
                .addGroup(painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cadastros.setText("Cadastros");
        cadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cadastroClienteFornecedor.setText("Clientes/Fornecedor");
        cadastroClienteFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteFornecedorActionPerformed(evt);
            }
        });
        cadastros.add(cadastroClienteFornecedor);

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

        cadastroEntidades.setText("Entidades");

        cadastroTipoEstoque.setText("Tipos Estoque");
        cadastroTipoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTipoEstoqueActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroTipoEstoque);

        cadastroContaCaixa.setText("Conta Caixa");
        cadastroContaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroContaCaixaActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroContaCaixa);

        cadastroFormaPagto.setText("Formas Pagto");
        cadastroFormaPagto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFormaPagtoActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroFormaPagto);

        cadastroUnidades.setText("Unidades");
        cadastroUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUnidadesActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroUnidades);

        cadastroTipoCadastro.setText("Tipo Cadastros");
        cadastroTipoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTipoCadastroActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroTipoCadastro);

        cadastroCsosn.setText("CSOSN");
        cadastroCsosn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCsosnActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroCsosn);

        cadastroCst.setText("CST");
        cadastroCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCstActionPerformed(evt);
            }
        });
        cadastroEntidades.add(cadastroCst);

        cadastros.add(cadastroEntidades);

        menuBarra.add(cadastros);

        vendas.setText("Vendas");
        vendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pontoVenda.setText("Ponto de Venda");
        pontoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoVendaActionPerformed(evt);
            }
        });
        vendas.add(pontoVenda);

        menuBarra.add(vendas);

        ordemServico.setText("Ordem de Serviço");

        OSAbertura.setText("Ordem Serviço");
        OSAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSAberturaActionPerformed(evt);
            }
        });
        ordemServico.add(OSAbertura);

        OSPainel.setText("Painel OS");
        OSPainel.setEnabled(false);
        OSPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSPainelActionPerformed(evt);
            }
        });
        ordemServico.add(OSPainel);

        OSConsulta.setText("Consulta OS");
        OSConsulta.setEnabled(false);
        OSConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSConsultaActionPerformed(evt);
            }
        });
        ordemServico.add(OSConsulta);

        OSFechamento.setText("Fechamento OS");
        OSFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSFechamentoActionPerformed(evt);
            }
        });
        ordemServico.add(OSFechamento);

        menuBarra.add(ordemServico);

        financeiro.setText("Financeiro");
        financeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        financeiro.setEnabled(false);

        financeiroMovimentoFinanceiro.setText("Movimento Financeiro");
        financeiroMovimentoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroMovimentoFinanceiroActionPerformed(evt);
            }
        });
        financeiro.add(financeiroMovimentoFinanceiro);

        financeiroContasPagar.setText("Contas a Pagar");
        financeiroContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroContasPagarActionPerformed(evt);
            }
        });
        financeiro.add(financeiroContasPagar);

        financeiroExtratoCaixa.setText("Extrato de Caixa");
        financeiroExtratoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroExtratoCaixaActionPerformed(evt);
            }
        });
        financeiro.add(financeiroExtratoCaixa);

        menuBarra.add(financeiro);

        estoque.setText("Estoque");
        estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        estoqueConsultaEstoque.setText("Consulta Estoque");
        estoqueConsultaEstoque.setEnabled(false);
        estoqueConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueConsultaEstoqueActionPerformed(evt);
            }
        });
        estoque.add(estoqueConsultaEstoque);

        estoqueMovimentacaoAvulsa.setText("Movimentação Avulsa");
        estoqueMovimentacaoAvulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueMovimentacaoAvulsaActionPerformed(evt);
            }
        });
        estoque.add(estoqueMovimentacaoAvulsa);

        estoqueMovimentacaoRealizada.setText("Movimentações Realizadas");
        estoqueMovimentacaoRealizada.setEnabled(false);
        estoqueMovimentacaoRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueMovimentacaoRealizadaActionPerformed(evt);
            }
        });
        estoque.add(estoqueMovimentacaoRealizada);

        menuBarra.add(estoque);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Métodos para abrir a tela de cadastros
    private void cadastroClienteFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteFornecedorActionPerformed
        PessoasForm cadastroCliente = new PessoasForm();
        painelHome.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_cadastroClienteFornecedorActionPerformed

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

    private void pontoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoVendaActionPerformed
        pontoVendaForm pontoVenda = new pontoVendaForm();
        painelHome.add(pontoVenda);
        pontoVenda.setVisible(true);
    }//GEN-LAST:event_pontoVendaActionPerformed

    private void financeiroMovimentoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroMovimentoFinanceiroActionPerformed
        MovimentoFinanceiroForm movimento = new MovimentoFinanceiroForm();
        painelHome.add(movimento);
        movimento.setVisible(true);
    }//GEN-LAST:event_financeiroMovimentoFinanceiroActionPerformed

    private void financeiroContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroContasPagarActionPerformed
        ContasPagarReceberForm contasPagar = new ContasPagarReceberForm();
        painelHome.add(contasPagar);
        contasPagar.setVisible(true);
    }//GEN-LAST:event_financeiroContasPagarActionPerformed

    private void financeiroExtratoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroExtratoCaixaActionPerformed
        ExtratoCaixaForm extratoCaixa = new ExtratoCaixaForm();
        painelHome.add(extratoCaixa);
        extratoCaixa.setVisible(true);
    }//GEN-LAST:event_financeiroExtratoCaixaActionPerformed

    private void estoqueConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueConsultaEstoqueActionPerformed
        ConsultaEstoqueForm consultaEstoque = new ConsultaEstoqueForm();
        painelHome.add(consultaEstoque);
        consultaEstoque.setVisible(true);
    }//GEN-LAST:event_estoqueConsultaEstoqueActionPerformed

    private void estoqueMovimentacaoAvulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueMovimentacaoAvulsaActionPerformed
        MovimentacaoEstoqueForm movimentacaoEstoque = new MovimentacaoEstoqueForm();
        painelHome.add(movimentacaoEstoque);
        movimentacaoEstoque.setVisible(true);
    }//GEN-LAST:event_estoqueMovimentacaoAvulsaActionPerformed

    private void OSAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSAberturaActionPerformed
        OrdemServicoForm abrirOS = new OrdemServicoForm();
        painelHome.add(abrirOS);
        abrirOS.setVisible(true);
    }//GEN-LAST:event_OSAberturaActionPerformed

    private void OSPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSPainelActionPerformed
        PainelOSForm painelOS = new PainelOSForm();
        painelHome.add(painelOS);
        painelOS.setVisible(true);
    }//GEN-LAST:event_OSPainelActionPerformed

    private void OSConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSConsultaActionPerformed
        ConsultaOSForm consultaOS = new ConsultaOSForm();
        painelHome.add(consultaOS);
        consultaOS.setVisible(true);
    }//GEN-LAST:event_OSConsultaActionPerformed

    private void OSFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSFechamentoActionPerformed
        FechamentoOSForm fechamentoOS = new FechamentoOSForm();
        painelHome.add(fechamentoOS);
        fechamentoOS.setVisible(true);
    }//GEN-LAST:event_OSFechamentoActionPerformed

    private void estoqueMovimentacaoRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueMovimentacaoRealizadaActionPerformed
        MovimentacaoRealizadaForm movimentacaoRealizada = new MovimentacaoRealizadaForm();
        painelHome.add(movimentacaoRealizada);
        movimentacaoRealizada.setVisible(true);
    }//GEN-LAST:event_estoqueMovimentacaoRealizadaActionPerformed

    private void cadastroTipoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTipoEstoqueActionPerformed
        EstoqueForm cadastroEstoque = new EstoqueForm();
        painelHome.add(cadastroEstoque);
        cadastroEstoque.setVisible(true);
    }//GEN-LAST:event_cadastroTipoEstoqueActionPerformed

    private void cadastroContaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroContaCaixaActionPerformed
        ContaCaixaForm contaCaixa = new ContaCaixaForm();
        painelHome.add(contaCaixa);
        contaCaixa.setVisible(true);
    }//GEN-LAST:event_cadastroContaCaixaActionPerformed

    private void cadastroFormaPagtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFormaPagtoActionPerformed
        FormaPagtoForm formaPagto = new FormaPagtoForm();
        painelHome.add(formaPagto);
        formaPagto.setVisible(true);
    }//GEN-LAST:event_cadastroFormaPagtoActionPerformed

    private void cadastroUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUnidadesActionPerformed
        UnidadesForm unidades = new UnidadesForm();
        painelHome.add(unidades);
        unidades.setVisible(true); 
    }//GEN-LAST:event_cadastroUnidadesActionPerformed

    private void cadastroTipoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTipoCadastroActionPerformed
        TipoCadastroForm tipoCadastro = new TipoCadastroForm();
        painelHome.add(tipoCadastro);
        tipoCadastro.setVisible(true); 
    }//GEN-LAST:event_cadastroTipoCadastroActionPerformed

    private void cadastroCsosnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCsosnActionPerformed
        CsosnForm csosn = new CsosnForm();
        painelHome.add(csosn);
        csosn.setVisible(true); 
    }//GEN-LAST:event_cadastroCsosnActionPerformed

    private void cadastroCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCstActionPerformed
        CstForm cst = new CstForm();
        painelHome.add(cst);
        cst.setVisible(true); 
    }//GEN-LAST:event_cadastroCstActionPerformed
         
   
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OSAbertura;
    private javax.swing.JMenuItem OSConsulta;
    private javax.swing.JMenuItem OSFechamento;
    private javax.swing.JMenuItem OSPainel;
    private javax.swing.JMenuItem cadastroClienteFornecedor;
    private javax.swing.JMenuItem cadastroContaCaixa;
    private javax.swing.JMenuItem cadastroCsosn;
    private javax.swing.JMenuItem cadastroCst;
    private javax.swing.JMenu cadastroEntidades;
    private javax.swing.JMenuItem cadastroFormaPagto;
    private javax.swing.JMenuItem cadastroProdutos;
    private javax.swing.JMenuItem cadastroServicos;
    private javax.swing.JMenuItem cadastroTipoCadastro;
    private javax.swing.JMenuItem cadastroTipoEstoque;
    private javax.swing.JMenuItem cadastroUnidades;
    private javax.swing.JMenuItem cadastroUsuarios;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenu estoque;
    private javax.swing.JMenuItem estoqueConsultaEstoque;
    private javax.swing.JMenuItem estoqueMovimentacaoAvulsa;
    private javax.swing.JMenuItem estoqueMovimentacaoRealizada;
    private javax.swing.JMenu financeiro;
    private javax.swing.JMenuItem financeiroContasPagar;
    private javax.swing.JMenuItem financeiroExtratoCaixa;
    private javax.swing.JMenuItem financeiroMovimentoFinanceiro;
    private javax.swing.JMenuBar menuBarra;
    public javax.swing.JLabel nomeUsuario;
    private javax.swing.JMenu ordemServico;
    public javax.swing.JDesktopPane painelHome;
    private javax.swing.JMenuItem pontoVenda;
    private javax.swing.JLabel user;
    private javax.swing.JMenu vendas;
    // End of variables declaration//GEN-END:variables
}
