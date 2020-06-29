package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_2;

import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) {

        Game game1 = new Game();
        Scanner scanner = new Scanner(System.in);
        int frame = 1;
        int pinNumber1;
        int pinNumber2;
        int pinNumber3;
        int rollNumber = 1;
        do {
            System.out.println("Enter number of pins for " + rollNumber + " roll:");
            pinNumber1 = scanner.nextInt();
            game1.roll(pinNumber1);

            if ((frame == 10) && (pinNumber1 == 10)) {
                rollNumber++;
                System.out.println("Enter number of pins for " + rollNumber + " roll:");
                pinNumber2 = scanner.nextInt();
                game1.roll(pinNumber2);

                if (pinNumber2 == 10) {
                    rollNumber++;
                    System.out.println("Enter number of pins for " + rollNumber + " roll:");
                    pinNumber3 = scanner.nextInt();
                    game1.roll(pinNumber3);
                }
            } else if (pinNumber1 < 10) {
                rollNumber++;
                System.out.println("Enter number of pins for " + rollNumber + " roll:");
                pinNumber2 = scanner.nextInt();
                game1.roll(pinNumber2);

                if ((frame == 10) && ((pinNumber1 + pinNumber2) == 10)) {
                    rollNumber++;
                    System.out.println("Enter number of pins for " + rollNumber + " roll:");
                    pinNumber3 = scanner.nextInt();
                    game1.roll(pinNumber3);
                }

            }
            frame++;
            rollNumber++;
        }
        while (frame < 11);
        System.out.println("Game is over! Your score is: " + game1.score());
    }
}