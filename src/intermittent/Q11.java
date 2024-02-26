
package intermittent;
// Q11.soring n numbers

import java.util.Scanner;
public class Q11 {
   static  void Sorting(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            
            }
            System.out.print(arr[i]+"|");
        }
       
     }
    public static void main(String[] args) {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter " + size + " integers separated by space : ");
        for (int i=0 ;i<size ; i++)  {
            a[i] = sc.nextInt(); 
        }
        System.out.print(" before sorting : ");
        for(int i=0 ; i<a.length; i++ ) {
          System.err.print(a[i] +"  |");
        }
        System.out.print("\n after sorting : ");
        Sorting(a);
      sc.close();
    }
}
