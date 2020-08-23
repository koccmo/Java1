package student_valerija_ionova.lesson_8.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
