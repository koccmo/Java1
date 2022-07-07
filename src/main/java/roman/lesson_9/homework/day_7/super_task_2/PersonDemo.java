package roman.lesson_9.homework.day_7.super_task_2;

public class PersonDemo {
    public static void main(String[] args) {
        Person mrScott = new Person.PersonBuilder("James", "Scott")
                .setAddress("High street 16")
                .setAge(25)
                .setNationality("Jamaica")
                .build();

        System.out.println(mrScott.toString());
    }
}
