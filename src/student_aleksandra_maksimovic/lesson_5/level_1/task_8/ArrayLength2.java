package student_aleksandra_maksimovic.lesson_5.level_1.task_8;
/*
Найдите ошибку в программе и исправить её:

class ArrayLength2 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
 */

class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        //System.out.println(numbers[2]);  out of bounds for length 2
    }

}

