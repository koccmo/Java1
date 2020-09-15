package student_aleksandra_maksimovic.lesson_5.level_x.supertask_1;

public class Task26 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getLengthFromUser();
        int [] array =  arrayUtil.newArray(arrayLength);
        arrayUtil.fillRandom(array);
        arrayUtil.printArray(array);
    }
}
