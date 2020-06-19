package student_svjatoslavs_cernobrivecs.lesson_3.day_5.task_22;

public class Dog {

    private String color;

    public Dog (String color) {
        this.color = color;
    }
    public void voice(){
        System.out.println(this.color);
    }
    public void changeColor(String newColor){
        System.out.println(newColor);
    }


}
