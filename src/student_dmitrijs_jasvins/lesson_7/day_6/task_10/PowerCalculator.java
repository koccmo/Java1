package student_dmitrijs_jasvins.lesson_7.day_6.task_10;

/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

public class PowerCalculator {
    public int calculate(int number, int power){
        long result = 1;
        int powerCount = power;
        while (powerCount != 0){
            result *= number;
            powerCount--;
        }
        return (int) result;
    }
}
