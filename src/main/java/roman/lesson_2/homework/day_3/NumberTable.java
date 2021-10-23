package roman.lesson_2.homework.day_3;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner( System.in );
        System.out.println("Please pu in Inte number: ");
        int number = inputNumber.nextInt();
        int doble = 1;
        System.out.println("Your result:");

        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble++));
        System.out.println(number + " x " + doble + " = " + (number * doble));

    }
}
