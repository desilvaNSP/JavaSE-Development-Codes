/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

/**
 *
 * @author Sandun Priyanka
 */
public class multiplicationaTable {

    public static void main(String[] args) {
        int p = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                p = i * j;
                System.out.print(p + "   ");
            }
            System.out.println("");

        }
    }
}
