package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        sc.close();
        int f=0;
        if(num<=1) {
        	System.out.println(num+" is not a prime number");
        }
        for(int i=2;i<num;i++) {
        	if(num%i==0) {
        		f++;
        	}
        }
         if(f==0) {
        	 System.out.println(num+" is a prime number");
         }else {
        	 System.out.println(num+" is not a prime number");
         
        }
        
     
        	
        
	}

}
