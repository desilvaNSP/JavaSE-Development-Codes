package lab;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandun Priyanka
 */
public class factorial {
    public static void main(String[] args) {
        factorial f = new factorial();
        for (int i = 1; i <= 10; i++) {
            f.fac(i); 
        }
        //f.fac(5);
       
    }
    void fac(int a ){
    int i = 1;
    int ft = 1;
    while(i<=a){
        
    ft = ft*i;
    i++;
    }
    System.out.println("the factotrial of "+a+" is "+ ft);
    //return ft;
    }
}
