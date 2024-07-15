package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   Connection connection;
   
   public Conexion(){
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost/tienda2", "root", "");
         
      } catch (Exception e){
         System.err.println("No se pudo establecer la conexión. Error.");
      }
   }
   public Connection getConnection(){
      return connection;
   }
}
