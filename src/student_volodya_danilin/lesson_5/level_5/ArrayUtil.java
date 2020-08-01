package student_volodya_danilin.lesson_5.level_5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public int [] fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int i = 0; i <array.length; i++) {
            array[i] = randomNumber.nextInt(100);
        }
        /*array[4] = 10; //проверка методов
        array[6] = 888;
        array[7] = 10;
        array[8] = 888;
        array[9] = 888;*/
        return array;
    }

    public boolean checkArrayForNumber (int[] array, int searchValue) {
        boolean result = false;

        for (int i : array) {
            if (i == searchValue) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int checkHowManyTimesNumber (int[] array, int searchValue) {
        int result = 0;

        for (int i : array) {
            if(i == searchValue) {
                result++;
            }
        }
        return result;
    }

    public int[] replaceGivenNumberOnce (int[] array, int searchValue, int newValue) {
        int result;
        for (int i = 0; i < array.length; i++){
            if(array[i] == searchValue) {
                array[i] = newValue;
                break;
            }
        }
        return array;
    }

    public int[] replaceGivenNumber (int[] array, int searchValue, int newValue, int count) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                array[i] = newValue;
                counter++;
            }
            if (counter >= count) {
                break;
            }
        }
        return array;
    }

    public int[] sortArray (int[] array) {
        boolean isChanged = true;
        int x;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if(array[i] > array[i + 1]) {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                    isChanged = true;
                }
            }
        }
        return array;
    }

    public int[] reverseArray (int[] array) {

        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

}


class ArrayUtilTest {

    private int[] newArray;
    private ArrayUtil arrayUtil;

    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();

        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.printArray("Creating new array...");

        arrayUtilTest.shouldFillArrayWithRandomNumbers();
        arrayUtilTest.printArray("Filling new array...");

        arrayUtilTest.shouldCheckArrayForNumber();
        arrayUtilTest.shouldCheckHowManyTimesNumber();

        arrayUtilTest.printArray("Array before replacing first number 10");
        arrayUtilTest.shouldCheckForNumberAndReplace();
        arrayUtilTest.printArray("Array after replacing first number 10");

        arrayUtilTest.shouldReplaceGivenNumber();
        arrayUtilTest.printArray("Array after replacing number 888 2 times");

        arrayUtilTest.shouldReverseArray();
        arrayUtilTest.printArray("Array after reverse");

        arrayUtilTest.shouldSortArray();
        arrayUtilTest.printArray("Array after sorting");

    }

    public void printArray(String title) {
        System.out.println(title);
        System.out.println(Arrays.toString(this.newArray));
    }

    public void shouldCreateArray () {
        this.arrayUtil = new ArrayUtil();
        this.newArray  = arrayUtil.createArray(10);
    }

    public void shouldFillArrayWithRandomNumbers() {
        this.arrayUtil.fillArrayWithRandomNumbers(this.newArray);
    }

    public void shouldCheckArrayForNumber () {
        int[] testArray = this.newArray;
        int searchValue = 10;
        boolean result = this.arrayUtil.checkArrayForNumber(testArray, searchValue);
        System.out.print("Does have 10? : ");
        System.out.println(result);
    }

    public void shouldCheckHowManyTimesNumber () {
        int[] testArray = this.newArray;
        int searchValue = 10;
        int result = this.arrayUtil.checkHowManyTimesNumber(testArray, searchValue);
        System.out.println("Number " + searchValue + " appears " + result + " times!");
    }

    public void shouldCheckForNumberAndReplace () {
        int[] testArray = this.newArray;
        int searchValue = 10;
        int newValue = 222;

        this.newArray = this.arrayUtil.replaceGivenNumberOnce(testArray, searchValue, newValue);
    }

    public void shouldReplaceGivenNumber () {
        int[] testArray = this.newArray;
        int searchValue = 888;
        int newValue = 333;
        int count = 2;

        this.newArray = this.arrayUtil.replaceGivenNumber(testArray, searchValue, newValue, count);
    }

    public void shouldReverseArray () {
        this.newArray = this.arrayUtil.reverseArray(this.newArray);
    }

    public void shouldSortArray () {
        this.newArray = this.arrayUtil.sortArray(this.newArray);
    }
}

