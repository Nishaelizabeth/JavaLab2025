import java.util.Scanner;

public class Student {
    private String name;
    private int marks;

    Student(String name) {
        this.name = name;
        marks = 0;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Mark: " + marks);
        System.out.println("Student Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = input.next();

        System.out.print("Enter the student's mark: ");
        int marks = input.nextInt();

        Student s = new Student(name, marks);

        s.displayResults();

        input.close();
    }
}
