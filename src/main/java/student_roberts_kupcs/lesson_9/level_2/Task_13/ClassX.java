package student_roberts_kupcs.lesson_9.level_2.Task_13;

//В 'student_roberts_kupcs.lesson_9.level_2.Task_13.ClassX' нет конструктора по умолчанию

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ClassX {
    public ClassX() {           //...+
    }                           //...+

    public ClassX(int i) {
        System.out.println(1);
    }
}

@CodeReview(approved = true)
class ClassY extends ClassX {
    public ClassY() {
        System.out.println(2);
    }
}
