/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author PC
 */
public class ChiTietPhieuNhap {
    protected String maPN;
    protected String maNL;
    protected String tenNL;
    protected int soLuong;
    protected BigDecimal giaNhap;
    protected BigDecimal thanhTien;

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }

    
    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPN, String maNL) {
        this.maPN = maPN;
        this.maNL = maNL;
    }

    public ChiTietPhieuNhap(String maPN, String maNL, int soLuong, BigDecimal giaNhap) {
        this.maPN = maPN;
        this.maNL = maNL;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }
    
    public ChiTietPhieuNhap(String maPN, String maNL, String tenNL, int soLuong, BigDecimal giaNhap, BigDecimal thanhTien) {
        this.maPN = maPN;
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.thanhTien = thanhTien;
        
    }
    
    
}
