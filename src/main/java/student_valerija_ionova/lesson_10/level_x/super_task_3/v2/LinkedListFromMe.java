package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LinkedListFromMe {


    private ElementOfLinkedList lastElement;

    private ElementOfLinkedList firstElement;

    private int lengthOfList;

    int getLengthOfList(){
        return lengthOfList;
    }

    LinkedListFromMe(){
        firstElement = new ElementOfLinkedList();
        lastElement = firstElement;
    }


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

    void deleteElementFromList(int index) {
        ElementOfLinkedList exElement = firstElement;
        ElementOfLinkedList nextElement = getElementOfListByIndex(0);
        for (int i = 0; i <= index; i++){
            if (i == index) {
                exElement.setAddress(nextElement.getAddress());
            }else {
                exElement = nextElement;
                nextElement = nextElement.getAddress();
            }
        }
        lengthOfList --;
    }

    void insertElement(int index, int number) {
        if (index == lengthOfList){
            addElement(number);
        }else{
            ElementOfLinkedList exElement;
            if (index == 0){
                exElement = firstElement;
            }else{
                exElement = getElementOfListByIndex(index-1);
            }
            ElementOfLinkedList nextElement = getElementOfListByIndex(index);
            exElement.setAddress(new ElementOfLinkedList(number, nextElement));
        }
        lengthOfList ++;
    }

}
