package intermittent;
//Q1.write a program to reverse a number

public class Q1 {

    public static void main(String[] args) {
        int num = 1234567890;
        System.out.println("Original Number : " + num);
        int rev=0;
        int rem;
        while (num!=0) {
            rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        System.out.println("\nReversed Number : " + rev);
    }
    
}
