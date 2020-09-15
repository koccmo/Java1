package student_jekaterina_loseva.lesson_5.level_x;

public class Task_27 {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] array = util.createArrayWithRandomLength();
        util.fillArrayWithRandomNumbers(array);
        util.printArrayToConsole(array);
        int maxNumber = util.findMaxNumber(array);
        System.out.println("Max number is - " +  maxNumber);
    }

}
