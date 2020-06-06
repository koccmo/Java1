package student_igors_bartkevics.lesson_2.homeworks;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int result;
        for(int i=1;i<=10;i++) {
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }




    }
}
