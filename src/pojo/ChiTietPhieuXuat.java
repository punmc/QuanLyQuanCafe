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
public class ChiTietPhieuXuat {
    protected String maPX;
    protected String maNL;
    protected String tenNL;
    protected int soLuong;

    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
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

    public ChiTietPhieuXuat() {
    }

    public ChiTietPhieuXuat(String maPX, String maNL, String tenNL, int soLuong) {
        this.maPX = maPX;
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.soLuong = soLuong;
    }

    public ChiTietPhieuXuat(String maPX, String maNL) {
        this.maPX = maPX;
        this.maNL = maNL;
    }
    
    
}
