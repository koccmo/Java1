package student_igors_bartkevics.lesson_12.homework.level_3_junior.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NullPointerExceptionsDemo {

    public static void main(String[] args) {
        Integer integer = null;
        Integer result = integer - 1; // NullPointerExceptions is thrown when an application attempts
                                     // to use an object reference that has the null value.

        String intString = integer.toString(); // These include: Calling an instance method on the
                                              // object referred by a null reference.
    }

}
