package student_aleksandra_maksimovic.lesson_2.lessoncode;

import java.util.Scanner;

public class AddTwoNummbers {
    public static void main(String[] args) {
        //1. get first number from user
        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        //2. get second number from user
        int secondNumber = myInput.nextInt();

        //3. first number + second number
        int result = firstNumber + secondNumber;

        //4. print result to console
        System.out.println("result = " + result);




    }
}
