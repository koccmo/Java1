package student_anvars_intezars.home_tasks.lesson_9.level_2.task8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;


}
/*
Не имеет никакого смысла делать классы с модификаторм доступа "Protected".
Также сама Java запрещает делать класс с таким доступом модификатора.
На уровне класс допустимо использовать только модификатор доступа(МД) "Public",
либо "Package level access" т.е. не укывать МД.
 */
