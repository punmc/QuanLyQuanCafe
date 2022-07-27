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
public class GoiMon {
    protected String MaHang, TenHang;
    protected int SoLuong;
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

    public GoiMon(String MaHang, String TenHang, int SoLuong, BigDecimal DonGia) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
            
            
}
