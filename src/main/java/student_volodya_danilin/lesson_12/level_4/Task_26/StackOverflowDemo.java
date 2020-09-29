package student_volodya_danilin.lesson_12.level_4.Task_26;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StackOverflowDemo {

    public static void main(String[] args) {

        StackOverflowDemo demo = new StackOverflowDemo();
        demo.stackOverflowExample();

    }

    void stackOverflowExample() {
        stackOverflowExample();
    }
}
