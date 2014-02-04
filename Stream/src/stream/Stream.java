/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

 import java.io.*;
/**
 *
 * @author Sandun Priyanka
 */
public class Stream {


   public static void main(String args[]) throws IOException
   {
      // Create a BufferedReader using System.in
      BufferedReader br = new BufferedReader(new
                              InputStreamReader(System.in));
      String str;
      System.out.println("Enter lines of text.");
      System.out.println("Enter 'end' to quit.");
      do {
         str = br.readLine();
         System.out.println(str);
      } while(!str.equals("end"));
   
}
}
