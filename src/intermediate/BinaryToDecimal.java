package intermediate;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Binary number");
        int Binary=sc.nextInt();
        sc.close();
        int decimal=0,base=1,rem;
        while (Binary!=0) {
            rem=Binary%10;
            decimal+=base*rem;
            base*=2;
            Binary/=10;
            
        }
        System.out.println(decimal);


    }
    
}
