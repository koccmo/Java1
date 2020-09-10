package student_valerija_ionova.lesson_12.level_4_junior.task_26;

/*Напишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!*/

class OutOfMemoryDemo {

    public static void main (String [] args){


        toUseMemoryCalculate(25, 45);

    }

    static void toUseMemoryCalculate(int a, int b){
        toUseMemoryCalculate(5, 12);
    }

}
