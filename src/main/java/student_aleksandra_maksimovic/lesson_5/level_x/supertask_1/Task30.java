package student_aleksandra_maksimovic.lesson_5.level_x.supertask_1;

public class Task30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArray(25);
        arrayUtil.fillRandom(array);
        arrayUtil.printArray(array);
        arrayUtil.printOddNumbers(array);
    }
}
