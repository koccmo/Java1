package student_dmitrijs_jasvins.lesson_6.day_x;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInsuranceObject {
    private String name;
    private BigDecimal value;
    private List<RiskType> risks;

    public SubInsuranceObject(String name, BigDecimal value, RiskType... risks) {
        this.name = name;
        this.value = value;
        this.risks = new ArrayList<>(Arrays.asList(risks));
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public boolean containRiskType(RiskType riskType) {
        return risks.contains(riskType);
    }
}
