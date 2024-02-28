package intermediate;

import java.util.Scanner;

public class SmallestOfTHREENumbers {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter  three a number :");
	        int num1=sc.nextInt();
	        int num2=sc.nextInt();
	        int num3=sc.nextInt();
	        System.out.println( num1 +"\t"+ num2+"\t"+num3);
	        sc.close();  
	        
	        if(num1<=num2 && num1<=num3) {
	        	System.out.println(num1 +" is smallest number");
	        }else if(num2<=num1 && num2<=num3) {
	        	System.out.println(num2 +" is smallest number");
	        }else {
	        	System.out.println(num3 +" is smallest number");
	        }
	       

	}

}
