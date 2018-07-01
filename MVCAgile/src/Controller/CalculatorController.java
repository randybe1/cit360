
package Controller;
import Model.CalculatorModel;

import Model.CalculatorModel;
import View.CalculatorView;
import java.awt.event.ActionEvent;
    
package Controller;


public class CalculatorController(CalculatorView theView, CalculatorModel theModel){

private CalculatorView theView;
private CalculatorModel theModel;

this.theView = theView;
this.theModel = theModel;

this.theView.addCalculationListner(new CalculateListner());
    
}


class CalculateListner implements ActionListner{
    public void actionPerformed(ActionEvent arg0){
        
        int firstNumber, secondNumber = 0;
        
     try{
        firstNumber = theView.getFirstNumber();
        secondNumber = theView.getSecondNumber();
        
        theModel.addTwoNumbers(firstNumber, secondNumber);
        
        theView.setCalcSolution(theModel.getCalcultionValue());
    }
     
     catch(NumberFormatException ex){
         theView.displayErrorMessage("you need to enter 2 integers");
         
        }
    }
}
