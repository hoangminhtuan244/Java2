/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt200;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Category {
    String cateRoll;
    String cateName;

    public Category() {
    }

    public Category(String cateRoll, String cateName) {
        this.cateRoll = cateRoll;
        this.cateName = cateName;
    }

    public String getCateRoll() {
        return cateRoll;
    }

    public void setCateRoll(String cateRoll) {
        this.cateRoll = cateRoll;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    
    Scanner input = new Scanner(System.in);
    public void inputCategory(){
        System.out.println("Nhap ma danh muc: ");
        cateRoll = input.nextLine();
        System.out.println("Nhap ten danh muc: ");
        cateName = input.nextLine();
    }
    
    public void displayCategory(){
        System.out.printf("Ma danh muc: %s",cateRoll);
        System.out.printf("Ten danh muc: %s",cateName);
    }
}
