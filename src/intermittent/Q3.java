package intermittent;
//Q4. Write a program to swap two numbers
import  java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the first number: ");
        int A=sc.nextInt();
        System.out.println("Enter the the Second number: ");
        int B=sc.nextInt();
         int temp;
         System.out.println("Before swapping: \n"+A+"\t "+(B));
         
         temp=A;
         A=B;
         B=temp;
         System.out.println("After Swapping: \n"+A+"\t"+(B));

         sc.close();
    }
    
}
