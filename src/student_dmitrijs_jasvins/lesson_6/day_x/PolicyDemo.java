package student_dmitrijs_jasvins.lesson_6.day_x;

import java.math.BigDecimal;

public class PolicyDemo {
    public static void main(String[] args) {
        SubInsuranceObject tv1 = new SubInsuranceObject("TV1", new BigDecimal("100.00"), RiskType.FIRE);
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"),
                                                                                     RiskType.FIRE, RiskType.THIEF);
        InsuranceObject flat = new InsuranceObject(tv1, notebook);

        SubInsuranceObject fridge = new SubInsuranceObject("Fridge1", new BigDecimal("500.00"));
        SubInsuranceObject tv2 = new SubInsuranceObject("Tv2", new BigDecimal("200.00"));
        InsuranceObject house = new InsuranceObject(tv2, fridge);

        Policy policy = new Policy(flat, house);
    }

}
