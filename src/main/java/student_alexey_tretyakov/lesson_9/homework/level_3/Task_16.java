package student_alexey_tretyakov.lesson_9.homework.level_3;

class Task_16 {
    public static class SuperClassConstructorInvoker {
        public SuperClassConstructorInvoker() {
            System.out.println(1);
            // super();
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        SuperClassConstructorInvoker superClassConstructorInvoker = new SuperClassConstructorInvoker();
        superClassConstructorInvoker.toString();
    }
}
