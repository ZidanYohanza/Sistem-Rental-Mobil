/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Koneksi.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Pelanggan {
    private String id; 
    private String nama; 
    private String alamat; 
    private String cp; 
    
    public Pelanggan(){
        
    }
    
    public String getId(){ 
        return this.id; 
    } 
    
    public String getNama(){ 
        return this.nama; 
    }
    
    public String getAlamat(){ 
        return this.alamat; 
    }
    
    public String getCp(){ 
        return this.cp; 
    }
    
    public void setId(String id){ 
        this.id = id; 
    } 
    
    public void setNama(String nama){ 
        this.nama = nama; 
    } 
    
    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    } 
    
    public void setCp(String cp){ 
        this.cp = cp; 
    } 
    
    public void insertPelanggan(){ 
        try{
            Koneksi kon = new Koneksi(); 
            String insertQuery = "insert into pelanggan values ('"+this.id+"','"+this.nama+"', '"+this.alamat+"', '"+this.cp+"')"; 
            kon.query(insertQuery);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Insert Data gagal");
        }
    } 
    public void updatePelanggan(){ 
        try{
            Koneksi kon = new Koneksi(); 
            String updateQuery = "update pelanggan set nama_pelanggan = '"+this.nama+"', cp_pelanggan = '"+this.cp+"', alamat_pelanggan = '"+this.alamat+"' where id_pelanggan = '"+this.id+"'";
            kon.query(updateQuery); 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Update Data gagal");
        }
    }
    
    public void deletePelanggan(){ 
        try{
            Koneksi kon = new Koneksi();
            String deleteQuery = "delete from pelanggan where id_pelanggan = \'" + this.id+"\'";
            kon.query(deleteQuery);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hapus Data gagal");
        }
    }
    
    public ResultSet getPelanggan(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String insertQuery = "insert into pelanggan values (\'"+this.id+"\', \'"+this.nama+"\', \'"+this.cp+"\', \'"+this.alamat+"\')";
        kon.query(insertQuery);
        return r;
    }
}
