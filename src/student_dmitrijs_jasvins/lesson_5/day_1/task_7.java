package student_dmitrijs_jasvins.lesson_5.day_1;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}
 */

public class task_7 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[1]);
    }
}
