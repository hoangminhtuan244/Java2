/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Zoo {
    ArrayList<Chuong> chuongList = new ArrayList<>();
    
    public void themChuong(Chuong chuong) {
        chuongList.add(chuong);
    }
    public Chuong getChuong(int maChuong) {
        for(int i = 0; i < chuongList.size(); i++) {
            if(chuongList.get(i).getMaChuong() == maChuong) {
                return chuongList.get(i);
            }
        }
            return null;
    }
    public void xoaChuong(int maChuong) {
        for(int i = 0; i < chuongList.size(); i++) {
            if(chuongList.get(i).getMaChuong() == maChuong) {
                chuongList.remove(i);
                break;
            }
        }
    }
    public void themConVat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuong can them dong vat: ");
        for(int i = 0; i < chuongList.size(); i++) {
            System.out.println(chuongList.get(i).getMaChuong() + " :");
            
        }
        int maChuong = Integer.parseInt(input.nextLine());
        
        System.out.println("Chon con vat can them");
        System.out.println("1. Tiger");
        System.out.println("2. Dog");
        System.out.println("3. Cat");
        System.out.println("Choose: ");
        int choose = Integer.parseInt(input.nextLine());
        
        Animal animal;
        
        switch(choose) {
            case 1:
                animal = new Tiger();
                break;
            case 2:
                animal = new Dog();
                break;
            default: 
                animal = new Cat();
                break;
        }
        animal.input();
        Chuong chuong = getChuong(maChuong);
        if(chuong != null) {
            chuong.themConVat(animal);
        }
    }
    
    public void xoaConVat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten dong vat can xoa: ");
        String name = input.nextLine();
        chuongList.forEach((chuong) -> {
            chuong.xoaConVat(name);
        });
    }
    
    public void xemThongTin() {
        for(int i = 0; i < chuongList.size(); i++) {
            chuongList.get(i).display();
        }
    }
}
