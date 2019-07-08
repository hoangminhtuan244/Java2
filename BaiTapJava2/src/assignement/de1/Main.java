/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.de1;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        
        do {          
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch(choose){
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
                default:
                    System.out.println("Nhap 1,2,3 hoac 4...!!!");
            }
        } while (choose != 8);
    }
    
    static void showMenu() {
        System.out.println("1. Nhập thông tin danh mục");
        System.out.println("2. Nhập thông tin sản phẩm ");
        System.out.println("3. In ra danh sách các sản phẩm đã bán");
        System.out.println("4. In ra danh sách sản phầm còn tồn kho");
        System.out.println("5. In ra danh sách sản phẩm đã quá hạn sử dụng (lấy giờ hiện tại của hệ thống để kiểm tra với HSD của sản phẩm)");
        System.out.println("6. In ra danh sách sản phẩm sắp hết hạn sử dụng (lấy giờ hiện tại của hệ thống và kiểm tra vs HSD, nếu giờ hiện tại <= HSD và giờ hiện tại >= HSD - 7 ngày thì in  kết quả ra)");
        System.out.println("7. Tìm kiếm >>> nhập tên sản phẩm -> in ra tất cả các sản phẩm có tên nhập vào và số sản phẩm.");
        System.out.println("8. Thoat!");
        System.out.println("Choose : ");
    }
}
