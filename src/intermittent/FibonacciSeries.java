package Basic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		sc.close();
		int a=0,b=1;
		
		for(int i=1;i<=num;i++) {
			System.out.print(a+" ");
			int sum=a+b;
			a=b;
			b=sum;

	}

	}	
}
