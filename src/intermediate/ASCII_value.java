package intermediate;

import java.util.Scanner;

public class ASCII_value {
public static void main(String[] args) {
    

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a character:");
    char ch=sc.next().charAt(0);
    int asciiValue= (int)ch;
    System.out.println(ch+ " =  "+asciiValue);


}
    
}
