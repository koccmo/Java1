package student_anvars_intezars.home_tasks.lesson_12.level_4.task_26;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StackOverflowErrorDemo {

    public static void recursivePrint(int num ) {
        System.out.println("Number: " + num);

        if (num == 0) {
            return;
        } else {
            recursivePrint(++num);
        }
    }

    public static void main(String[] args) {
        StackOverflowErrorDemo.recursivePrint(1);

    }
}
