
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadServer2 implements Runnable{
   private ChatServer chat;
   
   public ThreadServer2(ChatServer chat){
      this.chat = chat;
   }
   
   @Override
   public void run() {
      try {
         chat.mapClientes.put("teste", chat.servidor.accept());
      } catch (IOException ex) {
         Logger.getLogger(ThreadServer2.class.getName()).log(Level.SEVERE, null, ex);
      }
         
   }
   
}
