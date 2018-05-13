
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randy ther Master
 */
public class MyCollectionMap {
    public static void main(String[] args){
  //keys are Strings
    //obects are also Strings
    Map<String, String> map = new HashMap<>();
    fillData(map);
    
    //write to command line
    map.forEach((k, v) -> System.out.printf("%s %s%n", k, v ));
    
    //add and remove from the map
    map.put("Randy", "Is Awesome");
    map.remove("Haters");
    
    //write againg to command line
    map.forEach((k, v) -> System.out.printf("%s %s%n", k, v ));
}
    private static void fillData(Map<String, String> map){
        map.put("Randy", "is nnot good at java");
        map.put("Eclipse IDE", "Java");
        map.put("Git", "Version control system");
                
    }
}