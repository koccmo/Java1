package student_alexey_tretyakov.lesson_4.level_3;


import java.util.Scanner;

public class Task_10_v2 {

    // Поиск наибольшего значения из 3-х чисел. ( Предлагает воспользоваться Math.max (cтрока 20 и 26 :)) ) )

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число = ");
        int int1 = scanner.nextInt();
        System.out.print("Введите второе целое число = ");
        int int2 = scanner.nextInt();
        System.out.print("Введите третье целое число = ");
        int int3 = scanner.nextInt();
        if (int1 >= int2) {
            if (int1 >= int3) {
                System.out.print(int1);
            } else {
                System.out.print(int3);
            }
        } else {
            if (int2 >= int3) {
                System.out.print(int2);
            } else {
                System.out.print(int3);
            }
        }

    }
}
