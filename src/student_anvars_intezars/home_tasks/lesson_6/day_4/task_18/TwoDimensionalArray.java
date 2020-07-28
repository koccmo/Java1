package student_anvars_intezars.home_tasks.lesson_6.day_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {

    public void fillTwoDimensionalArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = random.nextInt(10);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }

    public int sumOfRandomNumbers(int[][] array) {
        Random random = new Random();

        // ставь фигурные скобки у цикла for в любом случае
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = random.nextInt(10);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                sum = sum + array[i][j];
        }
        return sum;
    }
}

