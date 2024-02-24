package intermittent;

import java.util.Scanner;

//Q2.check whether the number is palindrome are not
public class Q2 {
    static int Check(int n) {
        int reversed_n=0;
        while (n > 0) {
            reversed_n=reversed_n*10 + n % 10;

              n = n / 10;
    }
       return reversed_n;
  

}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num=sc.nextInt();
     int reversed_n=  Check(num);
     if (reversed_n == num){
        System.out.println(num+" is a Palindrome Number");
    }else{
        System.out.println(num+" is NOT a Palindrome Number");
    }
      sc.close();
    }
}
    

