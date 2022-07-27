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
import pojo.ChiTietHoaDon;
import pojo.GoiMon;

/**
 *
 * @author PC
 */
public class ChiTietHoaDonDAO {
    
    public static ArrayList<GoiMon> layDsGoiMon(String maHoaDon){
        ArrayList<GoiMon> arr = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETHD WHERE MAHD = '" + maHoaDon + "'";
        try {
            DataProvider provider1 = new DataProvider();
            provider1.open();
            ResultSet re = provider1.executeQuery(sql);
            
            while (re.next()){
                String sqlLayTenMon = "SELECT TENHANG FROM HANG WHERE MAHANG = '" + re.getString("MAHANG")+ "'";
                DataProvider provider2 = new DataProvider();
                provider2.open();
                ResultSet layTenMon = provider2.executeQuery(sqlLayTenMon);
                String tenMon = "";
                while(layTenMon.next()){
                    tenMon = layTenMon.getString("TENHANG");
                }
                GoiMon mon = new GoiMon(re.getString("MAHD"), tenMon, re.getInt("SOLUONG"), re.getBigDecimal("DONGIA"));

                arr.add(mon);         
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách gọi món !");
        }
        return arr;
    }
    
    public static int themMoiChiTietHD(ChiTietHoaDon ct){
        int temp = 0;
        String sql = "";
        if(ktraTonTai_CTHD(ct.getMaHD(), ct.getMaHang())){
            sql = "UPDATE CHITIETHD SET SOLUONG = SOLUONG +  "+(ct.getSoLuong() + "")
                        + "WHERE CHITIETHD.MAHD = '" + ct.getMaHD() + "' AND CHITIETHD.MAHANG = '"+ ct.getMaHang()+"'";
        }
        else{
            sql = "INSERT INTO CHITIETHD "
                    + "VALUES('" + ct.getMaHD() + "', '" + ct.getMaHang() + "', " + ct.getSoLuong() + "," + ct.getDonGia() +",0)";
        }
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            temp = provider.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm mới chi tiết hóa đơn !");
        }
        return temp;
    }
    
    public static boolean ktraTonTai_CTHD(String maHD, String maSP){
        boolean kq = false;
        
        String sql = "SELECT * FROM CHITIETHD WHERE MAHD = '" + maHD + "' AND MAHANG = '" + maSP +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            if(re.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return kq;
    }
    
    public static ArrayList<ChiTietHoaDon> layDsChiTietHD(String mahd){
        ArrayList<ChiTietHoaDon> lstct = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETHD WHERE MAHD = '" + mahd +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                lstct.add(new ChiTietHoaDon(re.getString("MAHD"), re.getString("MAHANG"), re.getInt("SOLUONG"), re.getBigDecimal("DONGIA")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstct;
    }
}
