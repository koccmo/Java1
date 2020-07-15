package student_sandra_arniece.lesson_4.numbers;
//Task 3
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 7: ");
        int inputNumber = sc.nextInt();
        if ((inputNumber) >= 1 && (inputNumber <= 7)) {
            switch (inputNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        } else {
            System.out.print("Please, an integer from 1 to 7!");
        }
    }

}

