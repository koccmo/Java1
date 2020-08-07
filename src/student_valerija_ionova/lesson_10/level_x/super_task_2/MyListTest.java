package student_valerija_ionova.lesson_10.level_x.super_task_2;

import java.util.Arrays;

class MyListTest {

    public static void main (String [] args){

        MyListTest myListTest = new MyListTest();

        myListTest.testAdd();
        myListTest.testInsertFirst();
        myListTest.testInsertThird();
        myListTest.testDeleteFirst();
        myListTest.testDeleteSecond();
        myListTest.testDeleteLast();
    }


    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testAdd (){
        String [] arrayStart = {"Bob", "John"};
        String [] expectedArray = {"Bob", "John", "Anna"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.addElement("Anna");
        printResult("testAdd", Arrays.equals(expectedArray,myList.getArray()));
    }

    void testInsertFirst (){
        String [] arrayStart = {"Bob", "John"};
        String [] expectedArray = {"Anna", "Bob", "John"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.insertElement(0,"Anna");
        printResult("testInsertFirst", Arrays.equals(expectedArray,myList.getArray()));
    }

    void testInsertThird (){
        String [] arrayStart = {"Bob", "John", "Alex", "Liza", "Lana"};
        String [] expectedArray = {"Bob", "John", "Alex", "Anna", "Liza", "Lana"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.insertElement(3,"Anna");
        printResult("testInsertThird", Arrays.equals(expectedArray,myList.getArray()));
    }

    void testDeleteFirst (){
        String [] arrayStart = {"Bob", "John", "Alex", "Liza", "Lana"};
        String [] expectedArray = {"John", "Alex", "Liza", "Lana"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.deleteElement(0);
        printResult("testDeleteFirst", Arrays.equals(expectedArray,myList.getArray()));
    }

    void testDeleteSecond (){
        String [] arrayStart = {"Bob", "John", "Alex", "Liza", "Lana"};
        String [] expectedArray = {"Bob", "John", "Liza", "Lana"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.deleteElement(2);
        printResult("testDeleteSecond", Arrays.equals(expectedArray,myList.getArray()));
    }

    void testDeleteLast (){
        String [] arrayStart = {"Bob", "John", "Alex", "Liza", "Lana"};
        String [] expectedArray = {"Bob", "John", "Alex", "Liza"};

        MyListImpl myList = new MyListImpl(arrayStart);
        myList.deleteElement(4);
        printResult("testDeleteFirst", Arrays.equals(expectedArray,myList.getArray()));
    }
}