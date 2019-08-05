package ex2_fizz_buzz;

public class Fizzbuzz {
    public static void main(String[] args) {

//            for (int i = 1; i < 100; i++) {
//                System.out.println(functionTestThree(i));
//            }

//            for (int i = 1; i < 100; i++) {
//                System.out.println(functionTestTwo(i));
//            }

        for (int i = 1; i < 100; i++) {
            System.out.println(functionTestThree(i));
        }
    }

    /*
    Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем,
    программа должна выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно
    пятнадцати, то программа должна выводить слово FizzBuzz.
     */

    //через if
    private static String functionTestOne(int number) {
        String result = "";
        if (number % 3 == 0) result = "Fizz";
        if (number % 5 == 0) result += "Buzz";
        if (result.equals("")) result = "" + number;
        return result;
    }

    //через тернарный оператор
    private static String functionTestTwo(int number) {
        String result = number % 3 == 0 ? "Fizz" : "";
        result += number % 5 == 0 ? "Buzz" : "";

        if (result.equals("")) {
            result = Integer.toString(number);
        }
        return result;
    }

    //с минимальным колличеством if
    private static String functionTestThree(int number) {
        String result = Integer.toString(number);
        String[] arrStr = {"FizzBuzz", "Buzz", "Fizz",};
        int[] arrNum = {15, 5, 3};

        for (int i = 0; i < 3; i++) {
            if (number % arrNum[i] == 0) {
                return arrStr[i];
            }
        }
        return result;
    }
}
