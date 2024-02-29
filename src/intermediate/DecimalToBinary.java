package intermediate;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        String ch="";
        while(num!=0){
            int rem=num%2;
            ch=rem+ch;
            num/=211;

        }
        System.out.println(temp+ " in binary :"+ch);
        sc.close();
        
    }
}
