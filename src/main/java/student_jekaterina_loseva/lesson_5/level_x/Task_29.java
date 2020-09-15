package student_jekaterina_loseva.lesson_5.level_x;

public class Task_29 {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] array = util.createArrayWithRandomLength();
        util.fillArrayWithRandomNumbers(array);
        util.printArrayToConsole(array);
        util.findEvenNumbers(array);
    }

}
