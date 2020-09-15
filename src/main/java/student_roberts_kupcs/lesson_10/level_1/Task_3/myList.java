package student_roberts_kupcs.lesson_10.level_1.Task_3;

import java.util.Collections;

interface myList {
    //вставляет obj в вызывающий список в позицию, указанную в index
    void addObj(int index, int obj);

    //удаляет элемент из вызывающего списка в позиции index
    int removeObj(int index);

    //Вставляет все элементы в вызывающий список по индексу
    boolean addMuchObj(int index, Collections a);
}
