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
 * @author mac
 */
public class Zoo {
    
    ArrayList<Chuong> roomList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    void themChuong (Chuong chuong) {
        roomList.add(chuong);
    }
    void xoaChuong(int maChuong) {
        for (int i=0;i<roomList.size();i++){
            if(roomList.get(i).getMaChuong() == maChuong){
                roomList.remove(i);
                break;
            }
        }
    }
    
    public Chuong getRoom(int maChuong){
        for (int i=0;i<roomList.size();i++){
            if(roomList.get(i).getMaChuong() == maChuong){
                return roomList.get(i);
            }
        }
        return null;
    } 
    
    public void deleteAnimal(){
        System.out.println("Nhap ten con vat can xoa: ");
        String name = input.nextLine();
        for (Chuong chuong : roomList) {
            chuong.xoaConVat(name);
        }
    }
    
    public void showInfor(){
        for (int i = 0; i < roomList.size(); i++) {
            roomList.get(i).display();
        }
    }
    
    public void addAnimal(){
        System.out.println("Chon chuong can them con vat: ");
        for (int i=0; i<roomList.size();i++){
            System.out.println(roomList.get(i).getMaChuong()+ " : ");
        }
        int roomNo = Integer.parseInt(input.nextLine());
        
        System.out.println("Chon con vat can them: ");
        System.out.println("1. Ho");
        System.out.println("2. Cho");
        System.out.println("3. Meo");
        System.out.println("Chon: ");
        int choose = Integer.parseInt(input.nextLine());
        Animal animal;
        switch(choose){
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
        
        animal.animalInput();
        Chuong chuong = getRoom(roomNo);
        if(chuong!=null){
            chuong.themConVat(animal);
        }
    }
}
