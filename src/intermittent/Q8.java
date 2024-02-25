package intermittent;
//Q8,adding element to arraylist at specific index.
public class Q8 {
    
    public static void main(String[] args){
        //array  of integers
        int A [] = new int[10];
        System.out.println( "Array A length: "+A.length);
        //adding element to array
        A[1]=5;
        A[0]=6;
        A[3]=7;
        A[9]=2;

    for(int i=0;i<=A.length-1;i++){
        System.out.print(A[i]+" | ");
    }
    // int B[] = new int[]{1,2,3,4,5};
    
    
    }
}
