import dao.UsuariosDao;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Usuarios;

public class ChatServer implements Runnable{
   private final String nomeUsuario;
   private Socket cliente;
   public ServerSocket servidor;
   public TelaServidor tela;
   public Map<String, Socket> mapClientes = new HashMap<>();
   
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
         servidor = new ServerSocket(123);
         System.out.println("Servidor ouvindo a porta 123");
         cliente = servidor.accept();
         
         if(this.tela!=null){
            this.tela.jlIpCliente.setText(cliente.getInetAddress().getHostAddress());
            this.tela.taHistorico.setText(this.tela.taHistorico.getText()+
                    cliente.getInetAddress().getHostAddress()+"\n");
         }
         
         while(true) {        
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Mensagem msg = (Mensagem)entrada.readObject();     
            if(msg.isAutenticacao()){
               System.out.println("Autenticando");
               Usuarios u = new Usuarios();
               u.setNick(msg.getRemetente());
               new UsuariosDao().inserirUsuario(u);
               continue;
            }
            System.out.println(msg);
            if(this.tela!=null){
               this.tela.taHistorico.setText(this.tela.taHistorico.getText()+
                       msg.getRemetente()+": "+msg.getMsg()+"\n");
            }
//        cliente.close();
      }  
    }   
    catch(Exception e) {
       System.err.println(e.getMessage());
    }  
   }
      
   public void enviarMsg(Mensagem msg){
      ObjectOutputStream saida;
      try {
         saida = new ObjectOutputStream(cliente.getOutputStream());
         saida.flush();
         saida.writeObject(msg);
         if(this.tela!=null){
            this.tela.taHistorico.setText(this.tela.taHistorico.getText()+"Eu: "+msg.getMsg()+"\n");
         }
      } catch (IOException ex) {
         Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
      }
      
   }
}