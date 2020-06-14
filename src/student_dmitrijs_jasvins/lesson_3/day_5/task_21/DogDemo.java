package student_dmitrijs_jasvins.lesson_3.day_5.task_21;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Dmitry", 5, "Red");
        System.out.println("First dog : ");

        firstDog.voice();

        System.out.println("Second dog : ");

        Dog secondDog = new Dog("Valera", 6, "blue");
        secondDog.voice();
    }
}


