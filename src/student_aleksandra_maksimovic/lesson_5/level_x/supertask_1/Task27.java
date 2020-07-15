package student_aleksandra_maksimovic.lesson_5.level_x.supertask_1;

public class Task27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil= new ArrayUtil();
        int[] array = arrayUtil.newArray(8);
        arrayUtil.fillRandom(array);
        arrayUtil.printArray(array);
        System.out.println("Max = " + arrayUtil.findMax(array));
    }
}
