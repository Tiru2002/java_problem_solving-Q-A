package intermediate;

public class GCD {
    public static void main(String[] args) {
        int a=20,b=22;
        int Gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                Gcd=i;
            }
        }

    System.out.println(a+" and "+b+" GCD is: "+ Gcd);
    }
}
