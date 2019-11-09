//package Methods;
//
//import java.util.Scanner;
//
//public class StringMethods3 {
//
//    public static void main(String[] args) {
//
//        //how to find the first o in the DevXSchool
//
//        int indexOfO = "Dev School".indexOf("o");
//        System.out.println("Dev School".charAt(indexOfO));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter your Last Name and First Name inside {}");
//
//        String name = sc.nextLine();
//        System.out.println(name);
//
//        int openingCurly = name.indexOf("{" );
//        System.out.println("opening" + openingCurly);
//        String nameWithoutOpenCurly = name.substring(openingCurly+1);
//
//        int closingCurly = name.indexOf("}");
//        String nameWithoutClosingCurly = nameWithoutOpenCurly.substring(openingCurly+1, closingCurly);
//        System.out.println(nameWithoutClosingCurly);
//
//
//    }
//}
