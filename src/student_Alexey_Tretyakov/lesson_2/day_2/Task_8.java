package student_Alexey_Tretyakov.lesson_2.day_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scannerName = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String inputName = scannerName.nextLine();
        System.out.print("Hello " + inputName + " !!!");
    }
}
