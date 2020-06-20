package student_georgij_galin.lesson3.day_5.task_21;



public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Aron", 10, "Black");
        System.out.println("First dog : ");

        firstDog.voice();

        System.out.println("Second dog : ");

        Dog secondDog = new Dog("Alex", 8, "Black");
        secondDog.voice();
    }
}
