package ex1_factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number for factorial counting: ");

        String x = scanner.nextLine();  // Read user input
        System.out.println("user entered number: " + x);  // Output user input

        try {
            System.out.println("Result: " + fact(Integer.parseInt(x)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    пример не только вычисления факториала, но и рекурсии

    При вызове метода fact() с аргументом, равным 1, вернётся 1. При других числах возвращается fact(n - 1) * n.
    Получается, что нужно ещё раз вызвать метод fact(). И так происходит до тех пор, пока не дойдёт до единицы.
    При этом промежуточные значения умножаются.

    Когда метод вызывает сам себя, новым локальным переменным и параметром выделяется место в стеке и код метода
    выполняется с этими новыми начальными значениями. При каждом возврате из рекурсивного вызова старые локальные
    переменные и параметры удаляются из стека, и выполнение продолжается с момента вызова внутри метода.

    Следует помнить, что рекурсивные методы требуют больше ресурсов для выполнения и даже может вызвать
    переполнение памяти при слишком больших значениях.
     */

    private static int fact(int n) {
        if (n == 1) return 1;
        return fact(n - 1) * n;
    }
}
