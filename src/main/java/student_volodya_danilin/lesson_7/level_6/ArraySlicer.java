package student_volodya_danilin.lesson_7.level_6;
/*
Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int leftBound, int rightBound) - вернуть новый массив,
в который входят только те числа, который находятся в рамках границы включительно.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import java.util.Arrays;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArraySlicer {

    int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int length = rightBound - leftBound;
        if (length < 0) {
            System.out.println("Incorrect left/right bounds!");
        }
        int[] result = new int[length];
        int j = 0;

        for (int i = leftBound; i < leftBound + length; i++ ) {
            result[j] = in[i];
            j++;
        }

        return result;
    }

}

class ArraySlicerTest {
    ArraySlicer arraySlicer = new ArraySlicer();
    int[] testArray = new int[10];
    int leftBound, rightBound;
    Random randomNumber = new Random();
    public static void main(String[] Args) {
        ArraySlicerTest arraySlicerTest = new ArraySlicerTest();
        arraySlicerTest.createTestArray();
        arraySlicerTest.printTestArray();
        arraySlicerTest.randomizeCopyBounds();
        arraySlicerTest.testCopyInRange();

    }

    void printTestArray() {
        System.out.print(Arrays.toString(this.testArray));
    }

    void createTestArray() {
        this.testArray = new int[10];
        for (int i = 0; i < 10; i++) {
            this.testArray[i] = randomNumber.nextInt(50) + 10;
        }
    }

    void randomizeCopyBounds() {
        System.out.println("\nSetting random left and right bounds...");
        this.leftBound = randomNumber.nextInt(5);
        this.rightBound = randomNumber.nextInt(5) + 5;
        System.out.println("Will copy from " + this.leftBound + " to " + this.rightBound);
    }


    void testCopyInRange() {
        System.out.println("Testing int[] copyInRange...");
        int[] result = arraySlicer.copyInRange(this.testArray, this.leftBound, this.rightBound);
        System.out.println("Resulting array is :" + Arrays.toString(result));

    }
}