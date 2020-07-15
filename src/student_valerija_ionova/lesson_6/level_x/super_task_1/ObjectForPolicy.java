package student_valerija_ionova.lesson_6.level_x.super_task_1;

import java.util.ArrayList;

public class ObjectForPolicy {

    private String name;
    private double cost;
    ElectricDevice [] electricDevices;
    private boolean isElectricDevices;

    public ObjectForPolicy(String name, double cost, ElectricDevice [] electricDevices){
        this.name = name;
        this.cost = cost;
        this.electricDevices = electricDevices;
        this.isElectricDevices = true;
    }

    public ObjectForPolicy(String name, double cost){
        this.name = name;
        this.cost = cost;
        this.electricDevices = null;
        this.isElectricDevices = false;
    }

    public ElectricDevice [] getElectricDevices() {
        return electricDevices;
    }

    public double getCost(){
        return cost;
    }

    public boolean getIsElectricDevices(){
        return isElectricDevices;
    }


}
