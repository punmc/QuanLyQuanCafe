/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import pojo.ChiTietPhieuNhap;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class ChiTietPhieuNhapDAO {
    public static ArrayList<ChiTietPhieuNhap> layDSChiTietPN(String maPN){
        ArrayList<ChiTietPhieuNhap> lst = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETPN WHERE MAPN = '" + maPN + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new ChiTietPhieuNhap(re.getString("MAPN"), re.getString("MANL"), re.getString("TENNL"), re.getInt("SOLUONG"), re.getBigDecimal("GIANHAP"), re.getBigDecimal("THANHTIEN")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public static boolean themMoiCTPN(ChiTietPhieuNhap pn){
        String sql = "INSERT INTO CHITIETPN VALUES('"+ pn.getMaPN() +"', '"+ pn.getMaNL() +"', N'" + pn.getTenNL()+ "', "+ pn.getSoLuong()+ ", "+ pn.getGiaNhap()+",0)";
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
    
    public static boolean capNhatCTPN(ChiTietPhieuNhap pn){
        String sql = "UPDATE CHITIETPN SET SOLUONG = "+ pn.getSoLuong() +", GIANHAP = "+ pn.getGiaNhap() +" WHERE MAPN = '" + pn.getMaPN()+"' AND MANL = '" + pn.getMaNL() +"'";
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
    
    public static boolean xoa1CTPN(ChiTietPhieuNhap ct){
        String sql = "DELETE FROM CHITIETPN WHERE MAPN = '" + ct.getMaPN() + "' AND MANL = '" + ct.getMaNL() + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            int temp = provider.executeUpdate(sql);
            if (temp > 0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
