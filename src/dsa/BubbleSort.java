package dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5};
    for(int i=0;i<=arr.length;i++){
        for(int j=i+1;j<=arr.length-1;j++){
            if(arr[i]>arr[j]){
              int  temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
          
            }
            System.out.println(arr[i]);
        }
    }
    }
    


