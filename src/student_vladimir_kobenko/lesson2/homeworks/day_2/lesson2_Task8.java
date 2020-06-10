package student_vladimir_kobenko.lesson2.homeworks.day_2;

import java.util.Scanner;

public class lesson2_Task8 {

    public static <string> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);
    }
}
