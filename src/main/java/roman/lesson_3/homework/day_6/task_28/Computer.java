package roman.lesson_3.homework.day_6.task_28;

public class Computer {
    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public void info(){
        System.out.println(this.manufacturer + " " + this.model );
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){ return model; }
    public String newModel(){ return model = "Asus";}
    public void againModel(String need){ this.model = need;}
    public void newNew(){this.model = "Pompa";}


}
