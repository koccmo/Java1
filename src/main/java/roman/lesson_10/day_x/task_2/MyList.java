package roman.lesson_10.day_x.task_2;

public interface MyList {
    int[] addElement(int number);
    int[] deleteElementByIndex(int index);
    int[] addInMiddleElement(int index, int number);
    boolean contains(int value);
    int size();
}
