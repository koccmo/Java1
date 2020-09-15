package student_anvars_intezars.home_tasks.lesson_6.day_4.task_16;

public class InfiniteLoopFor {

    public static void main(String[] args) {

        /*int firstNumber = 1;

        while ( firstNumber < 11) {
            System.out.println(firstNumber);
            firstNumber++;
        }
        for (firstNumber = 1, firstNumber < 11, firstNumber++) {
            System.out.println(firstNumber);
        }*/


        int [] array = {1,2,3,4,5,6};
        int number = 1;

        for(int i : array) {
            number *= i;
        }
        System.out.println(number);

    }
}
