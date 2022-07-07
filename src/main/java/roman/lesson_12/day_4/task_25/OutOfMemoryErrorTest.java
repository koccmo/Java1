package roman.lesson_12.day_4.task_25;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            integerList.add(i);
        }
    }
}
