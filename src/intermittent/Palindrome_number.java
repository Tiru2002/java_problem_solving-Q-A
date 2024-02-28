package Basic;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int num=sc.nextInt();
    sc.close();
    int temp=num;
    int rev=0,rem;
    
    while(temp!=0) {
    	rem=temp%10;
    	rev=rev*10+rem;
    	temp/=10;
    }
    if(num==rev) {
    	System.out.println(num +" is a palindrom");
    }else {
    	System.out.println(num +" is not a palindrom");
    }
   
    
	}

}
