package student_sandra_arniece.lesson_2;
//Task 2
import java.util.Scanner;

public class TwoDoubleMath {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Input a double and press Enter!");
    double numberOne = sc.nextDouble();

        System.out.println("Input a double and press Enter!");
    double numberTwo = sc.nextDouble();

        sc.close();
    double divisionResult = numberOne / numberTwo;
        System.out.println("The result for division is: " + divisionResult);

    double additionResult = numberOne + numberTwo;
        System.out.println("The result for addition is: " + additionResult);

    double subtractionResult = numberOne - numberTwo;
        System.out.println("The result for subtraction is: " + subtractionResult);

    double multiplicationResult = numberOne * numberTwo;
        System.out.println("The result for multiplication is: " + multiplicationResult);
    }
}
