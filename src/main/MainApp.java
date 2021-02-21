package main;

import lab.User;

public class MainApp  {
    public static void main(String args[]) {
        User user = new User("Aman Rajpal","12345553","12343", (float) 3000.56, true);

        user.printDetails();
        user.deposit(2500);
    }

}

//class Userdet extends User{
//    User user = new User("Aman Rajpal","12345553","12343",3000.56);
//
//    public Userdet(String username, String userAcNo, String ifscCode, Double userAcBal) {
//        super(username, userAcNo, ifscCode, userAcBal);
//        user.printDetails();
//    }
//
//
//        }