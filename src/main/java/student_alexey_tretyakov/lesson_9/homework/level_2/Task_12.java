package student_alexey_tretyakov.lesson_9.homework.level_2;

 class Task_12 {
    static class A {
        public A() {
            System.out.println("Class A Constructor");
        }
    }

    static class B extends A {
        public B() {
            System.out.println("Class B Constructor");
        }
    }

    static class C extends B {
        public C() {
            System.out.println("Class C Constructor");
        }
    }

    public static void main(String[] args) {
            C c = new C();
           c.toString();
    }

}
