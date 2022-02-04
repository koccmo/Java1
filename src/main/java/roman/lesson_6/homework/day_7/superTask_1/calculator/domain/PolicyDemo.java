package roman.lesson_6.homework.day_7.superTask_1.calculator.domain;

import java.math.BigDecimal;

public class PolicyDemo {
    public static void main(String[] args) {
        //Policy:
        //      flat:
        //          tv
        //          notebook
        //      house:
        //          fridge
        //          tv

        SubInsuranceObject tv1 = new SubInsuranceObject("TV 1", new BigDecimal("100.00"), RiskType.FIRE, RiskType.FLOOD);
        SubInsuranceObject notebook = new SubInsuranceObject("NoteBook", new BigDecimal("700.00"), RiskType.FIRE, RiskType.THEFT, RiskType.FLOOD);
        InsuranceObject flat = new InsuranceObject(tv1, notebook);

        SubInsuranceObject fridge = new SubInsuranceObject("Fridge", new BigDecimal("100.00"), RiskType.FIRE);
        SubInsuranceObject tv2 = new SubInsuranceObject("TV 2", new BigDecimal("700.00"), RiskType.THEFT);
        InsuranceObject house = new InsuranceObject(fridge, tv2);


        Policy policy = new Policy(flat, house);


    }
}
