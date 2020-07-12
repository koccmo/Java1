/*
Упростите метод boolean isEven(int number).
Код внутри этого метода может быть записан в одну строку.
Перед изменением кода убедитесь, что у вас есть автоматические тесты для проверки этого кода.
Если автоматических тестов нет то напишите их, убедитесь, что они проходят и только тогда меняйте код.

class Calculator {

    public boolean isEven(int number) {
         if(number % 2 == 0) {
             return true;
         } else {
             return false;
         }
    }
}
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
