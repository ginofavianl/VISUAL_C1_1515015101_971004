/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6dan7;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GinoFavianLeonardo
 */
public class koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            con = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pratikum_visual","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");  
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil"
            +e.getMessage());   
        }
        return con;
    }
    
}
