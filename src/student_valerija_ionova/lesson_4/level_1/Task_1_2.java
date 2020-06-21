package student_valerija_ionova.lesson_4.level_1;

//Написать программу, которая запрашивает у
//пользователя
//целое число и выводит на консоль
//положительное оно или отрицательное.

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args){
        System.out.println("Please input the number:");
        Scanner number = new Scanner (System.in);
        double numberFromUser = number.nextDouble();
        if (numberFromUser>0){
            System.out.println("It's positive number");
        }else{
            if (numberFromUser<0){
                System.out.println("It's negative number");
            }
            else{
                System.out.println("It's null!");
            }
        }
    }
}
