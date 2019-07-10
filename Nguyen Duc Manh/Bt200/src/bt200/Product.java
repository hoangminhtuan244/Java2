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
public class Product {
    String productRoll;
    String productCategory;
    String productName;
    int price;
    String inputDate;
    String sellDate;
    String expireDate;
    String des;
    
    Scanner input = new Scanner(System.in);
    public void inputProduct(){
        System.out.println("Nhap ma san pham: ");
        productRoll = input.nextLine();
        System.out.println("Nhap ma danh muc: ");
        productCategory = input.nextLine();
        System.out.println("Nhap ten san pham: ");
        productName = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        price = Integer.parseInt(input.nextLine());
        System.out.println("Ngay nhap: ");
        inputDate = input.nextLine();
        System.out.println("Ngay ban:  ");
        sellDate = input.nextLine();
        System.out.println("Ngay het han: ");
        expireDate = input.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        des = input.nextLine();
    }
    
    public void displayProduct(){
        System.out.printf("Ma san pham: %s\n",productRoll);
        System.out.printf("Ma danh muc: %s\n",productCategory);
        System.out.printf("Ten san pham: %s\n",productName);
        System.out.printf("Gia san pham: %d\n",price);
        System.out.printf("Ngay nhap san pham: %s\n",inputDate);
        System.out.printf("Ngay ban san pham: %s\n",sellDate);
        System.out.printf("Ngay het han: %s\n",expireDate);
        System.out.printf("Mo ta san pham: %s\n",des);
    }
            

    public Product() {
    }

    public Product(String productRoll, String productCategory, String productName, int price, String inputDate, String sellDate, String expireDate, String des) {
        this.productRoll = productRoll;
        this.productCategory = productCategory;
        this.productName = productName;
        this.price = price;
        this.inputDate = inputDate;
        this.sellDate = sellDate;
        this.expireDate = expireDate;
        this.des = des;
    }

    public String getProductRoll() {
        return productRoll;
    }

    public void setProductRoll(String productRoll) {
        this.productRoll = productRoll;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}