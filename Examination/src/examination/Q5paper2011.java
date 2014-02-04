/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.util.Scanner;

/**
 *
 * @author Sandun Priyanka
 */
public class Q5paper2011 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sent = scn.nextLine();
        System.out.println(sent);
        Q5paper2011 q= new Q5paper2011();
        q.longestWord(sent);
    }

    public void longestWord(String s) {
        String sentence = s;
        int[] count;
        char[][] b = null;
        char[] a = sentence.toCharArray();
        c:for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] != ' ') {
                    b[i][j] = a[j];
                   
                }
                else{
                     break c;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(b[i][j]);
                
            }
            
        }

    }
}
