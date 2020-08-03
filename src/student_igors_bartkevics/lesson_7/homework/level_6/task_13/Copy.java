package student_igors_bartkevics.lesson_7.homework.level_6.task_13;

class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] out = new int[(rightBound+1) - leftBound];
        int j = 0;
        for (int i = leftBound; i < (rightBound+1); i++) {
            out[j] = in[i];
            j++;
        }
        return out;
    }

}
