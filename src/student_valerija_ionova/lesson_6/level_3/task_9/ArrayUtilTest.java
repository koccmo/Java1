package student_valerija_ionova.lesson_6.level_3.task_9;

/*Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.*/

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.testIfContainsNumberTrue();
        test.testIfContainsNumberFalse();
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

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = arrayUtil.createArray(5);


        if (arrayForTest.length == 5){
            System.out.println("Method createArray is working");
        }else{
            System.out.println("Method createArray isn't working");
        }
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

}
