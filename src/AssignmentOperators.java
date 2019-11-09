public class AssignmentOperators {

    public static void main( String args []){
        // declaring

        int num1 = 100;
        int num2= 50;

        System.out.println("num1 => " + num1);

        num1 = 50;
        num1 = num2;

        num2 = num1;

        System.out.println("Line 15 num 1 = >>>>>: " + num1);

        System.out.println(" num2 =>>>>>: " + num2);

        int x = 15;
        int y = 5;
        int z = 10;

        System.out.println("Value of X: "+ x);

        x+= 5; // x= x+5;

        System.out.println("Value of x after addition: " +x);

        y*= 4; //y = y * 4;
        System.out.println("Value of y after multiplication: " +y);

        x/= 2; // x = x/2;
        System.out.println("Value of x after division: " + x);
        x%= z; // x = x % z ; x is 10, z is 10;
        System.out.println("Value of x after modulo: " + x);

        x+=y=z;

        System.out.println("Value of x after adding the sum of y and z: " + x);

        x+=y*z; //x = x = y * z;

        System.out.println("Value of x = " + x);

        int firstNum = 5;

        int secondNum = 2 * (firstNum=20);

        System.out.println("the value of First Num: " + firstNum);
        System.out.println("The value of second Num: " + secondNum);

    }
}
