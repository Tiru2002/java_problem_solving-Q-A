package intermediate;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<num;i++) {
			
			if(num%i==0) {
				sum+=i;
			}
		}
		 if(num==sum) {
			 System.out.println(num +" is a perfect number");
		 }else {
			 System.out.println(num +" is not a perfect number");
		 }
		
	}

}
