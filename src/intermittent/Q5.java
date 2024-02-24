package intermittent;

//Q6.To check the number is armstrong number or not 
import java.util.Scanner;

public class Q5{
public static void main(String[] args) {
    int num=153;
    int sum=0;
    int digit1=num/100;
    int digit2=num%100/10;
    int digit3=num%10;
    sum=digit1+digit2+digit3;
    if(num==sum){
        System.out.println(num+  " is an Armstrong number");
    }else{
        System.out.println(num + " is not an Armstrong number");
    }

}

}
