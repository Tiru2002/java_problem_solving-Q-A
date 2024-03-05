package Oops.inheritance;

public class Programmer extends Employee {
    
    int bouns=1000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println(p.bouns+p.salary);

    }
}
