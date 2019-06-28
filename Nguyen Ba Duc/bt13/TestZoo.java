/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt13;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class TestZoo {

    static Scanner input = new Scanner(System.in);
    static Zoo zoo = new Zoo();
    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            
            switch (choose) {
                case 1:
                    themChuong();
                    break;
                case 2:
                    xoaChuong();
                    break;
                case 3:
                    themConVat();
                    break;
                case 4:
                     zoo.xoaConVat();
                    break;
                case 5:
                    zoo.xemThongTin();
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Moi nhap lai");

            }
        } while(choose != 6);
    }

    static void themChuong() {
        System.out.println("Nhap so chuong can them: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            Chuong chuong = new Chuong();
            chuong.input();
            
            zoo.themChuong(chuong);
        }
    }
    
    static void xoaChuong() {
        System.out.println("Nhap ma chuong can xoa: ");
        int maChuong = Integer.parseInt(input.nextLine());
        zoo.xoaChuong(maChuong);
    }
    
    static void themConVat() {
        zoo.themConVat();
    }
    static void showMenu() {
        System.out.println("1. Them Chuong");
        System.out.println("2. Xoa chuong");
        System.out.println("3. Them con vat");
        System.out.println("4. Xoa con vat");
        System.out.println("5. Xem thong tin");
        System.out.println("6. Thoat");
        System.out.println("Choose: ");
    }
}
