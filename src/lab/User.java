package lab;

public class User {
    static String name;
    static String accountNo;
    static String ifsc_code;
     float balance;
     boolean loanTaken;
    public User(String username, String userAcNo, String ifscCode, float userAcBal, boolean loan){
        name = username;
        accountNo = userAcNo;
        ifsc_code = ifscCode;
        balance = userAcBal;
        loanTaken = loan;

    }





    public  void printDetails() {
        if (loanTaken=true){
            int roi = 13;
            Borrower borrower = new Borrower(name,accountNo,ifsc_code,balance,loanTaken,356780,56000,roi);
            System.out.println("The name of the customer " + name + "\nAccount number of the customer -" + accountNo + "\nIFSC code -" + ifsc_code +
                    "\nAccount balance -" + balance);
            borrower.printLoanDetails();
        }
        else {
            System.out.println("The name of the customer " + name + "\nAccount number of the customer -" + accountNo + "\nIFSC code -" + ifsc_code +
                    "\nAccount balance -" + balance);
        }
    }

    public  void deposit(float amount){
        float updatedBalance = balance+amount;
        balance=updatedBalance;
        System.out.println("Amount added your new balance is "+ balance);
    }

    public void withdraw(float amount){
        float updatedBalance = balance-amount;
        balance=updatedBalance;
        System.out.println("Amount withdrawn your new balance is "+ balance);
    }

}