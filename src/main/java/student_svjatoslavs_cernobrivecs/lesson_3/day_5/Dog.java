package student_svjatoslavs_cernobrivecs.lesson_3.day_5;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void voice(){
        System.out.println(getName() + " says: " + "bark " + " bark " + " bark");
    }
}
