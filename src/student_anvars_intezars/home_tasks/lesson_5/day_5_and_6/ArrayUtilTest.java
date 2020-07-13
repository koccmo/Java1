package student_anvars_intezars.home_tasks.lesson_5.day_5_and_6;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFinMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] firstArray = arrayUtil.createArray(5);
        if(firstArray.length == 5) {
            System.out.println("Create Array Test = OK");
        }
        else {
            System.out.println("Create Array Test = FAIL");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] firstArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(firstArray);
        System.out.println("Method Fill array with random numbers works:" );
        System.out.println(Arrays.toString(firstArray));
        // Буду еще думать над тестом. Сам метод работает. Пока не разобрался как лучше
        //затестить. Это не дает мне покоя )))
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] firstArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(firstArray);
        arrayUtil.findMaxNumber(firstArray);
    }
    public void shouldFinMinNumber() {
        ArrayUtil arrayUtil1 = new ArrayUtil();
        int[] firstArray = arrayUtil1.createArray(4);
        arrayUtil1.fillArrayWithRandomNumbers(firstArray);
        arrayUtil1.findMinNumber(firstArray);
    }

}


