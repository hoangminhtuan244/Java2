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
public class DiemThi {
    //mã sv, mã môn học, điểm
    String maSv;
    String maMonHoc;
    float diem;

    public DiemThi() {
    }

    public DiemThi(String maSv, String maMonHoc, float diem) {
        this.maSv = maSv;
        this.maMonHoc = maMonHoc;
        this.diem = diem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "DiemThi{" + "maSv=" + maSv + ", maMonHoc=" + maMonHoc + ", diem=" + diem + '}';
    }
    
    public void display() {
        System.out.println(toString());
    }
    
    public boolean input(List<DiemThi> diemList) {
        String maSvTempt;
        String maMonTempt;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma so sinh vien : ");
        maSvTempt = scanner.nextLine();
        System.out.println("Nhap ma mon hoc : ");
        maMonTempt = scanner.nextLine();
        for (int i = 0; i < diemList.size(); i++) {
            if (maSvTempt == this.maSv && maMonTempt == this.maMonHoc) {
                return false;
            } else {
                System.out.println("Nhap diem thi cua sinh vien : ");
                this.diem = Float.parseFloat(scanner.nextLine());
            }
        }
        return true;
    }
}
