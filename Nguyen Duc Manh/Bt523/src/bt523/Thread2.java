/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt523;

import apple.laf.JRSUIConstants;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Thread2 extends Thread{
    ArrayList<Character> list2;

    public Thread2(ArrayList<Character> list2) {
        this.list2 = list2;
    }
    
    public Thread2() {
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random random = new Random();

        
        for (int i = 0; i < 10; i++) {
            synchronized(list2) {
                char c = (char) (random.nextInt(26) + 'a');
                list2.add(c);
                System.out.println("rad : " + c);
                
                try {
                    list2.notifyAll();
                    list2.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                for (Character character : list2) {
                    System.out.println(c);
                }
            }
        }
        synchronized(list2) {
            list2.notifyAll();
        }
        
    }
    
}
