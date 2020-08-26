package student_igors_bartkevics.lesson_10.homework.level_1.task_3;

class MyListImpl implements MyList {

    private int[] array;
    private int currentLength;

    public MyListImpl() {
        this.array = new int[0];
        this.currentLength = array.length;
    }

    @Override
    public void add(int value) {
        int[] newArray = new int[currentLength + 1];
        for (int i = 0; i < array.length; i ++) {
            newArray[i] = array[i];
            if (i == currentLength - 1) {
                newArray[i+1] = value;
            }
        }
        array = newArray;
    }

    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public int getElement(int index) {
        return array[index];
    }

    @Override
    public boolean contains(int value) {
        return false;
    }
}
