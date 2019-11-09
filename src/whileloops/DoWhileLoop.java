package whileloops;


import java.util.Scanner;

//how much you contribute
//the percentage of the interest
//we should get number of years required to double the amount
public class DoWhileLoop {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter contribution amount");
        double contribution = in.nextDouble();
        System.out.println("Please enter interest rate");
        int interest = in.nextInt();

        int year = yearRequired(contribution, interest);
        System.out.println("In " + year + "  you will double your $" + contribution + " contribution");

        System.out.println("Enter your loan amount");
        double loanAmount = in.nextDouble();
        System.out.println("Enter your min monthly payment");
        double miniMonPayment = in.nextDouble();
        System.out.println("Enter num of no interest rate months");
        int noInterestMonth = in.nextInt();
        System.out.println("Enter late Fee amount");
        double lateFee = in.nextDouble();
        System.out.println("Enter interest rate");
        int interestRate = in.nextInt();

        loanProgram(loanAmount, miniMonPayment, noInterestMonth, lateFee, interestRate);


    }

    public static int yearRequired(double contributionAmount, int interestRate) {

        double balance = contributionAmount;
        int year = 0;
        while (balance <= contributionAmount * 2) {
            balance = (balance * interestRate / 100) + balance;
            year++;

        }
        return year;
    }

    //you are taking 10000 (dynamic )loan, minumum payment is 500 (dynamic ) monthly.
    // late fee (dynamic )
    // if paid in 10 (dynamic ) months you don't get charged for interest
    // after 10 months every month you will have to pay n% of the balance

    public static void loanProgram(double loanAmount, double minimumPaymentRequired, int numOfNoInterestMonths, double lateFeeAmount, int interestRate) {

        double balance = loanAmount;

        int monthNum = 1;
        while (balance >= 0) {

            System.out.println("Your balance amount: " + balance);
            System.out.println("This is your " + monthNum + " payment. How much you want to pay? ");
            Scanner in = new Scanner(System.in);
            double payment = in.nextDouble();
            if (payment < minimumPaymentRequired) {

                balance = balance - payment + lateFeeAmount;
            }
            else {
                balance = balance - payment;
            }
            if (monthNum <= numOfNoInterestMonths){
                balance = balance - payment;

            }
            else {
                balance = (balance- payment)+ balance * interestRate/100;
            }

            monthNum++;
        }

        System.out.println("Loan is paid off... ");


    }
}
