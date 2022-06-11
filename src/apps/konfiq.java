/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps;

import static apps.konfiq.getkoneksi;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class konfiq {
    
    
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/Login";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,pass);
                System.out.println("Connection Succes");
            }catch(Exception e){
                System.out.println("Eroor");
            }
        }
        return koneksi;
    }
    public static void main(String args){
        getkoneksi();
    }
    
}
