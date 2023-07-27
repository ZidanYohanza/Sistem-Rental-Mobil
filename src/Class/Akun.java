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
public class Akun {
    
    private String id_akun; 
    private String username; 
    private String password; 
    private String level; 
    
    public Akun(){ 
        this.id_akun = "";
        this.username = "";
        this.password = "";
        this.level = "";
    }
    
    public String getId(){ 
        return this.id_akun; 
    }
    
    public String getUsername(){ 
        return this.username; 
    }
    
    public String getPassword(){ 
        return this.password; 
    }
    
    public String getLevel(){ 
        return this.level; 
    }
    
    public void setId(String id){ 
        this.id_akun = id; 
    }
    
    public void setUsername(String user){ 
        this.username = user; 
    }
    
    public void setPassword(String password){ 
        this.password = password; 
    }
    
    public void setLevel(String level){ 
        this.level = level; 
    }
    
    public void insertAkun(){ 
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        String s = "insert into Akun(username, password, level) values (\'" + this.username +"\', '" + this.password +"\', '" + this.level +"\')";
        kon.query(s);
    }
    
    public void updateAkun(){
        Koneksi kon = new Koneksi();
        String s = "update Akun set username ='"+this.username+"', password = '"+this.password+"'where id_Akun ='"+this.id_akun+"'";
        kon.query(s);
    }
    
    public void deleteAkun(){ 
        Koneksi kon = new Koneksi();
        String s = "delete from Akun where id_akun = '"+this.id_akun+"'";
        kon.query(s);
    }
    
    public ResultSet getAkun(){ 
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into Akun values ('"+this.id_akun+"','"+this.username+"', '"+this.password+"', '"+this.level+"')";
        kon.query(s); 
        return r;
    }
    
}
