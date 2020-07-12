package student_sandra_arniece.lesson_3;
//Tasks 1,2,5,11,12,13
public class Robot {
    private String name;
    public Robot(String robotName){
        this.name = robotName;
    }
        public void sayHello() {
            System.out.println("Hello!");
        }
        public void sayYourName() {
            System.out.println("My name is " + this.name);
        }
}
