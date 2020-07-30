package student_valerija_ionova.lesson_9.level_3.task_16;

/*Почему не компилируется код приведённый ниже?
        Исправьте ошибку компиляции.

        Конструктор - первая строчкА!

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        super();
        System.out.println(2);
    }
}*/

public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
