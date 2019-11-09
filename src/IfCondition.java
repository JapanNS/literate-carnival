import java.util.Scanner;

public class IfCondition {

    public static void main( String args []) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please print your full name");
        String fullName = input.nextLine();
        System.out.println("Please print your age");
        int age = input.nextInt();


        if (age>=18){
            System.out.println("You can vote");
            System.out.println("Definitely");
            System.out.println("Don't vot for X");


        }

        System.out.println("I'am outside of an if statement");
        System.out.println("So I run regardless");


        System.out.println("What time it is right now?");

        int hour = input.nextInt();

        if (hour >= 0 && hour <= 11)
            System.out.println("Good Morning my beautiful World!!!");
            hour++;
            System.out.println("The next hour will be " + hour);


    }


    }

