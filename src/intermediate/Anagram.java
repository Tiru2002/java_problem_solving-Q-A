package intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first string:");
    String str1 =sc.nextLine();
    System.out.println("Enter the second string:");
    String str2 =sc.nextLine();
   str1= str1.replace(" ","");
    str2= str2.replace(" ", "");
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    Boolean r=Arrays.equals(ch1,ch2);
    if(r==true){
        System.out.println(str1+ " and "+ str2 +" are anagrams.");}
    else{
        System.out.println(str1+" and "+ str2 +" are not anagrams.");}
        sc.close();
    }
}   


