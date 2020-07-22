package student_valerija_ionova.lesson_6.level_x.super_task_1.second_variant;


import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculator {

    public BigDecimal calculate(Policy policy){
        BigDecimal premium = BigDecimal.ZERO;

        for (ObjectForPolicy object : policy.getObjectsForPolicy()){
            premium = premium.add(calculatePremiumForObject(object, policy));
        }

        return premium;
    }

    private BigDecimal calculatePremiumForObject(ObjectForPolicy object, Policy policy){
        BigDecimal premiumForObject = BigDecimal.ZERO;

        for (ElectricDevice device : object.getElectricDevices()){
            premiumForObject = premiumForObject.add(calculatePremiumForDevice(device, policy));
        }
        return premiumForObject;
    }

    private BigDecimal calculatePremiumForDevice(ElectricDevice device, Policy policy){
        BigDecimal premiumForDevice = BigDecimal.ZERO;

        for (InsuranceCategory insuranceCategory : device.getInsuranceCategory()){

            if (InsuranceCategory.FIRE == insuranceCategory){
                premiumForDevice = premiumForDevice.add(device.getCost().multiply(fireCoefficient(policy)));
            }

            if (InsuranceCategory.STEAl == insuranceCategory){
                premiumForDevice = premiumForDevice.add(device.getCost().multiply(stealCoefficient(policy)));
            }

        }

        return premiumForDevice;
    }

    private BigDecimal fireCoefficient (Policy policy) {

        BigDecimal sum = BigDecimal.ZERO;

        for (ObjectForPolicy object : policy.getObjectsForPolicy()) {

            for (ElectricDevice device : object.getElectricDevices()) {

                if (device.getInsuranceCategory().contains(InsuranceCategory.FIRE)) {
                    sum = sum.add(device.getCost());
                }
            }
        }
        if (sum.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("1");
        }else if (sum.compareTo(new BigDecimal("2000")) < 0) {
            return new BigDecimal("0.03");
        } else {
                return new BigDecimal("0.04");
        }
    }

    private BigDecimal stealCoefficient (Policy policy) {

        BigDecimal sum = BigDecimal.ZERO;

        for (ObjectForPolicy object : policy.getObjectsForPolicy()) {

            for (ElectricDevice device : object.getElectricDevices()) {

                if (device.getInsuranceCategory().contains(InsuranceCategory.STEAl)) {
                    sum = sum.add(device.getCost());
                }
            }
        }
        if (sum.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("1");
        }else if (sum.compareTo(new BigDecimal("2000")) < 0) {
            return new BigDecimal("0.01");
        } else {
            return new BigDecimal("0.02");
        }
    }



}
