package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

class LinkedListFromMe {


    private ElementOfLinkedList lastElement;

    private ElementOfLinkedList firstElement;

    private int lengthOfList;

    int getLengthOfList(){
        return lengthOfList;
    }

    ElementOfLinkedList getAddressOfFirstElement(){
        return firstElement.getAddress();
    }

    LinkedListFromMe(){
        firstElement = new ElementOfLinkedList();
        lastElement = firstElement;
    }

    /*
    void createNewLinkedListFromMe(){
        firstElement = new ElementOfLinkedList();
        lastElement = firstElement;
    }*/

    void addElement(int information){
        ElementOfLinkedList newElement = new ElementOfLinkedList();
        newElement.setInformation(information);
        lastElement.setAddress(newElement);
        lastElement = newElement;
        lengthOfList ++;
    }

    ElementOfLinkedList getElementOfListByIndex(int index){
        //Как писать ошибку нужно ещё выучить :))
        ElementOfLinkedList foundedElement = firstElement.getAddress();
        for (int i = 0; i < index; i++){
            foundedElement = foundedElement.getAddress();
        }
        return foundedElement;
    }

}
