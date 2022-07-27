/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.Ban;

import dataprovider.DataProvider;
/**
 *
 * @author PC
 */
public class BanDAO {
    public static ArrayList<Ban> layDSBan(){
        ArrayList<Ban> dsBan = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BAN";
            DataProvider provider  = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                Ban ban = new Ban();
                ban.setMaBan(re.getString("MaBan"));
                ban.setTenBan(re.getString("TenBan"));
                ban.setTrangThai(re.getString("TrangThai"));
                
                
                dsBan.add(ban);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsBan;
    }
    
    public static ArrayList<Ban> layDsBan(String maban){
        ArrayList<Ban> arr = new ArrayList<>();;
        String sql="";
        if(maban == "")
            sql = "SELECT * FROM BAN";
        else
            sql = "SELECT * FROM BAN WHERE MABAN = '" + maban + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                Ban ban = new Ban(re.getString("MABAN"), re.getString("TENBAN"), re.getString("TRANGTHAI"));
                arr.add(ban);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách bàn !");
        }
        return arr;
    }
    
    public static Ban layBan(String maban) {
        try {
            String sqlSelect = "SELECT * FROM BAN WHERE MABAN = '"+ maban +"'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            while(re.next()){
                return new Ban(maban, re.getString("TENBAN"), re.getString("TRANGTHAI"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
       public static boolean ktraTonTai_Ban(String tenban){
        try {
            String sqlSelect = "SELECT * FROM BAN WHERE TENBAN = '" + tenban + "'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            if(re.next())
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    //Kiểm tra BAN có tồn tại 
    public static boolean ktraTenBanCoTonTai(String ten){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM BAN WHERE TENBAN = '%s'",ten);
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return true;
            }
        }
        catch (Exception e){
            
        }
        return flag;
    }
    //ktra mã
    public static boolean ktraMaCoTonTai(String ma){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM BAN WHERE MABAN = '%s'",ma);
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return true;
            }
        }
        catch (Exception e){
            
        }
        return flag;
    }
    
    //Thêm BAN
     public static boolean themBan(Ban ban){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO BAN([MABAN],[TENBAN], [TRANGTHAI]) VALUES('',N'%s',N'%s')", ban.getTenBan(), ban.getTrangThai());
            DataProvider provider = new DataProvider();
            provider.open();
            int n = provider.executeUpdate(sql);
            if (n >=1)
                return true;
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
     
    public static boolean capNhatThongTin_Ban(Ban ban){
            String sql = String.format("UPDATE BAN SET TENBAN=N'%s', TRANGTHAI=N'%s'"
                    + "WHERE MABAN = '%s'", ban.getTenBan(), ban.getTrangThai(), ban.getMaBan());
            try {
                DataProvider provider = new DataProvider();
                provider.open();
                int kq = provider.executeUpdate(sql);
                if(kq >= 1)
                    return true;
                else
                    return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    //Xoa BAN
    public static boolean xoa1BAN(String maban){
        try {
            String sqlDelete = "DELETE BAN WHERE MABAN = '" + maban + "'";
            DataProvider provider = new DataProvider();
            provider.open();
            int n = provider.executeUpdate(sqlDelete);
            if(n >= 1){
                return true;
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean capNhapTrangThai(String maban){
        String sql = "UPDATE BAN SET TRANGTHAI = N'Đang phục vụ' WHERE MABAN = '" + maban +"'";
        try {
            DataProvider provider = new  DataProvider();
            provider.open();
            int temp = provider.executeUpdate(sql);
            if(temp > 0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
