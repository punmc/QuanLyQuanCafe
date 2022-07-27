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
public class KhachHang {
    protected String MaKH, TenKH, SDT, DiaChi, MaLoaiKH;
    protected int DiemTL;

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(String MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public int getDiemTL() {
        return DiemTL;
    }

    public void setDiemTL(int DiemTL) {
        this.DiemTL = DiemTL;
    }

    public KhachHang(String MaKH, String TenKH, String SDT, String DiaChi, String MaLoaiKH, int DiemTL) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.MaLoaiKH = MaLoaiKH;
        this.DiemTL = DiemTL;
    }

    public KhachHang() {
    }

    
    
    
    
}
