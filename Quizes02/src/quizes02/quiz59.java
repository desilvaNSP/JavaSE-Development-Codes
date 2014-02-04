/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes02;

/**
 *
 * @author Sandun Priyanka
 */
public class quiz59 {

    public static void main(String[] args) {
        quiz59 q = new quiz59();
        q.XOR();
        Integer a = 5;
        switch (a) {
            default:
                a ^= a;
            case 5:
                a++;
            // break;
            case 10:

                a = a + a;
            //break;

            // break;
        }
        System.out.println(a);

    }

    void XOR() {

        Integer b = 10;
        Integer c = 5;

        System.out.println(b^c);


    }
}
