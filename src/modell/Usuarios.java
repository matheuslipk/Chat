package modell;

public class Usuarios {

   public int getIdUsuario() {
      return idUsuario;
   }

   public void setIdUsuario(int idUsuario) {
      this.idUsuario = idUsuario;
   }

   public String getNick() {
      return nick;
   }

   public void setNick(String nick) {
      this.nick = nick;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }
   private int idUsuario;
   private String nick;
   private String nome;
}
