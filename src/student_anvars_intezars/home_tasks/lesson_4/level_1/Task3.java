package student_anvars_intezars.home_tasks.lesson_4.level_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number from 1 till 7:");
        int dayOfTheWeek = sc.nextInt();

        switch (dayOfTheWeek) {

            case 1: {
                System.out.println("Monday");
            }
            break;

            case 2: {
                System.out.println("Tuesday");
            }
            break;

            case 3: {
                System.out.println("Wednesday");
            }
            break;

            case 4:
                {System.out.println("Thursday");
            }
            break;

            case 5: {
                System.out.println("Friday");
            }
            break;

            case 6: {
                System.out.println ("Saturday");
            }
            break;

            case 7: {
                System.out.println ("Sunday");
            }
            break;

            default: {
                System.out.println("The value, which you have entered");
                System.out.print("does not correspond to neccessary one");
            }

        }
    }
}