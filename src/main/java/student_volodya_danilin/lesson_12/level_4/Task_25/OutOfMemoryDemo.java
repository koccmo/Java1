package student_volodya_danilin.lesson_12.level_4.Task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryDemo {

    public static void main(String[] args) {

        OutOfMemoryDemo demo = new OutOfMemoryDemo();
        demo.outOfMemoryExample();


    }

    void outOfMemoryExample() {

        List<Long> testList = new ArrayList<>();

        while (true) {
            testList.add(5L);
            testList.addAll(testList);
        }
    }
}
