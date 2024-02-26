package intermittent;
//Q9. Write a program to find the largest number in array
public class Q9 {

    static void check(int arr[]) {
       
        int max = arr[0];
        int n = arr.length;

        for (int i=1; i<n; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println("The largest number is " + max);
    }

    public static void main(String[] args) {
        int arr[] = {23, 78, 45, 12, 65};
        check(arr);
    }
}
