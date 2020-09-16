package student_anvars_intezars.home_tasks.lesson_10.level_4.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
