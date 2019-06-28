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
public class Subject extends Student{
    int subjectNo;
    String subName;

    public Subject(int subjectNo, String subName) {
        super();
        this.subjectNo = subjectNo;
        this.subName = subName;
    }



    public Subject() {
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
    

    @Override
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma mon hoc: ");
        subjectNo = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ten mon hoc");
        subName = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectNo=" + subjectNo + ", subName=" + subName + '}';
    }
    
}
