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
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Ranggga
 */
public class inputdatamobil extends javax.swing.JFrame {

    /**
     * Creates new form inputdatamobil
     */
    public inputdatamobil() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master Mobil");
        setMaximumSize(new java.awt.Dimension(890, 603));
        setMinimumSize(new java.awt.Dimension(890, 603));
        setPreferredSize(new java.awt.Dimension(890, 548));
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
        jLabel4.setText("ID Mobil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Plat Nomer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Harga Sewa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Jenis");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CC");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 30, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Bahan Bakar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 120, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 120, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 120, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "Van", "Sedan", "Sport", "HatchBack", "Bus", "Truck", "Jeep", " ", " ", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 100, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pertalite", "Pertamax", "Solar", "Bio Solar", "Dex Lite" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Nama");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Merk");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 120, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton4.setText("Tampil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Kembali Ke Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Mobil", "Plat Nomer", "Nama", "Merk", "Jenis", "CC", "Bahan Bakar", "Harga Sewa", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 830, 90));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Sudah Disewa", "Maintenance" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Rp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Cari Mobil berdasarkan ID Mobil");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 100, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tambahmobil();      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       tampilmobil();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       hapusmobil();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        editmobil();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modl= (DefaultTableModel)jTable1.getModel();
        int selecttedrow = jTable1.getSelectedRow();
        jTextField2.setText(modl.getValueAt(selecttedrow, 0).toString());
        jTextField4.setText(modl.getValueAt(selecttedrow, 1).toString());
        jTextField5.setText(modl.getValueAt(selecttedrow, 2).toString());
        jTextField1.setText(modl.getValueAt(selecttedrow, 3).toString());
        jComboBox1.setSelectedItem(modl.getValueAt(selecttedrow, 4).toString());
        jTextField3.setText(modl.getValueAt(selecttedrow, 5).toString());
        jComboBox2.setSelectedItem(modl.getValueAt(selecttedrow, 6).toString());
        jTextField6.setText(modl.getValueAt(selecttedrow, 7).toString());
        jComboBox3.setSelectedItem(modl.getValueAt(selecttedrow, 8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        carimobil();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(inputdatamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputdatamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputdatamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputdatamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputdatamobil().setVisible(true);
            }
        });
    }
    
    private void tambahmobil()
    {
         String idmbl=jTextField2.getText();
        String platno=jTextField4.getText();
        String namambl= jTextField5.getText();
        String merek= jTextField1.getText();
        String c_c=jTextField3.getText();
        Object jenis=jComboBox1.getSelectedItem();
        Object bb=jComboBox2.getSelectedItem();
        String hrgsewa=jTextField6.getText();
       Object stats=jComboBox3.getSelectedItem();
        try
        {
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            Statement st=con.createStatement();
            String quer="insert into mobil(id_mobil,plat_"
                    + "no,nama_mobil,merk,jenis,cc,bahan_bakar,harga_sewa,"
                    + "status)values('"+idmbl+"','"+platno+"','"+namambl+"','"
                    +merek+"','"+jComboBox1.getSelectedItem()+"','"+c_c+
                    "','"+jComboBox2.getSelectedItem()+"','"+jTextField6.getText()+"','"
                    +jComboBox3.getSelectedItem()+"');";
            st.executeUpdate(quer);
            JOptionPane.showMessageDialog(null, "Sukses Ditambahkan");
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
            jTextField1.setText(" ");
            
            jComboBox1.setSelectedItem("SUV");
            jTextField3.setText(" ");
            jComboBox2.setSelectedItem("Pertalite");
            jTextField6.setText(" ");
            jComboBox2.setSelectedItem("Ready");
        }
        catch(Exception a)
        {JOptionPane.showMessageDialog(null,"Error "+ a);}
    }

    private void tampilmobil()
    {String idm, platno, namambl, merkk,jns,cc ,bb, hs,sts; 
         try
        {
            Object[] row={"ID Mobil","Plat Nomer","Nama","Merk","Jenis","CC",
                "Bahan Bakar","Harga Sewa","Status"};
            DefaultTableModel tabmodel;
            tabmodel = new DefaultTableModel(null, row);
            jTable1.setModel(tabmodel);
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            String quer="SELECT id_mobil , plat_no , nama_mobil , merk , jenis , cc "
                    + ", bahan_bakar , harga_sewa , status FROM mobil";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(quer);
            while(rs.next())
            {
                idm=rs.getString("id_mobil");
                platno=rs.getString("plat_no");
                namambl=rs.getString("nama_mobil");
                merkk=rs.getString("merk");
                jns=rs.getString("jenis");
                cc=rs.getString("cc");
                bb=rs.getString("bahan_bakar");
                hs=rs.getString("harga_sewa");
                sts=rs.getString("status");
                String data[]={idm,platno,namambl,merkk,jns,cc,bb,hs,sts};   
                tabmodel.addRow(data);
            }   
        }
        catch(Exception e)
        { JOptionPane.showMessageDialog(null,"Tidak dapat menampilkan Data Mobil "+ e);}
    }
    
    private void editmobil()
    {
        String idmbl=jTextField2.getText();
         String platno=jTextField4.getText();
         String namambl= jTextField5.getText();
         String merek= jTextField1.getText();
         String c_c=jTextField3.getText();
         Object jenis=jComboBox1.getSelectedItem();
         Object bb=jComboBox2.getSelectedItem();
         String hrgsewa=jTextField6.getText();
         Object stats=jComboBox3.getSelectedItem();
       try
        {
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            Statement st=con.createStatement();
            String quer="update mobil set plat_no='"+platno+"',nama_mobil='"+namambl+"',"
                    + "merk='"+merek+"',jenis='"+jenis+"',cc='"+c_c+"',"
                    + "bahan_bakar='"+bb+"',harga_sewa='"+hrgsewa+"',status='"+stats+"'"
                    +"where id_mobil='"+idmbl+"'";
            st.executeUpdate(quer);
            JOptionPane.showMessageDialog(null, "Sukses Diganti");
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
            jTextField1.setText(" ");           
            jComboBox1.setSelectedItem("SUV");
            jTextField3.setText(" ");
            jComboBox2.setSelectedItem("Pertalite");
            jTextField6.setText(" ");
            jComboBox2.setSelectedItem("Ready");
        }
        catch(Exception a)
        {JOptionPane.showMessageDialog(null,"Error "+ a);}
    }
    
    private void hapusmobil()
    {
         int row=jTable1.getSelectedRow();
            String id=jTable1.getModel().getValueAt(row, 0).toString();
            String queriy="DELETE FROM mobil WHERE id_mobil = '"+id+"'";
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
    
    private void carimobil()
    {
        String idm, platno, namambl, merkk,jns,cc ,bb, hs,sts;
        try{
            String idpecarian=jTextField7.getText();
            Object[] row={"ID Mobil","Plat Nomer","Nama","Merk","Jenis"
                    + "","CC","Bahan Bakar"
            ,"Harga Sewa","Status"};
            DefaultTableModel tabmodel;
            tabmodel = new DefaultTableModel(null, row);
            jTable1.setModel(tabmodel);
            Class.forName("java.sql.Driver");
            String db="jdbc:mysql://localhost/rentalmobil";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(db,user,pass);
            String quer="SELECT * FROM mobil where id_mobil = '"+idpecarian+"'";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(quer);
                if(rs.next())
            {
                idm=rs.getString("id_mobil");
                platno=rs.getString("plat_no");
                namambl=rs.getString("nama_mobil");
                merkk=rs.getString("merk");
                jns=rs.getString("jenis");
                cc=rs.getString("cc");
                bb=rs.getString("bahan_bakar");
                hs=rs.getString("harga_sewa");
                sts=rs.getString("status");
                String data[]={idm,platno,namambl,merkk,jns,cc,bb,hs,sts};   
                tabmodel.addRow(data);
            }
                else
                {JOptionPane.showMessageDialog(null,"Data Mobil Tidak Dapat Ditemukans ");}   
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
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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