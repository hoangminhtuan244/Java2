/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt17;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hlamg
 */
public class Main {
    public static void main(String[] args) {
        int choose;
        HashMap<String, Student> studentList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        do {          
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch(choose){
                case 1: 
                    int n;
                    System.out.println("So luong sinh vien muon nhap la : ");
                    n = Integer.parseInt(scanner.nextLine());
                    //RollNo, Name, Sex, Age, Email, Address
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        System.out.printf("Nhap RollNo sinh vien thu %d: ", i+1);
                        std.setRollNo(scanner.nextLine());
                        System.out.printf("Nhap Name sinh vien thu %d: ", i+1);
                        std.setName(scanner.nextLine());
                        System.out.printf("Nhap Sex sinh vien thu %d: ", i+1);
                        std.setSex(scanner.nextLine());
                        System.out.printf("Nhap Age sinh vien thu %d: ", i+1);
                        std.setAge(Integer.parseInt(scanner.nextLine()));
                        System.out.printf("Nhap Email sinh vien thu %d: ", i+1);
                        std.setEmail(scanner.nextLine());
                        System.out.printf("Nhap Address sinh vien thu %d: ", i+1);
                        std.setAddress(scanner.nextLine());
                        
                        studentList.put(std.getRollNo(), std);
                    }
                    break;
                case 2:
                    Set<String> keys = studentList.keySet();
                    keys.forEach((key) -> {
                        System.out.println(studentList.get(key));
                    });
                    break;
                case 3:
                    String rollNoTempt;
                    System.out.println("Nhap RollNo sinh vien can tim : ");
                    rollNoTempt = scanner.nextLine();
                    
                    if (studentList.containsKey(rollNoTempt)) {
                        System.out.println(studentList.get(rollNoTempt));
                    } else {
                        System.out.printf("Sinh vien co RollNo %s khong ton tai!", rollNoTempt);
                    }
                    break;
                case 4: 
                    System.out.println("Good Bye!!!");
                    break;
                default:
                    System.out.println("Nhap 1,2,3 hoac 4!!!");
            }
        } while (choose == 4);
    }
    
    public static void showMenu(){
        System.out.println("1. Nhập N sinh viên");
        System.out.println("2. In thông tin sv");
        System.out.println("3. Tìm kiếm sinh viên (Yêu cầu nhập RollNo và hiển thị thông tin sv đó)");
        System.out.println("4. Thoat!");
        System.out.println("Choose : ");
    }
}
