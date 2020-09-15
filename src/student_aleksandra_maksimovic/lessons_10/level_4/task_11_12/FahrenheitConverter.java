package student_aleksandra_maksimovic.lessons_10.level_4.task_11_12;

 class FahrenheitConverter implements TemperatureConverter{

  @Override
  public double convert(double celsiusTemperature) {
   return (celsiusTemperature * 1.8) + 32;
  }
 }
