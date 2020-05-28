/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoja;

/**
 *
 * @author jose
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    public static Connection connect() {
        Connection conn = null;
        try {
         //Ruta de nuestra base de datos
            String url = "jdbc:sqlite:C:\\Users\\jose\\Desktop\\proyecto\\mybd.db";
            //Realizar conexion con nuestra Base de datos
            conn = DriverManager.getConnection(url);            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());            
        } finally {            
        }
       return conn;
    }  
}