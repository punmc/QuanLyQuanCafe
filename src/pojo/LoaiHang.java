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
public class LoaiHang {
    protected String maLoai;
    protected String tenLoaiHang;
    protected String moTa;

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    public LoaiHang(String maLoai, String tenLoaiHang) {
        this.maLoai = maLoai;
        this.tenLoaiHang = tenLoaiHang;
    }

    public LoaiHang(String maLoai, String tenLoaiHang, String moTa) {
        this.maLoai = maLoai;
        this.tenLoaiHang = tenLoaiHang;
        this.moTa = moTa;
    }

    public LoaiHang() {
    }

    
    
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
