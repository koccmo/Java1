package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;

import java.util.ArrayList;
import java.util.List;

class Policy {

	private List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public void addInsuranceObject(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
	}

	public List<InsuranceObject> getInsuranceObjects() {
		return this.insuranceObjects;
	}

}
