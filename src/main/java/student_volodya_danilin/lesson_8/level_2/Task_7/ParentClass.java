package student_volodya_danilin.lesson_8.level_2.Task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ParentClass {
    protected int ageParent = 44;
    protected String nameParent = "Default";


    public ParentClass(int integer, String string) {
        ageParent = integer;
        nameParent = string;
    }

}


