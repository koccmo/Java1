package student_valerija_ionova.lesson_4.level_1;

/*Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){

        //Input of number
        System.out.println("Please input integer:");
        Scanner myInput = new Scanner (System.in);
        int number = myInput.nextInt();
        if (number == 0) System.out.println("It's null!");
        else
        if (number % 2 == 0) {
            System.out.println("It's even number");
        } else
            System.out.println("It's odd number");
    }
}
