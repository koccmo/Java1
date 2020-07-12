/*
Task 11:
Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}

Task 12:
Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Добавьте в класс CalculatorTest тесты для этого метода.

Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
    }

}

Task 13:
Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Добавьте в класс CalculatorTest тесты для этого метода.

Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
    }
}

Task 14:
Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!


Подсказка:

class Calculator {

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        // реализуйте этот метод
    }
}

Task 15:
Добавьте в класс Calculator метод для определения
максимального из трёх целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!
 */
package student_igors_bartkevics.lesson_6.homework.level_1.task_1;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int max = firstNumber;
        if (firstNumber < secondNumber) {
            max = secondNumber;
        }
        else if (firstNumber == secondNumber) {
            System.out.println("You entered equal numbers");
        }
        return max;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int max = firstNumber;
        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        }
        else if (((secondNumber >= thirdNumber) && (secondNumber > firstNumber)) ||
                ((secondNumber >= firstNumber) && (secondNumber > thirdNumber))) {
            max = secondNumber;
        }

        else if (((thirdNumber >= firstNumber) && (thirdNumber > secondNumber))) {
            max = thirdNumber;
        }
        return max;
    }



}
