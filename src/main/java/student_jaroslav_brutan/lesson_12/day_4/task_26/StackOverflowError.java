package student_jaroslav_brutan.lesson_12.day_4.task_26;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StackOverflowError {

    public static void main(String[] args) {
        sayHi();
    }

    static void sayHi(){
        System.out.println("Hi there mate!");
        sayHi();
    }
}
