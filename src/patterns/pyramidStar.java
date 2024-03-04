package patterns;

public class pyramidStar {

    public static void main(String[] args) {
        int n = 5; 
        int i,j,K;
        for(i=1;i<=n;i++){
            for( K=1;K<=n-i;K++){
              System.out.print(" ");
            }
            for( j=1;j<=i;j++){
                System.out.print(" *");
            }
             System.err.println();
        }
    }
    
}
