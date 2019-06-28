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
public class Thread2 extends Thread{
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(sharedData) {
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int r = sharedData.getRad() * sharedData.getRad();
                System.out.println(r);
            }
        }
        
        synchronized(sharedData) {
            sharedData.notifyAll();
        }
    }
}
