public class Student {

    // instance variables
    private int ID;
    private String name;
    private double GPA;

    // answer to "a"
    public Student(int Id, String Name, double Gpa) {
        ID = Id;
        name = Name;
        GPA = Gpa;
    }
    public Student() {
        ID = -1;
        name = "No name assigned";
        GPA = -1.0;
    }

    // answer to "b"
    public String getName() {
        return name;
    }

    // answer to "c"
    public void setGPA(double newGPA) {
        GPA = newGPA;
    }

    // answer to "d"
    public String toString() {
        return ID + " | " + name + " | " + GPA;
    }

    // answer to "e"
    public boolean equals(Student otherStudent) {
        if (
            ID == otherStudent.ID
            && name.compareTo(otherStudent.name) == 0
            && GPA == otherStudent.GPA
        ) {
            return true;
        } else return false;
    }

}
