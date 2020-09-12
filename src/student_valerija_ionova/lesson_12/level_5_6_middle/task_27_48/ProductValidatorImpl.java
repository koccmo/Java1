package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

/*Task34
Создайте класс ProductValidatorImpl который реализует интерфейс ProductValidator.
*/

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator{

    private List <FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();

        for (FieldValidationRule currentRule : validationRules){
            try {
                currentRule.validate(product);
            }catch (ValidationException e){
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
