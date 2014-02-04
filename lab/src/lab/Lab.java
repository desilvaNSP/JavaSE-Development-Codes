/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Sandun Priyanka
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lab l =new Lab();
       l.halfTrangle();
       l.trangle();
    
    }
    
    void halfTrangle() {
        int a = 1;
        int[] b = new int[10];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i + 1; j++) {
                b[i]= a;
                System.out.print(b[j]); 
                
            }
            a+=1;
            System.out.print("\n");
        }
    }
     public void trangle() {
         int b =1;
         int[] c = new  int[10];
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                
                System.out.print(b+" "+c[i]);
                c[i]=b;
            }
            b+=1;
            System.out.print("\n");


        }
     }
}
