package student_valerija_ionova.lesson_6.level_x.super_task_1;

public class ElectricDeviceFactory {

    public static ElectricDevice createElectricDeviceWithExtraInsurance(String name, double price, InsuranceCategory insuranceCategory){
        return new ElectricDevice(name, price, insuranceCategory);
    }

    public static ElectricDevice createElectricDeviceWithoutInsurance(String name, double price){
        return new ElectricDevice(name, price);
    }


}


