package student_valerija_ionova.lesson_10.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {


    void addElement(String string); // Добавляет элемент в массив

    void insertElement(int index, String string); // Вставляет элемент в середину массива

    void deleteElement(int index); //Удаляет ячейку массива, сокращая его длину

}