package whileloops;

import java.util.Scanner;

public class Average {
    //write a program that promts user the mark  (between 0-100 in int) of 5 student;
    // computes the average (in double); and prints the result rounded to 2 decimal places.
    //Your program needs to perform input validation
    public static void main(String[] args) {
        //declare the mark number
        double num= 0;
        double x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");//25
        //number of students
        int n= sc.nextInt();
        while(x <= n){
            System.out.println("Enter your mark: " + (int)x );
            num += sc.nextDouble();
            x+=1;


        }
        double avg =(num/n);
        System.out.println("Average is test: " + avg);

    }
}