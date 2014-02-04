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
public class commonfactor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter ur first number :");

        int a = scn.nextInt();
        System.out.println("Enter ur second number :");
        int b = scn.nextInt();
        int[] num = new int[a+1];
        int[] num2 = new int[b+1];
        int[] re = new int[10];

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {

                    num[i] = i;
             System.out.println(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {

              num2[i] = i;
              System.out.println(i);
            }
        }

        int max = 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num2.length; j++) {

                if (num[i] == num2[j]) {

                    if (num[i] > max) {
                        max = num[i];

                    }
                 //   System.out.println(num[i]);

                }
            }
        }
            System.out.println("Greatest Common factor : " + max);
    }
}