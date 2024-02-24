package intermittent;
//Q5. Swap two nunbers without using a third variable. 
public class Q4 {
     public static void main(String[] args) {
        int A=10, B=20;
        System.out.println("Before swapping: \n"+"A="+A+"\t B="+B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("\nAfter  swapping:\n"+"A="+A+"\t B="+B);
     }
    
}