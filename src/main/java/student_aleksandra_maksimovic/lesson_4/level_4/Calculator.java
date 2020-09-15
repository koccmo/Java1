package student_aleksandra_maksimovic.lesson_4.level_4;
/*
   Создайте класс Calculator. В этом классе создайте методы
    для сложения, вычитания, деления и умножения двух целых чисел.


 */
public class Calculator {

    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public double division(int firstNumber, int secondNumber) {
        return (double)firstNumber / secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number) {
        return (number % 2) == 0;// 1 у намбера узнаю остаток от деления 2 сравнение с нулём
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}