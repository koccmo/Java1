package student_jekaterina_loseva.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        System.out.println("Please, enter an integer number from 1 till 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("You entered incorrect data!");
            }
        }

    }

}
