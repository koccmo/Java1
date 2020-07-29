package student_anvars_intezars.home_tasks.lesson_6.day_4.task_17;

public class InfiniteLoopWhile {

    public static void main(String[] args) {

        int a = 4;
        int b = 100;

        while (a < b) {
            System.out.println(a);
            a++;
            break;
        }
    }
}
