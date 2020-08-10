package student_valerija_ionova.lesson_10.level_x.super_task_4;

class Context {

    private TemperatureConverter temperatureConverter;

    //Constructor
    public Context(){
    }

    //Set new Strategy
    public void setTemperatureConverter(TemperatureConverter temperatureConverter){
        this.temperatureConverter = temperatureConverter;
    }

    public double executeStrategy (double temperature){
        return temperatureConverter.convert(temperature);
    }

}
