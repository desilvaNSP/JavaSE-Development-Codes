/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Sandun Priyanka
 */
public class Generics {

    
    public static void main(String[] args) {
      Integer[] iarray = {1,2,3,4};
      Character[] carray = {'s','a','n','d','u','n'};
      char[] chararray = {'c','h','a','t'};
      
      printMe(iarray);
      printMe(carray);
    //  printMe(chararray); can' use generic for that
    }
    public static <T>  void printMe(T[] a){
        for (T t : a) {
            System.out.print(t); 
           
        }
         System.out.println("");
    
    }


}
