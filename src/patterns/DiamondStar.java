package patterns;

public class DiamondStar {

    public static void main(String[] args) {
        int n = 5; // size of
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1;i<=n-1;i++){
            for(int k=1;k<=i;k++){
                System.out.print( " " );
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
