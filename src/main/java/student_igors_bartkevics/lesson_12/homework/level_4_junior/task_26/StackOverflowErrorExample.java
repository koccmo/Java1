package student_igors_bartkevics.lesson_12.homework.level_4_junior.task_26;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StackOverflowErrorExample {

    public static void main(String[] args) {
        printGreeting();
    }

    static void printGreeting() {
        System.out.println("Hello world!");
        printGreeting();
    }

}
