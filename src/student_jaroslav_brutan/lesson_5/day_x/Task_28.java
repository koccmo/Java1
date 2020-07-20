package student_jaroslav_brutan.lesson_5.day_x;

public class Task_28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Min number is " + arrayUtil.findMinNumber(array));
    }
}
