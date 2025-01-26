import java.util.ArrayList;
import java.text.DecimalFormat;

// Class representing a student
public class Lab11 {
	
    public static class Student {

	    private String first;  // first name
	    private String last;   // last name
	    private double gpa;    // grade point average
        
	    // Student class constructor
	    public Student(String first, String last, double gpa) {
		    this.first = first; // first name
		    this.last = last;   // last name
		    this.gpa = gpa;     // grade point average
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
		    return first + " " + last + " " + "(GPA: " + fmt.format(gpa) + ")";
	    }
    }

    private ArrayList<Student> roster; // Collection of Student objects

	public Lab11() {
		roster = new ArrayList<Student>();
	}

    // Output each student in the course roster, and then the total size of the course
    public void printRoster() {
        for (int i = 0; i < this.roster.size(); i++) {
            System.out.println(this.roster.get(i).toString());
        } System.out.printf("Students: %d\n", this.roster.size());
    }
    
    public void addStudent(Student s) {
        roster.add(s);
    }
    
    // main
    public static void main(String args[]) {
        Lab11 course = new Lab11();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average
        
        first = "Henry";
        last = "Cabot";
        gpa = 3.5;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student
        
        first = "Brenda";
        last = "Stern";
        gpa = 2.0;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student
        
        first = "Jane";
        last = "Flynn";
        gpa = 3.9;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student
        
        first = "Lynda";
        last = "Robison";
        gpa = 3.2;
        course.addStudent(new Student(first, last, gpa));  // Add 4th student
        
        course.printRoster();
    }    
}
