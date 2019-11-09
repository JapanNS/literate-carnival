package Methods;

public class NewLife {

    public static void main(String [] args) {
        boolean firstExample = isOldEnoughToDrive(17);
        System.out.println("Are you eligible to drive? " + firstExample);

        boolean secondExample = isOldEnoughToDrive(21);
        System.out.println("Are you eligible to Drive? " + secondExample);

        double change1 = calculateTheChange(102.56, 120.00);
        System.out.println(" Your change: " + change1);

        printOutMyNmae("John Doe");

        double change3 = calculateTheChange(520.23, 200 );
        System.out.println("Your Change is " + change3);

        double change4 = calculateTheChange(520.23, 1200 );
        System.out.println("Your Change is " + change4);


        boolean i = isOldEnoughToDrive(20);

    }

    public static boolean isOldEnoughToDrive (int age) {

        boolean isOldEnough;

        if (age >= 18) {

            isOldEnough = true;
        }
        else {
            isOldEnough = false;
        }

        return isOldEnough;

    }

    public static double calculateTheChange (double total, double cashReceived) {

        double change;
        if (total <= cashReceived) {
            change = ((100 * cashReceived) - (100 * total)) / 100;
        }
        else {
            System.out.println("Youd don't have enough money");
            System.out.println("you need " + (total- cashReceived));
            change = 0;
        }
        return change;
    }

    public static void printOutMyNmae(String name) {

        System.out.println("Your name: " + name);
    }

    public static boolean isNumberEven (int num) {

        boolean isEven = num%2 == 0;
        return isEven; // return num%2 == 0;  is also possible...
    }

    public static void useAllMethodsFromThisClass(){

        boolean isEven = isNumberEven(9);
        System.out.println("Is even" + isEven);


    }
}
