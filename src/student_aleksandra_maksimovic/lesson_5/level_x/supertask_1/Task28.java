package student_aleksandra_maksimovic.lesson_5.level_x.supertask_1;

public class Task28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArray(12);
        arrayUtil.fillRandom(array);
        arrayUtil.printArray(array);
        System.out.println("Min = " + arrayUtil.findMin(array));
    }
}

