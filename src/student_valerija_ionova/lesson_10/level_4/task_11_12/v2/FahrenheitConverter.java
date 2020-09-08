package student_valerija_ionova.lesson_10.level_4.task_11_12.v2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 1.8 +32;
    }

}
