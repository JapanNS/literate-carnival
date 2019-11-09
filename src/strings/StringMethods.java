package strings;

public class StringMethods {

    public static void main(String [] args){

        String str = "Hello- World!";
        String devX = "DevX School";


        int sizeOfMyString = str.length();

        System.out.println(sizeOfMyString);

        String str2 = "124567";

        int sizeOfMyString2 = str2.length();

        System.out.println(sizeOfMyString2);

        System.out.println(str.length());
        System.out.println(str2.length());

        char wOfHelloW = str.charAt(7);
        System.out.println(wOfHelloW);

        char hyphen = str.charAt(5);
        System.out.println(hyphen);

        char hInDevX = devX.charAt(7);
        System.out.println(hInDevX);

        char dInHello = str.charAt(11);
        System.out.println(dInHello);

        char exclamation = str.charAt(12);
        System.out.println(exclamation);

        char lastCh = str.charAt(str.length()- 1);
        System.out.println(lastCh);

        char hOfDevX = devX.charAt(devX.length()- 4);
        System.out.println(hOfDevX);

        char mixOfTwoStrs = str.charAt(devX.length() - 6);
        System.out.println(mixOfTwoStrs);

        String world =  str.substring(7);
        System.out.println(world);

        String school =  devX.substring(5);
        System.out.println(school);

        //char indexOutBound = str.charAt()

        String ello = str.substring(1,5);
        System.out.println(ello);




    }
}
