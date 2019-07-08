/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class DanhMucSanPham {
    int maDanhMuc;
    String tenDanhMuc;

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(int maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma danh muc: ");
        maDanhMuc = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ten danh muc: ");
        tenDanhMuc = nhap.nextLine();
    
    }

    @Override
    public String toString() {
        return "DanhMucSanPham{" + "maDanhMuc=" + maDanhMuc + ", tenDanhMuc=" + tenDanhMuc + '}';
    }
    
    
}
