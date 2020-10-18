package student_dmitrijs_jasvins.lesson_12.day_4.task_25;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        while (true) {
            list.add(new Object());
        }

    }
}
