package roman.lesson_3.homework.day_5.task_22;

public class DogDemo {
    public static void main(String[] args){
        Dog dog = new Dog(5,"Blue");
        String voice = dog.voice();
        System.out.println(dog.voice());
        dog.changeColor("Black");
        System.out.println(voice);
        dog.changeAge(8);
        System.out.println(voice);
    }
}
