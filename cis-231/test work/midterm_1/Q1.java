public class Q1 {

    // course class
    public static class Course {

        private String dept;
        private int number;
        private double units;

        // 3 param constructor
        public Course(String dept, int number, double units) {
            this.dept = dept;
            this.number = number;
            this.units = units;
        }

        // dept accessor
        public String getDept() {
            return dept;
        }
        // units accessor
        public double getUnits() {
            return units;
        }
        // units mutator
        public void mutUnits(double units) {
            this.units = units;
        }

        // to string method
        public String toString() {
            return "Dept: " + dept + ", Number: " + number + ", Units: " + units;
        }

    }

    public static void main(String[] args) {

        Course c = new Course("CIS", 231, 4.4);

        System.out.printf("%s %f\n", c.getDept(), c.getUnits());
        c.mutUnits(5.5);
        System.out.println(c.toString());

    }
}