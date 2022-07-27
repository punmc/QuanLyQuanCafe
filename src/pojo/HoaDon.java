
package pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author PC
 */
public class HoaDon {
    protected String MaHD,MaKH,	MaNV, MaBan;
    protected Date NgayXuat;
    protected BigDecimal TongThanhTien;// TongThanhTien = Sum(ThanhTien của ChiTietHoaDon) - MucGiamGia*Sum(ThanhTien của ChiTietHoaDon)
    protected float MucGiamGia; 
    protected int TrangThai;

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public BigDecimal getTongThanhTien() {
        return TongThanhTien;
    }

    public void setTongThanhTien(BigDecimal TongThanhTien) {
        this.TongThanhTien = TongThanhTien;
    }

    public float getMucGiamGia() {
        return MucGiamGia;
    }

    public void setMucGiamGia(float MucGiamGia) {
        this.MucGiamGia = MucGiamGia;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public HoaDon(String MaHD, String MaKH, String MaNV, String MaBan, Date NgayXuat, BigDecimal TongThanhTien, float MucGiamGia, int TrangThai) {
        this.MaHD = MaHD;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.MaBan = MaBan;
        this.NgayXuat = NgayXuat;
        this.TongThanhTien = TongThanhTien;
        this.MucGiamGia = MucGiamGia;
        this.TrangThai = TrangThai;
    }

    public HoaDon(String MaKH, String MaNV, String MaBan, int TrangThai) {
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.MaBan = MaBan;
        this.TrangThai = TrangThai;
    }

    public HoaDon() {
    }
    
    
	
    
}
