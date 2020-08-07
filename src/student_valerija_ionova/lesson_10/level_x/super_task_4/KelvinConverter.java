package student_valerija_ionova.lesson_10.level_x.super_task_4;

class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double kelvinTemperature) {
        return Math.round(kelvinTemperature);
    }

}
