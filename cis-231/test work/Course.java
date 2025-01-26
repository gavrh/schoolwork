import java.util.Scanner;
import java.util.ArrayList;

public class Course {

    String name;
    String dept;
    int number;

    public Course(String n, String d, int num) {
        name = n;
        dept = d;
        number = num;
    }

    public String toString() {
        return "Course " + name + " in " + dept + " #: " + number;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<Course>();

        String line;
        for (int i = 0; i < 10; i++) {
            line = in.nextLine();

            String[] inputs = line.split(" ", 3);
            String name = inputs[0];
            String dept = inputs[1];
            int number = Integer.parseInt(inputs[2]);

            Course newCourse = new Course(name, dept, number);
            courses.add(newCourse);
        }

        in.close();

        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%s\n", courses.get(i).toString());
        }

    }

}
