package student_roberts_kupcs.lesson_7.homework.level_1.level_6.task_10;

//Разработать класс PowerCalculator, который реализует единственный функциональный метод
//для возведения заданного числа в заданную степень.
//Математическую операцию реализовать с использованием цикла.
//Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
//Все тестовые сценарии должны отрабатывать без ошибок.

class PowerCalculator {
    public int numberPower(int number, int numpower) {
        int result = 1;
        for (int i = 1; i <= numpower; i++) {
            result = result * number;
        }
        return result;
    }
}
