package student_valerija_ionova.lesson_6.level_x.super_task_1;

import java.util.ArrayList;

public class ObjectForPolicy {

    private String name;
    private double cost;
    private boolean ifIsFireRisk;
    private boolean ifIsStealRisk;

    private ArrayList<ElectricDevice> electricalDevices;

    public ObjectForPolicy(String name, double cost, ArrayList <ElectricDevice> devices){
        this.name = name;
        this.cost = cost;
        this.electricalDevices = devices;
    }

    public ArrayList<ElectricDevice> getElectricalDevices() {
        return electricalDevices;
    }

    public double getCost(){
        return cost;
    }

    public void setIsIfIsStealRisk(boolean stealRisk){
        ifIsStealRisk = stealRisk;
    }

    public boolean getIsIfIsStealRisk(){
        return ifIsStealRisk;
    }

    public void setIfIsFireRisk(boolean fireRisk){
        ifIsFireRisk = fireRisk;
    }

    public boolean getIfIsFireRisk(){
        return ifIsFireRisk;
    }


}
