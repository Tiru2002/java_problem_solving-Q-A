package Basic;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		int arr[]= {1,4,5,100,200,6,9,3,88,99,201,777,999};
		int high=0,sec=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(high<arr[i]) {
				sec=high;
				high=arr[i];
					
			}
		}
		System.out.println("Second largest Number in the Array :"+sec);
		   
		

	}

}
