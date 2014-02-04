/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

/**
 *
 * @author Sandun Priyanka
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String a = "sandun";
      String b = new String("sandun");
     String x = new String("sandun");
      String c = "sandun";
      
        System.out.println(a==b);//false
        
        System.out.println(a==c);//true
        System.out.println(b==x);
        
        System.out.println("*****************");
        String st = "I Love You Sandun";
        System.out.println(st.substring(0,12)+st.substring(0,12));
        System.out.println(a.equals(b));
         System.out.println("*****************");
        String d = "sDffd";
        String e = "sdffd";
        System.out.println(d.equals(e));  // case sensitive
        System.out.println(d.equalsIgnoreCase(e)); // not case sensitive
  /*important*/      System.out.println(d.compareTo(e));
        System.out.println(d.charAt(2));
        System.out.println(st.endsWith("un")); // true
        System.out.println(st.startsWith("ch")); // false if "I" =>true
        System.out.println(st.indexOf("You")); //case sensitive
        System.out.println(st.indexOf("S"));   //case seensitive
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        char[] cha = st.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
            
        }
        System.out.println("*****************");
        String name = "Sandun Java dsdsdff Gona jdfdh";
        String[] tokens = name.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String string = tokens[i];
            System.out.println(string);
            
        }
 
    }
}
