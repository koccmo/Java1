package student_vladislav_zagrebin.lesson_3.homeWork.day_5.task_22;

public class DogDemo {

    public static void main(String[] args) {

        Dog myNewDog = new Dog();
        myNewDog.setDogName("Palkan");
        myNewDog.setDogColour("Brown");
        myNewDog.dogVoice();
        myNewDog.changeColour("White");
        myNewDog.dogVoice();
    }
}
