package student_jaroslav_brutan.lesson_7.day_6;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();

        int powerAmount;
        int result;

        for (int i = 0; i < power; i++){
            result = 1;
            powerAmount = i;
            while (powerAmount > 0) {
                result *= number;
                powerAmount--;
            }
            System.out.println("number " + number + " in power " + i + " will be " + result);
        }

    }


}
