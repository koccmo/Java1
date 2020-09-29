package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Rule;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Rule1 extends Rule {

    public Rule1(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String getName() {
        return "RULE-1";
    }

    @Override
    public boolean compliesWithRule(String string) {
        return string.isEmpty();
    }
}

