/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.sql.*;
import Koneksi.Koneksi;

/**
 *
 * @author USER
 */
public class Pegawai {
    private String id;
    private String id_akun;
    private String nama;
    private String alamat;
    private String cp;
    private String username;
    private String password;
    
    public Pegawai(){ 
        this.id = "";
        this.nama = "";
        this.alamat = "";
        this.cp = "";
        this.username = "";
        this.password = "";
        this.id_akun = "";
        
    }
    
    public String getId(){ return id; }
    public String getIdAkun(){ return id_akun; }
    public String getNama(){ return nama; }
    public String getAlamat(){ return alamat; }
    public String getCp(){ return cp; }
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    
    public void setId(String id){this.id = id; }
    public void setIdAkun(String id){this.id_akun = id; }
    public void setNama(String nama){ this.nama = nama; }
    public void setAlamat(String alamat){ this.alamat = alamat; }
    public void setCp(String cp){ this.cp = cp; }
    public void setUsername(String username){ this.username = username; } 
    public void setPassword(String password){ this.password = password; }

    public void insertPegawai(){ 
        Koneksi kon = new Koneksi();
        String s = "insert into pegawai values ('"+this.id+"','"+this.nama+"', '"+this.alamat+"' , '"+this.cp+"', '"+ this.id_akun+"')";
        kon.query(s);
    }
    
    public void updatePegawai(){
        Koneksi kon = new Koneksi();
        String s = "update pegawai set id_pegawai = '"+this.id+"', nama_pegawai = '"+this.nama+"', cp_pegawai = '"+this.cp+"', alamat_pegawai = '"+this.alamat+"' where id_pegawai = '"+this.id+"'";
        kon.query(s);
    }
    
    public void deletePegawai(){
        Koneksi kon = new Koneksi();
        String s = "delete from pegawai where id_pegawai ='"+this.id+"'";
        kon.query(s);
    }
    
    public ResultSet getPegawai(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into pegawai values ('"+this.id+"','"+this.nama+"', '"+this.alamat+"', '"+this.cp+"', '"+this.username+"','"+this.password+"', '2')";
        kon.query(s);
        return r;
    }
    
    
    
}
