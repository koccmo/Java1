package student_dmitrijs_jasvins.lesson_10.day_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "May be CelsiusConverter?")
public class Celsius implements TemperatureConvert {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }
}
