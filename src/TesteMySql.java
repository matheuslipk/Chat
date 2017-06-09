import dao.UsuariosDao;
import java.sql.SQLException;
import modell.Usuarios;

public class TesteMySql {
   public static void main(String[] args) throws SQLException {
      UsuariosDao udao = new UsuariosDao();
      Usuarios u = new Usuarios();
      u.setNick("matheuslipk");
      u.setNome("Matheus Araujo");
      udao.inserirUsuario(u);
   }
}
