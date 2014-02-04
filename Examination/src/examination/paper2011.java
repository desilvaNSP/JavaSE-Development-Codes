/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

/**
 *
 * @author Sandun Priyanka
 */
public class paper2011 {

    public float findAverage(int a, int b, int c) {
        float Avg;
        Avg = (a + b + c) / 3;
        return Avg;
    }

    public String cheackSign(double x) {
        String msg;
        double num = x;
        if (num > 0) {
            msg = "Positive";
        } else if (num < 0) {
            msg = "Negative";
        } else {
            msg = "Zero";
        }
        return msg;
    }
public int vowelCount(String word){
    int count = 0;
char[] a= word.toCharArray();
char[] b={'a','e','i','o','u'};
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if(b[j]==a[i]){
            count++;
            }
       }
}
return count;
}
public int sumOfDigits(int a,int b){
int sum;
sum=a+b;
return sum;
}
    public static void main(String[] args) {
        paper2011 p = new paper2011();

        System.out.println(p.findAverage(10, 25, 56));
        System.out.println(p.cheackSign(-50.2));
        System.out.println(p.vowelCount("sandun"));
        System.out.println(p.sumOfDigits(10,20));

    }
}
