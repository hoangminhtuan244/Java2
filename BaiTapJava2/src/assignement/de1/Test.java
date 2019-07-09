/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.de1;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author hlamg
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar cal = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//        
//        String dateString = scanner.nextLine();
//        Date date = sdf.parse(dateString);
//        
//        Date dNow = cal.getTime();
//        cal2.add(Calendar.DAY_OF_MONTH, -7);
//        Date dNow2 = cal2.getTime();
//        
//        System.out.println(date);
//        System.out.println(dNow);
//        System.out.println(dNow2);
//        
//        
//        
//        System.out.println(date.compareTo(dNow));
        
//        String s1 = "AcasDDSADA";
//        s1 = s1.toLowerCase();
//        System.out.println(s1);
        // Constructing An ArrayList
        List<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
 
        // Printing listWithDuplicateElements
        System.out.println("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements);
 
        // Constructing Another ArrayList
        List<String> listWithoutDuplicateElements = new ArrayList<String>();
        for (String element : listWithDuplicateElements) {
            // Check if element not exist in list, perform add element to list
            if (!listWithoutDuplicateElements.contains(element)) {
                listWithoutDuplicateElements.add(element);
            }
        }
 
        // Printing listWithoutDuplicateElements
        System.out.println("\nArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);
        
        

//        Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sdf_yyyyMMdd = new SimpleDateFormat("yyyy/MM/dd");
//		SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");
//		//cal.set(year, month, day);
//		cal.set();
//		System.out.println(sdf_yyyyMMdd.format(cal.getTime()));//2008/01/31
//		System.out.println(sdf_ddMMyyyy.format(cal.getTime()));//31/01/2008
    }
}
