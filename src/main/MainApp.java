package main;

import lab.Student;
import lab.User;

public class MainApp  {
    public static void main(String args[]) {
        System.out.println("First program \n");
        User user = new User("Aman Rajpal","12345553","12343", (float) 3000.56, true);

        user.printDetails();
        user.deposit(2500);
        user.withdraw(45);

        System.out.println("Second  program\n");
        Student student = new Student("aman rajpal",23,"BCA",4);
        student.showResult();

    }

}


