package student_aleksandra_maksimovic.lesson_5.level_5_6;

import student_aleksandra_maksimovic.testing.Tester;

/*
32-Создайте класс ArrayUtilTest.
 В этом классе напишите автоматический тест
 метода int[] createArray(int arrayLength)
 из предыдущего задания.

34!!!???????-В классе ArrayUtilTest напишите автоматический тест
 метода void fillArrayWithRandomNumbers(int[] array)
 из предыдущего задания.

37- В классе ArrayUtilTest напишите автоматический тест
 ля метода int findMaxNumber(int[] array)
 из предыдущего задания.

39-В классе ArrayUtilTest напишите автоматический тест
 для метода int findMinNumber(int[] array)
 из предыдущего задания.

 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        var tester = new Tester();

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] arrTest =  arrayUtil.createArray(6);
        tester.check(arrTest.length == 6, "ArrayUtil createArray test #1");


        int[] arr1 = new int[] { 34, 10, 15, 1, 5 };
        tester.check(arrayUtil.findMinNumber(arr1) == 1, "ArrayUtil findMinNumber test #1");
        tester.check(arrayUtil.findMaxNumber(arr1) == 34,"ArrayUtil findMaxNumber test #1");

    }


}
