/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javageneric;

/**
 *
 * @author Sandun Priyanka
 */
public class JavaGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3, 4};
        Character[] cray = {'s', 'a', 'n', 'd', 'u', 'n'};
        printMe(iray);
        printMe(cray);

    
    }

    public static <T> void printMe(T[] x) {
        for (T t : x) {
            System.out.printf("%s", t);
        }
        System.out.println("");
    }

}
