
import java.io.Serializable;
import java.util.Date;

public class Mensagem implements Serializable{

   public String getMsg() {
      return msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public String getRemetente() {
      return remetente;
   }

   public void setRemetente(String remetente) {
      this.remetente = remetente;
   }

   public String getDestino() {
      return destino;
   }

   public void setDestino(String destino) {
      this.destino = destino;
   }

   public Date getHora() {
      return hora;
   }

   public void setHora(Date hora) {
      this.hora = hora;
   }
   
   private Date hora;
   private String msg;
   private String remetente;
   private String destino;
}
