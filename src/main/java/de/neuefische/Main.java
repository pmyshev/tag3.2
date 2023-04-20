package de.neuefische;

import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {

//        int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length ; j++) {
//                for (int k = 0; k < multiArray[i][j].length; k++) {
//                    System.out.println(multiArray[i][j][k]);
//                }
//
//            }
//        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib einen Integer-Wert ein: ");
        int x = scanner.nextInt();
        System.out.println("Gib einen zweiten Integer-Wert ein: ");
        int y = scanner.nextInt();


        System.out.println(addition(x,y));
        System.out.println(addition1(x,y));
        System.out.println("Ist einer der int Werte größer als 100 ? \n - " +
                boolToHumanLang(isGreaterThan(x,y, 100)));

//        String ns = "die Zeichenfolge \"fancy\" enthält";
//        System.out.println(ns.length());
//        System.out.println(isStringLongerThan(ns, 31));
//        System.out.println(isStringContains(ns,"fancy"));


//        System.out.println(alarm(29, "gelb"));
//        System.out.println(Factorial1(4));


        System.out.println(fizzbuzz(20));
    }

    public static int addition(int a, int b)
    {
        return a + b;
    }

    public static String addition1(int a, int b)
    {
        return "Summe: " + (a + b);
    }
    //
    public static boolean isGreaterThan(int a, int b, int comparable){
        return a > comparable || b > comparable;
    }

    public static String boolToHumanLang(boolean condition){
        if(condition){
            return "Ja";
        }
        else {
            return "Nein";
        }
    }

    public static String fizzbuzz(int input){
        if (input % 3 == 0 && input % 5 ==0){
            return "fizzbuzz";
        } else if (input % 3 == 0) {
            return "fizz";
        } else if (input % 5 == 0) {
            return "buzz";
        }
        else {
            return "" + input;
        }
    }

    public static boolean smallerThanZero(int input){
        return input < 0;
    }

    public static int sumSquareOrSubstract(int input1, int input2, boolean flag){
        if (input1 > input2){
            if (flag){
                return input2 - input1;
            }
            return input1 + input2;
        }
        return input1 * input2;
    }

//
//    public static boolean isStringLongerThan(String s, int comparable){
//        return s.length() > comparable;
//    }
//
//    public static boolean isStringContains(String s, String subString){
//        return s.contains(subString);
//    }

//    public static String isTooManyPpl(int count, int max_erlaubt){
//        if (count > max_erlaubt) {
//            return "Zu viele Personen;  max " + max_erlaubt + " Personen erlaubt" ;
//        }
//        else {
//            return "Maximale Personenzahl nicht überschritten";
//        }
//    }



//    public static String alarm(int count, String alarmStufe){
//
//       switch (alarmStufe){
//            case "rot":
//                return "keine Personen erlaubt";
//            case "gelb":
//                return isTooManyPpl(count,30);
//
//            case "grün":
//                return isTooManyPpl(count,60);
//        }
//
//    return "";
//
//    }

//    public static int Factorial(int number){
//        int result = 1, i =1;
//
//        while (i<=number){
//            result *= i;
//            i++;
//        }
//
//        return result;
//    }
//
//    public static int Factorial1(int number){
//        int result = 1, i =1;
//
//        for (int j = 1; j <= number; j++) {
//            result *= j;
//
//        }
//        return result;
//    }


}





