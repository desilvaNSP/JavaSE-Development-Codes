/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Sandun Priyanka
 */
public class powertriangle {

    public static int x;

    public static void main(String[] args) {
        powertriangle p = new powertriangle();

        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter some number :  ");  /// if you entered 6
        x = scn.nextInt();
        p.trangle();
/*
 *        1
 *      1 2 1
 *    1 2 4 2 1
 *  1 2 4 8 4 2 1
 * 1 2 4 8 16 8 2 1
 * 
 * like that...
 * 
 */
    }

    public void trangle() {
        int[] b = new int[x];
        for (int i = 0; i < x; i++) {
            int a = (int) Math.pow(2, i);
            b[i] = a;
            for (int j = x; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(b[j] + " ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(b[i - j - 2] + " ");
            }
            System.out.println();

        }
    }
}
