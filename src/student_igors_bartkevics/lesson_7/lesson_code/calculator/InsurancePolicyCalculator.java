package student_igors_bartkevics.lesson_7.lesson_code.calculator;

import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.InsuranceObject;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.Policy;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.RiskType;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.SubInsuranceObject;

import java.math.BigDecimal;

class InsurancePolicyCalculator {

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (RiskType riskType: RiskType.values()) {
            BigDecimal premiumForRisk = calculate(policy, riskType);
            premium = premium.add(premiumForRisk);
        }
        return premium;
    }

    public BigDecimal calculate(Policy policy, RiskType riskType) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuranceObject insuranceObject: policy.getInsuranceObjects()) {
            BigDecimal premiumForRisk = calculate(insuranceObject, riskType);
            premium = premium.add(premiumForRisk);
        }
        return premium;
    }

    public BigDecimal calculate(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal premium = BigDecimal.ZERO;
        BigDecimal subObjectValueForSpecificRisk = calculateValue(insuranceObject, riskType);
        BigDecimal riskCoefficient = getRiskCoefficient(riskType, subObjectValueForSpecificRisk);
        return premium.add(subObjectValueForSpecificRisk.multiply(riskCoefficient));
    }

    public BigDecimal calculateValue(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal value = BigDecimal.ZERO;
        for (SubInsuranceObject subInsuranceObject: insuranceObject.getSubInsuranceObjects()) {
            if (subInsuranceObject.containsRiskType(riskType)) {
                value = value.add(subInsuranceObject.getValue());
            }
        }
        return value;
    }

    public BigDecimal getRiskCoefficient(RiskType riskType, BigDecimal subObjectValueForSpecificRisk) {
        if (riskType == RiskType.FIRE) {
            if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.03");
            }
            else {
                return new BigDecimal("0.04");
            }
        }
        if (riskType == RiskType.THIEF) {
            if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.01");
            }
            else {
                return new BigDecimal("0.02");
            }
        }
        return BigDecimal.ZERO;
    }
}
