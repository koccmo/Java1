package student_svjatoslavs_cernobrivecs.Lesson_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        System.out.println("Number One");
        double numberOne = y.nextDouble();
        System.out.println("Number Two");
        double numberTwo = y.nextDouble();
        double resultPlus = numberOne + numberTwo;
        double resultMinus = numberOne - numberTwo;
        double resultMulti = numberOne * numberTwo;
        double resultDivision = numberOne / numberTwo;

        System.out.println("Addition: " + resultPlus);
        System.out.println("Subtraction: " + resultMinus);
        System.out.println("Multiplication: " + resultMulti);
        System.out.println("Division: " + resultDivision);

    }
}
