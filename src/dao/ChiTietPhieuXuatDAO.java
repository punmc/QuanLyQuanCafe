/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import pojo.ChiTietPhieuXuat;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class ChiTietPhieuXuatDAO {
    public static ArrayList<ChiTietPhieuXuat> layDSChiTietPX(String maPX){
        ArrayList<ChiTietPhieuXuat> lst = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETPX WHERE MAPX = '" + maPX + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new ChiTietPhieuXuat(re.getString("MAPX"), re.getString("MANL"), re.getString("TENNL"), re.getInt("SOLUONG")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public static boolean themMoiCTPX(ChiTietPhieuXuat px){
        String sql = "INSERT INTO CHITIETPX VALUES('"+ px.getMaPX() +"', '"+ px.getMaNL() +"', N'" + px.getTenNL()+ "', "+ px.getSoLuong()+ ")";
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
    
    public static boolean capNhatCTPX(ChiTietPhieuXuat px){
        String sql = "UPDATE CHITIETPX SET SOLUONG = "+ px.getSoLuong() +" WHERE MAPX = '" + px.getMaPX()+"' AND MANL = '" + px.getMaNL() +"'";
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
    
    public static boolean xoa1CTPX(ChiTietPhieuXuat ct){
        String sql = "DELETE FROM CHITIETPX WHERE MAPX = '" + ct.getMaPX() + "' AND MANL = '" + ct.getMaNL() + "'";
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
