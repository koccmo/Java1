package student_aleksandra_maksimovic.lesson_7.level_6.task_10;

import student_aleksandra_maksimovic.lesson_7.level_1.WordService;
import teacher.codereview.CodeReview;

/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

@CodeReview(approved = true)
public class PowerCalculator {
    public int elevate(int number, int power) {

        int result = 1;

        for (int i = 0; i < power; i++) {

            result *= number;

        }

        return result;
    }

    public static void main(String[] args) {
        var calc = new PowerCalculator();
        var max = calc.elevate(8, 0);
        System.out.println(max);
    }

}
