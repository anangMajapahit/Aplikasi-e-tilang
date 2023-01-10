/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.tilang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author UmumPRT
 */
public class Config {
    public static Connection configDB()throws SQLException{
        Connection MySQLConfig = null;
        try{
            String url = "jdbc:mysql://localhost:3306/tilang";
            String user = "root";
            String pass = "";
            
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("Koneksi ke database gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}
