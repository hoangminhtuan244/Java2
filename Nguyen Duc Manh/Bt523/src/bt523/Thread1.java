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
public class Thread1 extends Thread{
    ArrayList<Integer> list1;

    public Thread1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }

    public Thread1() {
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random random = new Random();
        int rd = random.nextInt(100);

        list1.add(rd);
        for (int i = 0; i < 10; i++) {
            synchronized(list1) {
                int rad = random.nextInt(100) + 1;
                System.out.println("rad: " + rad);
                
                try {
                    list1.notifyAll();
                    list1.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(list1) {
            list1.notifyAll();
        }
    }
    
}
