package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num;
        //insert your code here

        while (num < maxNum)
        {
         i=2;
         count=0;
         while (i <= num/2)
         {
           if (num % i == 0)
           {
             count++;
             break;
           }
           i++;
         }
         if (count == 0 && num!=1)
         {
           sum = sum+num;
         }
         num++;
        }
        return sum;
    }
} 
