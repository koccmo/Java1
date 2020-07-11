package student_eduards_jasvins.lesson_4.day_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number :  ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter third number :  ");
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree  ){
            System.out.println("This number is bigger = " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("This number is bigger = " + numberTwo);
        } else {
            System.out.println("This number is bigger = " + numberThree);
        }
    }
}
