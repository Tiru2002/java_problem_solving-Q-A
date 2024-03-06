package dsa;

public class SequentialSearch {
    
    /**
     * @param arr
     * @param target
     */
    public static void squ(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                    System.out.println(target+" index is :"+ i);
            }
        }
    }
        public static void main(String[] args) {
            int arr[]={1,2,3,66,77,88,22,6};
            int target=77;
            squ(arr,target);
            }

    }

