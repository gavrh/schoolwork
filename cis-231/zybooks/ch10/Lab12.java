import java.util.ArrayList;
import java.text.DecimalFormat;

public class Lab12 {

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
		return first + " " + last + " (GPA: " + fmt.format(gpa) + ")";
	}
}
    
	private ArrayList<Student> roster; // Collection of Student objects
    
	public Lab12() {
		roster = new ArrayList<Student>();
	}
    
    // Return an ArrayList of all Students with a GPA of at least 3.5
	public ArrayList<Student> getDeansList() {
        ArrayList<Student> deanList = new ArrayList<Student>();
        for (int i = 0; i < this.roster.size(); i++) {
            if (this.roster.get(i).getGPA() >= 3.5) {
                deanList.add(this.roster.get(i));
            }
        }
        return deanList;
	}
    
	public void addStudent(Student s) {
		roster.add(s);
	}
    
    // main
    public static void main(String args[]) {
        Lab12 course = new Lab12();
        ArrayList<Student> deanList = new ArrayList<Student>();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average
        
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
        deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Student student: deanList) {
            System.out.println(student);     // Expect: ArrayList with Henry and Sonya
        }
    }    
}
