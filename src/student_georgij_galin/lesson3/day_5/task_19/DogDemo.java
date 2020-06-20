package student_georgij_galin.lesson3.day_5.task_19;



public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dmitry", 10);
        int dogAge = myDog.getAge();
        String firstName = myDog.getName();
        System.out.println("My age is : " + dogAge);
        System.out.println("My name is : " + firstName);
    }
}