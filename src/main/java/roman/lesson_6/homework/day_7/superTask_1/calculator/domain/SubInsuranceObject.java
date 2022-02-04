package roman.lesson_6.homework.day_7.superTask_1.calculator.domain;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInsuranceObject {

    private String title; // tv, notebook, etc
    private BigDecimal value; // price of object
    private List<RiskType> risks;



    public SubInsuranceObject (String title, BigDecimal value, RiskType ... risks) {
        this.title = title;
        this.value = value;
        this.risks = new ArrayList<>(Arrays.asList(risks));
    }



    public String getTitle() {
        return title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public boolean containsTypeRisk (RiskType riskType) {
        return risks.contains(riskType);
    }
}
