package student_jaroslav_brutan.lesson_5.day_x;

public class Task_25 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromUser();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
