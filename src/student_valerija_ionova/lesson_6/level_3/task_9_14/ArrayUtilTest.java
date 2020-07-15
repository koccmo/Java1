package student_valerija_ionova.lesson_6.level_3.task_9_14;

/*Task9
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task10
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task11
Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task12
Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task13
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task14
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
*/

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.testIfContainsNumberTrue();
        test.testIfContainsNumberFalse();
        test.testHowMuchNumbersXinArray0();
        test.testHowMuchNumbersXinArray1();
        test.testHowMuchNumbersXinArray2();
        test.testReplaceOnlyOneNumber();
        test.testReplaceOneFromTwoNumbers();
        test.testReplaceNoNumber();
        test.testReplaceAllOnlyOneNumber();
        test.testReplaceAllNoNumber();
        test.testReplaceAllTwoNumbers();
        test.testSortedArray();
        test.testReverseArray();

    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkArray(String name, int [] methodsResult, int [] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = arrayUtil.createArray(5);


        checkInt("shouldCreateArray", arrayForTest.length, 5);

    }

    public void shouldFindMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};

        checkInt("testFindMaxNumber", arrayUtil.findMaxNumber(arrayForTest), 8);

    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};

        checkInt("Test FinfMinNumber", arrayUtil.findMinNumber(arrayForTest), 0);
    }

    public void testIfContainsNumberTrue() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};

        checkBoolean("TestIfContainsNumberTrue", arrayUtil.ifContainsNumber(3, arrayForTest), true);
    }

    public void testIfContainsNumberFalse() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};

        checkBoolean("TestIfContainsNumberFalse", arrayUtil.ifContainsNumber(4, arrayForTest), false);
    }

    public void testHowMuchNumbersXinArray0(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        checkInt("testHowMuchNumbersXinArray0", arrayUtil.howMuchNumbersXinArray(9, arrayForTest), 0);
    }

    public void testHowMuchNumbersXinArray1(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        checkInt("testHowMuchNumbersXinArray1", arrayUtil.howMuchNumbersXinArray(8, arrayForTest), 1);
    }

    public void testHowMuchNumbersXinArray2(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        checkInt("testHowMuchNumbersXinArray2", arrayUtil.howMuchNumbersXinArray(5, arrayForTest), 2);
    }

    public void testReplaceOnlyOneNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replace(arrayForTest, 7, 55);
        int [] expectedArray = {1, 5, 5, 55, 8, 0};
        checkArray("Test replaceOnlyOneNumber", arrayForTest, expectedArray);

    }

    public void testReplaceOneFromTwoNumbers(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replace(arrayForTest, 5, 66);
        int [] expectedArray = {1, 66, 5, 7, 8, 0};
        checkArray("public void replaceTwoNumbers", arrayForTest, expectedArray);
    }

    public void testReplaceNoNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replace(arrayForTest, 9, 55);
        int [] expectedArray = {1, 5, 5, 7, 8, 0};
        checkArray("public void replaceNoNumber", arrayForTest, expectedArray);
    }

    public void testReplaceAllOnlyOneNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replaceAll(arrayForTest, 7, 55);
        int [] expectedArray = {1, 5, 5, 55, 8, 0};
        checkArray("Test replaceAllOnlyOneNumber", arrayForTest, expectedArray);

    }

    public void testReplaceAllTwoNumbers(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replaceAll(arrayForTest, 5, 66);
        int [] expectedArray = {1, 66, 66, 7, 8, 0};
        checkArray("Test replaceAllTwoNumbers", arrayForTest, expectedArray);
    }

    public void testReplaceAllNoNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        arrayUtil.replaceAll(arrayForTest, 9, 55);
        int [] expectedArray = {1, 5, 5, 7, 8, 0};
        checkArray("Test replaceAllNoNumber", arrayForTest, expectedArray);
    }

    public void testSortedArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 2, 0, 8, 0};
        arrayUtil.sortArray(arrayForTest);
        int [] expectedArray = {0, 0, 1, 2, 5, 8};
        checkArray("Test SortedArray", arrayForTest, expectedArray);
    }

    public void testReverseArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 5, 5, 7, 8, 0};
        int [] expectedArray = {0, 8, 7, 5, 5, 1};
        checkArray("Test ReverseArray", arrayUtil.reverseArray(arrayForTest), expectedArray);
    }



}
