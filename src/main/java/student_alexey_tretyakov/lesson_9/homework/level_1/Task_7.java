package student_alexey_tretyakov.lesson_9.homework.level_1;

public class Task_7 {
   private static class PrivateClass {

        private String title = "Book";
        private String author = "Author";

    }

    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();
        System.out.println( privateClass.title);
        System.out.println( privateClass.author);
    }
}
