package student_sandra_arniece.lesson_5.level_x;

class UserLengthRandomArray {

    public static void main(String[] args) {
        ArrayUtil xxx = new ArrayUtil();
        int[] array = xxx.createUserLengthArray(xxx.getArrayLengthFromUser());
        xxx.fillArrayWithRandomNumbers(array);
        xxx.printArray(array);
    }

}
