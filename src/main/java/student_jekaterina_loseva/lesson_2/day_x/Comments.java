package student_jekaterina_loseva.lesson_2.day_x;

import java.util.Scanner;

public class Comments {

    public static void main(String[] args) {
        // Этот однострочный комментарий
        System.out.println("Welcome!");

        /* Это многострочный комментарий
        Выводим на экран приветсвие пользователя
        по заданому имени */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");

    }

}
