/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadrunnables;

/**
 *
 * @author Randy ther Master
 */
class Threads extends Thread {
	
	public void run(){
		for(int i=1; i <=10; i++){
			System.out.println(Thread.currentThread().getId() + " This is a Thread");
		}
	}
}

public class ThreadsPractice1 {
	
	public static void main(String[] args) {
		Threads thread_1 = new Threads();
		thread_1.start();

		Threads thread_2 = new Threads();
		thread_2.start();
	}
}
