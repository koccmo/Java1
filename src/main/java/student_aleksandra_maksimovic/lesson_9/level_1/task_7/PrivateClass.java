package student_aleksandra_maksimovic.lesson_9.level_1.task_7;
/*
Исправьте код класса PrivateClass так, что бы он компилировался.

private class PrivateClass {

    private String title;
    private String author;


}

Как вы думаете, почему private классы создавать нельзя?
Напиши свой ответ в коментарии над исправленным кодом.

Уже говорила ранее...Это не имеет смысла, класс будет не дотупен для использования других классов.

  */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PrivateClass {

    private String title;
    private String author;


}

