package roman.lesson_10.day_x.task_2;


import java.util.Arrays;

public class MyListImplTest {
    public static void main(String[] args) {
        MyListImplTest test = new MyListImplTest();
        test.addElementToArray();
        test.ifElementInArray();
        test.deleteElementFromArrayBuyIndex();
        test.sizeOfArrayNoElements();
        test.sizeOfArrayWithTreeElements();
        test.addedElementBuyIndex();

    }

    public void addedElementBuyIndex() {
        MyListImpl intArray = new MyListImpl();
        intArray.addElement(2);
        intArray.addElement(1);
        intArray.addElement(9);
        intArray.addInMiddleElement(1, 8);
        checkResult(Arrays.toString(intArray.getArray()).compareTo("[2, 8, 1, 9]") == 0,
                "Add element buy index");
        System.out.println(Arrays.toString(intArray.getArray()));
    }

    public void sizeOfArrayWithTreeElements() {
        MyListImpl intArray = new MyListImpl();
        intArray.addElement(2);
        intArray.addElement(1);
        intArray.addElement(9);
        checkResult(intArray.size() == 3, "Size of array with tree elements");
    }

    public void sizeOfArrayNoElements() {
        MyListImpl intArray = new MyListImpl();
        checkResult(intArray.size() == 0, "Check size of array");
    }

    public void deleteElementFromArrayBuyIndex() {
        MyListImpl numberArray = new MyListImpl();
        numberArray.addElement(7);
        numberArray.addElement(3);
        numberArray.addElement(1);
        numberArray.deleteElementByIndex(1);
        checkResult(Arrays.toString(numberArray.getArray()).compareTo("[7, 1]") == 0,
                "Delete element buy index from array");
    }

    public void ifElementInArray() {
        MyListImpl numberArray = new MyListImpl();
        numberArray.addElement(9);
        numberArray.addElement(5);
        checkResult(numberArray.contains(5) && numberArray.contains(9),
                "If array contains element");
    }

    public void addElementToArray() {
        MyListImpl numberArray = new MyListImpl();
        numberArray.addElement(2);
        checkResult(Arrays.toString(numberArray.getArray()).compareTo("[2]") == 0,
                "Add element to array");
    }


    public void checkResult(boolean condition, String nameOfTest) {
        System.out.println(condition ? nameOfTest + " Test = OK!" : nameOfTest + " Test = FAIL!");
    }
}
