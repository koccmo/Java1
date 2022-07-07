package roman.lesson_10.day_x.task_2;

public class MyListImpl implements MyList{
    private int[] array;

    public MyListImpl() {
        this.array = new int[0];
    }

    public int[] getArray() {
        return array;
    }

    public void printArray(int[] arrayToPrint) {

    }

    @Override
    public boolean contains(int value) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public int[] addElement(int number) {
        int currentLength = array.length;
        int[] arrayWithAddedElement = new int[currentLength + 1];
        for (int i = 0; i < currentLength; i++) {
            arrayWithAddedElement[i] = array[i];
        }
        arrayWithAddedElement[arrayWithAddedElement.length - 1] = number;
        array = arrayWithAddedElement;
        return array;
    }

    @Override
    public int[] deleteElementByIndex(int index) {
        int currentIndex = array.length;
        int[] arrayWithDeletedElement = new int[currentIndex - 1];
        for (int i = 0; i < arrayWithDeletedElement.length; i++) {
//            if (i == index) {
//                arrayWithDeletedElement[i] = array[i + 1];
//            } else {
//                arrayWithDeletedElement[i] = array[i];
//            }
            arrayWithDeletedElement[i] = (i == index) ? array[i + 1] : array[i];
        }
        array = arrayWithDeletedElement;
        return array;
    }

    @Override
    public int[] addInMiddleElement(int index, int number) {
        int currentLength = array.length;
        int[] addedElementMiddleArray = new int[currentLength + 1];
        int j = 0;
        for (int i = 0; i < addedElementMiddleArray.length; i++) {
            addedElementMiddleArray[i] = array[i - j];
            if (i == index) {
            addedElementMiddleArray[i] = number;
            j++;
            }
        }
        array = addedElementMiddleArray;
        return array;
    }

    @Override
    public int size() {
        int sizeOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sizeOfArray++;
        }
        return sizeOfArray;
    }
}
