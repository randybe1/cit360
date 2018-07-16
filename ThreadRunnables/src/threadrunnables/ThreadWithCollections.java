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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class ThreadWithCollections{
	public static void main (String [] args){
		TeamA a = new TeamA ();
		TeamB b = new TeamB ();
		
		try {
	         a.start();
	         b.wait();
	      }catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
	      }
		
		
		
   }
}
class TeamA extends Thread{
	public void run (){
		Scanner input = new Scanner(System.in);
		String quit = "";
		HashMap<String, Integer> TeamA = new HashMap<String, Integer>();
		List<String> TeamAList = new ArrayList<String>();
		do{
			System.out.println("Enter Players Last Name");
			String Lname = input.next();
			System.out.println("Enter Players First Name");
			String Fname = input.next();
			System.out.println("Enter Players Number");
			int jnumber = input.nextInt();
			
			
			TeamAList.add(Fname+ " " + Lname);
			TeamA.put(Fname + " " + Lname, jnumber);
			
			System.out.println("Would you like to enter another player?(YES or NO)");
			quit = input.next();

		} while(quit.equals("YES"));
		System.out.println("Team A");
		   System.out.println(TeamA);
		   System.out.println();
		   System.out.println("Team A Players");
		   System.out.println(TeamAList);
	}
}

class TeamB extends Thread{
	public void run (){
		Scanner input = new Scanner(System.in);
		String quit = "";
		HashMap<String, Integer> TeamB = new HashMap<String, Integer>();
		List<String> TeamBList = new ArrayList<String>();
		do{
			System.out.println("Enter Players Last Name");
			String Lname = input.next();
			System.out.println("Enter Players First Name");
			String Fname = input.next();
			System.out.println("Enter Players Number");
			int jnumber = input.nextInt();
			
			
			TeamBList.add(Fname+ " " + Lname);
			TeamB.put(Fname + " " + Lname, jnumber);
			
			System.out.println("Would you like to enter another player?(YES or NO)");
			quit = input.next();

		} while(quit.equals("YES"));
		System.out.println("Team B");
		   System.out.println(TeamB);
		   System.out.println();
		   System.out.println("Team B Players");
		   System.out.println(TeamBList);
	
	}
}