public class LogicalOperators {


    public static void main( String args []){

        boolean isOld = true;

        boolean isOld2 = false;


        boolean oldResult = isOld || isOld2;

        System.out.println("Is Old Result: " + oldResult);

        boolean isHusbandMillionaire = true;
        boolean isWifeMillionaire = false;

        boolean isChildMillionaire = isHusbandMillionaire || isWifeMillionaire;
        System.out.println("Is a child a millionaire " + isChildMillionaire);

        boolean isSunny = true;
        boolean isRainy = true;

        boolean isRainbow = isSunny && isRainy;
        System.out.println("There will ba a rainbow;"  + isRainbow);

        boolean isSunny1 = false;
        boolean isRainy1 = true;

        boolean isRainbow1 = isSunny1 && isRainy1;
        System.out.println("There will ba a rainbow;"  + isRainbow1);

        boolean negating = !true; //! mark will change the false to true

        System.out.println("The value of negated boolean is; " + negating);

        boolean negating2= !false;

        System.out.println("The value of negated boolean is; " + negating2);






    }
}
