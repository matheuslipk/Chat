package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modell.Usuarios;

public class UsuariosDao {
   public void inserirUsuario(Usuarios usuario){
      try {
         try (Connection c = new Coneccao().getConecao()) {
            String sql = "INSERT INTO usuarios VALUES (NULL,?,?,NULL)";
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
               stmt.setString(1, usuario.getNick());
               stmt.setString(2, usuario.getNome());
               stmt.execute();
            }
         }
      } catch (SQLException ex) {
         System.err.println("Método (inserir usuarios): "+ex.getMessage());
      }
   }
   
   public void getUsuarioBtId(int id){
      try {
         try (Connection c = new Coneccao().getConecao()) {
            String sql = "SELECT * FROM usuarios WHERE idUsuario=?";
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
               stmt.setInt(1, id);
               stmt.execute();
            }
         }
      } catch (SQLException ex) {
         System.err.println(ex.getMessage());
      }
   }
   
   public void getUsuarioBtNick(String nick){
      try {
         try (Connection c = new Coneccao().getConecao()) {
            String sql = "SELECT * FROM usuarios WHERE nick=?";
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
               stmt.setString(1, nick);
               stmt.execute();
            }
         }
      } catch (SQLException ex) {
         System.err.println(ex.getMessage());
      }
   }
}
