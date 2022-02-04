package roman.lesson_4.homework.day_4.task_11;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int real(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int devide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public boolean isEven(int number){
        return number %2 == 0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        int largest = firstNumber;
        if (firstNumber > secondNumber) {
            largest = firstNumber;
        }
        if (firstNumber < secondNumber) {
            largest = secondNumber;
        }
        if (firstNumber == secondNumber) {
            largest = firstNumber;
        }
        return largest;
    }
    public int biggerNumberOfThree(int firstNumber, int secondNumber, int thirdNumber){
        int biggest = firstNumber;
        if ((secondNumber > thirdNumber) && (secondNumber > firstNumber)
                || ((secondNumber >= thirdNumber) && (thirdNumber > firstNumber))) {biggest = secondNumber;}
        else {if ((thirdNumber > secondNumber) && (thirdNumber > firstNumber)
                || (thirdNumber >= firstNumber) && (firstNumber > secondNumber)) {
            biggest = thirdNumber;
        } else {if ((firstNumber == secondNumber) && (secondNumber == thirdNumber))
        {biggest = firstNumber;}}
        }
        return biggest;
    }

}
