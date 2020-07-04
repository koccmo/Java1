package student_valerija_ionova.lesson_4.level_x.super_task_3;

/*Task11
Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Task13
Добавьте в класс Calculator метод для определения
чётное число или не чётное.


Task14
Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Task15
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

public class Calculator {

    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public double divide (int firstNumber, int secondNumber){
        return firstNumber / (double)secondNumber;
    }

    public boolean isEven (int number){
        if (number % 2 == 0) return true;
        else {return false;
        }
    }


}
