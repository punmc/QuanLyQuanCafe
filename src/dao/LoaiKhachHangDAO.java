/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.DataProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huỳnh Mỹ Linh
 */
public class LoaiKhachHangDAO {
    public static float layTyLeGiamGia(String malkh){
        String sql = "SELECT TILEGIAMGIA FROM LOAIKH WHERE MALKH = '" + malkh +"'";
        try {
            DataProvider provider = new DataProvider();
            provider.open();
            ResultSet re = provider.executeQuery(sql);
            while (re.next()) {
                return re.getFloat("TILEGIAMGIA");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
