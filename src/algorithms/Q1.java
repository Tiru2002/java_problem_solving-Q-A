package algorithms;

// Q1.Ask user to enter name and greet him with "Hello"
import java.util.Scanner;


public class Q1 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("\nHello, "+name);
        sc.close();

    } 

    
}
