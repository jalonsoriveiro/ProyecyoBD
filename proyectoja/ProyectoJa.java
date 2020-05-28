/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoja;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoja.Connect.*;
import static proyectoja.Connect.connect;
import static proyectoja.interfaz.Interfaz.menu;

/**
 *
 * @author jose
 */
public class ProyectoJa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Connect conn = new Connect();        
       // try {
         // String url = "jdbc:sqlite:C:\\Users\\jose\\Desktop\\proyecto\\mybd.db";
            // create a connection to the database
            //Connection conn = DriverManager.getConnection(url);
            //Connection conn = connect();          
          //  Statement miStatement = conn.createStatement();
          //  ResultSet miResultset = miStatement.executeQuery("Select * from persons");
            
      //  } catch (SQLException ex) {
        //    Logger.getLogger(ProyectoJa.class.getName()).log(Level.SEVERE, null, ex);
       // }
              menu();
       
    
    }
    
}
