package student_eduards_jasvins.lesson_10.day_4.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WeatherKelvin implements Weather {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
