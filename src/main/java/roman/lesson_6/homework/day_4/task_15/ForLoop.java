package roman.lesson_6.homework.day_4.task_15;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop test = new ForLoop();
        test.forEndLess();
    }

    public void forEndLess () {
        for (int i = 0; i > -1; i++) {
            System.out.println(i);
        }
    }
}
