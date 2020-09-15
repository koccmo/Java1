package student_aleksandra_maksimovic.lesson_6.level_4.task_16;

public class BrakeInfinityLoopWhile {
    public static void main(String[] args) {
        int i = 10;
        while(true) {
            System.out.println("while loop #" + i);
            if (--i == 0) {
                System.out.println("breaking loop");
                break;
            }
        }

    }

}
