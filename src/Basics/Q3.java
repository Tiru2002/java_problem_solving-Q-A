package Basics;

//Q3.Ask user for the age and display if eligible for vote or not
import java.util.Scanner;
public class Q3 {
    public void vote (int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Sorry, you are not eligible to vote yet");
        }

    }
    
    public static void  main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        sc.close();
        Q3 obj = new Q3();
        obj.vote(age);

}
}