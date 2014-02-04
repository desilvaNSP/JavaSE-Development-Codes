/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;
/**
 *
 * @author Sandun Priyanka
 */
/**
 *
 * There are three types of constructor in TreeSet class
 *
 * 1. TreeSet() default constructor 2. TreeSet(Collection c) 3.
 * TreeSet(Comparator comp) 4. TreeSet(SortedSet sS)
 *
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add('D');
        ts.add('n');
        ts.add('E');
        ts.add('A');
        ts.add('B');
        ts.add('F');
        ts.add('b');
        ts.add('f');
        ts.add('c');
        ts.add('a');

        System.out.println(ts);

        /**
         * output [A, B, D, E, F, a, b, c, f, n]
         *
         * The elements are ordered using their natural ordering This
         * implementation provides guaranteed log(n) time cost
         *
         * ClassCastException throws :if the keys in the given collection are
         * not comparable
         *
         * Following Example shows how to create TreeSet with other collection
         * TreeSet(Collection c)
         *
         */
        List<String> li = new ArrayList();
        // List is a interface and AarayList class implements from the List Interface
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");

        System.out.println("List : " + li);

        TreeSet ts2 = new TreeSet(li);
        System.out.println("Tree Set : " + ts2);

        /**
         * output List : [one, two, three, four] Tree Set : [four, one, three,
         * two]
         *
         * ClassCastException throws: if the keys in the given collection are
         * not comparable
         *
         * find the duplicate value in the set
         *
         */
        System.out.println("========find the duplicate value in the set============");
        String[] strArr = {"one", "two", "three", "four", "two", "one", "five"};
        TreeSet<String> unique = new TreeSet<>();
        for (String str : strArr) {
            if (!unique.add(str)) {
                System.out.println("duplicate value is : " + str);      
            }
        }
         System.out.println("Dont worry duplicate values are not in the TreeSet");
         System.out.println(unique);
         
         
         /**
          * how to read objects using Iterator. By calling iterator() method you will get Iterator object,
          * through which you can iterate through all the elements of the TreeSet.
          * 
          */
        System.out.println("========travesal throught the set============");
        Iterator<String> it = ts2.iterator(); // iterator is interface
        while(it.hasNext()){
            System.out.println("item : "+it.next());
        }
        
         
    }
}
