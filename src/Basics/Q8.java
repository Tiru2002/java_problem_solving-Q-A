package Basics;

//Q8.Convert USD to INR

import java.util.Scanner;
public class Q8 {
    
    public void  convertUSDtoINR(double USD) {
        double INR = USD * 82.098;
        System.out.println(USD+"$  is equal to "+INR+ "RS INR");
}
    public static void main(String[] args) {
        Q8 q8 = new Q8();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in USD $ : ");
        double usd = sc.nextDouble();
        q8.convertUSDtoINR(usd);
        sc.close();
    }
}
