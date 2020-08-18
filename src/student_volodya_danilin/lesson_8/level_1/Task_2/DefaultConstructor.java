package student_volodya_danilin.lesson_8.level_1.Task_2;


/*
Если не создавать дефолтный конструктор то компилятор сам его добавит. В этом случае
мы будем видеть конструктор не в source файле (.java) а в bytecode (.class) т.к.
конструктор будет добавлен во время компиляции.
 */


public class DefaultConstructor {


    public static void main(String[] Args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
    }
}
