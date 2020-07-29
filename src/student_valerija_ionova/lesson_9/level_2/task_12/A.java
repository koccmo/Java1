package student_valerija_ionova.lesson_9.level_2.task_12;

/*Какой будет результат выполнения следующей программы?

Class A Constructor
Class B Constructor
Class C Constructor

Родительский конструктор -> Дочерний -> Внучатый :)

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}*/
