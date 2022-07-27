/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.PhieuNhap;

/**
 *
 * @author PC
 */
public class PhieuNhapDAO {
    public static ArrayList<PhieuNhap> layDSPhieuNhap(){
        ArrayList<PhieuNhap> lst = new ArrayList<>();
        String sql = "SELECT * FROM PhieuNhap";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new PhieuNhap(re.getString("MAPN"), re.getString("MANCC"), re.getString("MANV"), re.getString("GHICHU"),re.getBigDecimal("TIENNHAP"), re.getDate("NGAYNHAP")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public static boolean themMoiPhieuNhap(PhieuNhap pn){
        String sql = "INSERT INTO PHIEUNHAP VALUES('', '', N'" + pn.getGhiChu() + "', '"+ pn.getMaNCC() + "', '"+ pn.getMaNV() +"',0)";
        try{
            DataProvider provider = new DataProvider();
            provider.open();
            int kq = provider.executeUpdate(sql);
            if(kq > 0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean capNhatPhieuNhap(PhieuNhap pn){
        String sql = "UPDATE PHIEUNHAP SET GHICHU = N'" + pn.getGhiChu() + "', MANCC = '" + pn.getMaNCC() + "' WHERE MAPN = '" + pn.getMaPN()+"'";
        try {
            DataProvider provider = new DataProvider();
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
