/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Sandun Priyanka
 */
public class reverse {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int length = array.length;
        reverse r = new reverse();
        r.reverseArray(array, length);
        for (int i = 0; i < array.length; i++) {       
            System.out.print(array[i]);
        }
    }
    public int[] reverseArray(int[] array, int length) {
        int len = length-1;
        int i = array.length - (len+1);
        if (length == 1) {
            return array;
        } else if (i <= len) {
            int a = array[i];
            array[i] = array[len];
            array[len] = a;
            reverseArray(array, len);
        }
        return array;
    }
}
