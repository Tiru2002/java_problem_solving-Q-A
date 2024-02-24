package Basics;
//check a number is prime or not

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {

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
            }
          }
          if(f==0){
            System.out.println(n+"  is a prime number");
          }
          else{
<<<<<<< HEAD
            System.out.println(n + " is not a prime number");
=======
            System.err.println(n + "is not a prime number");
>>>>>>> 6d5a0c1996449e99df6d7672303c34ca9a43ce8b
          }
       sc.close();
    }}
