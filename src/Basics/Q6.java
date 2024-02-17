package Basics;
/* Q6.Enhance above to calculate average marks of  student. Then find the grade and show. Grade details given below.
 >= 90% Grade A
 >=70% and <90% Grade B
 >=60% and <70% Grade C
 < 60% Grade D */

public class Q6 {
    public void average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        
        if (avg >= 90) System.out.println("Grade A");
        else if (avg >= 70) System.out.println("Grade B");
        else if (avg >= 60) System.out.println("Grade C");
        else System.out.println("Grade D");
    }
    
    public  static void main(String[] args) {
        Q6 q6 = new Q6();
        int[] scores1 = {85, 92, 78,69,68,74}; 
        q6.average(scores1);
     
    }
}

