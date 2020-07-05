package student_svjatoslavs_cernobrivecs.lesson_4.level_4;

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
    public int devide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public boolean isEvent(int number){
        return number % 2 == 0;
    }
}
