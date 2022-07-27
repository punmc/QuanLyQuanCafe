/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class PhieuXuat {
    protected String maPX;
    protected String maNV;
    protected String ghiChu;
    protected Date ngayXuat;

    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public PhieuXuat() {
    }

    public PhieuXuat(String maPX, String maNV, String ghiChu, Date ngayXuat) {
        this.maPX = maPX;
        this.maNV = maNV;
        this.ghiChu = ghiChu;
        this.ngayXuat = ngayXuat;
    }

    public PhieuXuat(String maNV, String ghiChu) {
        this.maNV = maNV;
        this.ghiChu = ghiChu;
    }
    
    
}
