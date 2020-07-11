package student_valerija_ionova.lesson_4.level_3;

/*Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.*/

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){

        //Input of first number
        System.out.println("Please input first number:");
        Scanner myInput = new Scanner(System.in);
        double number1 = myInput.nextDouble();

        //Input of third number
        System.out.println("Please input second number:");
        double number2 = myInput.nextDouble();

        //Input of third number
        System.out.println("Please input third number:");
        double number3 = myInput.nextDouble();

        if ((number1 == number2)&&(number2 == number3)){
            System.out.println("All numbers are equal");
        }else{
            if((number1 != number2) && (number2 != number3) && (number1 != number3)){
                System.out.println("All number are different");
            }else System.out.println("Neither all are equal or different");
        }

    }
}
