package student_anvars_intezars.home_tasks.lesson_3.day6;

public class PostMan {

    private String name;
    private int age;
    private String character;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }

    public void greetingsToPeople() {
        System.out.println("Good afternoon!");
    }
        public void letterDelivery() {
            System.out.println("This letter is for you");
        }
}
