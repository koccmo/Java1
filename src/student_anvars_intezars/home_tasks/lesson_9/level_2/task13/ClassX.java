package student_anvars_intezars.home_tasks.lesson_9.level_2.task13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ClassX {

    public ClassX(int i) {
        System.out.println(1);
    }

    public ClassX() {

    }
}

@CodeReview(approved = true)
class ClassY extends ClassX {
    public ClassY() {
        super();
        System.out.println(2);
    }
}
