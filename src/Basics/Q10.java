package Basics;
//check a number is prime or not

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println(num+"is not a prime");
        }
       else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num + "is a not  Prime number");
                    break;
                }
               else{
                   System.out.println(num + "is a Prime number");
                   break;
                }
=======

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n=sc.nextInt();
          int f=0;
          if(n<=1){
            System.out.println("The number is not prime");
          }
          for(int i=2;i<n;i++){
            if(n%i==0){
                f++;
>>>>>>> 6d5a0c1 (changes)
            }
          }
          if(f==0){
            System.out.println(n+"  is a prime number");
          }
          else{
            System.err.println(n + "is not a prime number");
          }
       sc.close();
    }}
