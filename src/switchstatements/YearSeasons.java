package switchstatements;

import java.util.Scanner;

public class YearSeasons {
    //Find a month (February) by getting a sequence number of a month(2)
    // Find which season is that month belongs to

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your month number");

        int monthNum = sc.nextInt();

        String season;
        switch (monthNum) {

            case 1:
                System.out.println("January");
                season = "Winter";
                break;
            case 2:
                System.out.println("February");
                season = "Winter";
                break;
            case 3:
                System.out.println("March");
                season = "Winter";
                break;
            case 4:
                System.out.println("April");
                season = "Spring";
                break;
            case 5:
                System.out.println("May");
                season = "Spring";
                break;
            case 6:
                System.out.println("June");
                season = "Spring";
                break;
            case 7:
                System.out.println("July");
                season = "Summer";
                break;
            case 8:
                System.out.println("August");
                season = "Summer";
                break;
            case 9:
                System.out.println("September");
                season = "Summer";
                break;
            case 10:
                System.out.println("October");
                season = "Fall";
                break;
            case 11:
                System.out.println("November");
                season = "Fall";
                break;
            case 12:
                System.out.println("December");
                season = "Fall";
                break;
            default:
                System.out.println("Invalid month is entered");
                season = "Wrong month entry";
                break;
        }

        System.out.println();
        System.out.println();
    }
}
