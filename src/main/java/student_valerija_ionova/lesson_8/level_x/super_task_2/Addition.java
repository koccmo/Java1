package student_valerija_ionova.lesson_8.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
