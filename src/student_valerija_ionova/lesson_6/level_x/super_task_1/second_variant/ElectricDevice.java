package student_valerija_ionova.lesson_6.level_x.super_task_1.second_variant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class ElectricDevice {

    private String name;
    private BigDecimal cost;
    private ArrayList <InsuranceCategory> insuranceCategory;

    public ElectricDevice (String name, BigDecimal cost, InsuranceCategory ... insuranceCategory){
        this.name = name;
        this.cost = cost;
        this.insuranceCategory = new ArrayList <InsuranceCategory>(Arrays.asList(insuranceCategory));
    }

    public BigDecimal getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public ArrayList<InsuranceCategory> getInsuranceCategory(){
        return insuranceCategory;
    }

}
