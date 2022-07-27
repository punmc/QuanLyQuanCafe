/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author PC
 */
public class LoaiKhachHang {
    protected String MaLoaiKH, TenLoaiKH;
    protected float MucGiamGia;

    public String getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(String MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public String getTenLoaiKH() {
        return TenLoaiKH;
    }

    public void setTenLoaiKH(String TenLoaiKH) {
        this.TenLoaiKH = TenLoaiKH;
    }

    public float getMucGiamGia() {
        return MucGiamGia;
    }

    public void setMucGiamGia(float MucGiamGia) {
        this.MucGiamGia = MucGiamGia;
    }

    public LoaiKhachHang(String MaLoaiKH, String TenLoaiKH, float MucGiamGia) {
        this.MaLoaiKH = MaLoaiKH;
        this.TenLoaiKH = TenLoaiKH;
        this.MucGiamGia = MucGiamGia;
    }

    public LoaiKhachHang() {
    }
    
    
}
