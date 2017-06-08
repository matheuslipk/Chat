
import java.util.Date;

public class TelaServidor extends javax.swing.JFrame {

   private String usuario;
   private ChatServer server;
   private Thread t;
   
   public TelaServidor() {
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
      jlIpCliente = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      taHistorico = new javax.swing.JTextArea();
      tfMsg = new javax.swing.JTextField();
      btnEnviarMsg = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Servidor");

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

      btnFecharServidor.setText("Fechar Servidor");
      btnFecharServidor.setEnabled(false);
      btnFecharServidor.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnFecharServidorActionPerformed(evt);
         }
      });

      btnIniciarServidor.setText("Iniciar Servidor");
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnFecharServidor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jlIpCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jlIpCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnFecharServidor)
                     .addComponent(btnIniciarServidor))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
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
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(247, Short.MAX_VALUE)
            .addComponent(btnEnviarMsg)
            .addGap(206, 206, 206))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
      iniciarServidor();
   }//GEN-LAST:event_btnIniciarServidorActionPerformed

   private void btnFecharServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharServidorActionPerformed
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
      
      server.enviarMsg(msg);
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
         msg.setDestino("destino");
         msg.setRemetente(usuario);
         msg.setMsg(texto);
         server.enviarMsg(msg);
         tfMsg.setText("");
     }
    }//GEN-LAST:event_tfMsgKeyPressed

   
   private void iniciarServidor(){
      server = new ChatServer(this, usuario);
      t = new Thread(server);
      t.start();      
   }
   
   private void fecharServidor(){
      t.interrupt();
      t = null;
      server = null;      
   }
   
   public static void main(String args[]) {
      
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaServidor().setVisible(true);
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
   public javax.swing.JLabel jlIpCliente;
   public javax.swing.JTextArea taHistorico;
   private javax.swing.JTextField tfMsg;
   private javax.swing.JTextField tfUsuario;
   // End of variables declaration//GEN-END:variables
}
