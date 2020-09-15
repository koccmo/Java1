package student_anvars_intezars.home_tasks.lesson_10.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

    //При помощи данного метода, у пользователья будет возможность добавить новый эелемент списка данных
    void addElement (int element);

    //Удаление конретного элемента по индексу
    void removeElement(int index);

    //Получение длины массива
    int getSize();

    //Получение элемента массива по индексу
    int getElement(int index);
}
