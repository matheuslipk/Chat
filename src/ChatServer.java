import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer implements Runnable{
   private String nomeUsuario;
   private TelaServidor t;
   Socket cliente;
   
   public void setNomeUsuario(String nome){
      this.nomeUsuario = nome;
   }
   
   public String getNomeUsuario(){
      return this.nomeUsuario;
   }
   
   public ChatServer(TelaServidor t){
      this.t = t;
   } 
   
   @Override
   public void run() {
      try {
      // Instancia o ServerSocket ouvindo a porta 12345
      ServerSocket servidor = new ServerSocket(21);
      System.out.println("Servidor ouvindo a porta 21");
      t.taHistorico.setText(t.taHistorico.getText()+"Servidor ouvindo a porta 21\n");
      cliente = servidor.accept();
      t.taHistorico.setText(t.taHistorico.getText()+"Cliente conectado: " + cliente.getInetAddress().getHostAddress()+"\n");
     
      while(true) {        
         System.out.println("Aguardando msg...");
         ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
         String mens = (String)entrada.readObject();
         t.taHistorico.setText(t.taHistorico.getText()+mens+"\n");        
//        cliente.close();
      }  
    }   
    catch(Exception e) {
       System.out.println("Erro: " + e.getMessage());
    }  
   }
   
   public void enviarMsg(String msg){
      ObjectOutputStream saida;
      try {
         saida = new ObjectOutputStream(cliente.getOutputStream());
         saida.flush();
         saida.writeObject(getNomeUsuario() + ": " +msg);
         t.taHistorico.setText(t.taHistorico.getText() + "Eu: " + msg + "\n");
      } catch (IOException ex) {
         Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
      }
      
//    saida.close();
   }
}