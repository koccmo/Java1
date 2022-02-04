package roman.lesson_6.homework.day_7.superTask_1.calculator;



import roman.lesson_6.homework.day_7.superTask_1.calculator.domain.InsuranceObject;
import roman.lesson_6.homework.day_7.superTask_1.calculator.domain.Policy;
import roman.lesson_6.homework.day_7.superTask_1.calculator.domain.RiskType;
import roman.lesson_6.homework.day_7.superTask_1.calculator.domain.SubInsuranceObject;

import java.math.BigDecimal;


public class InsurancePolicyPremiumCalculator {

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (RiskType riskType : RiskType.values()) {
            BigDecimal premiumForRisk = calculate(policy, riskType);
            premium = premium.add(premiumForRisk);
        }
        return premium;
    }

    public BigDecimal calculate(Policy policy, RiskType riskType) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
            BigDecimal premiumForRisk = calculate(insuranceObject, riskType);
            premium = premium.add(premiumForRisk);
        }
        return premium;
    }

    public BigDecimal calculate(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal subObjectValueForSpecificRisk = calculateValue(insuranceObject, riskType);
        BigDecimal riskCoeficent = getRiskCoeficent(riskType, subObjectValueForSpecificRisk);

        return subObjectValueForSpecificRisk.multiply(riskCoeficent);
    }

    public BigDecimal calculateValue(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal value = BigDecimal.ZERO;
        for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjects()) {
            if (subInsuranceObject.containsTypeRisk(riskType)) {
                value = value.add(subInsuranceObject.getValue());
            }
        }
        return value;
    }

    public BigDecimal getRiskCoeficent(RiskType riskType, BigDecimal subObjectValueForSpecificRisk) {
        if (RiskType.FIRE == riskType) {
            if(subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.03");
            } else {
                return new BigDecimal("0.04");
            }
        }
        if (RiskType.THEFT == riskType) {
            if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.01");
            } else {
                return new BigDecimal("0.02");
            }
        }
        if (RiskType.FLOOD == riskType) {
            if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) <0) {
                return new BigDecimal("0.02");
            } else {
                return new BigDecimal("0.04");
            }
        }
        return BigDecimal.ZERO;
    }

}
