import java.util.ArrayList;
import java.text.DecimalFormat;

public class Lab13 {

    public static class Student {
        
	    private String first;  // first name
	    private String last;   // last name
	    private double gpa;    // grade point average
        
	    // Student class constructor
	    public Student(String f, String l, double g) {
		    first = f;  // first name
		    last = l;   // last name
		    gpa = g;    // grade point average
	    }
        
	    public double getGPA() {
		    return gpa;
	    }
        
	    public String getLast() {
		    return last;
	    }
        
        // Returns a String representation of the Student object, with the GPA formatted to one decimal
	    public String toString() {
		    DecimalFormat fmt = new DecimalFormat("#.0");
		    return first + " " + last + " " + fmt.format(gpa);
	    }
    }

    private ArrayList<Student> roster; // Collection of Student objects

    public Lab13() {
	    roster = new ArrayList<Student>();
	}

	// Drops a student from course by removing student from course roster 
	public void dropStudent(String last) {
        for (int i = 0; i < this.roster.size(); i++) {
            if (this.roster.get(i).getLast().equals(last)) {
                this.roster.remove(i);
                i--;
            }
        }
	}

    public void addStudent(Student s) {
        roster.add(s);
    }
    
    public int countStudents() {
        return roster.size();
    }
    
    // main
    public static void main(String args[]) {
        Lab13 course = new Lab13();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average
        int beforeCount;
        
        first = "Henry";
        last = "Nguyen";
        gpa = 3.5;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student
        
        first = "Brenda";
        last = "Stern";
        gpa = 2.0;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student
        
        first = "Lynda";
        last = "Robison";
        gpa = 3.2;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student
        
        first = "Sonya";
        last = "King";
        gpa = 3.9;
        course.addStudent(new Student(first, last, gpa));  // Add 4th student
        
        beforeCount = course.countStudents();  // Number of students before dropping any students
        last = "Stern";
        course.dropStudent(last); // Should drop Brenda Stern
        
        System.out.println("Course size: " + beforeCount + " students");     // Should output 4
        System.out.println("Course size after drop: " + course.countStudents() + " students");     // Should output 3
    }    
}
