package Basics;

// Q5.Calculate Total marks of a student with 5 subjects

public class Q5 {

int subject1=80,subject2=90,subject3=76,subject4=92,subject5=88;
	
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        System.out.println("Total Marks : "+q5.totalMarks()+"/500");
    }

    private int totalMarks() {
        return subject1+subject2+subject3+subject4+subject5;
    
}
}
