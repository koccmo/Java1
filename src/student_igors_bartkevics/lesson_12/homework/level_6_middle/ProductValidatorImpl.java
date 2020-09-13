package student_igors_bartkevics.lesson_12.homework.level_6_middle;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule productPriceValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = productPriceValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            priceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }
}
