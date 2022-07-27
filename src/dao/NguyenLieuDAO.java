/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import pojo.NguyenLieu;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class NguyenLieuDAO {
    public static ArrayList<NguyenLieu> layDSNguyenLieu(){
        ArrayList<NguyenLieu> lst = new ArrayList<>();
        String sql = "SELECT * FROM NGUYENLIEU";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new NguyenLieu(re.getString("MANL"), re.getString("TENNL"), re.getString("DVT"), re.getInt("SOLUONG")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public static String layTenNguyenLieu(String manl){
        String sql = "SELECT TENNL FROM NGUYENLIEU WHERE MANL = '" + manl + "'";
        try {
            DataProvider provider =new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while(re.next()){
                return re.getString("TENNL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static NguyenLieu timKiemNguyenLieu(String tennl) {
        try {
            String sqlSelect = "SELECT * FROM NGUYENLIEU WHERE TENNL = N'"+ tennl +"'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            while(re.next()){
                return new NguyenLieu(re.getString("MANL"), tennl, re.getString("DVT"), re.getInt("SOLUONG"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<NguyenLieu> layDsNguyenLieu(String manl){
        ArrayList<NguyenLieu> arr = new ArrayList<>();;
        String sql="";
        if(manl == "")
            sql = "SELECT * FROM NGUYENLIEU";
        else
            sql = "SELECT * FROM NGUYENLIEU WHERE MANL = '" + manl + "'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            
            while(re.next()){
                NguyenLieu nl = new NguyenLieu(re.getString("MANLN"), re.getString("TENNL"), re.getString("DVT"), re.getInt("SOLUONG"));
                arr.add(nl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi lấy danh sách bàn !");
        }
        return arr;
    }
    
    public static NguyenLieu layNguyenLieu(String manl) {
        try {
            String sqlSelect = "SELECT * FROM NGUYENLIEU WHERE MANL = '"+ manl +"'";
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sqlSelect);
            while(re.next()){
                return new NguyenLieu(manl, re.getString("TENNL"), re.getString("DVT"), re.getInt("SOLUONG"));
            }
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean ktraTonTai_NguyenLieu(String tennl){
        try {
            String sqlSelect = "SELECT * FROM NGUYENLIEU WHERE TENNL = '" + tennl + "'";
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
    
    //Kiểm tra NguyenLIeu có tồn tại 
    public static boolean ktraNguyenLieuCoTonTai(String manl){
        boolean flag = false;
        
        try{
            String sql = String.format("SELECT * FROM NGUYENLIEU WHERE MANL = '%s'",manl);
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
    
    
    //Thêm NguyenLieu
     public static boolean themNguyenLieu(NguyenLieu nl){
        boolean kq = false;
        try {
            String sql = String.format("INSERT INTO NGUYENLIEU([MANL],[TENNL], [DVT], [SOLUONG]) VALUES('',N'%s',N'%s',N'%s')", nl.getTenNL(), nl.getDVT(), nl.getSoLuong());
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
     
    public static boolean capNhatThongTin_NguyenLieu(NguyenLieu nl){
            String sql = String.format("UPDATE NGUYENLIEU SET TENNL=N'%s', DVT=N'%s', SOLUONG=N'%s'"
                    + "WHERE MANL = '%s'", nl.getTenNL(), nl.getDVT(), nl.getTenNL(), nl.getMaNL());
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
    //Xoa NguyenLieu
    public static boolean xoa1NguyenLieu(String manl){
        try {
            String sqlDelete = "DELETE NGUYENLIEU WHERE MANL = '" + manl + "'";
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
