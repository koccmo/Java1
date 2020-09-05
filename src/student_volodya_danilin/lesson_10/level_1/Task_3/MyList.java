package student_volodya_danilin.lesson_10.level_1.Task_3;

interface MyList {

    void printList(MyList list);
    /*
    Вывод массива на экран
     */

    void searchList(MyList list, String searchValue);
    /*
    Поиск по массиву
     */

    void addToList(MyList list, String stringToAdd);
    /*
    Добавление заданной строки в массив
     */

    void removeFromList(MyList list, String stringToRemove);
    /*
    Поиск и удаление всех заданных строк
     */

}
