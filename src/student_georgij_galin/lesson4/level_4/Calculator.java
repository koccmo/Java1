package student_georgij_galin.lesson4.level_4;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Calculator() {
    }

    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divison(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}

