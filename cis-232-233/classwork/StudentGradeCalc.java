import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        Student stud = new Student(scnr);
        scnr.close();
        
        System.out.printf("Student Grade: %c\n", stud.grade());
        
    }
}

class Student {
    String name;
    int score;
    
    public Student(Scanner scnr) {
        System.out.print("Enter student's name: ");
        this.name = scnr.nextLine();
        System.out.print("Enter student's score: ");
        this.score = scnr.nextInt();
    }
    
    public char grade() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}