/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.Menu;
import pojo.NhanVien;
import pojo.TaiKhoan;

import dataprovider.DataProvider;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class NhanVienDAO {
    
    public static NhanVien layNhanVien(String manv) {
        try {
            String sqlSelect = "SELECT * FROM NHANVIEN WHERE MANV = '"+ manv +"'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            while(re.next()){
                return new NhanVien(manv, re.getString("TENNV"), re.getString("NGAYSINH"), re.getString("SDT"), re.getString("CHUCVU"), re.getString("DIACHI"), re.getString("PHAI"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String layMaNV(TaiKhoan tk) {
        try {
            String sqlSelect = "SELECT MANV FROM NHANVIEN WHERE MANV = '"+ tk.getMaNV() +"'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            while(re.next()){
                return re.getString("MANV");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    //Kiểm tra NV có tồn tại 
    public static boolean ktraNVCoTonTai(String manv){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM NHANVIEN WHERE MANV = '%s'",manv);
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
    
    public static ArrayList<NhanVien> layDSNhanVien(){
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhanVien";
            DataProvider provider  = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(re.getString("MaNV"));
                nv.setTenNV(re.getString("TenNV"));
                nv.setNgaySinh(re.getString("NgaySinh"));
                nv.setSDT(re.getString("SDT"));
                nv.setChucVu(re.getString("ChucVu"));
                nv.setDiaChi(re.getString("DiaChi"));
                nv.setGioiTinh(re.getString("Phai"));
                
                dsNV.add(nv);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNV;
    }
    
    //Thêm NV
     public static boolean themNhanVien(NhanVien nv, TaiKhoan tk){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO NhanVien([MANV],[TENNV], [NGAYSINH], [SDT], [CHUCVU], [DIACHI], [PHAI], [TENDN], [MATKHAU]) VALUES('',N'%s',N'%s',N'%s',N'%s',N'%s',N'%s', N'%s', N'%s')", nv.getTenNV(), nv.getNgaySinh(), nv.getSDT(), nv.getChucVu(), nv.getDiaChi(), nv.getGioiTinh(),tk.getTenDN(), tk.getMatKhau());
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
     
    public static boolean capNhatThongTin_NhanVien(NhanVien nv){
        String sql = String.format("UPDATE NHANVIEN SET TENNV=N'%s', NGAYSINH=N'%s', SDT = N'%s', CHUCVU=N'%s', DIACHI=N'%s', PHAI=N'%s'"
                + "WHERE MANV = '%s'", nv.getTenNV(), nv.getNgaySinh(), nv.getSDT(), nv.getChucVu(), nv.getDiaChi(), nv.getGioiTinh(), nv.getMaNV());
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
    
   public static boolean ktraNV_TrungTenDN(String tendn){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM NHANVIEN WHERE TENDN = '%s'",tendn);
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
   //Xoa NV
    public static boolean xoa1NhanVien(String manv){
        try {
            String sqlDelete = "DELETE NhanVien WHERE MaNV = '" + manv + "'";
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
