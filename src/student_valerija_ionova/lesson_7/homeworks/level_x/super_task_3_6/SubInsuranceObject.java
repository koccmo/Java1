package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class SubInsuranceObject {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks;

	public SubInsuranceObject(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		this.insuranceRisks = new ArrayList<>();           //added
	}

	public void addInsuranceRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
	}

	public List<InsuranceRisk> getInsuranceRisks() {
		return insuranceRisks;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public boolean isInsuredFrom(InsuranceRisk insuranceRisk) {
		return this.getInsuranceRisks().contains(insuranceRisk);
	}

}
