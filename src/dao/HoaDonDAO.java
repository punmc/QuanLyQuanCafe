/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.DataProvider;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.DoanhThu;
import pojo.HoaDon;

/**
 *
 * @author PC
 */
public class HoaDonDAO {
    public static HoaDon layHoaDon(String maBan){
        
        String sql = "SELECT * FROM HOADON WHERE MABAN = '" + maBan + "' AND TRANGTHAI = 0";
        
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy hóa đơn !");
        }
        return null;
    }
    
    public static int themMoiHoaDon(HoaDon hd){ // Thêm mới hóa đơn chưa thanh toán (TRANGTHAI = 0)
        int temp = 0;
        
        String sqlInsert = "INSERT INTO HOADON VALUES('',N'',0,0, N'','" + hd.getMaKH() + "','" + hd.getMaNV() + "', '" + hd.getMaBan() + "',0)";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            temp = provider.executeUpdate(sqlInsert);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi thêm hóa đơn mới !");
        }
        return temp;
    }
    
    public static int capNhatTrangThai(String mahd){
        String sql = "UPDATE HOADON SET TRANGTHAI = 1, NGAYXUAT = GETDATE() WHERE MAHD = '" + mahd + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            int kq = provider.executeUpdate(sql);
            if ( kq > 0)
                return kq;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static ArrayList<HoaDon> layDsHoaDon(){
        String sql = "SELECT * FROM HOADON";
        ArrayList<HoaDon> ds = new ArrayList<>();
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                ds.add(new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
    
    public static HoaDon timKiemHoaDon_theoMaHD(String mahd){
        String sql = "SELECT * FROM HOADON WHERE MAHD = '" + mahd +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<HoaDon> timKiemDsHoaDon_theoMaKH(String makh) {
        String sql = "SELECT * FROM HOADON WHERE MAKH = '" + makh +"'";
        ArrayList<HoaDon> ds = new ArrayList<>();
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                ds.add(new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
    
    public static ArrayList<HoaDon> timKiemDsHoaDon_theoMaNV(String manv) {
        String sql = "SELECT * FROM HOADON WHERE MANV = '" + manv +"'";
        ArrayList<HoaDon> ds = new ArrayList<>();
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                ds.add(new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
    
    public static ArrayList<HoaDon> timKiemDsHoaDon_theoNgayThangNam(String ymd) {
        String sql = "select * from HOADON where Convert(date, NGAYXUAT) = '" + ymd +"'";
        ArrayList<HoaDon> ds = new ArrayList<>();
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                ds.add(new HoaDon(re.getString("MAHD"), re.getString("MAKH"), re.getString("MANV"), re.getString("MABAN"), re.getDate("NGAYXUAT"), re.getBigDecimal("TONGTIEN"), re.getFloat("MUCGIAMGIA"), re.getInt("TRANGTHAI")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
    
    public static ArrayList<DoanhThu> doanhThu_theoNgayThangNam(String ngay) {
        ArrayList<DoanhThu> lst = new ArrayList<>();
        String sql = "select * from dbo.doanhthu_ngay("+ ngay +")";
        
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                 lst.add(new DoanhThu(re.getInt("NGAY"), re.getInt("THANG"), re.getInt("NAM"), re.getBigDecimal("DOANHTHU")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    
    public static ArrayList<DoanhThu> doanhThu_theoThangNam(String thang) {
        ArrayList<DoanhThu> lst = new ArrayList<>();
        String sql = "select * from dbo.doanhthu_thang("+ thang +")";
        
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                 lst.add(new DoanhThu(0, re.getInt("THANG"), re.getInt("NAM"), re.getBigDecimal("DOANHTHU")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    
    public static ArrayList<DoanhThu> doanhThu_theoNam(String nam) {
        ArrayList<DoanhThu> lst = new ArrayList<>();
        String sql = "select * from dbo.doanhthu_nam("+ nam +")";
        
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                 lst.add(new DoanhThu(0, 0, re.getInt("NAM"), re.getBigDecimal("DOANHTHU")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    
    public static boolean XoaHD(String mahd){
        String sql = "DELETE FROM HOADON WHERE MAHD = '" + mahd +"'";
        try {
            DataProvider provider =new DataProvider();
            provider.open();
            int x = provider.executeUpdate(sql);
            if(x > 0){
                return true;
            }
      
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
             
}
