package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleRule;
    private ProductPriceValidationRule priceRule;
    private ProductDescriptionValidationRule descriptionRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleRule,
                                ProductPriceValidationRule priceRule,
                                ProductDescriptionValidationRule descriptionRule) {
        this.titleRule = titleRule;
        this.priceRule = priceRule;
        this.descriptionRule = descriptionRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        exceptions.addAll(titleRule.validate(product));
        exceptions.addAll(priceRule.validate(product));
        exceptions.addAll(descriptionRule.validate(product));
        return exceptions;
    }

}
