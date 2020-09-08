package student_aleksandra_maksimovic.lesson_9.level_3.task_16;
/*
Почему не компилируется код приведённый ниже?
Исправьте ошибку компиляции.

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        super();
        System.out.println(2);
    }
}
 */

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();// вызов базового конструктора ,должен идти первой операцией в конструкторе насленика...
        System.out.println(1);
        System.out.println(2);
    }
}
