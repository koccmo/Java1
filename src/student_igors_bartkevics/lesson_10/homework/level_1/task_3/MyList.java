package student_igors_bartkevics.lesson_10.homework.level_1.task_3;

interface MyList {

    void add(int value); //add new element to end of the list

    void removeByIndex(int index); //remove element with index from list

    int getElement(int index); //get element from list with index

    boolean contains(int value); //return true if list contains element with value

}
