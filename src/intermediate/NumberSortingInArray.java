package intermediate;

public class NumberSortingInArray {
    public static void main(String[] args){
        int arr[] = new int[]{9, 5, 7, 3,2,99};
     System.out.println("sorted  array in ascending order:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
            System.err.print(arr[i]+" | ");
        }   
}

}