/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;
import java.sql.*;
import Koneksi.Koneksi;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Report extends javax.swing.JPanel {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        Koneksi kon = new Koneksi(); 
        ResultSet rs = null;
        int i = 0; 
        try{ 
            rs = kon.getData("select * from peminjaman p Join mobil m On (p.id_mobil = m.id_mobil) JOIN pegawai pe ON (p.id_pegawai = pe.id_pegawai) "); 
            while(rs.next()){
            jTable1.setValueAt(rs.getString("id_peminjaman"), i, 0);
            jTable1.setValueAt(rs.getString("id_pelanggan"), i, 1);
            jTable1.setValueAt(rs.getString("jenis_mobil"), i, 2);
            jTable1.setValueAt(rs.getString("nama_pegawai"), i, 3);
            jTable1.setValueAt(rs.getString("tgl_pinjam"), i, 4);
            jTable1.setValueAt(rs.getString("tgl_hrs_kembali"), i, 5) ;
            jTable1.setValueAt(rs.getString("biaya"), i, 6);
            jTable1.setValueAt(rs.getString("denda"), i, 7); i++; 
            } rs.close(); 
        } catch(Exception e){ 
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(190, 197, 173));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(105, 126, 83));
        jLabel1.setText("Report");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Pelanggan", "Mobil", "Petugas", "Tgl Pinjam", "Tgl Kembali", "Sewa", "Denda"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
