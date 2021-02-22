package lab;

import java.util.Scanner;

public class Student implements methods {
    String studentName;
    int rollNo;
    String courseName;
    int semester;
    double total;
    static final double grandTotal = 500;

    public Student(String name, int roll_no, String course, int sem){
        studentName=name;
        rollNo=roll_no;
        courseName=course;
        semester=sem;
    }

    @Override
    public double calcPercent(double marksObtained) {
        System.out.println("Enter the marks obtained by the user");
        Scanner input = new Scanner(System.in);
        marksObtained = input.nextDouble();
        total=marksObtained;
        double pcent = total/grandTotal * 100;
        return pcent;
    }



    @Override
    public void showResult() {
        double result = calcPercent(total);
        System.out.println(result+"%");
    }
}
