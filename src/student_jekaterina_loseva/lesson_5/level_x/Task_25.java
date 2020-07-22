package student_jekaterina_loseva.lesson_5.level_x;

public class Task_25 {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int arrayLength = util.getArrayLength();
        int[] array = util.createArray(arrayLength);
        util.fillArrayWithNumbers(array);
        util.printArrayToConsole(array);
    }

}
