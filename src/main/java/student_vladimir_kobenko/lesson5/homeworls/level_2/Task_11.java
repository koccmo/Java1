package student_vladimir_kobenko.lesson5.homeworls.level_2;

import java.util.Scanner;

public class Task_11 {
public static void main (String [] args){
    int[] digits = new int[3];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int firstNumber = sc.nextInt();

    System.out.println("Enter second number: ");
    int secondNumber = sc.nextInt();

    System.out.println("Enter second number: ");
    int thirdNumber = sc.nextInt();

    digits[0] = firstNumber;
    digits[1] = secondNumber;
    digits[2] = thirdNumber;
    for (int j = 0; j<3; j++)
    System.out.println(digits[j]);
    }
}
