package student_valerija_ionova.lesson_7.homeworks.level_6.task_13;

/*Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int leftBound, int rightBound) - вернуть новый массив,
в который входят только те числа, который находятся в рамках границы включительно.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/

import java.util.Arrays;

public class CopyTest {

    public static void main(String[] args){
        CopyTest copyTest = new CopyTest();

        copyTest.testArrayAllNumbersInDiapazone();
        copyTest.testArraySmallDiapazone();
        copyTest.testArrayNotAllNumbersInDiapazone();
    }

    public void checkIntArray(String name, int [] methodsResult, int [] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testArrayAllNumbersInDiapazone(){
        Copy copy = new Copy();
        int [] arrayForCheck = {1, 2, 3, 4, 5};
        int [] expectedResults = {1, 2, 3, 4, 5};
        checkIntArray("testArrayAllNumbersInDiapazone", copy.copyInRange(arrayForCheck,1,5), expectedResults);
    }

    public void testArraySmallDiapazone(){
        Copy copy = new Copy();
        int [] arrayForCheck = {1, 2, 3, 4, 5};
        int [] expectedResults = {3};
        checkIntArray("testArrayAllNumbersInDiapazone", copy.copyInRange(arrayForCheck,3,3), expectedResults);
    }

    public void testArrayNotAllNumbersInDiapazone(){
        Copy copy = new Copy();
        int [] arrayForCheck = {1, 2, 3, 4, 5};
        int [] expectedResults = {2, 3, 4};
        checkIntArray("testArrayAllNumbersInDiapazone", copy.copyInRange(arrayForCheck,2,4), expectedResults);
    }

}
