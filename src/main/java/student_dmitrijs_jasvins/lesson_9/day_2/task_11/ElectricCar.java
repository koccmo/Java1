package student_dmitrijs_jasvins.lesson_9.day_2.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ElectricCar extends Car{

    private String average;

    protected ElectricCar (String name, String average){
        super(name);
        this.average = average;
    }
}
