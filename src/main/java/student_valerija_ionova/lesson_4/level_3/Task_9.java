package student_valerija_ionova.lesson_4.level_3;

/*Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.*/

import java.util.Scanner;

class Task_9 {
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

        if ((number2 > number1) && (number3 > number2)){
            System.out.println("increasing");
        }else{
            if ((number1>number2)&& (number2 > number3)){
                System.out.println("decreasing");
            }else System.out.println("Neither increasing or decreasing order");
        }
    }
}
