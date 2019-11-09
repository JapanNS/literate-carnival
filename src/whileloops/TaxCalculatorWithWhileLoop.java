package whileloops;

import java.util.Scanner;

public class TaxCalculatorWithWhileLoop {


        public static void main(String[] args) {

            int count =0;
            boolean runAgain = true;
            while (runAgain) {
                Scanner in = new Scanner(System.in);
                System.out.println("What is your annual salary?");
                int salary = in.nextInt();
                System.out.println("Are you married? ");
                boolean status = in.nextBoolean();
                double taxToBePaid = calculateTax(salary, status);
                printMyFederalTaxInfo(taxToBePaid);

                System.out.println("Would you like to run another tax calculation?");
                runAgain = in.nextBoolean();

                }
            }

        public static double calculateTax(int salary, boolean isMarried) {
            if (!isMarried) {
                return calculateTaxForSingle(salary);
            } else {
                return calculateTaxForMarried(salary);
            }
        }
        public static void printMyFederalTaxInfo(double tax) {
            System.out.println("Your Federal Tax Total: " + tax);
        }
        public static double calculateTaxForSingle(int salary) {
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
        }
        public static double calculateTaxForMarried(int salary) {
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

