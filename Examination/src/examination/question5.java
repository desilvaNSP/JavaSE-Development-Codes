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
public class question5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sent = s.nextLine();
        question5 a = new question5();
        System.out.println(a.longWord(sent));



    }

    public String longWord(String sentence) {
        String maxword = null;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            
            
        }
        int maxlength = 0;
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (len > maxlength) {
                maxlength = len;
                maxword = words[i];
            }
        }
        return maxword;
    }
    

    }

