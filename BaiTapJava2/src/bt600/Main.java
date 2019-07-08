/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hlamg
 */
public class Main {

    public static void main(String[] args) {
        int choose;
        List<SinhVien> studentList = new ArrayList<>();
        List<MonHoc> monHocList = new ArrayList<>();
        List<DiemThi> diemList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    SinhVien std = new SinhVien();
                    if (std.input(studentList) == true) {
                        studentList.add(std);
                    } else {
                        System.out.println("Sinh vien da co trong danh sach, khong can nhap moi!");
                    }
                    break;
                case 2:
                    MonHoc monHoc = new MonHoc();
                    if (monHoc.input(monHocList) == true) {
                        monHocList.add(monHoc);
                    } else {
                        System.out.println("Mon hoc da co trong danh sach, khong can nhap moi!");
                    }
                    break;
                case 3:
                    DiemThi diem = new DiemThi();
                    if (diem.input(diemList) == true) {
                        diemList.add(diem);
                    } else {
                        System.out.println("Diem cua sinh vien da co  trong danh sach, khong can nhap moi!");
                    }
                    break;
                case 4:
                    diemList.forEach((diemThi) -> {
                        String tenStdTempt = "";
                        String tenMonTempt = "";

                        for (int i = 0; i < studentList.size(); i++) {
                            if (diemThi.getMaSv() == studentList.get(i).getMaSv()) {
                                tenStdTempt = studentList.get(i).getTen();
                            } else {
                                tenStdTempt = "Khong ton tai";
                            }
                        }

                        for (int i = 0; i < monHocList.size(); i++) {
                            if (diemThi.getMaMonHoc() == monHocList.get(i).getMaMonHoc()) {
                                tenMonTempt = monHocList.get(i).getTenMonHoc();
                            } else {
                                tenMonTempt = "Khong ton tai";
                            }
                        }

                        System.out.printf("MSSV: %s  Ten: %s  MonHoc: %s  DiemThi: %f /n", diemThi.getMaSv(), tenStdTempt, tenMonTempt, diemThi.getDiem());
                    });
                    break;
                case 5:
                    //Mã SV, tên sv, ngày sinh, địa chỉ, môn học, điêm thi
                    List<String> danhSach = new ArrayList<>();

                    diemList.forEach(new Consumer<DiemThi>() {
                        @Override
                        public void accept(DiemThi diemThi) {
                            String maSvTempt = "";
                            String tenStdTempt = "";
                            String ngaySinhTempt = "";
                            String diaChiTempt = "";
                            String tenMonTempt = "";
                            float diemTempt = diemThi.getDiem();

                            for (int i = 0; i < studentList.size(); i++) {
                                if (diemThi.getMaSv() == studentList.get(i).getMaSv()) {
                                    maSvTempt = studentList.get(i).getMaSv();
                                    tenStdTempt = studentList.get(i).getTen();
                                    ngaySinhTempt = studentList.get(i).getNgaySinh();
                                    diaChiTempt = studentList.get(i).getDiaChi();
                                }
                            }

                            for (int i = 0; i < monHocList.size(); i++) {
                                if (diemThi.getMaMonHoc() == monHocList.get(i).getMaMonHoc()) {
                                    tenMonTempt = monHocList.get(i).getTenMonHoc();
                                }
                            }

                            String tempt = "MSSV: " + maSvTempt + "  Ten: " + tenStdTempt + "  NgaySinh: " + ngaySinhTempt + "  DiaChi: " + diaChiTempt + "  MonHoc: " + tenMonTempt + "  DiemThi: " + diemTempt;
                            danhSach.add(tempt);
                            
                            FileWriter writer = null;
                            try {
                                writer = new FileWriter("danh_sach.txt");
                                
                                writer.write(tempt);
                            } catch (IOException e) {
                            } finally {
                                if (writer != null) {
                                    try {
                                        writer.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        }
                    });
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
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. thêm môn học");
        System.out.println("3. thêm điểm thi");
        System.out.println("4. Hiển thị thông tin theo định dạng (mã sv, tên, môn học, điểm thi)");
        System.out.println("5. Lưu thông tin vào 1 file text theo định dạng sau (yêu cầu mỗi thông tin sv là 1 dòng) (Mã SV, tên sv, ngày sinh, địa chỉ, môn học, điêm thi)");
        System.out.println("6. Lưu thông tin sinh viên vào file student.obj (Sử dụng ObjectOutputStream)");
        System.out.println("7. Lấy thông tin sinh viên từ file student.obj và hiển thị ra màn hình");
        System.out.println("8. Thoat!");
        System.out.println("Choose : ");
    }
}
