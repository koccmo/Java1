package student_vladimir_kobenko.lesson4.homeworks.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main (String [] args){

        System.out.println ("Введите число");

        Scanner scanner = new Scanner(System.in);

        int useNumber = scanner.nextInt();

        if (useNumber % 2 == 0) {

            System.out.println("Ваше число: " + useNumber + " чётное");
        }

        else {
            System.out.println ("Ваше число: " + useNumber + " нечётное");
        }

    }
}
