/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemleveltesting;
import java.util.scanner;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author Randy Beckford
 */
public class shoppingCartView implements Serializable{
	public shoppingCartView() {
}

	public String newOrOldcart() {

 	   System.out.println("=========================\n"
				+ "To start new list type: new"
				+"\nOr to use an old list type: old");
	Scanner startingApp = new Scanner(System.in);
	String choiceMade = startingApp.nextLine();
		return choiceMade;
}

	public String namingCart(){
	   System.out.println("Name your list: ");
	   Scanner nameList = new Scanner(System.in);	
	   String nameListIs = nameList.nextLine();
		return nameListIs;
}	

	public String addingStuff(){
	   System.out.println("What items to add? ");
	   Scanner nameItem = new Scanner(System.in);	
	   String nameItemIs = nameItem.nextLine();
		return nameItemIs;
}

	public String numOfItem(){
	   System.out.println("How many? ");
	   Scanner itemNum = new Scanner(System.in);	
	   String  itemNumIs = itemNum.nextLine();
		return itemNumIs;
}
        
	public String shoppingCartName (String lista) {
	   System.out.println("=================\nYour list name is:");
		return lista;
}


	public String shoppingCartItem (String cosa) {
	   System.out.println("===================\nYou added items/items :" + cosa);
		return cosa;
}

	public int shoppingCartQuantity (int quanta) {
	   System.out.println("===================\nYour list name is:" + quanta);
		return quanta;
}

}
