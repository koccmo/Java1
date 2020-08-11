package student_eduards_jasvins.lesson_7.day_6.task_13;

import java.util.Arrays;

public class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] numbersArray = new int[in.length];
        int arraynumber = 0;
        for (int number : in) {
            if (number >= leftBound && number <= rightBound) {
                numbersArray[arraynumber++] = number;
            }
        }
        return Arrays.copyOf(numbersArray, arraynumber);
    }
}
