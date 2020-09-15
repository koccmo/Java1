package student_vladimir_kobenko.lesson3.homeworks.day_5;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }

    public void happyBirthday(){
        this.age++;
    }
    public void voice(){
        System.out.println("I am a dog. My name is " + this.name+"; age "+this.age+"; color  "+this.color);
    }

}
