package intermittent;
<<<<<<< HEAD
//Q1.write a program to reverse a number
=======
//write a program to reverse a number
>>>>>>> 6d5a0c1996449e99df6d7672303c34ca9a43ce8b
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
