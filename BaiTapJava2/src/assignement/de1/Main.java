/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.de1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hlamg
 */
public class Main {

    public static void main(String[] args) {
        int choose;
        List<DanhMucSanPham> danhMucList = new ArrayList<>();
        List<SanPham> spList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    DanhMucSanPham dmTempt = new DanhMucSanPham();
                    if (dmTempt.input(danhMucList) == 1) {
                        System.out.println("Them danh muc san pham thanh cong !!!");
                        danhMucList.add(dmTempt);
                    } else {
                        System.out.println("Danh muc san pham da ton tai !!!");
                    }
                    break;
                case 2:
                    SanPham spTempt = new SanPham();
                    if (spTempt.input(spList) == 1) {
                        System.out.println("Them san pham thanh cong !!!");
                        spList.add(spTempt);
                    } else {
                        System.out.println("San pham da ton tai !!!");
                    }
                    break;
                case 3:
                    System.out.println("Danh sach cac san pham da ban : ");
                    spList.forEach((sanPham) -> {
                        if ("0".equals(sanPham.getNgayBan()) == false) {
                            sanPham.display();
                        }
                    });
                    break;
                case 4:
                    System.out.println("Danh sach cac san pham ton kho : ");
                    spList.forEach((sanPham) -> {
                        if ("0".equals(sanPham.getNgayBan()) == true) {
                            sanPham.display();
                        }
                    });
                    break;
                case 5:
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date dNow = new Date();

                    System.out.println("Danh sach san pham da qua han su dung : ");
                    spList.forEach((sanPham) -> {
                        try {
                            Date date = sdf.parse(sanPham.getHanSuDung());
                            if (dNow.compareTo(date) > 0) {
                                sanPham.display();
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
                    break;
                case 6:
                    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

                    Calendar cal1 = Calendar.getInstance();
                    Calendar cal2 = Calendar.getInstance();

                    Date dNow1 = cal1.getTime();
                    cal2.add(Calendar.DAY_OF_MONTH, -7);
                    Date dNow2 = cal2.getTime();
                    
                    System.out.println("Danh sach san pham sap het han su dung : ");
                    spList.forEach((sanPham) -> {
                        try {
                            Date date = sdf2.parse(sanPham.getHanSuDung());
                            int compare1 = date.compareTo(dNow1);
                            int compare2 = date.compareTo(dNow2);
                            
                            if (compare1 <= 0 && compare2 >= 0) {
                                sanPham.display();
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    });
                    break;
                case 7:
                    System.out.println("Nhap vao ten san pham can tim : ");
                    String tenSpTempt = scanner.nextLine();
                    tenSpTempt = tenSpTempt.toLowerCase();
                    
                    System.out.println("Kết quả : ");
                    int count = 0;
                    for (int i = 0; i < spList.size(); i++) {
                        String tenSp = spList.get(i).getTenSp().toLowerCase();
                        if (tenSp.indexOf(tenSpTempt) != 1) {
                            spList.get(i).display();
                            count++;
                        }
                    }
                    System.out.printf("Số lượng : %d", count);
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    System.out.println("Good Bye !!!");
                    break;
                default:
                    System.out.println("Nhap 1,2,3 hoac 4...!!!");
            }
        } while (choose != 10);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin danh mục");
        System.out.println("2. Nhập thông tin sản phẩm ");
        System.out.println("3. In ra danh sách các sản phẩm đã bán");
        System.out.println("4. In ra danh sách sản phầm còn tồn kho");
        System.out.println("5. In ra danh sách sản phẩm đã quá hạn sử dụng (lấy giờ hiện tại của hệ thống để kiểm tra với HSD của sản phẩm)");
        System.out.println("6. In ra danh sách sản phẩm sắp hết hạn sử dụng (lấy giờ hiện tại của hệ thống và kiểm tra vs HSD, nếu giờ hiện tại <= HSD và giờ hiện tại >= HSD - 7 ngày thì in  kết quả ra)");
        System.out.println("7. Tìm kiếm >>> nhập tên sản phẩm -> in ra tất cả các sản phẩm có tên nhập vào và số sản phẩm.");
        System.out.println("8. Lưu vào file (danh mục sẽ được lưu vào file category.dat, sản phẩm đã bán vào sell.dat, hết hạn sử dụng vào file : expire.dat, sản phẩm còn lại vào product.dat)");
        System.out.println("9. Đọc dữ liệu từ file và lưu ra chương trình.");
        System.out.println("10. Thoat!");
        System.out.println("Choose : ");
    }
}
