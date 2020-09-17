package student_volodya_danilin.lesson_10.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
