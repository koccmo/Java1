package student_alexey_tretyakov.lesson_9.homework.level_2;

public class Task_13 {
    static class ClassX {
        public ClassX(int i) {
            System.out.println(1);
        }
    }

    static class ClassY extends ClassX {
        public ClassY(int i) {
            super(i);
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        ClassY classY = new ClassY(5);
        classY.toString();
        //System.out.println(s);
    }
}
