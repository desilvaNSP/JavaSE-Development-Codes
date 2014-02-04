/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Sandun Priyanka
 */
import java.util.Scanner;
public class tutorialFour {
    public static void main(String[] args) {
        int[] array = {3, 3, 4, 5, 6,7,8,5,6,2,5,9};
        int length = array.length;
        tutorialFour tf = new tutorialFour();
        Scanner scn = new Scanner(System.in);
/* question 01 */      System.out.println(tf.sum(3)) ;    
            System.out.println("********************");
/* question 02 */        System.out.println(tf.minimumVal(array, length));
            System.out.println("********************");
/* question 03 */            System.out.println(tf.sumOfArray(array, length));
/*pass paper*/
 System.out.println("********ODD***********");
        System.out.println(tf.sumOdd(array, length));
         System.out.println("********************");
            System.out.println("next step for question for...");
            System.out.println("Enter the word to check wheather it is palindrome or not : ");
            String word = scn.nextLine();
            char[] c = word.toCharArray();
            int lengthOfWord = c.length;
/* question 04 */            System.out.println(tf.cheackPalindrome(c, lengthOfWord));

/* Question 05 */ System.out.println(tf.reverseDigit(12345));
    }
    // question no 1
    public int sum(int n){
        int sum = 0;
        if(n==1){
        return 1;
        }else{
           sum = n + sum(n-1);
        }
        return sum;
        
    }
    
    //quetion no 2
    public int minimumVal(int[] array,int length){
        
        int len = length -1 ;
        
        
        if(length == 1){
           return array[0];
        }
        else if(array[len] <= array[0])
                array[0] = array[len];
                return minimumVal(array, len);
           
    
    }
    // quetion no 3
    public int sumOfArray(int[] array,int length){
    int len = length - 1;
    int sum = 0;
    if(length == 1){
        return array[0];
    }else{
   return array[len]+sumOfArray(array,len);
    } 
  
    }
    // pass paper 2012 batch 10
int sumOdd(int[] array,int length){
int len = length - 1;
if(length== 1){
int value = array[len] % 2 ;
if(value==0){
    return 0;
}
return array[0];

}
else{
   int value = array[len] % 2 ;
 if(value == 1){
 return array[len]+sumOdd(array, len);
 }   
 else if(value == 0){
 return sumOdd(array, len);
 }
 return 0;
 

}


}

    
   // quetion no 4
    public int cheackPalindrome(char[] word,int length){
    char[] result = word;
    int len = length - 1;
    int j = word.length-len;

    if(j<=len){
     if(word[len] == word [j]){
     return cheackPalindrome(word, len);
     }
     else 
         return 0;
    }
    else
        return 1;
    
    }
    int reverseDigit(int n){
    int redigit;
    if(String.valueOf(n).length()==1){
    return n;
    }
    else{
    return redigit = Integer.parseInt(String.valueOf(n%10) + reverseDigit(n/10));
    }
    }
    
    
}
