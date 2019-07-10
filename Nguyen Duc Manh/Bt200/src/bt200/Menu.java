/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt200;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
 * @author Administrator
 */
public class Menu {
    static void menu(){
        System.out.println("1. Nhập thông tin danh mục");
        System.out.println("2. Nhập thông tin sản phẩm ");
        System.out.println("3. In ra danh sách các sản phẩm đã bán");
        System.out.println("4. In ra danh sách sản phầm còn tồn kho");
        System.out.println("5. In ra danh sách sản phẩm đã quá hạn sử dụng");
        System.out.println("6. In ra danh sách sản phẩm sắp hết hạn sử dụng ");
        System.out.println("7. Tìm kiếm");
        System.out.println("8. Lưu vào file");
        System.out.println("9. Đọc dữ liệu từ file và lưu ra chương trình.");
    }
    
    static Date date = new Date();
     
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        Product product = new Product();
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(product.sellDate);
        Category category = new Category();
        List<Product> listProduct = new ArrayList<>();
        List<Category> listcategory = new ArrayList<>();
        List<Product> listexpire = new ArrayList<>();
        List<Product> listSell = new ArrayList<>();
        int n;
        do{
            menu();
            System.out.println("Nhap chuc nang: ");
            n = Integer.parseInt(input.nextLine());
            switch(n){
                case 1:
                    System.out.println("Nhap so danh muc can them: ");
                    int y = Integer.parseInt(input.nextLine());
                    for(int z = 0;z<y;z++){
                        category.inputCategory();
                        listcategory.add(category);
                    }
                    break;
                case 2:
                    System.out.println("Nhap so san pham can them: ");
                    int x = Integer.parseInt(input.nextLine());
                    for(int i=0; i<x;i++){
                        product.inputProduct();
                        listProduct.add(product);
                    }
                    break;
                case 3:
                    for(int i=0;i<listProduct.size();i++){
                        if("".equals(product.sellDate)){
                            product.displayProduct();
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<listProduct.size();i++){
                        if(!"".equals(product.sellDate)){
                            product.displayProduct();
                            listSell.add(product);
                        }
                    }
                    
                    break;
                case 5:
                    for(int i=0;i<listProduct.size();i++){
                        if (date.compareTo(date1) > 0) {
                            product.displayProduct();
                            listexpire.add(product);
                        }
                    }
                    break;
                case 6:
                    Calendar c1 = Calendar.getInstance();
                    Calendar c2 = Calendar.getInstance();
                    
                    c1.setTime(date);
                    c2.setTime(date1);
                    
                    long noDay;
                    noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
                    for(int i=0;i<listProduct.size();i++){
                        if(noDay>7){
                            product.displayProduct();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Nhap san pham can tim: ");
                    String search = input.nextLine();
                    for(int i=0;i<listProduct.size();i++){
                        if(search == product.productName){
                            product.displayProduct();
                        }
                    }
                    break;
                case 8:
                    //category.dat
                    FileOutputStream fos1 = null;
                    ObjectOutputStream oos1 = null;
                    try {
                        fos1 = new FileOutputStream("category.dat");

                        oos1 = new ObjectOutputStream(fos1);

                        oos1.writeObject(listcategory);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        if (fos1 != null) {
                            try {
                                fos1.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        if (oos1 != null) {
                            try {
                                oos1.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    //sell.dat
                    FileOutputStream fos2 = null;
                    ObjectOutputStream oos2 = null;
                    try {
                        fos2 = new FileOutputStream("sell.dat");

                        oos2 = new ObjectOutputStream(fos2);

                        oos2.writeObject(listSell);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        if (fos2 != null) {
                            try {
                                fos2.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        if (oos2 != null) {
                            try {
                                oos2.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    //expire.dat
                    FileOutputStream fos3 = null;
                    ObjectOutputStream oos3 = null;
                    try {
                        fos3 = new FileOutputStream("sell.dat");

                        oos3 = new ObjectOutputStream(fos3);

                        oos3.writeObject(listexpire);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        if (fos3 != null) {
                            try {
                                fos3.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        if (oos3 != null) {
                            try {
                                oos3.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    //product.dat
                    FileOutputStream fos4 = null;
                    ObjectOutputStream oos4 = null;
                    try {
                        fos4 = new FileOutputStream("product.dat");

                        oos4 = new ObjectOutputStream(fos4);

                        oos4.writeObject(listexpire);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        if (fos4 != null) {
                            try {
                                fos4.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        if (oos4 != null) {
                            try {
                                oos4.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    System.out.println("Da luu san pham");
                    break;
                case 9:
                    int a;
                    do{
                        System.out.println("1. Category");
                        System.out.println("2. Sell");
                        System.out.println("3. Expire");
                        System.out.println("4. Product");
                        System.out.println("Chon file can doc");
                        a = Integer.parseInt(input.nextLine());
                        switch(a){
                            case 1:
                                FileInputStream fis = null;
                                ObjectInputStream ois = null;
                                try {
                                    fis = new FileInputStream("category.dat");

                                    ois = new ObjectInputStream(fis);

                                    listcategory = (List<Category>) ois.readObject();
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } finally {
                                    if (ois != null) {
                                        try {
                                            ois.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }

                                    if (fis != null) {
                                        try {
                                            fis.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }
                                for(int i=0;i<listcategory.size();i++){
                                    System.out.println(listcategory);
                                }
                                break;
                            case 2:
                                FileInputStream fis1 = null;
                                ObjectInputStream ois1 = null;
                                try {
                                    fis1 = new FileInputStream("sell.dat");
                                    ois1 = new ObjectInputStream(fis1);

                                    listSell = (List<Product>) ois1.readObject();
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } finally {
                                    if (ois1 != null) {
                                        try {
                                            ois1.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }

                                    if (fis1 != null) {
                                        try {
                                            fis1.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }

                                for (int i=0;i<listSell.size();i++) {
                                    System.out.println(listSell);
                                }
                                break;
                            case 3:
                                FileInputStream fis2 = null;
                                ObjectInputStream ois2 = null;
                                try {
                                    fis2 = new FileInputStream("sell.dat");
                                    ois2 = new ObjectInputStream(fis2);

                                    listSell = (List<Product>) ois2.readObject();
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } finally {
                                    if (ois2 != null) {
                                        try {
                                            ois2.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }

                                    if (fis2 != null) {
                                        try {
                                            fis2.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }

                                for (int i=0;i<listexpire.size();i++) {
                                    System.out.println(listexpire);
                                }
                                break;
                            case 4:
                                FileInputStream fis3 = null;
                                ObjectInputStream ois3 = null;
                                try {
                                    fis3 = new FileInputStream("product.dat");
                                    ois3 = new ObjectInputStream(fis3);

                                    listProduct = (List<Product>) ois3.readObject();
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                } finally {
                                    if (ois3 != null) {
                                        try {
                                            ois3.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }

                                    if (fis3 != null) {
                                        try {
                                            fis3.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }

                                for (int i=0;i<listProduct.size();i++) {
                                    System.out.println(listProduct);
                                }
                                break;
                            default:
                                System.out.println("Nhap lai file can xem");
                                break;
                        }
                        
                    }while(a!=0);
                    break;
                default:
                    System.out.println("Nhap lai chuc nang");
                    break;
            }
        }while(n!=0);
    }
}
