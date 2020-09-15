package student_anvars_intezars.home_tasks.lesson_6.day_4.task_16;

public class InfiniteLoopWhile {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 100;

        while (firstNumber < secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}

