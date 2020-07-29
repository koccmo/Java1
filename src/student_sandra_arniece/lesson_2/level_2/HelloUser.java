package student_sandra_arniece.lesson_2.level_2; //Task 8

import java.util.Scanner;

class HelloUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input your name: ");

        String userName = sc.nextLine();
        System.out.print("Hello, " + userName + "!");
    }

}
