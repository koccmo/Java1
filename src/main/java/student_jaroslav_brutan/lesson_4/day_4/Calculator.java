package student_jaroslav_brutan.lesson_4.day_4;


public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else {return false;}
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) return firstNumber;
        else return secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber) {
                if (firstNumber >= thirdNumber)
                return firstNumber;
                else return thirdNumber;
        }  else {
            if (secondNumber >= thirdNumber)
                return secondNumber;
            else return thirdNumber;}
}
}


