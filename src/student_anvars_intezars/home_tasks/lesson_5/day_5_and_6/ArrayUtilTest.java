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
        int[] secondArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(secondArray);
        System.out.println("Method Fill array with random numbers works:" );
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        // Буду еще думать над тестом. Сам метод работает. Пока не разобрался как лучше
        //затестить. Это не дает мне покоя )))
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] thirdArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        arrayUtil.findMaxNumber(thirdArray);
    }
    public void shouldFinMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] fourthArray = arrayUtil.createArray(4);
        arrayUtil.fillArrayWithRandomNumbers(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        arrayUtil.findMinNumber(fourthArray);
    }

}


