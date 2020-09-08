package student_eduards_jasvins.lesson_10.day_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface  ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
