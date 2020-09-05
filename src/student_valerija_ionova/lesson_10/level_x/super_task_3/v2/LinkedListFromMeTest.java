package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

public class LinkedListFromMeTest {

    public static void main (String [] args){

        LinkedListFromMeTest linkedListFromMeTest = new LinkedListFromMeTest();

        linkedListFromMeTest.testLengthOfEmptyList();
        linkedListFromMeTest.testLengthOfNotEmptyList();

        linkedListFromMeTest.testOfGetElementByIdZero();
        linkedListFromMeTest.testOfGetElementByIdThree();

    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testLengthOfEmptyList(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        printResult("testLengthOfEmptyList", myList.sizeOfList() == 0);
    }

    void testLengthOfNotEmptyList(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        printResult("testLengthOfNotEmptyList", myList.sizeOfList() == 1);
    }

    void testOfGetElementByIdZero(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(2, null);

        printResult("testOfGetElementByIdZero", myList.getElement(0).equals(expectedResult));
    }

    void testOfGetElementByIdThree(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5); //3

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(5, null);

        printResult("testOfGetElementByIdThree", myList.getElement(3).equals(expectedResult));
    }



}
