package intermediate;

public class FrequencyOfAStringInAnArray {

	public static void main(String[] args) {
		int a[]={1,2,3,1,3,4,1,4,3,5,3};
		int freq[]=new int [a.length];
		int v=-1;
		for(int i=0;i<a.length;i++){
			int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
					freq[j]=v;
				}
			}
			if(i!=v){
				freq[i]=count;
			}

		}

		for(int i=0;i<freq.length;i++){
			if(freq[i]!=v){
			System.out.println(a[i]+" "+freq[i]);
		}
	}
	}

}
