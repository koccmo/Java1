package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

public class ObjectForPolicy {

    ElectricDevice [] electricDevices;
    private boolean isElectricDevices;

    public ObjectForPolicy(ElectricDevice [] electricDevices){
        this.electricDevices = electricDevices;
        this.isElectricDevices = true;
    }

    public ObjectForPolicy(){
        this.electricDevices = null;
        this.isElectricDevices = false;
    }

    public ElectricDevice [] getElectricDevices() {
        return electricDevices;
    }

    public boolean getIsElectricDevices(){
        return isElectricDevices;
    }


}
