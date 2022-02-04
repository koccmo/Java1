package roman.lesson_6.homework.day_7.superTask_1.calculator.domain;

import
        java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceObject {

    private List<SubInsuranceObject> subInsuranceObject ;

    public InsuranceObject(SubInsuranceObject ... subInsuranceObject) {

        this.subInsuranceObject = new ArrayList<>(Arrays.asList(subInsuranceObject));
    }

    public List<SubInsuranceObject> getSubInsuranceObjects() {

        return subInsuranceObject;
    }
}
