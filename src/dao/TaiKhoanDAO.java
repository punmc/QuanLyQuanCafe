/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pojo.TaiKhoan;
import dataprovider.DataProvider;

/**
 *
 * @author PC
 */
public class TaiKhoanDAO {
    public static TaiKhoan layTaiKhoan(String name, String pass){
        TaiKhoan tk = null;
        String sql;
            sql = "SELECT * FROM NHANVIEN Where TENDN = '"+name+"' AND MATKHAU = '"+pass+"'";
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
               tk  = new TaiKhoan(rs.getString("TENDN"), rs.getString("MATKHAU"), rs.getString("MANV"), rs.getInt("PHANQUYEN"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return tk;
    }
    
    public static TaiKhoan layTaiKhoan_TheoMaNV(String manv){
        TaiKhoan tk = null;
        String sql;
            sql = "SELECT * FROM NHANVIEN Where MANV = '"+manv+"'";
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
               tk  = new TaiKhoan(rs.getString("TENDN"), rs.getString("MATKHAU"), rs.getString("MANV"), rs.getInt("PHANQUYEN"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return tk;
    }
    
    public static boolean ktraLogin(TaiKhoan tk){
        try {
            String sqlSelect = "SELECT * FROM NHANVIEN WHERE TENDN = '" + tk.getTenDN()+ "'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            String mk = "";
            while(re.next()){
                mk = re.getString("MATKHAU");
            }
            boolean x = mk.equals(tk.getMatKhau());
            if(x==true)
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
