package student_valerija_ionova.lesson_4.level_1;

/*Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday*/

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args){

        //Input of number
        System.out.println("Please input number from 1 to 7");
        Scanner myInput = new Scanner (System.in);
        int number = myInput.nextInt();
        switch (number){
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;
            case 7 : System.out.println("Sunday"); break;
            default : System.out.println("Not day!");
        }
    }
}
