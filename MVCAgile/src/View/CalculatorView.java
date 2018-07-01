package View;

import java.awt.Button;
import java.awt.event.ActionListener;
import javax.swing.*;
import 


public class CalculatorView extends JFrame{
    
    private JTextField firstNumber = JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber =  new JTextField(10);
    private JButton calculateButton = new JButton("calculate");
    private JTextField calcSolution = new JTextField(10);
    
 
    CalculatorView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
       this.add(calcPanel);
    }
    
    public int getFirstNumber(){
    return Integer.parseInt(firstNumber.getText());
    }
    
    public int getSecondNumber(){
    return Integer.parseInt(secondNumber.getText());
    }
    
    public int getCalcSolution(){
    return Integer.parseInt(calcSolution.getText());
    }
    
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    
    void addCalculationListner(ActionListener listnerForCalcButton){
        calculateButton.addActionListener(listnerForCalcButton);
    }
    
    void displayErrorMessage(String errorMessage){
    JOptionPane.showMessageDialog(this,errorMessage);
    }

    private JTextField JTextField(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}