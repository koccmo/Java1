package student_vladimir_kobenko.lesson4.homeworks.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main (String [] args){

        System.out.println ("Введите число");

        Scanner scanner = new Scanner(System.in);

        int useNumber = scanner.nextInt();

        if (useNumber < 0) {

            System.out.println("Ваше число: " + useNumber + " отрицательное");
        }

        else if (useNumber == 0){

            System.out.println("Ваше число: " + useNumber);
        }

        else {
            System.out.println ("Ваше число: " + useNumber + " положительное");
        }

    }
}
