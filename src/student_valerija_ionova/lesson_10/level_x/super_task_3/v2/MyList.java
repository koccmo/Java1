package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

    int sizeOfList();  //Размер списка

    ElementOfLinkedList getElement (int index);  // Получить элемент листа

    void addElement(int number); // Добавляет элемент в массив

    void insertElement(int index, int number); // Вставляет элемент в середину массива

    void deleteElement(int index); //Удаляет ячейку массива, сокращая его длину

}