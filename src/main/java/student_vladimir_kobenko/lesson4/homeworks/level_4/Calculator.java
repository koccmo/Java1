package student_vladimir_kobenko.lesson4.homeworks.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;

    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }


    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven1(int firstNumber) {
        if (firstNumber % 2 == 0) {
            return true;
        } else return false;

        }

    public boolean isEven2(int secondNumber) {
        if (secondNumber % 2 == 0) {
            return true;
        } else return false;
            }

     public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
            if (firstNumber > secondNumber) {
                return 0;
            }
                else if (firstNumber < secondNumber){
         return 1;
         }
           else return 2;}

    public int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return 0;
        }
        else if (secondNumber >= thirdNumber && secondNumber >= firstNumber) {
            return 1;
        }
        else return 2;

    }
    }
