public class Student {

    //Private fields:
    private double gpa;
    private int creditHrs;
    private String fname;
    private String lname;

    //Constructur, assigns all private fields:
    public Student(double gpa, int creditHrs, String fname, String lname) {
        this.gpa = gpa;
        this.creditHrs = creditHrs;
        this.fname = fname;
        this.lname = lname;
    }

    //Getter methods:
    public double getGpa() {return this.gpa;}
    public int getCreditHrs() {return this.creditHrs;}
    public String getName() {return this.lname + ", " + this.fname;}

    //Tostring method:
    public String toString() {
        System.out.println("Student Name: " + getName());
        System.out.println("GPA: " + getGpa());
        System.out.println("Credit Hours Earned: " + getCreditHrs());
        return getName();
    }
}