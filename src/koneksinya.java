/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Ranggga
 */
public class koneksinya {
    
    public void getkoneksi()
    {
      Connection con;
         Statement stm;
        try {
     
          String url = "jdbc:mysql://localhost/rentalmobil";//alamat menghubungkan database
          String user="root";//username diisi root
          String pass="";//untuk password sebaiknya tidak diisi
          Class.forName("com.mysql.jdbc.Driver");//untuk java database conectivity
          con =DriverManager.getConnection(url,user,pass);//untuk menghubungkan ke database
          stm = con.createStatement();//untuk membuat statement atau mengeksekusi queri
           System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}
