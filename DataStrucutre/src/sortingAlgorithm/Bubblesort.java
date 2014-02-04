/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithm;

/**
 *
 * @author Sandun Priyanka
 */
public class Bubblesort {

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 9, 1, 6, 8, 7, 4};
        int temp;
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println("");
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 0; j < (array.length-i)-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        // print out put
        for (int arr : array) {
            System.out.print(arr + " ");
        }

    }
}


/*
   int temp;
        for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] < arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
 */