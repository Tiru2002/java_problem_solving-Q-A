package Basic;

import java.util.Scanner;

public class FactorialoOfANumber {
	 // with  out recursion
	public int factorial(int n) {
		if(n==0||n==1)
			return 1;
		return n* factorial(n-1);
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        sc.close();
        int sum=1;
  //without recursion
       for(int i=1;i<=num;i++) {
        	sum=sum*i;
     	
       }
       System.out.println(num+" without recursion :"+sum);
	
        
	FactorialoOfANumber f=new FactorialoOfANumber();
	 System.out.println(num+" without recursion :"+f.factorial(num));
	
	   
        
        
	}
	}

