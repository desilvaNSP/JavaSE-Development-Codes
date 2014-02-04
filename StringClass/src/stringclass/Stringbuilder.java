/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

import java.lang.StringBuilder;

/**
 *
 * @author Sandun Priyanka
 */
public class Stringbuilder {
static String name = "sandun";
    public static void main(String[] args) {
//static int x  = 10;  /// local variable can't be static

        StringBuilder s = new StringBuilder("I Love you dream Girl");
        //System.out.println(s.reverse());
        
        System.out.println(s.replace(11, 22,"girl"));
        
        System.out.println(s.insert(21, "sandun priyanka"));
        
        System.out.println(s.delete(11, 21));
        
        System.out.println(s.deleteCharAt(5));
    }
}