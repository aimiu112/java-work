import java.util.Scanner;

public class Exercise07_01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
    System.out.print("Enter number of students: ");
    int numberOfStudents = input.nextInt();

    double[] scores = new double[numberOfStudents]; 
    double best = 0; 

    
    System.out.print("Enter " + numberOfStudents + " scores: ");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextDouble();
      
      if (scores[i] > best)
        best = scores[i];
    }

   
    char grade; 
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= best - 10)
        grade = 'A';
      else if (scores[i] >= best - 20)
        grade = 'B';
      else if (scores[i] >= best - 30)
        grade = 'C';
      else if (scores[i] >= best - 40)
        grade = 'D';
      else
        grade = 'F';

      System.out.println("Student " + i + " score is " +
        scores[i] + " and grade is " + grade);
    }
  }
}
