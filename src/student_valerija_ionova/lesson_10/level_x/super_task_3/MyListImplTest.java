package student_valerija_ionova.lesson_10.level_x.super_task_3;

import java.util.LinkedList;

class MyListImplTest {

    public static void main (String [] args){

        MyListImplTest myListImplTest = new MyListImplTest();

        myListImplTest.testAdd();
        myListImplTest.testInsertSecond();
        myListImplTest.testInsertFirst();
        myListImplTest.testDeleteFirst();
        myListImplTest.testDeleteSecond();
    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testAdd(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        MyListImpl myList = new MyListImpl(list);
        myList.addElement(3);
        LinkedList expectedList = new LinkedList();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        printResult("testAdd", list.equals(expectedList));
    }

    void testInsertSecond(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        MyListImpl myList = new MyListImpl(list);
        myList.insertElement(1,3);
        LinkedList expectedList = new LinkedList();
        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(2);
        printResult("testInsertSecond", list.equals(expectedList));
    }

    void testInsertFirst(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        MyListImpl myList = new MyListImpl(list);
        myList.insertElement(0,3);
        LinkedList expectedList = new LinkedList();
        expectedList.add(3);
        expectedList.add(1);
        expectedList.add(2);
        printResult("testInsertFirst", list.equals(expectedList));
    }

    void testDeleteFirst(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        MyListImpl myList = new MyListImpl(list);
        myList.deleteElement(0);
        LinkedList expectedList = new LinkedList();
        expectedList.add(2);

        printResult("testDeleteFirst", list.equals(expectedList));
    }

    void testDeleteSecond(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        MyListImpl myList = new MyListImpl(list);
        myList.deleteElement(2);
        LinkedList expectedList = new LinkedList();
        expectedList.add(1);
        expectedList.add(2);

        printResult("testDeleteSecond", list.equals(expectedList));
    }

}
