/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.DataProvider;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.SanPham;

/**
 *
 * @author PC
 */
public class SanPhamDAO {
    public static ArrayList<SanPham> layDsSanPham(String maloai){
        ArrayList<SanPham> arr = new ArrayList<>();
        String sql = "";
        if(maloai == "")
            sql = "SELECT * FROM HANG";
        else
            sql = "SELECT * FROM HANG WHERE MALH = '" + maloai + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                arr.add(new SanPham(re.getString("MAHANG"), re.getString("TENHANG"), re.getString("MALH"), re.getBigDecimal("DONGIA")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách hàng !");
        }
        return arr;
    }
    
    public static BigDecimal layGiaSP(String mahang){
        String sql = "SELECT DONGIA FROM HANG WHERE MAHANG = '" + mahang +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                return re.getBigDecimal("DONGIA");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BigDecimal.ZERO;
    }
    
    public static SanPham lay1SanPham(String mahang){
        String sql = "SELECT * FROM HANG WHERE MAHANG = '" + mahang +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                return new SanPham(re.getString("MAHANG"), re.getString("TENHANG"), re.getString("MALH"), re.getBigDecimal("DONGIA"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static SanPham lay1SanPham_theoTenHang(String tenhang){
        String sql = "SELECT * FROM HANG WHERE TENHANG = N'" + tenhang +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                return new SanPham(re.getString("MAHANG"), re.getString("TENHANG"), re.getString("MALH"), re.getBigDecimal("DONGIA"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<SanPham> layDSSanPham(){
        ArrayList<SanPham> dsSP = new ArrayList<>();
        try {
            String sql = "SELECT * FROM HANG";
            DataProvider provider  = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                SanPham sp = new SanPham();
                sp.setMaHang(re.getString("MaHang"));
                sp.setTenHang(re.getString("TenHang"));
                sp.setMaLoaiHang(re.getString("MaLH"));
                sp.setDonGia(BigDecimal.valueOf(Double.parseDouble(re.getObject("DonGia").toString())));
                
                dsSP.add(sp);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }
    
    
    //Kiểm tra SP có tồn tại 
    public static boolean ktraSPCoTonTai(String masp){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM HANG WHERE MAHANG = '%s'",masp);
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
    //Thêm SP
     public static boolean themSanPham(SanPham sp){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO HANG VALUES('',N'%s','%s','%s')", sp.getTenHang(), sp.getMaLoaiHang(), sp.getDonGia().toString());
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
     
     //Kiem tra SP
     public static boolean ktraSanPham_TrungTen(String tensp){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM HANG WHERE TENHANG = N'%s'",tensp);
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
     
      //Cập nhật  Hàng
     public static boolean capNhatThongTin_Hang(SanPham sp){
        String sql = String.format("UPDATE HANG SET TENHANG=N'%s', MALH = '%s', DONGIA = %s WHERE MAHANG = '%s'", sp.getTenHang(), sp.getMaLoaiHang(), sp.getDonGia().toString(), sp.getMaHang());
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
     //Xóa 1 Sản Phẩm
    public static boolean xoa1SanPham(String masp){
        try {
            String sqlDelete = "DELETE HANG WHERE MAHANG = '" + masp + "'";
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
