package student_sandra_arniece.lesson_3;
//Tasks 18,19,20,21,22
public class Dog {
    private final String dogName;
    private int dogAge;
    private String dogColor;

    public Dog (String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    public void voice() {
        System.out.println(dogName.repeat(3) + " I am " + dogColor +" and " + dogAge + " years old!");
    }

    public void happyBirthday() {
        dogAge++;
        System.out.println("Today is my Birthday!");
    }

    public void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}
