import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatClient implements Runnable{
   private String nomeUsuario;
   private Socket cliente;   
   private String ip = "192.168.0.120";
   private int porta = 80;
   private TelaCliente tela;
   
   public ChatClient(TelaCliente tela, String nomeUsuario){
      this.tela = (TelaCliente)tela;
      this.nomeUsuario = nomeUsuario;
      try {
         this.cliente = new Socket(ip, porta);      
         this.tela.jlInfo.setText("Conectado");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
   
   public ChatClient(String nomeUsuario){
      this.nomeUsuario = nomeUsuario;
      try {
         this.cliente = new Socket(ip, porta);      
         System.out.println("Socket criado");
         
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }

   @Override
   public void run() {
      try {
         
         while(true){
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            String msg = (String)entrada.readObject();
            System.out.println(msg);
            if(this.tela!=null){
               this.tela.taHistorico.setText(this.tela.taHistorico.getText()+msg+"\n");
            }
         }      
      }
      
      catch(IOException | ClassNotFoundException e) {
         System.out.println("Erro: " + e.getMessage());
      }
   }
   
   public void enviarMsg(String msg){
      ObjectOutputStream saida;
      try {
         saida = new ObjectOutputStream(cliente.getOutputStream());
         saida.flush();
         saida.writeObject(nomeUsuario +": "+ msg);
         if(this.tela!=null){
            this.tela.taHistorico.setText(this.tela.taHistorico.getText()+"Eu: "+msg+"\n");
         }
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