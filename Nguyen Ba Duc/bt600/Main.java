/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt600;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP ENVY
 */
public class Main {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int tuyChon;
        Subject s2 = new Subject();
        Mark s3 = new Mark();

        List<Student> studentList = new ArrayList<>();
        do {

            showInfo();
            tuyChon = tc.nextInt();
            switch (tuyChon) {
                case 1:
                    Student s1 = new Student();
                    s1.nhap();
                    studentList.add(s1);
                    break;
                case 2:
                    s2.nhap();
                    break;
                case 3:
                    s3.nhap();
                    break;
                case 4:

                    break;

                case 5:
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
                        fos = new FileOutputStream("students.txt");
                        oos = new ObjectOutputStream(fos);

                        oos.writeObject(studentList);
                    } catch (IOException e) {

                    } finally {
                        try {
                            if (fos != null) {
                                fos.close();
                            }
                            if (oos != null) {
                                oos.close();
                            }
                        } catch (Exception e) {

                        }
                    }

                    break;
                case 6:

                    break;
                case 7:

                    break;
            }

        } while (tuyChon
                != 7);

    }

    @Override
    public String toString() {
        return "Main{" + '}';
    }

    static void showInfo() {
        System.out.println("1. Them sinh vien.");
        System.out.println("2. Them mon hoc.");
        System.out.println("3. Them diem thi.");
        System.out.println("4. Hien thi thong tin sinh vien.");
        System.out.println("5. Luu thong tin file txt.");
        System.out.println("6. Luu thong tin file obj.");
        System.out.println("7. Lay thong tin tu file obj.");
        System.out.println("Lua chon: ");

    }

}
