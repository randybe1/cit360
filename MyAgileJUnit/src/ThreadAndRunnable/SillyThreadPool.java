/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadAndRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Randy Beckford
 */
public class SillyThreadPool {
    
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int threadCnt = 0; threadCnt < 3; threadCnt++){
                SillyRunnableExample aSillyRunnable = new SillyRunnableExample(); 
                anExecutor.execute((Runnable) aSillyRunnable);
		}
		try {
			Thread.sleep(5000);
			System.out.println("Done Sleeping");
			for(int threadCnt = 0; threadCnt < 3; threadCnt++){
				SillyRunnableExample aSillyRunnable = 
                new SillyRunnableExample();
				anExecutor.execute((Runnable) aSillyRunnable);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}