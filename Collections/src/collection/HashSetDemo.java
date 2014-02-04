/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.HashSet;


/**
 * 
 * @author Sandun Priyanka
 */

/**
 * 
 * set interface
 * --------------
 * HashSet(class)
 * TreeSet
 * LinkedHashSet
 * 
 * 
 * 
    java.lang.Object
        java.util.AbstractCollection<E>
            java.util.AbstractSet<E>
                java.util.HashSet<E>


 * 
 * HashSet class extend from the AbstractSet class 
 * and Implement from Set Interface
 * 
 */

public class HashSetDemo {
    public static void main(String[] args) {
       Collect coll = new Collect();
       // create hashset object
       HashSet hs = new HashSet();
       // addding elemets into the hash set
       hs.add("sandun"); // can be added String Object 
       hs.add("priyanka");
       hs.add('s'); // can be pass character
       hs.add('s');  //A Set is a Collection that cannot contain duplicate elements
       hs.add(555); // can be pass Integer type
       hs.add(coll); // can be pass Object type
       hs.add(null); // can be pass null value as well
       
       // beacause HashSet Interface is a generic
       // no order
        System.out.println("there are "+hs.size()+" elements in the hash set");
        System.out.println(hs);
        System.out.println("");
        
 /// hash table for only strings
        
        HashSet<String> hs2 = new  HashSet<>();
        
        hs2.add("malani de silva");
        hs2.add("Sandunnika de silva");
        //hs2.add('s');  cant be add chareters
        //hs2.add(545);  cant be add integeres
        //hs2.add(coll); cant be add objects
        
        
        System.out.println(hs2);
        
        
        
        
    }
    
}
