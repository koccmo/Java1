package student_valerija_ionova.lesson_7.level_6.task_10;

/*Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/

public class PowerCalculator {

    public int powerOfNumber(int number, int power){
        int result = 1;
        int j= 1;
        do {if (power!=0) {
                result *= number;
            }
            j++;
        } while (j<=power);
        return result;
    }

}
