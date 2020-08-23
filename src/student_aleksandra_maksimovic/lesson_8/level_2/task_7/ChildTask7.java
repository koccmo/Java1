package student_aleksandra_maksimovic.lesson_8.level_2.task_7;
/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ChildTask7 extends Task_7 {
    private int value;
    public ChildTask7(String title, int value) {
        super(title);
        this.value = value;
    }
}

