package student_sandra_arniece.lesson_2.level_3; //Task 11

import java.util.Scanner;

class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number and press Enter: ");
        double numberOne = sc.nextDouble();

        System.out.println("Enter the second number and press Enter: ");
        double numberTwo = sc.nextDouble();

        System.out.println("Enter the third number and press Enter: ");
        double numberThree = sc.nextDouble();

        sc.close();

        System.out.print("The average of entered numbers is:" + avr(numberOne, numberTwo, numberThree));
    }

    public static double avr(double numberOne, double numberTwo, double numberThree) {
        return (numberOne + numberTwo + numberThree) / 3;
    }

}
