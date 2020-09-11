package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

/*Task34
Создайте класс ProductValidatorImpl который реализует интерфейс ProductValidator.
*/

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator{

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule, ProductPriceValidationRule priceValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
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
        }catch (ValidationException e){
            exceptions.add(e);
        }
        return exceptions;
    }
}