package student_igors_bartkevics.lesson_10.homework.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyListImpl implements MyList {

    private int[] array;

    public MyListImpl() {
        this.array = new int[0];
    }

    @Override
    public void add(int value) {
        int currentLength = array.length;
        int[] newArray = new int[currentLength + 1];
        for (int i = 0; i < currentLength; i ++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;
        array = newArray;
    }

    @Override
    public int size(){
        return array.length;
    }

    @Override
    public void removeByIndex(int index) {
        int currentLength = array.length;
        if (currentLength > 0) {
            int[] newArray = new int[currentLength - 1];
            int j = 0;
            for (int i = 0; i < currentLength; i ++) {
                if (i != index) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            array = newArray;
        }
    }

    @Override
    public int getElementByIndex(int index) {
        return array[index];
    }

    @Override
    public boolean contains(int value) {
        boolean result = false;
        for (int element : array) {
            if (element == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
