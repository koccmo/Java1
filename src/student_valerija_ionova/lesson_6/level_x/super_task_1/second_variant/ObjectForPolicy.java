package student_valerija_ionova.lesson_6.level_x.super_task_1.second_variant;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectForPolicy {

    private ArrayList <ElectricDevice> electricDevices;

    public ObjectForPolicy (ElectricDevice ... electricDevices){
        this.electricDevices = new ArrayList <ElectricDevice> (Arrays.asList(electricDevices));
    }

    public ArrayList <ElectricDevice> getElectricDevices(){
        return electricDevices;
    }

}
