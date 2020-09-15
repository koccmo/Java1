/*
Исправьте код класса PrivateClass так, что бы он компилировался.

private class PrivateClass {

    private String title;
    private String author;

}

Как вы думаете, почему private классы создавать нельзя?
Напиши свой ответ в коментарии над исправленным кодом.
 */
package student_igors_bartkevics.lesson_9.homework.level_1.task_7;

/*Сделать класс приватным в Java нельзя, так как в противном
случае класс был бы не доступен для использования в других классах, что
само по себе противоречит сущности использования классов в Java.
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
/*private*/ class PrivateClass {

    private String title;
    private String author;

}
