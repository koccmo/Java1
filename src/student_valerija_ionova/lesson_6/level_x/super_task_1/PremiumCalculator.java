package student_valerija_ionova.lesson_6.level_x.super_task_1;

/*Написать программу для расчёта стоимости полюса страхования для недвижимой собственности.

Каждый полюс может включать в себя один или много объектов страхования (дом или квартира).

В полюс страхования для каждого объекта страхования могут быть включены дополнительные под-объекты страхования,
например
--электрические приборы (телевизор, компьютер и так далее).

Полюс страхования может включать в себя страховку от
--разных рисков.
На данный момент требуется реализовать поддержку следующих рисков: пожара и кражи.

Риски кражи и пожара могут быть применены только к под-объектам страхования (электрическим приборам и так далее).

Полная стоимость страхового полюса равна сумме страховки от каждого риска в отделности.

При страховке под-объектов (электрических приборов и так далее) от пожара стоимость
страховки увеличивается на: сумма стоимости всех страхуемых под-объектов * 0.03.
Если сумма страхуемых под-объектов привышает 2000 евро, то используется коефициент 0.04 вместо 0.03.

При страховке под-объектов (электрических приборов и так далее) от кражи стоимость
страховки увеличивается на: сумма стоимости всех страхуемых под-объектов * 0.01.
Если сумма страхуемых под-объектов привышает 2000 евро, то используется коефициент 0.01 вместо 0.02.

Написать программу входной точкой которой будет класс PremiumCalculator с методом:

calculate(Policy policy) Данный метод должен возвращать стоимость страховки для
переданного ему в качестве параметра полюса страхования.

который принимает */

import java.util.Arrays;

public class PremiumCalculator {

    public boolean deviceIsFireInsured(ElectricDevice electricDevice){
        return ((electricDevice.isFireInsurance()) || (electricDevice.isBothInsurance()));
    }

    public double coefficientFireInsurance(ElectricDevice [] electricDevices){
        double sum = 0;
        for (int i=0; i< electricDevices.length; i++){
            if (deviceIsFireInsured(electricDevices[i])){
                sum += electricDevices[i].getCost();
            }
        }
        if (sum > 2000){
            return 0.04;
        }else{
            return
                0.03;

        }
    }


    public double fireInsurancePremium(ElectricDevice [] electricDevices){
        double sum = 0;
        for (int i=0; i< electricDevices.length; i++){
            if (deviceIsFireInsured(electricDevices[i])){
                sum += electricDevices[i].getCost() * coefficientFireInsurance(electricDevices);
            }
        }
        return sum;
    }

    public boolean ifDeviceIsStealInsured(ElectricDevice electricDevice){
        return ((electricDevice.isStealInsurance()) || (electricDevice.isBothInsurance()));
    }

    public double coefficientStealInsurance(ElectricDevice [] electricDevices){
        double sum = 0;
        for (int i=0; i< electricDevices.length; i++){
            if (ifDeviceIsStealInsured(electricDevices[i])){
                sum += electricDevices[i].getCost();
            }
        }
        if (sum >2000){
            return 0.02;
        }else{
            return
                    0.01;
            }
        }

    public double stealInsurancePremium(ElectricDevice [] electricDevices){
        double sum = 0;
        for (int i=0; i< electricDevices.length; i++){
            if (ifDeviceIsStealInsured(electricDevices[i])){
                sum += electricDevices[i].getCost() * coefficientStealInsurance(electricDevices);
            }
        }
        return sum;
    }

    public double insurancePremiumForElectricDevicesAmount(ElectricDevice[] electricDevices){
        double sum = 0;
        for (int i=0; i<electricDevices.length; i++){
            sum += electricDevices[i].getCost();
        }
        return sum;
    }


    public double insurancePremiumForElectricDevices(ElectricDevice[] electricDevices){
        return fireInsurancePremium(electricDevices) + stealInsurancePremium(electricDevices) + insurancePremiumForElectricDevicesAmount(electricDevices);
    }


    public boolean objectHasElectricDevices(ObjectForPolicy objectForPolicy){
        return (objectForPolicy.getIsElectricDevices());
    }

    public double PremiumForObject(ObjectForPolicy [] objectsForPolicy){
        double sum = 0;
        for (int i = 0; i < objectsForPolicy.length; i++) {
            sum += objectsForPolicy[i].getCost();
        }
        return sum;
    }

    public double PremiumForObjectsElectricDevices(ObjectForPolicy [] objectsForPolicy){
        double sum = 0;
        for (ObjectForPolicy object : objectsForPolicy){
            if (objectHasElectricDevices(object)) {
                sum += insurancePremiumForElectricDevices(object.getElectricDevices());
            }
        }
        return sum;
    }


    public double calculate(Policy policy) {
        ObjectForPolicy[] objectsForPolicy = policy.getObjectsForPolicy();

        return PremiumForObject(objectsForPolicy) + PremiumForObjectsElectricDevices(objectsForPolicy);
    }

    public void printPolicyPremium(Policy policy){
        System.out.println(calculate(policy));
    }

}
