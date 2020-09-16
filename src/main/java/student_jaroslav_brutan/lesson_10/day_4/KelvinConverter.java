package student_jaroslav_brutan.lesson_10.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
