package student_dmitrijs_jasvins.lesson_6.day_x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Policy {

    private List<InsuranceObject> insuranceObjectList;

    public Policy(InsuranceObject ... insuranceObjectList) {
        this.insuranceObjectList = new ArrayList<>(Arrays.asList(insuranceObjectList));
    }

    public List<InsuranceObject> getInsuranceObjectList() {
        return insuranceObjectList;
    }
}
