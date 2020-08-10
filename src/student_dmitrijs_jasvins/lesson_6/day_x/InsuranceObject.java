package student_dmitrijs_jasvins.lesson_6.day_x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceObject {

    private List<SubInsuranceObject> subInsuranceObjectList;

    public InsuranceObject(SubInsuranceObject ... subInsuranceObjectList) {
        this.subInsuranceObjectList = new ArrayList<>(Arrays.asList(subInsuranceObjectList));
    }

    public List<SubInsuranceObject> getSubInsuranceObjectList() {
        return subInsuranceObjectList;
    }
}
