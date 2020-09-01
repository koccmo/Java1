package student_roberts_kupcs.lesson_9.level_2.Task_8;

//Исправьте код класса ProtectedClass так, что бы он компилировался.
//
//protected class ProtectedClass {
//
//    private String title;
//    private String author;
//
//
//}
//
//Как вы думаете, почему protected классы создавать нельзя?
//Напиши свой ответ в коментарии над исправленным кодом.

//Вы не можете объявлять защищенные классы на уровне пространства имен, потому что модификатор доступа
// для классов внешнего уровня определяет их видимость по отношению к другим сборкам.
// Защищенная видимость используется для обозначения «видимой для производных классов»;
// это имеет смысл для вещей внутри класса, но обычно не имеет значения на уровне класса.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProtectedClass {

    private String title;
    private String author;

}
