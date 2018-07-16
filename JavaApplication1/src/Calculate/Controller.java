/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;
import java.util.HashMap;
/**
 *
 * @author Randy Beckford
 */
public class Controller {
        public static HashMap<String, doMath> key = new HashMap <String, doMath>();
	
	public void Controller(){
		
	}
	
	public static void handleOperator(String operator, Integer input1, Integer input2){
		key.put("+", new Addition());
		key.put("-", new Subtraction());
		key.put("/", new Division());
		key.put("*", new Multiplication());
		
		doMath handler = key.get(operator);
		handler.execute(input1, input2);
	}
}