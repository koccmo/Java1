package roman.lesson_3.homework.day_6.Task_24;

public class Phone {
    private String model;
    private String color;

    public Phone(String model,String color){
        this.model = model;
        this.color = color;
    }

    public void call(int number){
        System.out.println(model + " call to number " + number);
    }

    public String text(int yourNumber,String yourText){
        return model + " to number " + yourNumber + " send text: " + yourText;
    }
}
