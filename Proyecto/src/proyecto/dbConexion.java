/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class dbConexion {
    Connection con;
    public dbConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto" ,"root", "1234" );
        }catch(Exception e){
        }
    }
    public Connection getConnection(){
        return con;
    }
}
