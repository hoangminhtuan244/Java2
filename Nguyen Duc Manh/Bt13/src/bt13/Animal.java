/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt13;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public abstract class Animal {
    String ten;
    int tuoi;
    String moTa;
    void xemThongTin(){
        
    }
    abstract void tiengKeu();

    public Animal() {
    }

    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String moTa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    Scanner input = new Scanner(System.in);
    void animalInput(){
        System.out.println("Nhap ten: ");
        ten = input.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("Nhap mo ta: ");
        moTa = input.nextLine();
    }
    
    void animalDisplay(){
        System.out.printf("Ten: %s\n",ten);
        System.out.printf("Tuoi: %d\n",tuoi);
        System.out.printf("Mo ta: %s\n",moTa);
    }
}
