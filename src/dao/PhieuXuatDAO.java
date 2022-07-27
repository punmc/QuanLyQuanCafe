/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.PhieuXuat;
/**
 *
 * @author PC
 */
public class PhieuXuatDAO {
    public static ArrayList<PhieuXuat> layDSPhieuXuat(){
        ArrayList<PhieuXuat> lst = new ArrayList<>();
        String sql = "SELECT * FROM PhieuXuat";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new PhieuXuat(re.getString("MAPX"), re.getString("MANV"), re.getString("GHICHU"), re.getDate("NGAYXUAT")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public static boolean themMoiPhieuXuat(PhieuXuat px){
        String sql = "INSERT INTO PHIEUXUAT VALUES('', '" + px.getMaNV() +"', GETDATE(), N'" + px.getGhiChu() + "')";
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
    
    public static boolean capNhatPhieuXuat(PhieuXuat px){
        String sql = "UPDATE PHIEUXUAT SET GHICHU = N'" + px.getGhiChu() + "' WHERE MAPX = '" + px.getMaPX() + "'";
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
