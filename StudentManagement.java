package OopsProject;



class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
//     getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // method to display info
    public void DisplayStudentInfo() {
        System.out.println("name  :" + name);
        System.out.println("rollNumber:" + rollNumber);
        System.out.println("marks:" + marks);
        // System.out.println("Grade :" + calculateGrade());
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Student obj = new Student("durgesh",78,90.00);
        Student obj1 = new Student("vijay",34,67.23);
        Student obj2= new Student("kundan",2,67);
//        display Student information
        System.out.println("Student 1 information:");
        obj.DisplayStudentInfo();
        System.out.println("-----------");
        System.out.println("Student 2 information");
        obj1.DisplayStudentInfo();
        System.out.println("-----------");
        System.out.println("Student 3 information");
        obj2.DisplayStudentInfo();
        System.out.println("---------");


    }
}
