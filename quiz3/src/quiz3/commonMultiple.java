/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import java.util.Scanner;

/**
 *
 * @author Sandun Priyanka
 */
public class commonMultiple {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        System.out.println("Enter ur First number  : ");
        int a = scn.nextInt();
        System.out.println("Enter ur Second number : ");
        int b = scn.nextInt();
        System.out.println(a);
            System.out.println(b);
            int[] Arr1 = new int[b];
            int[] Arr2 = new int[b];
        for (int i = 1; i < 100; i++) {
            
            a+=a;
            b+=b;
             
        }
        
   
    }
    
}
