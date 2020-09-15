/*
Исправьте код класса ProtectedClass так, что бы он компилировался.

protected class ProtectedClass {

    private String title;
    private String author;

}

Как вы думаете, почему protected классы создавать нельзя?
Напиши свой ответ в коментарии над исправленным кодом.
 */
package student_igors_bartkevics.lesson_9.homework.level_2.task_8;
/*
Protected классы создавать нельзя так как в противном случае не было бы возможным
наследоваться от класса Protected из других пакетов. Таким образом класс с модификатором
доступа Protected ни чем не отлечался бы от класса с дефолтным модификатором доступа.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;

}

