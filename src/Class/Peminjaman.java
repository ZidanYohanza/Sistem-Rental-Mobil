/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Koneksi.Koneksi;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class Peminjaman {
  private String idPeminjaman;
  private String idPelanggan;
  private String idMobil;
  private String idPetugas;
  private String ptanggal;
  private String pbulan;
  private String ptahun;
  private String lama;
  private String ktahun;
  private String biaya;
  private String telat;
  private String denda;
  
  public Peminjaman() {}
  
  public String getPem() {
    return idPeminjaman;
  }
  
  public String getPel() {
    return idPelanggan;
  }
  
  public String getMobil() {
    return idMobil;
  }
  
  public String getPetugas() {
    return idPetugas;
  }
  
  public String getPtanggal() {
    return ptanggal;
  }
  
  public String getPbulan() {
    return pbulan;
  }
  
  public String getPtahun() {
    return ptahun;
  }
  
  public String getLama() {
    return lama;
  }
  
  public String getKtahun() {
    return ktahun;
  }
  
  public String getBiaya() {
    return biaya;
  }
    
  public String getTelat() {
    return telat;
  }
    
  public String getDenda() {
    return denda;
  }
  
  public void setPeminjaman(String peminjaman) {
    this.idPeminjaman = peminjaman;
  }
  public void setPelanggan(String pelanggan) {
    this.idPelanggan = pelanggan;
  }
  public void setMobil(String mobil) {
    this.idMobil = mobil;
  }
  
  public void setPetugas(String petugas) {
    this.idPetugas = petugas;
  }
  public void setPtanggal(String ptanggal) {
    this.ptanggal = ptanggal;
  }
  public void setPbulan(String pbulan) {
    this.pbulan = pbulan;
  }
  public void setPtahun(String ptahun) {
    this.ptahun = ptahun;
  }
  public void setLama(String lama) {
    this.lama = lama;
  }
  public void setKtahun(String ktahun) {
    this.ktahun = ktahun;
  }
  
  public void setBiaya(String biaya) {
    this.biaya = biaya;
  }
  
  public void setTelat(String telat) {
    this.telat = telat;
  }
  
  public void setDenda(String denda) {
    this.denda = denda;
  }

  public void insertPeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "insert into peminjaman values('" + this.idPeminjaman+
            "', '"+this.idPelanggan+"', '" + this.idMobil + "', '"+this.idPetugas+
            "', '"+this.ptanggal+"/"+this.pbulan+"/"+this.ptahun+
            "', '"+this.ktahun+"', '"+this.lama+"', '0', '"+this.biaya+"', '0')"; 
    kon.query(s);
  }
  public void updatePeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "update peminjaman set telat = '" + this.telat +
            "', denda = '"+this.denda+ "', biaya = '" + this.biaya + "' where id_peminjaman = '"+this.idPeminjaman+"'";
    kon.query(s);
  }
  public void deletePeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "delete from peminjaman where id_peminjaman = '"+this.idPeminjaman+"'";
    kon.query(s);
  }
  public ResultSet getPeminjaman() {
    ResultSet r = null;
    Koneksi kon = new Koneksi();
    String s = "insert into peminjaman values ( '" + this.idPeminjaman +
            "', '"+this.idPelanggan+"', '"+this.idMobil+"','" +
            this.idPetugas+"', ' " + this.ptanggal+"/" +
            this.pbulan+"/"+this.ptahun+" ', '" + this.ktahun +
            "', '" + this.lama + "', '" + this.telat + "', '" + this.biaya + "', '" + this.denda + "')";
    kon.query(s);
    return r;
  }
}
