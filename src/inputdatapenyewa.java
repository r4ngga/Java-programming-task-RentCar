/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.xdevapi.DatabaseObject;
import com.mysql.cj.xdevapi.DbDoc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;  
import java.util.Properties;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Ranggga
 */
public class inputdatapenyewa extends javax.swing.JFrame {

    /**
     * Creates new form inputdatapenyewa
     */
    public inputdatapenyewa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master Mobil");
        setMaximumSize(new java.awt.Dimension(890, 603));
        setMinimumSize(new java.awt.Dimension(890, 603));
        setPreferredSize(new java.awt.Dimension(890, 603));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(101, 82, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Speedy Speed Boy");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 370, 50));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rent Car");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Tempat Tanggal Lahir");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ID Penyewa");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nama Penyewa");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Nomer Hp");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Alamat");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Pekerjaan");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 110, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 110, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 110, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Penyewa", "Nama ", "Alamat", "Jenis Kelamin", "TTL", "Pekerjaan", "No HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, 840, 90));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setText("Tampil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Kembali Ke Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 130, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel11.setText("Cari Penyewa berdasarkan ID Penyewa");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 100, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tambahpenyewa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       tampilpenyewa();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        hapuspenyewa();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        editpenyewa();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modl= (DefaultTableModel)jTable1.getModel();
        int selecttedrow = jTable1.getSelectedRow();
        jTextField2.setText(modl.getValueAt(selecttedrow, 0).toString());
        jTextField3.setText(modl.getValueAt(selecttedrow, 1).toString());
        jTextField4.setText(modl.getValueAt(selecttedrow, 2).toString());
        jComboBox1.setSelectedItem(modl.getValueAt(selecttedrow, 3).toString());
        jTextField5.setText(modl.getValueAt(selecttedrow, 4).toString());
        
        jTextField6.setText(modl.getValueAt(selecttedrow, 5).toString());
        jTextField1.setText(modl.getValueAt(selecttedrow, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        caripenyewa();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inputdatapenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputdatapenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputdatapenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputdatapenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputdatapenyewa().setVisible(true);
            }
        });
    }
    
    private void tambahpenyewa()
    {
         String idpenyw=jTextField2.getText();
        String nmpnyw=jTextField3.getText();
        String alamat=jTextField4.getText();
        String tl= jTextField5.getText();
        String nohp= jTextField1.getText(); 
        Object jk=jComboBox1.getSelectedItem();
        String pkrj=jTextField6.getText();
       try
       {
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            Statement st=con.createStatement();
            String quer="insert into penyewa(id_penyewa,nama_penyewa,alamat,ttl,"
                    + "jenis_kel,pekerjaan,nohp)values('"+idpenyw+"','"+nmpnyw+"','"+
                    alamat+"','"+tl+"','"+jk+"','"+pkrj+"','"+nohp+"');";
             st.executeUpdate(quer);
            JOptionPane.showMessageDialog(null, "Sukses Ditambahkan");
             jTextField2.setText(" ");
            jTextField3.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
             jTextField1.setText(" ");
             jComboBox1.setSelectedItem("Laki-Laki");
             jTextField6.setText(" ");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(null," Error tidak dapat ditambahkan "+ e);}
    }
    
    private void tampilpenyewa()
    {
       String idp,namap,alamatp,jenisp,ttlp,pekerjaanp,nohp_p;
         try     
        {
            Object[] row = {"ID Penyewa", "Nama", "Alamat", "Jenis Kelamin",
                "TTL", "Pekerjaan", "No HP"};
            DefaultTableModel tabmod;
            tabmod = new DefaultTableModel(null, row);
            jTable1.setModel(tabmod);
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
             String quer="SELECT id_penyewa , nama_penyewa , alamat , jenis_kel , "
                     + "ttl , pekerjaan , nohp  FROM penyewa";
            Statement st=con.createStatement();       
            ResultSet rs= st.executeQuery(quer);
            while(rs.next())
            {
                idp=rs.getString("id_penyewa");
                namap=rs.getString("nama_penyewa");
                alamatp=rs.getString("alamat");
                jenisp=rs.getString("jenis_kel");
                ttlp=rs.getString("ttl");
                pekerjaanp=rs.getString("pekerjaan");
                nohp_p=rs.getString("nohp");
                String datt[]={idp,namap,alamatp,jenisp,ttlp,pekerjaanp,nohp_p};
                tabmod.addRow(datt);
            }
        }
        catch(Exception e)
        { JOptionPane.showMessageDialog(null,"Can't Show Database "+ e);}
    }
    
    private void hapuspenyewa()
    {
        int row=jTable1.getSelectedRow();
        String id=jTable1.getModel().getValueAt(row, 0).toString();
        String queriy="DELETE FROM penyewa WHERE id_penyewa = '"+id+"'";
        try {
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);       
            PreparedStatement pstmt = con.prepareStatement(queriy);
           pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Sukses Dihapus");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak Dapat Di Hapus "+ e);
        }
    }
    
    private void editpenyewa()
    {
          String idpenyw=jTextField2.getText();
        String nmpnyw=jTextField3.getText();
        String alamat=jTextField4.getText();
        String tl= jTextField5.getText();
        String nohp= jTextField1.getText();
        Object jk=jComboBox1.getSelectedItem();
        String pkrj=jTextField6.getText();
       try
       {
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            Statement st=con.createStatement();
            String quer="update penyewa set nama_penyewa='"+nmpnyw+"',alamat='"+
                    alamat+"',ttl='"+tl+"',jenis_kel='"+jk+"',pekerjaan='"+pkrj+
                    "',nohp='"+nohp+"' where id_penyewa='"+idpenyw+"'";
             st.executeUpdate(quer);
            JOptionPane.showMessageDialog(null, "Sukses Diganti");
             jTextField2.setText(" ");
            jTextField3.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
             jTextField1.setText(" ");
             jComboBox1.setSelectedItem("Laki-Laki");
             jTextField6.setText(" ");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(null," Error tidak dapat diganti "+ e);} 
    }

    private void caripenyewa()
    {
     String idp,namap,alamatp,jenisp,ttlp,pekerjaanp,nohp_p;
        try{
            String idpecarian=jTextField7.getText();
            Object[] row={"ID Penyewa","Nsms","Alamat","Jenis Kelamin","TTL","Pekerjaan","No HP"};
            DefaultTableModel tabmodel;
            tabmodel = new DefaultTableModel(null, row);
            jTable1.setModel(tabmodel);
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            String quer="SELECT * FROM penyewa where id_penyewa = '"+idpecarian+"'";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(quer);
                if(rs.next())
            {
                idp=rs.getString("id_penyewa");
                namap=rs.getString("nama_penyewa");
                alamatp=rs.getString("alamat");
                jenisp=rs.getString("jenis_kel");
                ttlp=rs.getString("ttl");
                pekerjaanp=rs.getString("pekerjaan");
                nohp_p=rs.getString("nohp");
               
                String data[]={idp,namap,alamatp,jenisp,ttlp,pekerjaanp,nohp_p};   
                tabmodel.addRow(data);
            }else
                {JOptionPane.showMessageDialog(null,"Tidak Dapat Ditemukans ");
                } 
        }
        catch(Exception a){
           JOptionPane.showMessageDialog(null,"Tidak Dapat Ditemukans "+a);}
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
