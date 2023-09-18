
package view.cadastros;

import model.Produto;
import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProdutosForm extends javax.swing.JInternalFrame {

    private ProdutoDao produtoDao = new ProdutoDao();

    public ProdutosForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaCadastroProdutos = new javax.swing.JPanel();
        buscarProdutos = new javax.swing.JTextField();
        descricaoProduto = new javax.swing.JTextField();
        codigoProduto = new javax.swing.JTextField();
        marcaProduto = new javax.swing.JTextField();
        codigoEanProduto = new javax.swing.JTextField();
        codigoGtinProduto = new javax.swing.JTextField();
        pesoProduto = new javax.swing.JTextField();
        codigoBarrasProduto = new javax.swing.JTextField();
        ncmProduto = new javax.swing.JTextField();
        ipiProduto = new javax.swing.JTextField();
        custoProduto = new javax.swing.JTextField();
        freteProduto = new javax.swing.JTextField();
        margemLucroProduto = new javax.swing.JTextField();
        precoVendaProduto = new javax.swing.JTextField();
        outrasDespesaProduto = new javax.swing.JTextField();
        descontoProduto = new javax.swing.JTextField();
        cestProduto = new javax.swing.JTextField();
        unidadeProduto = new javax.swing.JComboBox<>();
        cstProduto = new javax.swing.JComboBox<>();
        csosnProduto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        buscarProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descricaoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codigoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        marcaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codigoEanProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codigoGtinProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoGtinProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoGtinProdutoActionPerformed(evt);
            }
        });

        pesoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pesoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoProdutoActionPerformed(evt);
            }
        });

        codigoBarrasProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoBarrasProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarrasProdutoActionPerformed(evt);
            }
        });

        ncmProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ipiProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        custoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        freteProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        margemLucroProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        precoVendaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        precoVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoVendaProdutoActionPerformed(evt);
            }
        });

        outrasDespesaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descontoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cestProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        unidadeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "UN", "MT", "CX", "LT", "KG", "PC", "PTE", "FD", "M" }));
        unidadeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cstProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "000 - Tributada Integralmente", "010 - Tributada e com cobrança do ICMS por substituição tributária", "020 - Com redução de base de cálculo", "030 - Isenta ou não-tributada e com cobrança do ICMS por substituição tributária", "040 - Isenta", "041 - Não-tributada", "050 - Com suspensão", "051 - Com diferimento", "060 - ICMS cobrado anteriormente por substituição tributária", "070 - Com redução da base de cálculo e cobrança do ICMS por substituição tributária", "090 - Outras" }));
        cstProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        csosnProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "101 - Tributada pelo Simples Nacional com permissão de crédito", "102 - Tributada pelo Simples Nacional sem permissão de crédito", "103 - Isenção do ICMS no Simples Nacional para faixa de receita bruta", "201 - Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por substituição tributária", "202 - Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por substituição tributária", "203 - Isenção do ICMS no Simples Nacional para faixa de receita bruta e com cobrança do ICMS por substituição tributária", "300 - Imune", "400 - Não tributada pelo Simples Nacional", "500 - ICMS cobrado anteriormente por substituição tributária ou por antecipação", "900 - Outros" }));
        csosnProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Produtos");

        jLabel2.setText("Descrição");

        jLabel3.setText("Código");

        jLabel4.setText("Marca");

        jLabel5.setText("Código EAN");

        jLabel6.setText("Código GTIN");

        jLabel7.setText("Unidade");

        jLabel8.setText("Peso (KG)");

        jLabel9.setText("Código de Barras");

        jLabel10.setText("NCM");

        jLabel11.setText("IPI (%)");

        jLabel12.setText("CST");

        jLabel13.setText("CSOSN");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Dados Fiscais");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Custos");

        jLabel16.setText("Custo (R$)");

        jLabel17.setText("Frete (R$)");

        jLabel18.setText("Margem Lucro (%)");

        jLabel19.setText("Outras Depesas");

        jLabel20.setText("Preço Venda (R$)");

        jLabel21.setText("CEST");

        jLabel22.setText("Desconto (%)");

        btn_salvar.setBackground(new java.awt.Color(0, 255, 0));
        btn_salvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout TelaCadastroProdutosLayout = new javax.swing.GroupLayout(TelaCadastroProdutos);
        TelaCadastroProdutos.setLayout(TelaCadastroProdutosLayout);
        TelaCadastroProdutosLayout.setHorizontalGroup(
            TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoBarrasProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroProdutosLayout.createSequentialGroup()
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoEanProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoGtinProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cstProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(csosnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ncmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ipiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cestProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(freteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(margemLucroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outrasDespesaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        TelaCadastroProdutosLayout.setVerticalGroup(
            TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(codigoEanProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(codigoGtinProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(unidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(codigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ncmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(ipiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(csosnProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(cstProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TelaCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(custoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(freteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(margemLucroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(outrasDespesaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cestProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(precoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(descontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(TelaCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoGtinProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoGtinProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoGtinProdutoActionPerformed

    private void pesoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoProdutoActionPerformed

    private void codigoBarrasProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarrasProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarrasProdutoActionPerformed

    private void precoVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoVendaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoVendaProdutoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        //Atribuindo os dados inseridos nos formulario a variáveis
        String descProduto = descricaoProduto.getText();
        String codEan = codigoEanProduto.getText();
        String codGtin = codigoGtinProduto.getText();
        String marca = marcaProduto.getText();
        String unidade = unidadeProduto.getSelectedItem().toString();
        String codBarras = codigoBarrasProduto.getText();
        String ncm = ncmProduto.getText();
        String cst = cstProduto.getSelectedItem().toString();
        String cest = cestProduto.getText();
        String csosn = csosnProduto.getSelectedItem().toString();
        Double peso;
        Double ipi ;
        Double custo;
        Double valorFrete;
        Double margemLucro;
        Double outrasDespesas;
        Double precoVenda;
        Double desconto;
        
        //Tratando as exceções dos dados que são números (inteiros e floats)
        try{
            peso = Double.parseDouble(pesoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Peso do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            ipi = Double.parseDouble(ipiProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "IPI do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            custo = Double.parseDouble(custoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Custo do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }        
        
        try{
            valorFrete  = Double.parseDouble(freteProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "PValor do frente não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }        
        
        try{
            margemLucro = Double.parseDouble(margemLucroProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Margem de lucro do produto não foi informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }        

        try{
            outrasDespesas = Double.parseDouble(outrasDespesaProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Outras Despesas do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }

        try{
            precoVenda = Double.parseDouble(precoVendaProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Preço de venda do produto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            desconto = Double.parseDouble(descontoProduto.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Desconto não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }


        //Instanciando o Objeto Produto
        Produto produto = new Produto(descProduto, codEan, codGtin, unidade, marca, codBarras, ncm, cst, cest, csosn, peso, ipi, custo, valorFrete, margemLucro, outrasDespesas, precoVenda, desconto);

        try{
            produtoDao.adicionar(produto);
            JOptionPane.showMessageDialog(null, "Produto cadastrado");
            
            //Limpando os campos para inserir novos dados
            cestProduto.setText("");
            codigoBarrasProduto.setText("");
            codigoEanProduto.setText("");
            codigoGtinProduto.setText("");
            csosnProduto.setName("Selecione");
            cstProduto.setName("Selecione");
            custoProduto.setText("");
            descontoProduto.setText("");
            descricaoProduto.setText("");
            freteProduto.setText("");
            ipiProduto.setText("");
            marcaProduto.setText("");
            margemLucroProduto.setText("");
            ncmProduto.setText("");
            outrasDespesaProduto.setText("");
            pesoProduto.setText("");
            precoVendaProduto.setText("");
            unidadeProduto.setName("Selecione");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o produto no banco de dados", "Erro", JOptionPane.WARNING_MESSAGE);
        }       
    }//GEN-LAST:event_btn_salvarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaCadastroProdutos;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField buscarProdutos;
    private javax.swing.JTextField cestProduto;
    private javax.swing.JTextField codigoBarrasProduto;
    private javax.swing.JTextField codigoEanProduto;
    private javax.swing.JTextField codigoGtinProduto;
    private javax.swing.JTextField codigoProduto;
    private javax.swing.JComboBox<String> csosnProduto;
    private javax.swing.JComboBox<String> cstProduto;
    private javax.swing.JTextField custoProduto;
    private javax.swing.JTextField descontoProduto;
    private javax.swing.JTextField descricaoProduto;
    private javax.swing.JTextField freteProduto;
    private javax.swing.JTextField ipiProduto;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField marcaProduto;
    private javax.swing.JTextField margemLucroProduto;
    private javax.swing.JTextField ncmProduto;
    private javax.swing.JTextField outrasDespesaProduto;
    private javax.swing.JTextField pesoProduto;
    private javax.swing.JTextField precoVendaProduto;
    private javax.swing.JComboBox<String> unidadeProduto;
    // End of variables declaration//GEN-END:variables
}
