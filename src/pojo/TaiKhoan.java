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
public class TaiKhoan {
    protected String TenDN;
    protected String MatKhau;
    protected String MaNV;
    protected int PhanQuyen; //1 là Quản lý, 2 là Nhân viên

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(int PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }

    public TaiKhoan(String TenDN, String MatKhau, String MaNV, int PhanQuyen) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
        this.MaNV = MaNV;
        this.PhanQuyen = PhanQuyen;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(String TenDN, String MatKhau) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
    }
    
    
}
