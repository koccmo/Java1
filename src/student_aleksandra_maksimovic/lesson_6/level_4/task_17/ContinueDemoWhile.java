package student_aleksandra_maksimovic.lesson_6.level_4.task_17;

public class ContinueDemoWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}