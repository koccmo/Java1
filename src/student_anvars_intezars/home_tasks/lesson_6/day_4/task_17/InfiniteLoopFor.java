package student_anvars_intezars.home_tasks.lesson_6.day_4.task_17;

public class InfiniteLoopFor {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        int number = 1;

        for(int i : array) {
            number *= i;
            break;
        }
        System.out.println(number);

    }
    }
