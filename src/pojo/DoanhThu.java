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
public class DoanhThu {
    protected int ngay;
    protected int thang;
    protected int nam;
    protected BigDecimal tongtien;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public BigDecimal getTongtien() {
        return tongtien;
    }

    public void setTongtien(BigDecimal tongtien) {
        this.tongtien = tongtien;
    }

    public DoanhThu() {
    }

    public DoanhThu(int ngay, int thang, int nam, BigDecimal tongtien) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.tongtien = tongtien;
    }
    
    
}
