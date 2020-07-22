package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

public class ElectricDeviceFactory {

    public static ElectricDevice createElectricDeviceWithExtraInsurance(String name, int price, InsuranceCategory insuranceCategory){
        return new ElectricDevice(name, price, insuranceCategory);
    }

    public static ElectricDevice createElectricDeviceWithoutInsurance(String name, int price){
        return new ElectricDevice(name, price);
    }


}


