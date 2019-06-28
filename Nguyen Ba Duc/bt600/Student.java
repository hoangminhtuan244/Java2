/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Student implements Serializable {
    int rollNo;
    String name;
    String dateOfBirth;
    String address;

    public Student(int rollNo, String name, String dateOfDate, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.dateOfBirth = dateOfDate;
        this.address = address;
    }

    public Student() {
        super();
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        rollNo = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ten sinh vien: ");
        name = nhap.nextLine();
        System.out.println("Nhap ngay sinh: ");
        dateOfBirth = nhap.nextLine();
        System.out.println("Nhap dia chi: ");
        address = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address + '}';
    }
    
}
