package student_valerija_ionova.lesson_7.level_x.super_task_3_6;

//Super task 6 Добавить в InsurancePolicyPremiumCalculator поддержку риска наводнения,
//коэфициенты для риска наводнения придумайте самостоятельно.

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculator {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator
			= new InsuranceObjectPremiumCalculator();

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal insuranceObjectPremium = insuranceObjectPremiumCalculator.calculate(insuranceObject);
			premium = premium.add(insuranceObjectPremium);
		}
		return premium;
	}

}