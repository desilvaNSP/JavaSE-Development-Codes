/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithm;

/**
 *
 * @author Sandun Priyanka
 */
public class Insertionsort {

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 9, 1, 6, 8, 7, 4};
        int i, j, val;
        for (i = 1; i < array.length; i++) {
            val = array[i];
            for (j = i; j > 0; j--) {
                if (array[j - 1] > val) {
                    array[j] = array[j - 1];
                    array[j - 1] = val;
                }
            }
        }

        for (int arr : array) {
            System.out.print(arr + " ");

        }
    }
}

/*
      int i, j, value;

        for (i = 1; i < array.length; i++) {
            value = array[i];
            j = i; // i is a pointer 
            while (j > 0 && array[j - 1] > value) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }
 */