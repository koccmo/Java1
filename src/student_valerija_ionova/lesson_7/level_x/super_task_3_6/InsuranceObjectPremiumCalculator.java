package student_valerija_ionova.lesson_7.level_x.super_task_3_6;

import java.math.BigDecimal;

public class InsuranceObjectPremiumCalculator {

	private SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
	private FireRiskCoeficientDetector fireRiskCoeficientDetector = new FireRiskCoeficientDetector();
	private TheftRiskCoeficientDetector theftRiskCoeficientDetector = new TheftRiskCoeficientDetector();
	private FloodRiskCoefficientDetector floodRiskCoefficientDetector = new FloodRiskCoefficientDetector();


	public BigDecimal calculate(InsuranceObject insuranceObject) {
		BigDecimal insuranceObjectRiskPremium = calculatePremiumForInsuranceObjectItself(insuranceObject);
		BigDecimal subInsuranceObjectRiskPremium = subInsuranceObjectsPremiumCalculator.calculate(insuranceObject);
		return insuranceObjectRiskPremium.add(subInsuranceObjectRiskPremium);
	}

	private BigDecimal calculatePremiumForInsuranceObjectItself(InsuranceObject insuranceObject) {
		return insuranceObject.getInsuranceRisks().stream()
				.map(insuranceRisk -> calculateInsuranceObjectRiskPremium(insuranceObject, insuranceRisk))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	private BigDecimal calculateInsuranceObjectRiskPremium(InsuranceObject insuranceObject,
                                                           InsuranceRisk insuranceRisk) {
		BigDecimal coefficient = getCoeficient(insuranceRisk, insuranceObject);
		return insuranceObject.getCadastralValue().multiply(coefficient);
	}

	private BigDecimal getCoeficient(InsuranceRisk insuranceRisk,
                                     InsuranceObject insuranceObject) {
		if (InsuranceRisk.FIRE == insuranceRisk) {
			return fireRiskCoeficientDetector.detect(insuranceObject);
		}
		if (InsuranceRisk.FLOOD == insuranceRisk) {
			return floodRiskCoefficientDetector.detect(insuranceObject);
		}
		if (InsuranceRisk.THEFT == insuranceRisk) {
			return theftRiskCoeficientDetector.detect(insuranceObject);
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
	}

}
