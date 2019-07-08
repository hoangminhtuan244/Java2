/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class SanPham {
    Scanner sc = new Scanner(System.in);
    int maSanPham;
    int maDanhMuc;
    String tenSanPham;
    float gia;
    Date ngayBan;
    Date ngayNhap;
    Date hanSuDung;
    String moTa;

    
     
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
     
    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public SanPham(int maSanPham, int maDanhMuc, String tenSanPham, float gia, Date ngayBan, Date ngayNhap, Date hanSuDung, String moTa) {
        this.maSanPham = maSanPham;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.ngayBan = ngayBan;
        this.ngayNhap = ngayNhap;
        this.hanSuDung = hanSuDung;
        this.moTa = moTa;
    }

    public SanPham() {
    }
    
    public void nhap() throws ParseException {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ma san pham: ");
        maSanPham = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ma danh muc: ");
        maDanhMuc = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ten san pham");
        tenSanPham = nhap.nextLine();
        System.out.println("Nhap gia ban: ");
        gia = Integer.parseInt(nhap.nextLine());
        
        System.out.println("Nhap ngay ban: ");
        ngayBan =new SimpleDateFormat("dd/mm/yyyy").parse(nhap.nextLine()); 
        System.out.println("Nhap ngay nhap: ");
        ngayNhap = new SimpleDateFormat("dd/mm/yyyy").parse(nhap.nextLine());
        System.out.println("Nhap han su dung: ");
        hanSuDung = new SimpleDateFormat("dd/m/yyyy").parse(nhap.nextLine());
        System.out.println("Nhap mo ta san pham: ");
        moTa = nhap.nextLine();
        
    }

    @Override
    public String toString() {
        return  ""+ "SanPham{ maSanPham=" + maSanPham + ", maDanhMuc=" + maDanhMuc + ", tenSanPham=" + tenSanPham +
                ", gia=" + gia + ", ngayBan=" + dateFormat.format(ngayBan) +
                ", ngayNhap=" +dateFormat.format(ngayNhap)+ ", hanSuDung=" + dateFormat.format(hanSuDung) + ", moTa=" + moTa + '}';
    }


    
}


