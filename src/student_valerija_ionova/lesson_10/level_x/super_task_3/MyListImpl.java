package student_valerija_ionova.lesson_10.level_x.super_task_3;


import java.util.LinkedList;

class MyListImpl implements MyList {

    LinkedList list = new LinkedList();

    MyListImpl (LinkedList list){
        this.list = list;
    }

    @Override
    public void addElement(int number) {
        list.add(number);
    }

    @Override
    public void insertElement(int index, int number) {
        list.add(index, number);
    }

    @Override
    public void deleteElement(int index) {
        list.remove(index);
    }
}
