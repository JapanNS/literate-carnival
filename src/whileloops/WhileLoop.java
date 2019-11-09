//package whileloops;
//
//public class WhileLoop {
//
//    public static void main(String[] args) throws InterruptedException {
//        String str = "You are Awesome!!!";
//
//        boolean isAwesome = true;
//        int count = 0;
//
//        while (isAwesome) {
//            System.out.println(str);
//            count++;
//
//            if (count >= 3) {
//                isAwesome = false;
//
//            }
//
//        }
//        System.out.println("While loop is exited");
//
//        int count2 = 0;
//        while (count2 < 4) {
//            System.out.println(str + "While loop 2");
//            count2++;
//        }
//
//        int count3 = 5;
//        while (count3 > 0) {
//            System.out.println(count3--);
//            Thread.sleep(1000L);
//            if (count3 == 0) {
//                System.out.println("Kaaaabbbbboooom");
//            }
//
//        }
//
//        String str1 = "";
//        //"G" stop the program when my str1 is "GGG"
//
//        while (!str1.equals("GGG")) {
//            str1 = str1.concat("G");
//            System.out.println(str1);
//
//
//        }
//        System.out.println(str1);
//
//        String str2 = "";
//        while (str2.length() < 3) ;
//        str2 = str2.concat("G");
//        System.out.println(str2);
//    }
//    String passWord = "ChaseBankPass222";
//    String userName = "DevX School";
//        System.out.println("Please Enter your user Name");
//    String userNameEntered = sc.nextLine();
//        System.out.println("Please Enter your password");
//    String passEntered = sc.nextLine();
//        if(userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)){
//        System.out.println("You are Successfully Logged in");
//    }
//        else{
//        System.out.println("Invalid Password entered");
//    }
//}
