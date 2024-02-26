package intermittent;
// Q12.program for to transpose a matrix

import java.util.Scanner;
public class Q12 {

    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int res [][]= new int [3] [3];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array 3*3 : ");

      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
               a[i][j]=sc.nextInt();
        
         }
      }
 
      //check 
      System.out.println("input :");
      for(int i=0; i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
      }

        //transpose of the matrix
         

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                res[j][i] = a[i][j];
            }
        }

        System.out.println("Transposed Matrix:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i] [j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
