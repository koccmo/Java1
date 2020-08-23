package student_dmitrijs_jasvins.lesson_8.day_2.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Cat extends Animal {
    private String tail;

    private Cat(String name, int age, String tail) {
        super(name, age);
        this.tail = tail;
    }
}
