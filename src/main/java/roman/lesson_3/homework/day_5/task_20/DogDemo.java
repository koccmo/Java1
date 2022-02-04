package roman.lesson_3.homework.day_5.task_20;

public class DogDemo {
    public static void main(String[] args){
        Dog dog = new Dog(5);
        String voice = dog.voice();
        System.out.println(dog.voice());
        dog.happyBirthday();
        System.out.println(dog.voice());
        dog.happyBirthday();
        System.out.println(dog.voice());
    }
}
