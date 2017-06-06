import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatClient implements Runnable{
   String nomeUsuario;
   TelaCliente t;
   Socket cliente;
   
   public ChatClient(TelaCliente t){
      this.t = t;
      try {
         this.cliente = new Socket("192.168.0.195", 21);
         
      } catch (IOException ex) {
         return;
      }
   }
   
   public ChatClient(String nomeUsuario){
      this.nomeUsuario = nomeUsuario;
      try {
         this.cliente = new Socket("192.168.0.195", 21);
         
      } catch (IOException ex) {
         return;
      }
   }

   @Override
   public void run() {
      try {
      System.out.println("Socket criado");
      
      while(true){
         ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
         String msg = (String)entrada.readObject();
         System.out.println(msg);
         if(t!=null)t.taHistorico.setText(t.taHistorico.getText()+msg+"\n");
      }
      
    }
    catch(Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
   }
   
   public void setNomeUsuario(String nome){
      this.nomeUsuario = nome;
   }
   
   public void enviarMsg(String msg){
      ObjectOutputStream saida;
      try {
         saida = new ObjectOutputStream(cliente.getOutputStream());
         saida.flush();
         saida.writeObject(nomeUsuario +": "+ msg);
         if(t!=null)t.taHistorico.setText(t.taHistorico.getText()+"Eu: "+msg+"\n");
         
      } catch (IOException ex) {
         Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
      }
      
   }
   
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite seu usuario");
      ChatClient c = new ChatClient(ler.next());
      Thread t = new Thread(c);
      t.start();
      
      while(true){
         System.out.println("Eu: ");
         c.enviarMsg(ler.nextLine());
      }
   }
}