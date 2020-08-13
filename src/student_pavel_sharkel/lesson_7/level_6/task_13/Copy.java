package student_pavel_sharkel.lesson_7.level_6.task_13;

import java.util.ArrayList;

public class Copy {

    ArrayList<Integer> copyInRange(int[] in, int numberFrom, int numberTo) {
        ArrayList<Integer> selectedArray = new ArrayList<>(in.length);

        for (int i = 0; i < in.length; i++) {
            if ((in[i] > numberFrom) && (in[i] < numberTo)) {
                selectedArray.add(in[i]);

            }
        }
        return selectedArray;
    }
}
