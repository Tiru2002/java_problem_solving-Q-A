package intermittent;

//Q10. find the second largest element in an array .

public class Q10 {

    public static void main(String[] args) {
        int a[] = {23,14,56,77,66,67,88,100};
        int high = 0;
        int sec = 0;
         for(int i=0;i<a.length;i++){
            if(high<a[i]){
                sec=high;
                high=a[i];
            }else if(sec>a[i]){
                sec=a[i];
            }
            
          
    }    
        System.out.println("the first highest number is " + high);
        System.out.println("the second highest number is " + sec);
    }
}