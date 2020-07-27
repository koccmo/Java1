package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

class ObjectForPolicyFactory {

    public static ObjectForPolicy createObjectWithElectricDevices(int price, ElectricDevice [] electricDevices){
        return new ObjectForPolicy(electricDevices);
    }

    public static ObjectForPolicy createObjectWithoutElectricDevices(int price){
        return new ObjectForPolicy();
    }

}

