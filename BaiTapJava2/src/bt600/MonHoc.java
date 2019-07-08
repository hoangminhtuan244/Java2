/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class MonHoc {
    //mã môn học, tên môn học
    String maMonHoc;
    String tenMonHoc;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + '}';
    }
    
    public boolean input(List<MonHoc> monHocList) {
        String maMonTempt;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma mon hoc : ");
        maMonTempt = scanner.nextLine();
        for (int i = 0; i < monHocList.size(); i++) {
            if (maMonTempt == this.maMonHoc) {
                return false;
            } else {
                this.maMonHoc = maMonTempt;
                System.out.println("Nhap ten mon hoc : ");
                this.tenMonHoc = scanner.nextLine();
            }
        }
        return true;
    }
    
    public void display() {
        System.out.println(toString());
    }
}
