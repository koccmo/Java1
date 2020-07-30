/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */
package student_igors_bartkevics.lesson_7.homework.level_6.task_10;

class PowerCalculator {

    public double exponentiation(double base, int exponent) {

        double baseNumber = base;
        int exponentNumber = exponent;

        if (isNegative(exponent)) {
            baseNumber = 1/base;
            exponentNumber = Math.abs(exponent);
        }
        else if (isZero(exponent)) {
            baseNumber = 1;
            exponentNumber = 1;
        }

        return exponentiationForPositiveExponent(baseNumber, exponentNumber);
    }

    public double exponentiationForPositiveExponent(double base, int exponentNumber) {
        double baseNumber = base;
        while (exponentNumber > 1) {
            baseNumber *= base;
            exponentNumber--;
        }
        return baseNumber;
    }

    public boolean isNegative(int exponent) {
        return exponent < 0;
    }

    public boolean isZero(int exponent) {
        return exponent == 0;
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        System.out.println(calculator.exponentiation(2,4));
    }
}
