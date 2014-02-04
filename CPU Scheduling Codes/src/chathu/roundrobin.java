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
public class roundrobin {

    int[] temp, wait, resp, outputwait;
    int commBT, pcount;
    int k, tq;
    int[][] d, ar, btLeastThantq;
    int btcache;
    int outputresponse;
    int waitTime;

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no. of process = ");
        pcount = s.nextInt();
        d = new int[pcount][2];
        ar = new int[pcount][2];

        temp = new int[pcount]; // create pcount size array 
        wait = new int[pcount]; // create array for wait
        resp = new int[pcount]; // create array for response

        for (int i = 0; i < pcount; i++) {
            System.out.print("enter BT for process "+i+" = ");
            d[i][0] = i;
            ar[i][0] = i;
            int m = s.nextInt();
            d[i][1] = m;
            System.out.print("enter AT for Process "+i+" = ");
            int atp = s.nextInt();
            ar[i][1] = atp;

            commBT += m;
        }
        System.out.print("enter TQ = ");
        tq = s.nextInt();
       // System.out.println(commBT); /// sum of the burst times of all process
        System.out.println("****************************************");
        responsing();
        System.out.println("****************************************");
        //waiting();
        System.out.println("****************************************");
        start();
        display();
        System.out.println("****************************************");

    }

    void waiting() {
        a:
        for (int i = 0; i < d.length; i++) {
            outputwait[i] = 0;

            for (int j = 0; j < d.length; j++) {
                if (d[i][1] > tq) {
                    waitTime = 0;
                    int restburstTime = d[j][1];
                    waitTime = +tq;
                    d[j][1] = d[j][1] % tq;

                } else {
                }
            }
            outputwait[i] = +waitTime;

        }
        for (int i = 0; i < d.length; i++) {

            System.out.println("waiting Time of process " + i + " is " + outputwait[i]);

        }
    }

    void responsing() {
        float resval = 0;

        outputresponse = resp[0];
        for (int i = 0; i < d.length - 1; i++) {
            resp[0] = ar[0][1];
            if (d[i][1] > tq) {  //process ekaka burst time eka time quantum ekatawada wedi wenakota
                outputresponse += tq;
                resp[i + 1] = outputresponse - ar[i + 1][1];
            } else {
                outputresponse += d[i][1];  // process ekaka burst time eka time quantum ekata wada adu wenakota
                resp[i + 1] = outputresponse - ar[i + 1][1];
            }
        }
        for (int j = 0; j < d.length; j++) {

            System.out.println("response time of process " + (j + 1) + " is " + resp[j]);
            resval += resp[j];

        }
        System.out.println("Average of response time  = " + resval / pcount);

    }

    void start() {
        for (int i = 0; i < d.length; i++) {
            int bt = d[i][1];
            int at = ar[i][1];
            if (bt > 0) {
                if (bt <= tq) {
                    temp[i] = btcache + bt;
                    btcache = temp[i];
                    temp[i] = temp[i] - at;

                    k += bt;
                    bt -= bt;



                } else {
                    temp[i] = btcache + tq;
                    btcache = temp[i];
                    temp[i] = temp[i] - at;
                    bt -= tq;
                    k += tq;
                }

                d[i][1] = bt;


            }
        }
        if (k != commBT) {
            start();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        roundrobin r = new roundrobin();
        r.getData();
    }

    private void display() {
        float val = 0;
        int c = 1;
        for (int i : temp) {
            System.out.println("Turnarround Time for process " + c + " is " + i);
            val += i;
            c++;
        }
        System.out.println("Average turnArround Time = " + val / temp.length);
    }
}
