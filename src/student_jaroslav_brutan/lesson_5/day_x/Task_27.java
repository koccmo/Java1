package student_jaroslav_brutan.lesson_5.day_x;

public class Task_27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(6);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Max number is " + arrayUtil.findMaxNumber(array));
    }
}
