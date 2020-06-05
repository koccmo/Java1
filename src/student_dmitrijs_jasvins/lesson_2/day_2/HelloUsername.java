package student_dmitrijs_jasvins.lesson_2.day_2;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}
