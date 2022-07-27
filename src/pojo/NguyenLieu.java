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
public class NguyenLieu {
    protected String maNL;
    protected String tenNL;
    protected String DVT;
    protected int soLuong;

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

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public NguyenLieu() {
    }

    public NguyenLieu(String maNL, String tenNL, String DVT, int soLuong) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.DVT = DVT;
        this.soLuong = soLuong;
    }
    
    
}
