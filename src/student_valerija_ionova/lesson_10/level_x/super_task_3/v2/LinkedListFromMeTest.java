package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

public class LinkedListFromMeTest {

    public static void main (String [] args){

        LinkedListFromMeTest linkedListFromMeTest = new LinkedListFromMeTest();

        linkedListFromMeTest.testLengthOfEmptyList();
        linkedListFromMeTest.testLengthOfNotEmptyList();

        linkedListFromMeTest.testOfGetElementByIdZero();
        linkedListFromMeTest.testOfGetElementByIdThree();

        linkedListFromMeTest.testOfAddFirstElement();
        linkedListFromMeTest.testOfAddThirdElement();

        linkedListFromMeTest.testOfDeleteFirstElementCheckOfElement();
        linkedListFromMeTest.testOfDeleteFirstElementCheckOfLength();
        linkedListFromMeTest.testOfDeleteThirdElementLength();
        linkedListFromMeTest.testOfDeleteThirdElementForNextElement();
        linkedListFromMeTest.testOfDeleteThirdElementForLastElement();
        linkedListFromMeTest.testOfDeleteLastElement();


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

    void testOfAddFirstElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(34);
        myList.addElement(56);

        int expectedResult = 34;

        printResult("testOfAddFirstElement", myList.getElement(0).getInformation() == expectedResult);
    }

    void testOfAddThirdElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4); //third added
        myList.addElement(5);

        int expectedResult = 4;

        printResult("testOfAddThirdElement", myList.getElement(2).getInformation() == expectedResult);
    }

    void testOfDeleteFirstElementCheckOfElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(34);
        myList.addElement(56);

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(56, null);

        myList.deleteElement(0);

        printResult("testOfDeleteFirstElementCheckOfElement", myList.getElement(0).equals(expectedResult));
    }

    void testOfDeleteFirstElementCheckOfLength(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(34);
        myList.addElement(56);

        int expectedResult = 1;
        myList.deleteElement(0);

        printResult("testOfDeleteFirstElementCheckOfLength", myList.sizeOfList() == expectedResult);
    }

    void testOfDeleteThirdElementLength(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5); //third added
        myList.addElement(6);

        int expectedResult = 4;
        myList.deleteElement(3);
        printResult("testOfDeleteThirdElementLength", myList.sizeOfList() == expectedResult);
    }

    void testOfDeleteThirdElementForNextElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5); //third added
        myList.addElement(6);

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(6, null);
        myList.deleteElement(3);

        printResult("testOfDeleteThirdElementForNextElement", myList.getElement(3).equals(expectedResult));
    }

    void testOfDeleteThirdElementForLastElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5); //third added
        myList.addElement(6);

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(4, new ElementOfLinkedList(6, null));
        myList.deleteElement(3);

        printResult("testOfDeleteThirdElementForLastElement", myList.getElement(2).equals(expectedResult));
    }

    void testOfDeleteLastElement(){
        LinkedListFromMe linkedListFromMe = new LinkedListFromMe();
        MyListImpl myList = new MyListImpl(linkedListFromMe);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5);

        ElementOfLinkedList expectedResult = new ElementOfLinkedList(4, null);
        myList.deleteElement(3);

        printResult("testOfDeleteLastElement", myList.getElement(2).equals(expectedResult));
    }



}
