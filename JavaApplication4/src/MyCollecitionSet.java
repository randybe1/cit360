
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randy ther Master
 */
public class MyCollecitionSet {
    // example of Set collection interface
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Randy");
        names.add("Kalie");
        
        if (names.add("Ashton")){
        System.out.println("Ashton is added to the set");
}
         if(!names.add("Randy")){
         System.out.println("Randy is already added to the set");
    }
}
}