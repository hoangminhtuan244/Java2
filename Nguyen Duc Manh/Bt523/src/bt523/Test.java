/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt523;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Test {
    
    static Thread t1 = null;
    static Thread t2 = null;
    
    
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Random random = new Random();
                    int rd = random.nextInt(100);
                    list1.add(rd);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                for (int j=0;j<list1.size();j++) {
                    System.out.println(list1.get(j));
                }
            }
        });
        
        t2 = new Thread(new Runnable() {
            ArrayList<Character> list2 = new ArrayList<>();
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Random random = new Random();
                    char c = (char) (random.nextInt(26) + 'a');
                    list2.add(c);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                

                for (int i = 0; i < list2.size(); i++) {
                    System.out.println(list2.get(i));
                }
            }
        });
        
        t1.start();
        t2.start();
        
        
    }
    
}
