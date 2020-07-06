package student_alexey_tretyakov.lesson_4.level_4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public double divide (int firstNumber, int secondNumber) {
        double firstDouble = firstNumber;
        double secondDouble = secondNumber;
        return firstDouble / secondDouble;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println("Calculate Sum 5 + 3 = " + myCalc.sum( 5, 3 ));
        System.out.println("Calculate Subtract 5 - 3 = " + myCalc.subtract( 5, 3 ));
        System.out.println("Calculate Multiply 5 * 3 = " + myCalc.multiply( 5, 3 ));
        System.out.println("Calculate Divide 10 / 3 = " + myCalc.divide( 10, 3 ));
    }
}
