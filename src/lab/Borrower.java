package lab;

public class Borrower extends User {
    int loanNo;
    float loanAmount;
    float rateOfInterest;

    public void printLoanDetails() {
        System.out.println("The customer has taken loan from the bank\n Here are the loan details:");
        System.out.println("Loan number - "+loanNo+"\nLoan Amount - "+loanAmount+"\nInterest rate - "+rateOfInterest);

    }

    public Borrower(String username, String userAcNo, String ifscCode, float userAcBal,boolean loan, int lno, float lamt, float roi) {
        super(username, userAcNo, ifscCode, userAcBal, loan);
        loanNo = lno;
        loanAmount = lamt;
        rateOfInterest = roi;

    }
}
