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
        ArrayUtil arrayUtil1 = new ArrayUtil();
        int[] firstArray = arrayUtil1.createArray(5);
        if(firstArray.length == 5) {
            System.out.println("Create Array Test = OK");
        }
        else {
            System.out.println("Create Array Test = FAIL");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil2 = new ArrayUtil();
        int[] secondArray = arrayUtil2.createArray(5);
        arrayUtil2.fillArrayWithRandomNumbers(secondArray);
        System.out.println("Method Fill array with random numbers works:" );
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        // Буду еще думать над тестом. Сам метод работает. Пока не разобрался как лучше
        //затестить. Это не дает мне покоя )))
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil3 = new ArrayUtil();
        int[] thirdArray = arrayUtil3.createArray(5);
        arrayUtil3.fillArrayWithRandomNumbers(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        arrayUtil3.findMaxNumber(thirdArray);
    }
    public void shouldFinMinNumber() {
        ArrayUtil arrayUtil4 = new ArrayUtil();
        int[] fourthArray = arrayUtil4.createArray(4);
        arrayUtil4.fillArrayWithRandomNumbers(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        arrayUtil4.findMinNumber(fourthArray);
    }

}


