/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithm;

/**
 *
 * @author Sandun Priyanka
 */
public class Selectionsort {

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 9, 1, 6, 8, 7, 4};

        for (int i = 0; i < array.length; i++) {
            int min = i;  // index of min value
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        // print out put
        for (int arr : array) {
            System.out.print(arr + " ");
        }

    }
}
