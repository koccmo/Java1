package student_roberts_kupcs.lesson_4.homework.level_4;

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
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
        return (number % 2) == 0;
    }
    public int maxTwoNumber(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    public int maxThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && secondNumber >=thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

}
