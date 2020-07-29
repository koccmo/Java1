package student_sandra_arniece.lesson_5.level_x;

class LowestRandom {

    public static void main(String[] args) {
        ArrayUtil xxx = new ArrayUtil();
        int[] array = xxx.createArray(4);
        xxx.fillArrayWithRandomNumbers(array);
        xxx.printArray(array);
        System.out.println("Lowest number in this array is: " + xxx.findLowestNumber(array));
    }

}
