package Basics;
//find a factorial of a number
import java.util.Scanner;
public class Q9 {
    // method 2
    // static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }else{
    //        return n*fact(n-1);
    //     }
        
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++){
            //fact=fact*i;
            fact*=i;
        }
        System.out.println("The Factorial "+num+" is :"+fact);
        sc.close();
    //    int f=fact(num);
    //    System.out.println(f);
    }
}
