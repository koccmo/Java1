package roman.lesson_5.homework.day_5.task_33;

import java.util.Random;

public class ArrayUtil {
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
