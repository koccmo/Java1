package student_valerija_ionova.lesson_6.level_x.super_task_1;

import student_valerija_ionova.lesson_x.part_2_basic.task_19_26.ExpenseCategory;
import student_valerija_ionova.lesson_x.part_2_basic.task_19_26.TransactionType;

public class ElectricDevice {

    private String name;
    private double cost;
    private InsuranceCategory insuranceCategory;


    public ElectricDevice (String name, double cost, InsuranceCategory insuranceCategory){
        this.name = name;
        this.cost = cost;
        this.insuranceCategory = insuranceCategory;
    }

    public ElectricDevice (String name, double cost){
        this.name = name;
        this.cost = cost;
        this.insuranceCategory = null;
    }


    public double getCost(){
        return cost;
    }

    public boolean isFireInsurance(){
        return (InsuranceCategory.FIRE == this.insuranceCategory);
    }

    public boolean isStealInsurance(){
        return (InsuranceCategory.STEAL == this.insuranceCategory);
    }

    public boolean isBothInsurance(){
        return (InsuranceCategory.BOTH == this.insuranceCategory);
    }


    public InsuranceCategory print(){
        return insuranceCategory;
    }

}

