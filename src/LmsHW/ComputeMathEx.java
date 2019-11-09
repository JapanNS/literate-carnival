package LmsHW;

public class ComputeMathEx {
    public static void main(String[] args) {

        double sumOfSpecifiedExpression = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("Output of specified expression way 1: " + sumOfSpecifiedExpression);

        double expr1 = 25.5d;
        double expr2 = 3.5d;
        double expr3 = 40.5d;
        double expr4 = 4.5d;

        System.out.println("Output of specified expression way 2: " + (expr1 * expr2 - expr2*expr2)/(expr3 - expr4));

        double sumOfFormula = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));

        System.out.println("Output of specified formula: " + sumOfFormula);


    }
}
