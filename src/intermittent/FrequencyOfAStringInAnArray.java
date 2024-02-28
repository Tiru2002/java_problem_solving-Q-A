package Basic;

public class FrequencyOfAStringInAnArray {

	public static void main(String[] args) {
		String srt="hello,world!";
		char ch []=srt.toCharArray();
		for(int i=0;i<=ch.length;i++) {
			if(ch[i]!=0) {
				System.out.println( i +"-"+(char)ch[i]);
			}
		}

	}

}
