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
public class Chuong {
    int maChuong;
    ArrayList<Animal> AnimalList;
    void themConVat(Animal animal){
        AnimalList.add(animal);
    }

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public ArrayList<Animal> getAnimalList() {
        return AnimalList;
    }

    public void setAnimalList(ArrayList<Animal> AnimalList) {
        this.AnimalList = AnimalList;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    
    
    void xoaConVat(String ten){
        for (int i=0;i<AnimalList.size();i++){
            if(AnimalList.get(i).getTen().equalsIgnoreCase(ten)){
                AnimalList.remove(i);
                break;
            }
        }
    }
    
    Scanner input = new Scanner(System.in);
    void input(){
        System.out.println("Nhap ma chuong: ");
        maChuong = Integer.parseInt(input.nextLine());
    }
    
    public void display(){
        for (Animal animal : AnimalList) {
            animal.animalDisplay();
        }
    }
}
