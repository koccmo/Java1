package student_aleksandra_maksimovic.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class ProductValidatorImpl implements ProductValidator {

	@CodeReviewComment(teacher = "This field mus be private :)")
    List<FieldValidationRule> rules;

    public ProductValidatorImpl(List<FieldValidationRule> rules)
    {
        this.rules = rules;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> result = new ArrayList<>();

        for (FieldValidationRule rule : rules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                result.add(e);
            }
        }

        return result;
    }

}
