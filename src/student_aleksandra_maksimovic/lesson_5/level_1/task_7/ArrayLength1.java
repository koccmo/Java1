package student_aleksandra_maksimovic.lesson_5.level_1.task_7;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}
 */

class ArrayLength1 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[1]);
        System.out.println(numbers[1]); // (-1) out of bounds for length 2
    }

}