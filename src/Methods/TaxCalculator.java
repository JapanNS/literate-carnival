package Methods;

import java.util.Scanner;

public class TaxCalculator {


    //Get annual income from a user
    //Then printout how much they need to pay for federal tax 10%
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your annual salary?");

        int salary = in.nextInt();

        System.out.println("Are you married?");

        boolean status = in.nextBoolean();

        double taxToBePaid = calculateTax(salary, status);
        printMyTaxInfo(taxToBePaid);



    }

    public static double calculateTax(int salary, boolean isMarried){
       if (isMarried) {

           if (salary >= 0 && salary <= 9075) {
               double taxToBePaid = (salary * 10) / 100;
               return taxToBePaid;

           } else if (salary >= 9076 && salary <= 36900) {
               double taxToBePaid = (salary * 15) / 100;
               return taxToBePaid;

           } else if (salary >= 36901 && salary <= 89350) {
               double taxToBePaid = (salary * 25) / 100;
               return taxToBePaid;
           } else {
               double taxToBePaid = (salary * 28) / 100;
               return taxToBePaid;
           }

       }else {
           if (salary >= 0 && salary <= 18150) {
               double taxToBePaid = (salary * 10) / 100;
               return taxToBePaid;

           } else if (salary >= 18151 && salary <= 73800) {
               double taxToBePaid = (salary * 15) / 100;
               return taxToBePaid;

           } else if (salary >= 73801 && salary <= 148850) {
               double taxToBePaid = (salary * 25) / 100;
               return taxToBePaid;
           } else {
               double taxToBePaid = (salary * 28) / 100;
               return taxToBePaid;

           }

       }




    }

    public static void printMyTaxInfo(double tax){
        System.out.println("Your federal tax Total: " + tax);

    }
}
