/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Mark extends Student{
    int rollNo;
    int subjectNo;
    float mark;

    public Mark(int rollNo, int subjectNo, float mark) {
        super();
        this.rollNo = rollNo;
        this.subjectNo = subjectNo;
        this.mark = mark;
    }

    public Mark() {
    }
    

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        rollNo = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ma mon hoc: ");
        subjectNo = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap diem: ");
        mark = nhap.nextFloat();
    }

    @Override
    public String toString() {
        return "Mark{" + "rollNo=" + rollNo + ", subjectNo=" + subjectNo + ", mark=" + mark + '}';
    }
    
    
}
