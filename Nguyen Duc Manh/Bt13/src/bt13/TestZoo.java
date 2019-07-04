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
public class TestZoo {
    
    
    static void showMenu(){
        System.out.println("1. Thêm chuồng");
        System.out.println("2. Xóa chuồng");
        System.out.println("3. Thêm con vật");
        System.out.println("4. Xóa con vật");
        System.out.println("5. Xem tất cả các con vật");
        System.out.println("6. Thoát");
    }
    static Zoo zoo = new Zoo();
    static Scanner input = new Scanner(System.in);
    
    static void inputRoom(){
        System.out.println("Nhap so chuong can them: ");
        int x = Integer.parseInt(input.nextLine());
        for (int i=0;i<x;i++){
            Chuong chuong =  new Chuong();
            chuong.input();
            
            zoo.themChuong(chuong);
        }
    }
    
    static void deleteRoom(){
        System.out.println("Nhap ma chuong can xoa:  ");
        int roomNo = Integer.parseInt(input.nextLine());
        
        zoo.xoaChuong(roomNo);
    }
    
    

    public static void main(String[] args) {
        int n;
        
        do{
            showMenu();
            System.out.println("Nhap chuc nang: ");
            n = Integer.parseInt(input.nextLine());
            switch(n){
                case 1:
                    inputRoom();
                    break;
                case 2:
                    deleteRoom();
                    break;
                case 3:
                    zoo.addAnimal();
                    break;
                case 4:
                    zoo.deleteAnimal();
                    break;
                case 5:
                    zoo.showInfor();
                    break;
                case 6:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Nhap lai chuc nang");
            }
        }while(n!=0);
        
         
    }
    
}
