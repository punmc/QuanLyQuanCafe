/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.KhachHang;
import pojo.LoaiKhachHang;

/**
 *
 * @author PC
 */
public class KhachHangDAO {
    public static KhachHang layKhachHang_theoSDT(String sdt){
        String sql = "SELECT * FROM KHACHHANG WHERE SDT = '" + sdt + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                return new KhachHang(re.getString("MAKH"), re.getString("TENKH"), re.getString("SDT"), re.getString("DIACHI"), re.getString("MALKH"),re.getInt("DIEMTL"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy khách hàng theo SDT !");
        }
        return null;        
    }
    

    public static LoaiKhachHang layLoaiKH(String maLoaiKH) {
        String sql = "SELECT * FROM LOAIKH WHERE MALKH = '" + maLoaiKH + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next())
                return new LoaiKhachHang(maLoaiKH, re.getString("TENLKH"), re.getFloat("TILEGIAMGIA"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy loại khách hàng !");
        }
        return null;
    }
    
    public static boolean ktraSDT_KhachHang(String sdt){
        try {
            String sqlSelect = "SELECT * FROM KHACHHANG WHERE SDT = '" + sdt + "'";
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
    
    public static ArrayList<KhachHang> layDSKhachHang(){
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhachHang";
            DataProvider provider  = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(re.getString("MaKH"));
                kh.setTenKH(re.getString("TenKH"));
                kh.setSDT(re.getString("SDT"));
                kh.setDiaChi(re.getString("DiaChi"));
                kh.setMaLoaiKH(re.getString("MaLKH"));
                kh.setDiemTL(re.getInt("DiemTL"));
                
                
                dsKH.add(kh);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsKH;
    }
    
    public static boolean ktraKHCoTonTai(String makh){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM KHACHHANG WHERE MAKH = '%s'",makh);
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
    //Thêm KH
     public static boolean themKhachHang(KhachHang kh){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO KhachHang([MAKH], [TENKH], [SDT], [DIACHI], [MALKH], [DIEMTL]) VALUES('%s',N'%s',N'%s',N'%s','%s',%d)",kh.getMaKH(), kh.getTenKH(), kh.getSDT(), kh.getDiaChi(), kh.getMaLoaiKH(), kh.getDiemTL());
            DataProvider provider = new DataProvider();
            provider.open();
            int n = provider.executeUpdate(sql);
            if(n >= 1)
                return true;
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
     
     //cập nhật Thông tin
    public static boolean capNhatThongTin_KhachHang(KhachHang kh){
        String sql = String.format("UPDATE KHACHHANG SET TENKH=N'%s', SDT=N'%s', DIACHI = N'%s', MALKH= '%s', DIEMTL= %d"
                + "WHERE MAKH = '%s'", kh.getTenKH(), kh.getSDT(), kh.getDiaChi(), kh.getMaLoaiKH(), kh.getDiemTL(), kh.getMaKH());
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
    //Xóa 1 Khách Hàng
    public static boolean xoa1Khachhang(String makh){
        try {
            String sqlDelete = "DELETE KHACHHANG WHERE MaKH = '" + makh + "'";
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
