package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30;

public class ArrayValidator {

    public boolean arrayContainsLessThanTwoElements(String[] array) {
        return array.length < 2;
    }

    public boolean arrayContainsNotDigit(String[] array) {
        for (String element : array) {
            for (int i = 0; i < element.length(); i ++) {
                if (!Character.isDigit(element.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

}
