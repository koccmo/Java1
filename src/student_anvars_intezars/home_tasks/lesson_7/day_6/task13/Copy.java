package student_anvars_intezars.home_tasks.lesson_7.day_6.task13;

class Copy {

    int[] copyInRange(int[] in, int leftBound, int rightBound) {
            int index = 0;
            int countResult = countNumbersInRange(in,leftBound,rightBound);
            int [] newArray = new int[countResult];
            for ( int i = 0; i < in.length; i++) {
                if ((in[i] >= leftBound) && (in[i] <= rightBound)) {
                    newArray[index] = in[i];
                    index++;
                }
            }
        return newArray;
    }

    int countNumbersInRange(int[] array, int leftBound, int rightBound) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if ((array[j] >= leftBound) && (array[j] <= rightBound)) {
                count ++;
                }
            }
            return count;
        }
}
