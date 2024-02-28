package intermediate;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.nextLine();
		sc.close();
		char ch[] =str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println(rev);
		if(str.matches(rev)) { 
			System.out.println(str +" is palindrome");
		}
		else {
			System.out.println(str +" is not a palindrome");
		}
	}

}
