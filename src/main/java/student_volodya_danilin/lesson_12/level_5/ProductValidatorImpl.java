package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator{

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;

    ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                         ProductPriceValidationRule priceValidationRule,
                         ProductDescriptionValidationRule descriptionValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
        this.descriptionValidationRule = descriptionValidationRule;
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

        try {
            descriptionValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }

        return exceptions;
    }

}
