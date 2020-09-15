package student_vladislav_zagrebin.lesson_4.lessonExamples;

public class IfExample {

    public static void main(String[] args) {

        boolean answer = true;
        answer = false;

        // <, <=, >, >=, == (равно), != (не равно)

        if (true) {
            System.out.println("IF is TRUE!");
        }

        if (1 > 0) {
            System.out.println("IF executed!");
        }

        int number1 = 10;
        if (number1 < 20) {
            System.out.println("Number is lesser than 20!");
        }

        int number2 = 10;
        if (number2 == number1) {
            System.out.println("Numbers are the same!");
        }

        number2 = 12354;
        if (number1 != number2); {
            System.out.println("Numbers are not equal!");
            System.out.println("Numbers are not equal!");
        }

        if (number1 != number2);
        // если нет {} тогда выполняется (правильно) только 1 команда!!;
        // последующие выполнятся в любом случае!! (по примеру);
        // этот вариант лучше НЕ ИСПОЛЬЗОВАТЬ!!;
            System.out.println("Numbers are not equal!");
            System.out.println("Numbers are not equal! (not right!!!)");

        // int, long, double, float, boolean - примитивные типы данных;


    }
}
