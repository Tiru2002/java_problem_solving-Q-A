package intermittent;
// find fibonacci series of number n
public class Q7 {

    public static void main(String[] args) {
        int n = 10, a=0, b=1;
        System.out.print("Fibonacci Series up to " + n+" ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int sum = a+b;
            a = b;
            b = sum;
        }
     if(n <= 0){
        System.out.println("\nPlease enter a positive integer.");
     
}           

    }
}


    

