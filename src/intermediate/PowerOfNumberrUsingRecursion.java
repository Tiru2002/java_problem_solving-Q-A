package intermediate;

public class PowerOfNumberrUsingRecursion {

    public static int power(int base, int powerr){
        if(powerr!=0){
             return base*power(base,powerr-1);
        } else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int base=4 ,powerr=4;
        int result=power(base, powerr);
        System.out.println("The value of "+base+" raised to the power "+powerr+ " is :"+result);


    }
    
}
