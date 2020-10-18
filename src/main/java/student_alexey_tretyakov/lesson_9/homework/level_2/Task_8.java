package student_alexey_tretyakov.lesson_9.homework.level_2;

class Task_8 {
    static class ProtectedClass {

        private String title;
        private String author;


    }

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        System.out.println( protectedClass.title + " +++ " + protectedClass.author);
    }
}
