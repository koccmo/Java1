package student_eduards_jasvins.lesson_10.day_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

    String[] addElement(String text);

    String[] deleteElement(int index);

    String[] findElement(int index);
}
