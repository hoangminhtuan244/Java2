/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.de1;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class SanPham {
    //mã sản phẩm, mã danh mục, tên sp, giá, ngày nhập, ngày bán, hạn sử dụng, mô tả sản phẩm.
    String maSp;
    String maDm;
    String tenSp;
    long giaSp;
    String ngayNhap;
    String ngayBan;
    String hanSuDung;
    String moTa;

    public SanPham() {
    }

    public SanPham(String maSp, String maDm, String tenSp, long giaSp, String ngayNhap, String ngayBan, String hanSuDung, String moTa) {
        this.maSp = maSp;
        this.maDm = maDm;
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.ngayNhap = ngayNhap;
        this.ngayBan = ngayBan;
        this.hanSuDung = hanSuDung;
        this.moTa = moTa;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getMaDm() {
        return maDm;
    }

    public void setMaDm(String maDm) {
        this.maDm = maDm;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public long getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(long giaSp) {
        this.giaSp = giaSp;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", maDm=" + maDm + ", tenSp=" + tenSp + ", giaSp=" + giaSp + ", ngayNhap=" + ngayNhap + ", ngayBan=" + ngayBan + ", hanSuDung=" + hanSuDung + ", moTa=" + moTa + '}';
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma san pham : ");
        this.maSp = scanner.nextLine();
        System.out.println("Nhap ma danh muc : ");
        this.maDm = scanner.nextLine();
        System.out.println("Nhap ten san pham : ");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhap gia san pham : ");
        this.giaSp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ngay nhap san pham : ");
        this.ngayNhap = scanner.nextLine();
        System.out.println("Nhap ngay ban san pham : ");
        this.ngayBan = scanner.nextLine();
        System.out.println("Nhap han su dung san pham : ");
        this.hanSuDung = scanner.nextLine();
        System.out.println("Nhap mo ta san pham : ");
        this.moTa = scanner.nextLine();
    }
    
    public void display() {
        System.out.println(toString());
    }
}
