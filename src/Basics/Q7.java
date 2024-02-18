package Basics;

//Q7. Calculate simple interest

import java.util.Scanner;

public class Q7 {

    public void simpleInterest(float p,float r, float t) {
        double SI=((p*r*t)/1100);
        System.out.println("The Simple Interest is : "+SI);
    }

    public static void main(String[]args){
        System.out.println("Enter the Principle Amount");
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        System.out.println("Enter the Rate of Interest");
        float r=sc.nextFloat();
        System.out.println("Enter the Time Period");
        int t=sc.nextInt();
        Q7 q7obj = new Q7();
        q7obj.simpleInterest(p,r,t);
        sc.close();
    }
}

