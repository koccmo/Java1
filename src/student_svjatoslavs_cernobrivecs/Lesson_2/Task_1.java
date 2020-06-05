package student_svjatoslavs_cernobrivecs.Lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("first number");
        int numberOne = x.nextInt();
        System.out.println("second number");
        int numberTwo = x.nextInt();
        int resultPlus = numberOne + numberTwo;
        int resultMinus = numberOne - numberTwo;
        int resultMulti = numberOne * numberTwo;
        double resultDivision = numberOne / (double) numberTwo;

        System.out.println("Addition: " + resultPlus);
        System.out.println("Subtraction: " + resultMinus);
        System.out.println("Multiplication: " + resultMulti);
        System.out.println("Division: " + resultDivision);
    }
}

