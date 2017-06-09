package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccao {
   public Connection getConecao() throws SQLException{
      return DriverManager.getConnection("jdbc:mysql://localhost/chat", "root", "21049900");
   }
}
