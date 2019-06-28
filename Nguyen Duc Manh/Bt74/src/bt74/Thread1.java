/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt74;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Thread1 extends Thread{
   SharedData sharedData;

    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            synchronized(sharedData) {
                int rad = random.nextInt(20) + 1;
                sharedData.setRad(rad);
                System.out.println("so thu " +(i+1)+ " : " + rad);
                
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(sharedData) {
            sharedData.notifyAll();
        }
    }
}
