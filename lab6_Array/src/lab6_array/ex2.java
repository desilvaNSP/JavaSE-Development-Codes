/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_array;

import java.util.Scanner;

/**
 *
 * @author Sandun Priyanka
 */
public class ex2 {

    static int i;
   static  int[] a;

    public static void main(String[] args) {
        ex2 e = new ex2();
        for (i = 0; i <3; i++) {
            e.getname();
            e.getMark();
        }

       int x =e.maxValue(a);
        System.out.println("max value :" +x);

    }

    void getname() {
        Scanner s = new Scanner(System.in);
        String[] b = new String[10];
        System.out.println("Name of  student : ");
        b[i] = s.nextLine();

    }

    void getMark() {
        Scanner s = new Scanner(System.in);
         a = new int[10];
        System.out.println("Marks Of Student : ");
        a[i] = s.nextInt();

    }
    public int maxValue(int[] c){
     
        int max = c[0];
        for (int j = 1; j < c.length; j++) {
            if (c[j]>max) {
                max = c[j];
                
            }
        }
    return max;
    
    }
}
