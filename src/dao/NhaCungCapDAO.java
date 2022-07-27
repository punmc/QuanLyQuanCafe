/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import pojo.NhaCungCap;
import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class NhaCungCapDAO {
    public static ArrayList<NhaCungCap> layDSNhaCC(){
        ArrayList<NhaCungCap> lst = new ArrayList<>();
        String sql = "SELECT * FROM NHACC";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()){
                lst.add(new NhaCungCap(re.getString("MANCC"), re.getString("TENNCC"), re.getString("DIACHI"), re.getString("SDT")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
}
