package student_roberts_kupcs.lesson_9.level_2.Task_12;

//Class A Constructor
//Class B Constructor
//Class C Constructor

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

class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
