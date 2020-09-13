package student_igors_bartkevics.lesson_12.homework.level_6_middle;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }
}
