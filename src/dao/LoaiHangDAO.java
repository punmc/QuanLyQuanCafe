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
import pojo.LoaiHang;

import dataprovider.DataProvider;

/**
 *
 * @author PC
 */
public class LoaiHangDAO {
    public static ArrayList<LoaiHang> layDsLoaiHang(){
        ArrayList<LoaiHang> arr = new ArrayList<>();
        String sql = "SELECT * FROM LOAIHANG";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                arr.add(new LoaiHang(re.getString("MALH"), re.getString("TENLH"), re.getString("MOTA")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách loại hàng !");
        }
        return arr;
    }
    
    public static LoaiHang layLoaiHang(String tenlh){
        
        String sql = "SELECT * FROM LOAIHANG WHERE TENLH = N'" + tenlh + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                return new LoaiHang(re.getString("MALH"), re.getString("TENLH"), re.getString("MOTA"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách loại hàng !");
        }
        return null;
    }
    
    
    
    
     //Kiểm tra LH có tồn tại 
    public static boolean ktraLHCoTonTai(String malh){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM LOAIHANG WHERE MALH = '%s'",malh);
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    //Thêm LH
     public static boolean themLoaiHang(LoaiHang lh){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO LoaiHang VALUES('',N'%s',N'%s')", lh.getTenLoaiHang(), lh.getMoTa());
            DataProvider provider = new DataProvider();
            provider.open();
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
     
     
     //ktra tênLoai
     public static boolean ktraLoaiHang_TrungTen(String tenloaihang){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM LOAIHANG WHERE TENLH = N'%s'",tenloaihang);
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
     
     //Cập nhật Loại Hàng
     public static boolean capNhatThongTin_LoaiHang(LoaiHang lh){
        String sql = String.format("UPDATE LOAIHANG SET TENLH=N'%s', MOTA=N'%s' WHERE MALH = '%s'", lh.getTenLoaiHang(), lh.getMoTa(),lh.getMaLoai());
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
      //Xóa 1 Loại Hàng 
    public static boolean xoa1LoaiHang(String maloaihang){
        try {
            String sqlDelete = "DELETE LOAIHANG WHERE MALH = '" + maloaihang + "'";
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
    
    
}
