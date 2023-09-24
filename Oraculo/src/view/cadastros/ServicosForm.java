
package view.cadastros;

import dao.ServicoDao;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import model.Servico;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;

public class ServicosForm extends javax.swing.JInternalFrame {

    private ServicoDao servicoDao = new ServicoDao();
    Calendar data = Calendar.getInstance();

    public ServicosForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        codServico = new javax.swing.JTextField();
        descricaoServico = new javax.swing.JTextField();
        precoServico = new javax.swing.JTextField();
        pctIssServico = new javax.swing.JTextField();
        dataCadastroServico = new javax.swing.JFormattedTextField();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setText("Código");

        jLabel2.setText("Buscar");

        jLabel3.setText("Preço");

        jLabel4.setText("ISS (%)");

        jLabel5.setText("Descrição");

        jLabel6.setText("Data Cadastro");

        codServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descricaoServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        precoServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pctIssServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dataCadastroServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGravar.setBackground(new java.awt.Color(0, 153, 51));
        btnGravar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codServico, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(descricaoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(precoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pctIssServico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dataCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(precoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pctIssServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
        String cod = codServico.getText();
        String descricao = descricaoServico.getText();
        Double preco;
        Double iss;
        String data = formatandoData(); //Recebe método que converte a data atual em String
        
        //Convertendo String em Double
        try{
            preco = Double.parseDouble(precoServico.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Peso do serviço não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        try{
            iss = Double.parseDouble(pctIssServico.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ISS do serviço não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        //Instanciando o objeto Servico e passando os atributos no parâmetro do construtor
        Servico servico = new Servico(cod, descricao, preco, iss, data);
        
        if(!cod.isEmpty() && descricao.isEmpty() && preco < 0 ){
            
            try{
                servicoDao.adicionar(servico);
                JOptionPane.showMessageDialog(null, "Serviço cadastrado");

                //Limpando os campos para inserir novos dados
                limparCampos();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o serviço no banco de dados", "Erro", JOptionPane.WARNING_MESSAGE);
            }  
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos vazios. Preencha todos os campos obrigatórios", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        
     
    }//GEN-LAST:event_btnGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JTextField codServico;
    private javax.swing.JFormattedTextField dataCadastroServico;
    private javax.swing.JTextField descricaoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pctIssServico;
    private javax.swing.JTextField precoServico;
    // End of variables declaration//GEN-END:variables

    private String formatandoData(){
        Calendar data = Calendar.getInstance();

        //Setando a data atual para objeto
        //this.data.set(this.data.get(Calendar.YEAR),this.data.get(Calendar.MONTH), this.data.get(Calendar.DAY_OF_MONTH));

        //DateFormat dataFormatada = DateFormat.getDateInstance();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy");

        String data1 = dataFormatada.format(this.data.getTime());

        return data1;
    }
    
    private void limparCampos(){
        
        codServico.setText("");
        descricaoServico.setText("");
        precoServico.setText("");
        pctIssServico.setText("");
        dataCadastroServico.setText("");
    }

}
