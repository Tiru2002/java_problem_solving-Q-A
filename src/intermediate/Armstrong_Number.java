package intermediate;
import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Entre a number :" );
	 int num=sc.nextInt();
	 int temp=num,sum=0,last,digit=0;

	 while (temp!=0) {
		temp/=10;
		digit++;
		
	 }
	 System.out.println(digit);
	 temp=num;
	 while(temp!=0){
		last=temp%10;
		sum=sum+(int) Math.pow(last,digit);
		temp/=10;
	 }

	 if(sum==num) {
		 System.out.println(num+" is a armStrong number");
	 }
	 else {
		 System.out.println(num+" is not a armStrong number");
		 
	 }
	 sc.close();

	}

}
