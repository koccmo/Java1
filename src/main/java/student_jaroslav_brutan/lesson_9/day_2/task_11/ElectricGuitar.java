package student_jaroslav_brutan.lesson_9.day_2.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ElectricGuitar extends Guitar{

    private int stringAmount;

    protected ElectricGuitar(String color, String stringType, int stringAmount) {
        super(color, stringType);
        this.stringAmount = stringAmount;
    }
}
