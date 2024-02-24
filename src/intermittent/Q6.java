package intermittent;

//Q9. Write a program to find the whether a number is perfect number or not 

import java.util.Scanner;
public class Q6 {
    
 public void check(int n) {
    int sum=0;
    for(int i=1;i<n;i++) {
        if(n%i==0){
            sum+=i;
            System.out.println(sum);
        }
    }
     if(n==sum)
         System.out.println(" number"+n+" is a perfect number");
     else  
         System.out.println("number "+n +" is not a perfect number"); 
     
}

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num =sc.nextInt();
    Q6 q = new Q6();
    q.check(num);
    sc.close();
}
}

