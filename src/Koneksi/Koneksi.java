/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author USER
 */
public class Koneksi {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String db = "jdbc:mysql://localhost/db_rentalmobil";
    private String user = "root";
    private String password = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Koneksi(){
        try{
            Class.forName(driver);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "JDBC DriverError", JOptionPane.WARNING_MESSAGE); 
        } 

        try{
            con = (Connection)DriverManager.getConnection(db, user, password);
            stmt = (Statement) con.createStatement();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, " "+e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE); 
        }
    }

    public Connection getCon(){
        return this.con;
    }
    
    public void query(String SQLString){
        try{ 
            stmt.executeUpdate(SQLString);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE); 
        }
    }
    
    public ResultSet getData(String SQLString){
        try{ 
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){ 
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(),"Communication Error", JOptionPane.WARNING_MESSAGE); }
        return rs;
    }
}
