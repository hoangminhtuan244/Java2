/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class SinhVien implements Serializable{
    //tên, ngày sinh, địa chỉ, mã sinh viên
    String ten;
    String ngaySinh;
    String diaChi;
    String maSv;

    public SinhVien() {
    }

    public SinhVien(String ten, String ngaySinh, String diaChi, String maSv) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSv = maSv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", maSv=" + maSv + '}';
    }
    
    public boolean input(List<SinhVien> stdList) {
        String maSvTempt;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma so sinh vien : ");
        maSvTempt = scanner.nextLine();
        for (int i = 0; i < stdList.size(); i++) {
            if (maSvTempt == stdList.get(i).getMaSv()) {
                return false;
            } else {
                this.maSv = maSvTempt;
                System.out.println("Nhap ten sinh vien : ");
                this.ten = scanner.nextLine();
                System.out.println("Nhap ngay sinh sinh vien : ");
                this.ngaySinh = scanner.nextLine();
                System.out.println("Nhap dia chi sinh vien : ");
                this.diaChi = scanner.nextLine();
            }
        }
        return true;
    }
    
    public void display() {
        System.out.println(toString());
    }
}
