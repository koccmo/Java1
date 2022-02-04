package roman.lesson_3.homework.day_5.task_21;

public class DogDemo {
    public static void main(String[] args){
        Dog dog = new Dog(3,"Grey");
        String voice = dog.voice();
        System.out.println(voice);
    }
}
