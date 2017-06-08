
import java.util.Date;

public class TelaCliente extends javax.swing.JFrame {

   private String usuario;
   private ChatClient cliente;
   private Thread t;
   
   public TelaCliente() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      tfUsuario = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      btnFecharServidor = new javax.swing.JButton();
      btnIniciarServidor = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      taHistorico = new javax.swing.JTextArea();
      tfMsg = new javax.swing.JTextField();
      btnEnviarMsg = new javax.swing.JButton();
      jlInfo = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Cliente");

      jLabel2.setText("Seu nome");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel2)
               .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      btnFecharServidor.setText("Desconectar");
      btnFecharServidor.setEnabled(false);
      btnFecharServidor.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnFecharServidorActionPerformed(evt);
         }
      });

      btnIniciarServidor.setText("Conectar");
      btnIniciarServidor.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIniciarServidorActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnIniciarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(btnFecharServidor)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnFecharServidor)
               .addComponent(btnIniciarServidor))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      taHistorico.setEditable(false);
      taHistorico.setColumns(20);
      taHistorico.setRows(5);
      jScrollPane1.setViewportView(taHistorico);

      tfMsg.setToolTipText("");
      tfMsg.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            tfMsgKeyPressed(evt);
         }
      });

      btnEnviarMsg.setText("Enviar");
      btnEnviarMsg.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEnviarMsgActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(tfMsg)
               .addComponent(jScrollPane1)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(16, 16, 16)
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEnviarMsg)
            .addGap(206, 206, 206))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createSequentialGroup()
                  .addGap(47, 47, 47)
                  .addComponent(jlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(tfMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnEnviarMsg)
            .addContainerGap(32, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnIniciarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarServidorActionPerformed
      usuario = tfUsuario.getText();
      tfUsuario.setEnabled(false);
      btnIniciarServidor.setEnabled(false);
      btnFecharServidor.setEnabled(true);
      conectaComOServidor();
   }//GEN-LAST:event_btnIniciarServidorActionPerformed

   private void btnFecharServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharServidorActionPerformed
      System.exit(0);
      tfUsuario.setEnabled(true);
      btnIniciarServidor.setEnabled(true);
      btnFecharServidor.setEnabled(false);
      fecharServidor();
   }//GEN-LAST:event_btnFecharServidorActionPerformed

   private void btnEnviarMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMsgActionPerformed
      String texto = tfMsg.getText();
      texto = texto.trim();
      if(texto.length()==0){
         return;
      }
      Mensagem msg = new Mensagem();
      msg.setHora(new Date());
      msg.setDestino("destino");
      msg.setRemetente(usuario);
      msg.setMsg(texto);
      
      cliente.enviarMsg(msg);
      tfMsg.setText("");
   }//GEN-LAST:event_btnEnviarMsgActionPerformed

   private void tfMsgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMsgKeyPressed
      if(evt.getKeyChar()=='\n'){
         String texto = tfMsg.getText();
         texto = texto.trim();
         if(texto.length()==0){
            return;
         }
         Mensagem msg = new Mensagem();
         msg.setHora(new Date());
         msg.setDestino("Destino");
         msg.setRemetente(usuario);
         msg.setMsg(texto);
         cliente.enviarMsg(msg);
         tfMsg.setText("");
     }
   }//GEN-LAST:event_tfMsgKeyPressed

   
   private void conectaComOServidor(){
      cliente = new ChatClient(this, usuario);
      t = new Thread(cliente);
      t.start();      
   }
   
   private void fecharServidor(){
      t.interrupt();
      t = null;
      cliente = null;      
   }
   
   public static void main(String args[]) {
      
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaCliente().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnEnviarMsg;
   private javax.swing.JButton btnFecharServidor;
   private javax.swing.JButton btnIniciarServidor;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   public javax.swing.JLabel jlInfo;
   public javax.swing.JTextArea taHistorico;
   private javax.swing.JTextField tfMsg;
   private javax.swing.JTextField tfUsuario;
   // End of variables declaration//GEN-END:variables
}
