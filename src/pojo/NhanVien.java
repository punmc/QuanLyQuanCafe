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
public class NhanVien {
    protected String MaNV;
    protected String TenNV;
    protected String NgaySinh;
    protected String SDT;
    protected String ChucVu;
    protected String DiaChi;
    protected String GioiTinh;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String NgaySinh, String SDT, String ChucVu, String DiaChi, String GioiTinh) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.ChucVu = ChucVu;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public NhanVien(String MaNV, String TenNV, String ChucVu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.ChucVu = ChucVu;
    }
    public NhanVien(String TenNV, String NgaySinh, String SDT, String ChucVu, String DiaChi, String GioiTinh) {
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.ChucVu = ChucVu;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
    
}
