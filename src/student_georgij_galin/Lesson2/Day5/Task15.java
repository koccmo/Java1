package student_georgij_galin.Lesson2.Day5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Вывод строки без перевода на новую строку: ");
        System.out.print(number);
    }
}