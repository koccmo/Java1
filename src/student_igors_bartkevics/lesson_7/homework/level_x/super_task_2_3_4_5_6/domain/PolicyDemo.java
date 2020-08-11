package student_igors_bartkevics.lesson_7.homework.level_x.super_task_2_3_4_5_6.domain;

import java.math.BigDecimal;

public class PolicyDemo {

    public static void main(String[] args) {
        //Policy:
        //      flat:
        //           tv
        //           notebook
        //       house:
        //           tv
        //           fridge

        SubInsuranceObject tv1 = new SubInsuranceObject("TV-1", new BigDecimal("200.00"), RiskType.FIRE);
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("400.30"), RiskType.FIRE, RiskType.THIEF);
        InsuranceObject flat = new InsuranceObject(tv1, notebook);

        SubInsuranceObject tv2 = new SubInsuranceObject("TV-2", new BigDecimal("310.00"), RiskType.FIRE);
        SubInsuranceObject fridge = new SubInsuranceObject("Fridge", new BigDecimal("270.00"), RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(tv2, fridge);

        Policy policy = new Policy(flat, house);
    }
}
