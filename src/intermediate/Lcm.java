package intermediate;

import java.util.Scanner;

public class Lcm{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;

            }
        }
        int r=a*b/gcd;
        System.out.println( a +" and "+b+" LCM is: "+r);
        sc.close();
    }
}
