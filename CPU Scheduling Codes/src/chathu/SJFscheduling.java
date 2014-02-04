/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chathu;

import java.util.Scanner;

/**
 *
 * @author Sandun Priyanka
 */
class GetInputs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Set Waiting time..
        int[] WT = new int[4];

        // Get Input arrival time
        int[] AT = new int[4];

        System.out.println("Enter all process arrival time in ascending oder");

        for (int i = 0; i < AT.length; i++) {
            System.out.printf("Enter arrival time for AT[%s]", i);
            AT[i] = scan.nextInt();
        }
        System.out.println("\n\n");

        // Get Input burst time
        int[] BT = new int[4];

        System.out.println("Enter all process burst time in corresponding oder");

        for (int i = 0; i < BT.length; i++) {

            System.out.printf("Enter burst time for BT[%s]", i);
            BT[i] = scan.nextInt();
        }
        System.out.println("\n\n");

        SJFscheduling sjf = new SJFscheduling();


        //  System.out.println(sjf.getMinBurstTime(BT));

        //System.out.println(sjf.cheackMinNextJob(BT,AT)

        int[] first = new int[4];
        int[] processId = new int[4];
        first = sjf.cheackMinNextJob(BT, AT);

        for (int i = 0; i < first.length; i++) {
            //  System.out.println(first[i]);
            //System.out.println("process number :"+i);
            if (first[i] != 0) {
                for (int j = 0; j < first.length; j++) {

                    processId[j] = i;
                    //System.out.println(processId[j]);
                }

            }
        }
     System.out.println(sjf.getMinBurstTime(BT,processId));
       /* System.out.println("\t FCFS \n");
         System.out.println("\t BT \t\t AT \t\t WT \t\t  RT \t\t TT \n");
         for(int i=0;i<BT.length;i++){
         System.out.printf("\t %s \t\t %s \t\t %s \t\t %s \t\t %s",BT[i],AT[i],WT[i],WT[i],(WT[i]+BT[i]));
         System.out.println("\n");
            
         }*/
    }
}

public class SJFscheduling extends GetInputs {

    public int getMinBurstTime(int[] a, int[] processID) {
        for (int i = 0; i < processID.length; i++) {
            System.out.println(processID[i]);
        }
        System.out.println("**********************");
        int minBurstTime = a[1];
        for (int i = 2; i < a.length; i++) {
            if (minBurstTime > a[i]) {
                minBurstTime = a[i];
            }
        }
        return minBurstTime;
    }

    public int[] cheackMinNextJob(int[] b, int[] c) {
        int[] jobArrivalInFirstProcessTime = new int[4];
        int[] jobNotArrivalInTheFirstProcessTime = new int[4];
        int firstProcessBT = b[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i] < firstProcessBT) {
                jobArrivalInFirstProcessTime[i] = c[i];
            } else {
                jobNotArrivalInTheFirstProcessTime[i] = c[i];
            }
        }

        return jobArrivalInFirstProcessTime;


    }
}
