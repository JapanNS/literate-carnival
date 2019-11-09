import java.util.Scanner;

public class SumProductMinMax {

   /* Write a program calledSumProductMinMax3that prompts user for three integers. The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results.
    For examples,
    Enter 1st integer: 8
    Enter 2nd integer: 2 //enterYourData()
    Enter 3rd integer: 9
    The sum is: 19//sum(a,b,c);
    The product is: 144//product(a,b,c);
    The min is: 2//min(a,b,c)
    The max is: 9//min(a,b,c)

    */

    public static int num1, num2, num3;
    public static int sum, product, min, max;

    //public means- acces modifier
    public static void main(String[] args) {


        // create Scanner object
        Scanner input = new Scanner(System.in);

        //print out and put the text
        System.out.println("Please enter the first number");
        num1 = input.nextInt();


        System.out.println("Please enter the second number");

        num2 = input.nextInt();

        System.out.println("Please enter the third number");

        num3 = input.nextInt();
        sum(); // static method sum () that we are calling
        product();
        max();
        min();
    }

        //custom method that we created to find summary of numbers
        public static void sum () {

            sum = num1 + num2 + num3;
            System.out.println("The sum is: " + sum);

        }


        // custom method that multiplis to find product of numbers
        public static void product () {

            product = num1 * num2 * num3;
            System.out.println("The sum is: " + product);
        }

            // custom method that find max number

            public static void max () {
                max = num1;
                if (num1 > max)
                    max = num1;
                if (num2 > max)
                    max = num2;
                if (num3> max)
                    max = num3;
                System.out.println("The max is: " + max);
            }public static void min () {
            min = num1;
            if (num1 < min)
                min = num1;
            if (num2 < min)
                min = num2;
            if (num3 < min)
                min = num3;
            System.out.println("The min is: " + min);

        }

    }


