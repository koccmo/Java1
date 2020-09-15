package student_valerija_ionova.lesson_10.level_x.super_task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double kelvinTemperature) {
        return Math.round(kelvinTemperature);
    }

}
