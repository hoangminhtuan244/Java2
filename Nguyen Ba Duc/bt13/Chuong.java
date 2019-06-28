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
public class Chuong {
    int maChuong;
    ArrayList<Animal>animalList = new ArrayList<>();

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }
    
    public void themConVat(Animal animal) {
        animalList.add(animal);
    }
    
    public void xoaConVat(String name) {
        for(int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getName().equalsIgnoreCase(name));
                animalList.remove(name);
                break;
        }
    }
  public void input() {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhap ma chuong: ");
      maChuong = input.nextInt();
      
  }  
  
  public void display() {
      for(Animal animal : animalList ) {
          animal.display();
      }
  }
}
