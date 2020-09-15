package student_vladislav_zagrebin.lesson_2.homeWork.day_3;

import java.util.Scanner;

public class Task11_Average {

    public static void main(String[] args) {

    Scanner digit = new Scanner(System.in);

    System.out.println("Please enter first double number:");
    double firstDouble = digit.nextDouble();
    System.out.println("Please enter second double number:");
    double secondDouble = digit.nextDouble();
    System.out.println("Please enter third double number:");
    double thirdDouble = digit.nextDouble();

    System.out.println("The average value equals "
            + (firstDouble + secondDouble + thirdDouble/(double) 3));


    }
}