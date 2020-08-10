package student_dmitrijs_jasvins.lesson_7.day_6.task_13;

import java.util.Arrays;

public class CopyInRange {
    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] temp = new int[in.length];
        int numberFound = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                temp[numberFound++] = number;
            }
        }
        return Arrays.copyOf(temp, numberFound);
    }
}
