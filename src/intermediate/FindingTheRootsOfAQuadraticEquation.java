package intermediate;

import java.util.Scanner;

public class FindingTheRootsOfAQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of  a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c =sc.nextDouble();
        sc.close();
        double d= b*b-(4*a*c);
        double r1,r2;
        //real and equal
        if(d==0){
            r1=r2=-b/2*a;
        System.out.println("The roots are real and equal \n R1="+r1+"\t R2="+r2);
        }
        else if(d>0){
            r1=r2=-b+Math.sqrt(d)/2*a;
            System.out.println("The roots are real and distinct \n R1="+r1+"\t R2="+r2);
        }
        //d<0
        else{
            //r1=x+iy r2=x-iy
            double x=-b/2*a;
            double y=Math.sqrt(-d)/2*a;
            System.out.println("The roots are distinct  and imaginary \n R1="+x+"+i"+y +"\tR2="+x+"-i"+y);
        }
        }
    }
    

