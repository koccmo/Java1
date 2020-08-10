package student_dmitrijs_jasvins.lesson_6.day_x;

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
        BigDecimal premuim = BigDecimal.ZERO;
        for (InsuranceObject insuranceObject : policy.getInsuranceObjectList()) {
            BigDecimal premiumForRisk = calculate(insuranceObject, riskType);
            premuim = premiumForRisk.add(premiumForRisk);
        }

        return premuim;
    }

    public BigDecimal calculate(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal premuim = BigDecimal.ZERO;
        BigDecimal subObjectValueForSpicificRisk = calculateValue(insuranceObject, riskType);
        BigDecimal riskCoeficient = getRiskCoeficient(riskType, subObjectValueForSpicificRisk);

        return premuim.add(subObjectValueForSpicificRisk.multiply(riskCoeficient));
    }

    public BigDecimal calculateValue(InsuranceObject insuranceObject, RiskType riskType) {
        BigDecimal value = BigDecimal.ZERO;
        for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjectList()) {
            if (subInsuranceObject.containRiskType(riskType)) {
                value = value.add(subInsuranceObject.getValue());
            }
        }
        return value;
    }

    public BigDecimal getRiskCoeficient(RiskType riskType, BigDecimal subObjectValueForSpicificRisk) {
        if (RiskType.FIRE == riskType) {
            if (subObjectValueForSpicificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.03");
            } else {
                return new BigDecimal("0.04");
            }
        }
        if (RiskType.THIEF == riskType) {
            if (subObjectValueForSpicificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
                return new BigDecimal("0.01");
            } else {
                return new BigDecimal("0.02");
            }
        }
        return BigDecimal.ZERO;
    }
}
