package student_eduards_jasvins.lesson_2.day_2;

import java.util.Scanner;

public class HelloUsername {

    public static void main(String[] args) {
        // 1. get name from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = myInput.next();

        // 2. print result to console
        System.out.println("Hello " + name);

    }

}
