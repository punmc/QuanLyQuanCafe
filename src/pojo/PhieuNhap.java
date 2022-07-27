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
public class PhieuNhap {
    protected String mapn;
    protected String mancc;
    protected String manv;
    protected String ghichu;
    protected BigDecimal tiennhap;
    protected Date ngaynhap;

    public String getMaPN() {
        return mapn;
    }

    public void setMaPN(String mapn) {
        this.mapn = mapn;
    }

    public String getMaNCC() {
        return mancc;
    }

    public void setMaNCC(String mancc) {
        this.mancc = mancc;
    }

    public String getMaNV() {
        return manv;
    }

    public void setMaNV(String manv) {
        this.manv = manv;
    }

    public String getGhiChu() {
        return ghichu;
    }

    public void setGhiChu(String ghichu) {
        this.ghichu = ghichu;
    }

    public BigDecimal getTienNhap() {
        return tiennhap;
    }

    public void setTienNhap(BigDecimal tiennhap) {
        this.tiennhap = tiennhap;
    }

    public Date getNgayNhap() {
        return ngaynhap;
    }

    public void setNgayNhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public PhieuNhap() {
    }

    public PhieuNhap(String mapn, String mancc, String manv, String ghichu, BigDecimal tiennhap, Date ngaynhap) {
        this.mapn = mapn;
        this.mancc = mancc;
        this.manv = manv;
        this.ghichu = ghichu;
        this.tiennhap = tiennhap;
        this.ngaynhap = ngaynhap;
    }


    public PhieuNhap(String mancc, String manv, String ghichu) {
        this.mancc = mancc;
        this.manv = manv;
        this.ghichu = ghichu;
    }

    
    
}
