package roman.lesson_12.day_5;

import roman.lesson_12.day_6.FieldValidationRule;
import roman.lesson_12.day_6.ProductDescriptionValidationRule;
import roman.lesson_12.day_6.ProductPriceValidationRule;
import roman.lesson_12.day_6.ProductTitleValidationRule;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator{

    private List<FieldValidationRule> allRules = new ArrayList<>();

    public ProductValidatorImpl(ProductPriceValidationRule priceValidationRule,
                                ProductTitleValidationRule titleValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        this.allRules.add(priceValidationRule);
        this.allRules.add(titleValidationRule);
        this.allRules.add(descriptionValidationRule);
    }


    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule rule : allRules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
