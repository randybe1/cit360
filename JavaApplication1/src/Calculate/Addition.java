/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

/**
 *
 * @author Randy Beckford
 */
public class Addition implements doMath{
    public void execute(Integer input1, Integer input2){
		Integer addition = input1 + input2;
		System.out.println(addition);
	}
	
	public int addition(int i, int j) {
		return i + j;
	}
}