/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes02;
import java.util.*;
/**
 *
 * @author Sandun Priyanka
 */
public class rouudrobin2 {
    
}


class SimpleRR {
 
    int [] temp,wait,resp;
    int commBT;
    int k, tq;
    int[][] d,ar,btLeastThantq;
    int btcache;
 
     
    void getData( ){
        Scanner s = new Scanner(System.in);
        System.out.println( "enter no. of process");
        int pcount = s.nextInt();
        d = new int[pcount][2];
        ar =new int[pcount][2];
 
        temp = new int[pcount]; // create pcount size array 
        wait = new int[pcount]; // create array for wait
        resp = new int[pcount]; // create array for response
        
        for (int i = 0; i < pcount; i++) {
            System.out.println( "enter BT");
            d[i][0] = i;
            ar[i][0]=i;
               int m = s.nextInt();
            d[i][1] = m;
            System.out.println( "enter AT");
            int atp = s.nextInt();
            ar[i][1] = atp;
 
            commBT += m;
        }
        System.out.println( "enter TQ ");
        tq = s.nextInt();
        System.out.println(commBT); /// sum of the burst times of all process 
        start();
        display( );
         
    }

    void start( ){
        for (int i = 0; i < d.length; i++) {
            int bt  = d[i][1];
            int at  = ar[i][1];
            if( bt > 0){
                if( bt <= tq){
                    temp[i] = btcache+bt;
                    btcache = temp[i];
                    temp[i]=temp[i]-at;
         
                    k += bt;
                    bt -= bt;
                    
                      
                }
                else{
                    temp[i] = btcache+tq;
                    btcache = temp[i];
                    temp[i]=temp[i]-at;
                    bt -= tq;
                    k += tq;
                }
                 
                d[i][1] = bt;
                
                 
            }
        }
        if( k!= commBT)
            start();
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleRR r= new SimpleRR();
        r.getData();
    }
 
    private void display() {
        float val = 0;
        int c = 1;
        for (int i : temp) {
            System.out.println( "Turnarround Time for process " + c + " is " + i );
            val += i;
            c++;
        }
        System.out.println( "avg BT = " + val/temp.length);
    }
}

class Rr {
	         
	     
	    public static void main(String[] args) {
	         
	        Scanner kb = new Scanner(System.in);
	        System.out.print("No. of Processes: ");
	        int n = kb.nextInt();
	        System.out.print("TQ: ");
	        int tq = kb.nextInt();
	         
	        int []p = new int[n];
	        int at[] = new int[n];
	        int bt[] = new int[n];       
	        int bt2[] = new int[n];
	        int wt[] = new int[n];
	        int tat[] = new int[n];
	 
	         
	        int count = 1;
        for(int i=0; i<n; i++){
	            p[i] = count;
	            at[i] = 0 + (int)(Math.random()*10);
	            bt[i] = 4 + (int)(Math.random()*20);
	            bt2[i] = bt[i];
	 
	            count++;
	        }
	        int tbt=0;
	        for (int i = 0; i < n; i++)
	            tbt = tbt + bt[i];
	 
	        int time[] = new int[tbt];
	        int k = 0;
	        int q2 = 0;
	        int asd;
	        System.out.println("\nGantt Chart");
	        bt[0] = bt[0] - 1;
	        //********************************************************
	        //********************************************************
	                // THE PROBLEM IS HERE, I DON'T KNOW IF I AM DOING THE RIGHT COMPUTATIONS HERE
	        // GANTT CHART HERE (TEXT)
	        int a = 0;
	        while(tbt>0){
	         //   System.out.print("|    p[" + p[tbt] + "]\t");
	            tbt = tbt - 4;
	             
	        }
	        //********************************************************
	        //********************************************************
	        //******************************************************** 
	             
	        double wtime = 0;
	        double tatime = 0;
	 
	        for (int i = 0; i < n; i++)
	        {
	            wt[i] = wt[i] - at[i];
	            tat[i] = tat[i] - at[i];
	            wtime = wt[i];
	            tatime = tat[i];
       }
            }
}