import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer implements Runnable{
   private final String nomeUsuario;
   private Socket cliente;
   private ServerSocket servidor;
   private TelaServidor tela;
   
   public ChatServer(TelaServidor tela, String nomeUsuario){
      this.tela = tela;
      this.nomeUsuario = nomeUsuario;
   }
   
   public ChatServer(String nomeUsuario){
      this.nomeUsuario = nomeUsuario;
   }
   
   public String getNomeUsuario(){
      return this.nomeUsuario;
   }
   
   @Override
   public void run() {
      try {
         // Instancia o ServerSocket ouvindo a porta 80
         servidor = new ServerSocket(80);
         System.out.println("Servidor ouvindo a porta 80");
         cliente = servidor.accept();
         if(this.tela!=null){
            this.tela.jlIpCliente.setText(cliente.getInetAddress().getHostAddress());
         }
         
         while(true) {        
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            String msg = (String)entrada.readObject();     
            System.out.println(msg);
            if(this.tela!=null){
               this.tela.taHistorico.setText(this.tela.taHistorico.getText()+msg+"\n");
            }
//        cliente.close();
      }  
    }   
    catch(Exception e) {
       System.err.println(e.getMessage());
    }  
   }
   
   public void enviarMsg(String msg){
      ObjectOutputStream saida;
      try {
         saida = new ObjectOutputStream(cliente.getOutputStream());
         saida.flush();
         saida.writeObject(getNomeUsuario() + ": " +msg);
         if(this.tela!=null){
            this.tela.taHistorico.setText(this.tela.taHistorico.getText()+"Eu: "+msg+"\n");
         }
      } catch (IOException ex) {
         Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
      }
      
//    saida.close();
   }
}