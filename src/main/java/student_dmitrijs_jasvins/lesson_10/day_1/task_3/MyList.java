package student_dmitrijs_jasvins.lesson_10.day_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface MyList {

    void addNewElement(int element); // dobovlaem element;

    boolean contains(int element); // vernem true, esli element v est v liste;

    void removeElement(int element); // udalaem element;
}