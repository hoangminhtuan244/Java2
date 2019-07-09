/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.de1;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class DanhMucSanPham implements Serializable{

    String maDm;
    String tenDm;

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(String maDm, String tenDm) {
        this.maDm = maDm;
        this.tenDm = tenDm;
    }

    public String getMaDm() {
        return maDm;
    }

    public void setMaDm(String maDm) {
        this.maDm = maDm;
    }

    public String getTenDm() {
        return tenDm;
    }

    public void setTenDm(String tenDm) {
        this.tenDm = tenDm;
    }

    @Override
    public String toString() {
        return "DanhMucSanPham{" + "maDm=" + maDm + ", tenDm=" + tenDm + '}';
    }

    public int input(List<DanhMucSanPham> dmList) {
        Scanner scanner = new Scanner(System.in);
        String maDmTempt;

        System.out.println("Nhap vao ma danh muc : ");
        maDmTempt = scanner.nextLine();
        System.out.println("Nhap vao ten danh muc : ");
        this.tenDm = scanner.nextLine();

        if (dmList.isEmpty()) {
            this.maDm = maDmTempt;
        } else {
            for (int i = 0; i < dmList.size(); i++) {
                if (maDmTempt.equals(dmList.get(i).getMaDm()) == true) {
                    return 0;
                } else {
                    this.maDm = maDmTempt;
                }
            }
        }
        return 1;
    }

    public void display() {
        System.out.println(toString());
    }
}
