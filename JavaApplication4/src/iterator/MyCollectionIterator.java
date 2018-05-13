
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Randy ther Master
 */
public class MyCollectionIterator {
    public static void main(String a[]){
        List<String> myList = new ArrayList<String>();
        myList.add("Orange");
        myList.add("Banana");
        myList.add("Apple");
        myList.add("Grape");
        myList.add("Kiwi");
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
         System.out.println(itr.next());   
        }
    }
    
}
