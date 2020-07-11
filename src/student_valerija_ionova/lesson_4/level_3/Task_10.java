package student_valerija_ionova.lesson_4.level_3;

/*Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!*/

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        //Input of first number
        System.out.println("Please input first number:");
        Scanner myInput = new Scanner(System.in);
        int number1 = myInput.nextInt();

        //Input of third number
        System.out.println("Please input second number:");
        int number2 = myInput.nextInt();

        //Input of third number
        System.out.println("Please input third number:");
        int number3 = myInput.nextInt();

        if (number1 >= number2){
            if (number1 >= number3) System.out.println(number1);
            else System.out.println(number3);
        }else
            if (number2 >= number3) System.out.println(number2);
            else System.out.println(number3);

    }
}
