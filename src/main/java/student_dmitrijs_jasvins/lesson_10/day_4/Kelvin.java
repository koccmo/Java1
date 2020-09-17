package student_dmitrijs_jasvins.lesson_10.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Kelvin implements TemperatureConvert {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
