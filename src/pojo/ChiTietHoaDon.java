/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class ChiTietHoaDon {
    protected String MaHD, MaHang;
    protected int SoLuong;
    protected BigDecimal DonGia, ThanhTien; //ThanhTien = DonGia * SoLuong

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public ChiTietHoaDon(String MaHD, String MaHang, int SoLuong, BigDecimal DonGia, BigDecimal ThanhTien) {
        this.MaHD = MaHD;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }

    
    public ChiTietHoaDon(String MaHD, String MaHang, int SoLuong, BigDecimal DonGia) {
        this.MaHD = MaHD;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
    
    
    
}
