package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

public class ElectricDevice {

    private String name;
    private int cost;
    private InsuranceCategory insuranceCategory;


    public ElectricDevice (String name, int cost, InsuranceCategory insuranceCategory){
        this.name = name;
        this.cost = cost;
        this.insuranceCategory = insuranceCategory;
    }

    public ElectricDevice (String name, int cost){
        this.name = name;
        this.cost = cost;
        this.insuranceCategory = null;
    }


    public int getCost(){
        return cost;
    }

    public boolean isFireInsurance(){
        return (InsuranceCategory.FIRE == this.insuranceCategory);
    }

    public boolean isStealInsurance(){
        return (InsuranceCategory.STEAL == this.insuranceCategory);
    }

    public boolean isBothInsurance(){return (InsuranceCategory.BOTH == this.insuranceCategory);
    }


    public InsuranceCategory print(){
        return insuranceCategory;
    }

}

