package student_roberts_kupcs.lesson_12.homework.level_4.Task_26;
//Напишите программу, которая вылетает с StackOverflowError.
//
//Подсказка: Вызовите метод в рекурсии (сам себя).
//
//Память JVM не безгранична!

class StackOverflowError {
    static int i =0;

    static int printNumber(int x) {
        i = i + 2;
        System.out.println(i);
        return i + printNumber(i + 2);
    }

    public static void main(String[] args) {
        //StackOverflowError.printNumber(i);
    }
}
