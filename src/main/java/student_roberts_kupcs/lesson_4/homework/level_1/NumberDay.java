package student_roberts_kupcs.lesson_4.homework.level_1;

import java.util.Scanner;

class NumberDay {
    public static void main(String[] args) {

        int number;


        Scanner sc = new Scanner(System.in);
        System.out.print("Ввод: ");
        number = sc.nextInt();

        if (number == 1) {
            System.out.println("Вывод: Monday");
        }
        if (number == 2) {
            System.out.println("Вывод: Tuesday");
        }
        if (number == 3) {
            System.out.println("Вывод: Wednesday");
        }
        if (number == 4) {
            System.out.println("Вывод: Thursday");
        }
        if (number == 5) {
            System.out.println("Вывод: Friday");
        }
        if (number == 6) {
            System.out.println("Вывод: Saturday");
        }
        if (number == 7) {
            System.out.println("Вывод: Sanday");
        } else {
            System.out.println("такого дня недели не существует");
        }


    }
}
