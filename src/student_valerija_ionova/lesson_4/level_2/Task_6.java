package student_valerija_ionova.lesson_4.level_2;

//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль наименьшее из них.

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args){

        //Input of first number
        System.out.println("Please input first number");
        Scanner myInput = new Scanner(System.in);
        int number1 = myInput.nextInt();

        //Input of second number
        System.out.println("Please input second number");
        int number2 = myInput.nextInt();

        //if statement
        if (number1<number2){
            System.out.println("Smaller number is: "+ number1);
        }else{
            if (number1>number2){
                System.out.println("Smaller number is: "+number2);
            }
            else System.out.println("Numbers are the same");
        }

    }
}

