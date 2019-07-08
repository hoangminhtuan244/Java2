/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt200;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Menu {
    static Scanner input = new Scanner(System.in);
    
    static void menu(){
        
            System.out.println("1. San pham da ban");
            System.out.println("2. San pham chua ban");
            System.out.println("3. San pham da het han");
            System.out.println("4. San pham chua het han");
            System.out.println("5. Nhap san pham");
        
        
    }
    
    static Product product = new Product();
    static Date date1;
    static Date date = new Date();
    static void expire() throws ParseException{
        for(int i=0;i<list.size();i++){
            try {
                date1 = new SimpleDateFormat("dd-MM-yyyy").parse(product.getSellDate());
            } catch (ParseException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(date1.compareTo(date)<0){
                list.get(i).display();
            }
        }
    }
    
    static List<Product> list = new ArrayList<>();
    
    static void unExpire(){
        for(int i=0;i<list.size();i++){
            try {
                date1 = new SimpleDateFormat("dd-MM-yyyy").parse(product.getSellDate());
            } catch (ParseException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(date1.compareTo(date)>0){
                list.get(i).display();
            }
        }
        
    }
    
    public static void main(String[] args)  throws ParseException{
        int n;
        do{
            menu();
            System.out.println("Nhap chuc nang: ");
            n= Integer.parseInt(input.nextLine());
            switch(n){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    expire();
                    break;
                case 4:
                    unExpire();
                    break;
                case 5:
                    System.out.println("Nhap so san pham can them: ");
                    int x = Integer.parseInt(input.nextLine());
                    for (int i =0;i<x;i++){
                        product.input();
                        list.add(product);
                    }
                    break;
            }
        }while(n!=0);
    }

    
}
