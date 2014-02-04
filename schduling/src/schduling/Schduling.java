/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schduling;
import java.util.Scanner;
/**
 *
 * @author Sandun Priyanka
 */
public class Schduling {

}

 class GetInputs {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        // Set Waiting time
        
         int [] WT=new int[4];
         
       // Set Response time
        
         int [] RT=new int[4];
         
        // Set Turnaround time
        
         int [] TT=new int[4]; 
         
        // Get Input arrival time
         int [] AT =new int[4];
         
        
         
                    System.out.println("Enter all process arrival time in ascending oder");

        for(int i=0; i<AT.length;i++){
            System.out.printf("Enter arrival time for AT[%s]",i);
            AT[i]=scan.nextInt();
        }
                System.out.println("\n\n");

        // Get Input burst time
        int [] BT =new int[4];
        
                    System.out.println("Enter all process burst time in corresponding oder");

        for(int i=0; i<BT.length;i++){
            
            System.out.printf("Enter burst time for BT[%s]",i);
            BT[i]=scan.nextInt();
        }
        System.out.println("\n\n");
        System.out.println("********************************************************************************");
        
        // Set output of FCFS
        
       FCFS F = new FCFS();
       
            F.waitingTime(AT,BT,WT);
            
        System.out.println("\t\t FCFS \n");
        System.out.println("\t BT \t\t AT \t\t WT \t\t  RT \t\t TT \n");
        
        float totalWT=0;
        float totalTT=0;
        
        
        for(int i=0;i<BT.length;i++){
            System.out.printf("\t %s \t\t %s \t\t %s \t\t %s \t\t %s",BT[i],AT[i],WT[i],WT[i],(WT[i]+BT[i]));
            System.out.println("\n");
            totalWT =+ WT[i];
            totalTT =+ (WT[i]+BT[i]);           
        }
        float averageWT_1 =totalWT/4;
        float averageTT_1 =totalTT/4; 
        float averageRT_1 =averageWT_1;
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Aver\t\t\t\t\t(WT)%s \t(RT)%s \t(TT)%S",averageWT_1,averageWT_1,averageTT_1);
        System.out.println("\n");
        System.out.println("*******************************************************************************");
        
        // Set output of SJF 
        
       SJF S = new SJF();
       
            S.waitingTime(AT, BT, WT);
            
        System.out.println("\t\t SJF (non premetive)\n");
        System.out.println("\t BT \t\t AT \t\t WT \t\t  RT \t\t TT \n");
        
        totalWT=0;
        totalTT=0;
        
        for(int i=0;i<BT.length;i++){
            System.out.printf("\t %s \t\t %s \t\t %s \t\t %s \t\t %s",BT[i],AT[i],WT[i],WT[i],(WT[i]+BT[i]));
            System.out.println("\n");
            totalWT =+ WT[i];
            totalTT =+ (WT[i]+BT[i]);
            
        }
        float averageWT_2 =totalWT/4;
        float averageTT_2 =totalTT/4;
        float averageRT_2 =averageWT_2;
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Aver\t\t\t\t\t(WT)%s \t(RT)%s \t(TT)%S",averageWT_2,averageWT_2,averageTT_2);
        System.out.println("\n");
        System.out.println("*******************************************************************************");
        
        // Set output of RR 
        
       RR R = new RR();
       
            R.getData(AT, BT);
            R.waiting(WT);
            R.responsing(RT);
            R.start(TT);
            
        System.out.printf("\t\t RR (TQ = %S)\n",R.getData(AT, BT));
        System.out.println("\t BT \t\t AT \t\t WT \t\t  RT \t\t TT \n");
        
        totalWT=0;
        totalTT=0;
        int totalRT=0;
        
        for(int i=0;i<BT.length;i++){
            System.out.printf("\t %s \t\t %s \t\t %s \t\t %s \t\t %s",BT[i],AT[i],WT[i],RT[i],TT[i]);
            System.out.println("\n");
            totalWT =+ WT[i];
            totalTT =+ TT[i];
            totalRT =+ RT[i];
            
        }
        float averageWT_3 =totalWT/4;
        float averageTT_3 =totalTT/4;
        float averageRT_3 =totalRT/4;

        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Aver\t\t\t\t\t(WT)%s \t(RT)%s \t(TT)%S",averageWT_3,averageRT_3,averageTT_3);
        System.out.println("\n");
        System.out.println("*******************************************************************************");
        System.out.println("\n\n");
        
        //Final evaluation 
        
                
        if(averageWT_1 < averageWT_2 && averageWT_1 < averageWT_3 ){
            System.out.println("\t FCFS is suitable for minimum wating");
        }
        if(averageWT_1 > averageWT_2 && averageWT_3 > averageWT_2) {
            System.out.println("\t SJF is suitable for minimum wating");
        }
        if(averageWT_1 > averageWT_3 && averageWT_2 > averageWT_3){
            System.out.println("\t RR is suitable for minimum wating");
        }
        if (averageWT_1 == averageWT_2 && averageWT_2 < averageWT_3){
            System.out.println("\t FCFS and SJF are suitable for minimum wating");
        }
        if (averageWT_1 == averageWT_3 && averageWT_1 < averageWT_2){
            System.out.println("\t FCFS and RR are suitable for minimum wating");
        }
        if (averageWT_2 == averageWT_3 && averageWT_2 < averageWT_1){
            System.out.println("\t SJF and RR are suitable for minimum wating");
        }
        
        
        
        if(averageRT_1 < averageRT_2 && averageRT_1 < averageRT_3 ){
            System.out.println("\t FCFS is suitable for quick response");
        }
        if(averageRT_1 > averageRT_2 && averageRT_3 > averageRT_2) {
            System.out.println("\t SJF is suitable for quick response");
        }
        if(averageRT_1 > averageRT_3 && averageRT_2 > averageRT_3){
            System.out.println("\t RR is suitable for quick response");
        }
        if (averageRT_1 == averageRT_2 && averageRT_2 < averageRT_3){
            System.out.println("\t FCFS and SJF are suitable for quick response");
        }
        if (averageRT_1 == averageRT_3 && averageRT_1 < averageRT_2){
            System.out.println("\t FCFS and RR are suitable for quick response");
        }
        if (averageRT_2 == averageRT_3 && averageRT_2 < averageRT_1){
            System.out.println("\t SJF and RR are suitable for quick response");
        }
        
        
        
        if(averageTT_1 < averageTT_2 && averageTT_1 < averageTT_3 ){
            System.out.println("\t FCFS is suitable for minimum turnaround");
        }
        if(averageTT_1 > averageTT_2 && averageTT_3 > averageTT_2) {
            System.out.println("\t SJF is suitable for minimum turnaround");
        }
        if(averageTT_1 > averageTT_3 && averageTT_2 > averageTT_3){
            System.out.println("\t RR is suitable for minimum turnaround");
        }
        if (averageTT_1 == averageTT_2 && averageTT_2 < averageTT_3){
            System.out.println("\t FCFS and SJF are suitable for minimum turnaround");
        }
        if (averageTT_1 == averageTT_3 && averageTT_1 < averageTT_2){
            System.out.println("\t FCFS and RR are suitable for minimum turnaround");
        }
        if (averageTT_2 == averageTT_3 && averageTT_2 < averageTT_1){
            System.out.println("\t SJF and RR are suitable for minimum turnaround");
        }
        
        
    }
    
}

 class FCFS extends GetInputs{
     
     public int[] waitingTime(int[] x,int[] y,int[] z){
         
         // z[] = WT[]
         // x[] = AT[]
         // y[] = BT[]
         
         // all possible variables
         
         int p,q,s,a,b,m;
         p = y[0] + x[0];           
         q = p + y[1];              
         s = q + y[2];              
         
         
         a = x[1] + y[1];           
         b = a + y[2];              
         
         m = x[2]+y[2];   
         
         // initialize all values of WT[i]
         
         z[0] = 0;                  
         
         if (p > x[1]){ 
         z[1] = p - x[1];           
            if(q > x[2]){
            z[2] = q - x[2];        
                if(s > x[3]){
                z[3] = s - x[3];    
                }
            }
            if(q <= x[2]){
                if(m > x[3]){
                z[3] = m - x[3];    
                }
            }
         }
         
         if(p <= x[1]){
            if(a > x[2]){
            z[2] = a -x[2];
                if(b > x[3]){
                z[3] = b - x[3];
                }
            }
            if(a <= x[2]){
                if(m > x[3]){
                z[3] = m - x[3];
                }
            }
         }
         return z;
     }
     
 }
  
class SJF extends GetInputs{
     
    public int[] waitingTime(int[] x,int[] y,int[] z){
        
            // z[] = WT[]
            // x[] = AT[]
            // y[] = BT[]
    
        // all possible variables
        
        int p,q,s,t,a,b,m;
         p = y[0] + x[0];           
         q = p + y[1];              
         s = q + y[2];          
         t = s + y[3];
         
         a = x[1] + y[1];           
         b = a + y[2];              
         
         m = x[2]+y[2];             
         
         // intialize all values of WT[i] = 0
         
         z[0] = 0;                 
         z[1] = 0;
         z[2] = 0;
         z[3] = 0;
        
         //if AT[1] < BT[0] + AT[0]  && AT[2] > BT[0] + AT[0]
         
        if(x[1] < p && x[2] > p){
             z[1] = p - x[1];
             if(q > x[2] && q > x[3]){
                    if(y[2] < y[3] || y[2] == y[3]){
                    z[2] = q - x[2];
                    z[3] = s - x[3];
                    }
                    if(y[3] < y[2]){
                    z[3] = q - x[3];
                    z[2] = (t-y[2])- x[2];
                    }
             }
             
             if(x[2] < q && x[3] > q){
                    z[2] = q - x[2];
                    if(x[3] < s){
                    z[3] = s - x[3];
                    }
             }
             
             if(x[2] >= q){
                    if(x[3] < m){
                    z[3] = m - x[3];
                    }
            }
         }
         
        // if AT[2] < BT[0] + AT[0]  && AT[3] > BT[0] + AT[0]
        
        if(x[2] < p && x[3] > p ){
            
            if(y[2] > y[1] || y[1] == y[2]){
                z[1] = p - x[1];
                if(x[3] < q ){
                    if(y[2] < y[3] || y[2]==y[3]){
                    z[2] = q - x[2];
                    z[3] = s - x[3];
                    }
                    if(y[3] < y[2]){
                    z[3] = q - x[3];
                    z[2] = (t-y[2])- x[2];
                    }
                }
                if (x[3] > q && x[3] < s){
                    z[2] = q - x[2];
                    z[3] = s - x[3];
                }
            }
            
            
           if(y[2] < y[1]){
                z[2] = p - x[2];
                if(x[3] < (p+y[2]) ){
                    if(y[1] < y[3] || y[1]==y[3]){
                    z[1] = (p+y[2]) - x[1];
                    z[3] = s - x[3];
                    }
                    if(y[3] < y[1]){
                    z[3] = (p+y[2]) - x[3];
                    z[1] = (t-y[1])- x[1];
                    }
                }
                if (x[3] > (p+y[2]) && x[3] < s){
                    z[1] = (p+y[2]) - x[1];
                    z[3] = s - x[3];
                }
            }
        }
            
        // if AT[3] < BT[0] + AT[0]
        
        if(x[3] < p ){
          
            if(y[2] > y[1] && y[3] > y[1]){
               z[1] = p - x[1];                 
               if(y[2] < y[3] || y[2] == y[3]){
               z[2] = q - x[2];
               z[3] = s - x[3];
               }
               if(y[3] < y[2]){
               z[3] = q - x[3];
               z[2] = (q+y[3]) - x[2];
               }
            }
            
            if(y[1] > y[2] && y[3] > y[2]){
               z[2] = p - x[2];                 
               if(y[1] < y[3] || y[1] == y[3]){
               z[1] = (p+y[2]) - x[1];
               z[3] = s - x[3];
               }
               if(y[3] < y[1]){
               z[3] = (p+y[2]) - x[3];
               z[1] = (t-y[1]) - x[1];
               }
            }
            if(y[2] > y[3] && y[1] > y[3]){
               z[3] = p - x[3];                
               if(y[1] < y[2] || y[1] == y[2]){
               z[1] = (p+y[3]) - x[1];
               z[2] = (t-y[2]) - x[2];
               }
               if(y[2] < y[1]){
               z[2] = (p+y[3]) - x[2];
               z[1] = (t-y[1]) - x[1];
               }
            }
            
        }
        
        // if AT[1]> p
        
        if(x[1] >= p){
            if(x[3]< a){
                if(y[2]<y[3] || y[2] == y[3]){
                z[2] = a - x[2];
                z[3] = b - x[3];
                }
                if(y[3]<y[2]){
                z[3] = a - x[3];
                z[2] = (a+y[3]) - x[2];
                }
            }
            
            if(x[2]> a && m > x[3]){
                z[3] = m - x[3];
            }
            
            if(x[2]< a && x[3]> a){
                z[2] = a - x[2];
                if(b > x[3]){
                z[3] = b - x[3];
                }
            }
        }
        
       //if BT[1]=BT[2]=BT[3]
        
        if(y[1]==y[2] && y[2]==y[3]){
            if (p > x[1]){ 
            z[1] = p - x[1];
            
                if(q > x[2]){
                z[2] = q - x[2];        
                    if(s > x[3]){
                    z[3] = s - x[3];    
                    }
                }
                
                if(q <= x[2]){
                    if(m > x[3]){
                    z[3] = m - x[3];   
                    }
                }
            }
         
            if(p <= x[1]){
                
                if(a > x[2]){
                z[2] = a -x[2];
                    if(b > x[3]){
                    z[3] = b - x[3];
                    }
                }
                if(a <= x[2]){
                    if(m > x[3]){
                    z[3] = m - x[3];
                    }
                }
            }
        }
        return z;
    }
 }


class RR extends GetInputs {
    
        // AT[] = x[]
        // BT[] = y[]
        // WT[] = z[]
        // RT[] = r[]
        // TT[] = t[]
        

    int[] t, z, r,x,y;
    int commBT;
    int k, tq;
    int[][] d, ar, btLeastThantq;
    int btcache;
    int outputresponse;
    int waitTime;

    public int getData(int[]x, int[]y) {
        
        
        d = new int[4][2];
        ar = new int[4][2];

        for (int i = 0; i < 4; i++) {
        
            d[i][0] = i;
            ar[i][0] = i;
            
            d[i][1] = x[i];
            
            ar[i][1] = y[i] ;

            commBT += x[i];
        }
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("enter TQ (8 or 16)= ");
        tq = s.nextInt();
        return tq;
    }

    public int[] waiting(int[]z) {
        a:
        for (int i = 0; i < d.length; i++) {
            z[i] = 0;

            for (int j = 0; j < d.length; j++) {
                if (d[i][1] > tq) {
                    waitTime = 0;
                    int restburstTime = d[j][1];
                    waitTime = +tq;
                    d[j][1] = d[j][1] % tq;

                } 
                else {
                }
            }
            z[i] = +waitTime;

        }
        return z;
    }

    public int[] responsing(int []r) {
       
        outputresponse = r[0];
        for (int i = 0; i < d.length - 1; i++) {
            r[0] = ar[0][1];
            if (d[i][1] > tq) {  //process ekaka burst time eka time quantum ekatawada wedi wenakota
                outputresponse += tq;
                r[i + 1] = outputresponse - ar[i + 1][1];
            } else {
                outputresponse += d[i][1];  // process ekaka burst time eka time quantum ekata wada adu wenakota
                r[i + 1] = outputresponse - ar[i + 1][1];
            }
        }
        return r;
    }

    public int[] start(int[]t) {
        for (int i = 0; i < d.length; i++) {
            int bt = d[i][1];
            int at = ar[i][1];
            if (bt > 0) {
                if (bt <= tq) {
                    t[i] = btcache + bt;
                    btcache = t[i];
                    t[i] = t[i] - at;

                    k += bt;
                    bt -= bt;



                } else {
                    t[i] = btcache + tq;
                    btcache = t[i];
                    t[i] = t[i] - at;
                    bt -= tq;
                    k += tq;
                }

                d[i][1] = bt;


            }
        }
        if (k != commBT) {
            start(t);
        }
        return t;
    }

}