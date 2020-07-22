package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;

import java.math.BigDecimal;
import java.util.List;

public class FloodRiskCoefficientDetector {

    private static final BigDecimal STANDARD_FLOOD_RISK_COEF = new BigDecimal("0.07");
    private static final BigDecimal OVERPRICED_FLOOD_RISK_COEF = new BigDecimal("0.08");
    private static final BigDecimal PRICE_BORDER = new BigDecimal("2000.00");

    public BigDecimal detect(InsuranceObject insuranceObject) {
        if (InsuranceObjectType.FLAT == insuranceObject.getInsuranceObjectType()) {
            return new BigDecimal("0.03");
        }
        if (InsuranceObjectType.HOUSE == insuranceObject.getInsuranceObjectType()) {
            return new BigDecimal("0.09");
        }
        throw new IllegalArgumentException("Insurance object type not supported! " + insuranceObject.getInsuranceObjectType());
    }

    public BigDecimal detect(List<SubInsuranceObject> subInsuranceObjects) {
        BigDecimal sumOfInsuredObjectsFromFire = subInsuranceObjects.stream()
                .filter(subInsuranceObject -> subInsuranceObject.isInsuredFrom(InsuranceRisk.FLOOD))
                .map(SubInsuranceObject::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        if (sumOfInsuredObjectsFromFire.compareTo(PRICE_BORDER) < 0) {
            return STANDARD_FLOOD_RISK_COEF;
        } else {
            return OVERPRICED_FLOOD_RISK_COEF;
        }
    }

}
