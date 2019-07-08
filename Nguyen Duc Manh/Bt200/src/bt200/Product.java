/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt200;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Product {
    String name;
    String sellDate;
    String expireDate;
    Scanner input = new Scanner(System.in);
    public void input(){
            System.out.println("Nhap ten");
            name = input.nextLine();
            System.out.println("Ngay nhap");
            sellDate = input.nextLine();
            System.out.println("Ngay het han");
            expireDate = input.nextLine();
            
        
    }
    
    public void display(){
        System.out.printf("Ten: %s",name);
        System.out.printf("Ngay nhap: %s",sellDate);
        System.out.printf("Ngay het han: %s",expireDate);
    }
    
    public Product() {
    }

    public Product(String name, String sellDate, String expireDate) {
        this.name = name;
        this.sellDate = sellDate;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    
    
}
