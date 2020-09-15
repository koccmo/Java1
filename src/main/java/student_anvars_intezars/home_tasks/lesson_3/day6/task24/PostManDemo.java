package student_anvars_intezars.home_tasks.lesson_3.day6.task24;

public class PostManDemo {

    public static void main(String[] args) {

        PostMan postman = new PostMan();
            postman.setName("Anatoly");
            postman.setAge(42);
            postman.setCharacter("Nice");

            System.out.println("This is our postman " + postman.getName());
            System.out.println("His age is " + postman.getAge());
            System.out.println("He is very " + postman.getCharacter());
            System.out.println();
            postman.greetingsToPeople();
            postman.letterDelivery();
    }
}
