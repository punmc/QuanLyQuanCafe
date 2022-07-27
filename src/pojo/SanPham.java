
package pojo;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class SanPham{
    protected String MaHang;
    protected String TenHang;
    protected String MaLoai;
    protected BigDecimal DonGia;

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getMaLoaiHang() {
        return MaLoai;
    }

    public void setMaLoaiHang(String MaLoai) {
        this.MaLoai = MaLoai;
    }


    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public SanPham(String MaHang, String TenHang, String MaLoai, BigDecimal DonGia) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.MaLoai = MaLoai;
        this.DonGia = DonGia;
    }

    public SanPham() {
    }
    
    

    

    
    
    
    
    
}
