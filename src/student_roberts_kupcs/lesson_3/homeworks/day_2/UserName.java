package student_roberts_kupcs.lesson_3.homeworks.day_2;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите name: ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
    }
}
