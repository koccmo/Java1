package student_igors_bartkevics.lesson_7.homework.level_x.super_task_2_3_4_5_6.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceObject {

    private List<SubInsuranceObject> subInsuranceObjects;

    public InsuranceObject(SubInsuranceObject... subInsuranceObjects) {
        this.subInsuranceObjects = new ArrayList<>(Arrays.asList(subInsuranceObjects));
    }

    public List<SubInsuranceObject> getSubInsuranceObjects() {
        return subInsuranceObjects;
    }
}
