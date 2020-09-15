package student_roberts_kupcs.lesson_9.level_1.Task_7;

//Исправьте код класса PrivateClass так, что бы он компилировался.
//
//private class PrivateClass {
//
//    private String title;
//    private String author;
//
//
//}
//
//Как вы думаете, почему private классы создавать нельзя?
//Напиши свой ответ в коментарии над исправленным кодом.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PrivateClass {    //Модификатор private здесь запрещен

    //Приватный класс верхнего уровня не имеет большого смысла,
    // потому что на него нельзя ссылаться ни из одного класса.

    private String title;
    private String author;

}
