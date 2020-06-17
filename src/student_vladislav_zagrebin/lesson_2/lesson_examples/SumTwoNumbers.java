package student_vladislav_zagrebin.lesson_2.lesson_examples;

public class SumTwoNumbers {

    public static void main(String[] args) {

        // int number One = 10; - пробелы ставить нельзя
        // int NumberOne = 10; - переменные писать с маленькой буквы
        // int numberOne; - можно создать пустую переменную

        /* если хочешь оставить больгой комментарий
        в несколько строк
         */

        int numberOne = 10;

        numberOne = 10;
        numberOne = 20;

        int numberTwo = 20;

        // int sum = 20 + 20

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);

        double numberThree = 2.2;
        double numberFour = 4.4;

        // numberOne = numberThree; - not allowed
        // sum = numberThree + numberFour; - not allowed

        numberFour = 1;
        numberFour = 1.0;
        numberFour = numberOne;

        System.out.println("NumberFour = " + numberFour );

        numberOne = 5;
        numberTwo = 3;

        int devide = numberOne / numberTwo;

        System.out.println("Devide = " + devide);

        int oststokOtDelenija = numberOne % numberTwo;

        System.out.println("Ostatok = " + oststokOtDelenija);

    }
}


