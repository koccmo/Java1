package student_roberts_kupcs.lesson_9.level_1.Task_1;

//Создайте класс самолёт и сделайте так,
//что бы он был доступен из любого другого класса
//в этом пакете и в других пакетах.
//Каким оператором доступа для этого надо воспользоваться?

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AirPlane {
    private String name;
    private String id;
    private String flight;

    public AirPlane(String name, String id, String flight) {
        this.name = name;
        this.id = id;
        this.flight = flight;
    }
    // getters/setters
}
