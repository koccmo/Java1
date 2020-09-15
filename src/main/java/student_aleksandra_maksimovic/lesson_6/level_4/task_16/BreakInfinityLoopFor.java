package student_aleksandra_maksimovic.lesson_6.level_4.task_16;

public class BreakInfinityLoopFor {
    public static void main(String[] args) {
        int j = 10;
        for (;;) {
            System.out.println("for loop #" + j);
            if (--j == 0) {
                System.out.println("breaking for loop");
                break;
            }

        }
    }
}
