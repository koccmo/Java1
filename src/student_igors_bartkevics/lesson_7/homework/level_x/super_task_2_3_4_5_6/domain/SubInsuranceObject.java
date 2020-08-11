package student_igors_bartkevics.lesson_7.homework.level_x.super_task_2_3_4_5_6.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInsuranceObject {
    private String title;     //tv, notebook, etc
    private BigDecimal value; //стоимость под-объекта
    private List<RiskType> risks;

    public SubInsuranceObject(String title, BigDecimal value, RiskType... risks) {
        this.title = title;
        this.value = value;
        this.risks = new ArrayList<>(Arrays.asList(risks));  // convert varargs to array List
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public boolean containsRiskType(RiskType riskType) {
        return risks.contains(riskType);
    }
}
