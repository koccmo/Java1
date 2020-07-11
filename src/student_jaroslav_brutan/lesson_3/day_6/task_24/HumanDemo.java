package student_jaroslav_brutan.lesson_3.day_6.task_24;

public class HumanDemo {
    public static void main(String []args){
        Human human = new Human();
        human.setName("Jarik");
        human.setAge(28);
        System.out.println("Hi! My name is " + human.getName() + ".");
        System.out.println("I'm " + human.getAge() + ".");
        human.work();
        human.sleep();


    }


}
