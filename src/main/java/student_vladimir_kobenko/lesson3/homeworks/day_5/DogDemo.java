package student_vladimir_kobenko.lesson3.homeworks.day_5;

public class DogDemo {
    public static void main (String[] args){
        Dog dog = new Dog("Jack", 3, "brown");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("black");
        dog.voice();
    }

}
