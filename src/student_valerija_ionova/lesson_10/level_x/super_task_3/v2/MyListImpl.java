package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

class MyListImpl implements  MyList{

    LinkedListFromMe linkedListFromMe;

    MyListImpl (LinkedListFromMe linkedListFromMe){
        this.linkedListFromMe = linkedListFromMe;
    }

    @Override
    public int sizeOfList() {
        return linkedListFromMe.getLengthOfList();
    }

    @Override
    public ElementOfLinkedList getElement(int index) {
        return linkedListFromMe.getElementOfListByIndex(index);
    }

    @Override
    public void addElement(int number) {
        linkedListFromMe.addElement(number);
    }

    @Override
    public void insertElement(int index, int number) {

    }

    @Override
    public void deleteElement(int index) {
        linkedListFromMe.deleteElementFromList(index);
    }
}
