package student_roberts_kupcs.lesson_12.homework.level_3.Task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NullPointerExceptionDemo {
    //исключение случается когда JVM пытается обратиться к null в том месте где должен был быть объект.
    //Получая доступ к или изменяя метод объекта, который равен null.
    //Получая длину массива когда он равен null.
    //Получая доступ к или меняя объекты, которые являются заключенными
    // в массив, который равен null.
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }

}
