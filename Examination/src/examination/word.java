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
public class word {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String maxword = null;
        str = str + ' ';
        int l = str.length();
        String word = "";
        int maxlength = l;
        for (int i = 0; i < l; i++) {
            word = word + str.charAt(i);
            if (str.charAt(i + 1) == ' ') {
                if (word.length() <maxlength) {
                    maxword = new String(word);
                    maxlength = word.length();
                }
                word = "";
                i++;
            }
        }
        System.out.println("longest word is " + maxword);

    }
}
