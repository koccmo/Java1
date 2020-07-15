package student_sandra_arniece.lesson_2;
//Task 1
import java.util.Scanner;

public class TwoIntMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer and press Enter!");
        int numberOne = sc.nextInt();

        System.out.println("Input an integer and press Enter!");
        int numberTwo = sc.nextInt();

        sc.close();
        int divisionResult = numberOne / numberTwo;
        System.out.println("The result for division is: " + divisionResult);

        int additionResult = numberOne + numberTwo;
        System.out.println("The result for addition is: " + additionResult);

        int subtractionResult = numberOne - numberTwo;
        System.out.println("The result for subtraction is: " + subtractionResult);

        int multiplicationResult = numberOne * numberTwo;
        System.out.println("The result for multiplication is: " + multiplicationResult);
    }
}
