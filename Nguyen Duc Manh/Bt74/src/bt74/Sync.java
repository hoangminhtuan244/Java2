/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt74;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Sync {
    static int x = 0;
    static Thread t1 = null;
    static Thread t2 = null;
    static Object obj = new Object();
    
    public static void main(String[] args) {
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Bt74.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Bt74.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        t1.start();
        t2.start();
        
        System.out.println("");
    }
}
