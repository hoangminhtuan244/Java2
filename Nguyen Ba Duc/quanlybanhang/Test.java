/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP ENVY
 */
public class Test {
   static Date date = new Date();
   static int choose;
    public static void main(String[] args) throws ParseException {
        SanPham sp = new SanPham();
        sp.nhap();
        System.out.println(sp.toString());
        HanSuDung(sp.hanSuDung);
        SapHetHan(sp.hanSuDung);
    }
    
     static void HanSuDung(Date comparingDate) {
        
        if(date.compareTo(comparingDate) > 0) {
            System.out.println("het han su dung");
        } else {
            System.out.println("con han su dung");
        }
        
    }
     static void SapHetHan(Date comparingDate) {
         if(date.compareTo(comparingDate) > 0) {
             if(date.compareTo(comparingDate) > -7) {
                 System.out.println("Sap het han");
             }
         }
     }
     
     static void TimKiem() {
         
     }
     
     static void showMenu() {
         System.out.println("1. Nhap thong tin danh muc");
         System.out.println("2. Nhap thong tin san pham");
         System.out.println("3. In danh sach");
         System.out.println("4. In danh sach ton kho");
         System.out.println("5. In ra danh sach qua han su dung");
         System.out.println("6. In ra danh sach qua han su dung");
         System.out.println("7. Tim kiem");
         System.out.println("8. Luu vao file");
         System.out.println("9. Doc du lieu tu file va luu ra chuong trinh");
         System.out.println("Choose: ");
         
         switch(choose) {
             case 1:
                 
                 break;
             case 2:
                 
                 break;
             case 3: 
                 
                 break;
             case 4:
                 
                 break;
             case 5:
                 
                 break;
             case 6: 
                 
                 break;
             case 7:
                 
                 break;
                 
             case 8:
                 
                 break;
             case 9 :
                 
                 break;
             default :
                 System.out.println("Nhap sai");
         }
     }
}
