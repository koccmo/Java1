package student_roberts_kupcs.lesson_12.homework.level_4.Task_25;
//Напишите программу, которая вылетает с OutOfMemoryError.
//
//Подсказка: создайте много объектов, только не теряйте ссылки на них.
//Например положите много объектов в список.
//
//Память JVM не безгранична!



class OutOfMemoryError {

    public static void main(String[] args) throws Exception {

        Float[] array = new Float[10000 * 100000];
    }
}
