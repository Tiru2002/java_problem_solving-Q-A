package Basics;
//check a number is prime or not

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println(num+"is not a prime");
        }
       else{
            for(int i=2;i<=num;){
                if(num%i==0){
                    System.out.println(num + "is a not  Prime number");
                    break;
                }
               else{
                   System.out.println(num + "is a Prime number");
                   break;
                }
            }
      
        }
        sc.close();
    }
}
