package student_valerija_ionova.lesson_6.level_x.super_task_1;

public class ObjectForPolicyFactory {

    public static ObjectForPolicy createObjectWithElectricDevices(String name, double price, ElectricDevice [] electricDevices){
        return new ObjectForPolicy(name, price, electricDevices);
    }

    public static ObjectForPolicy createObjectWithoutElectricDevices(String name, double price, ElectricDevice [] electricDevices){
        return new ObjectForPolicy(name, price, electricDevices);
    }

}

