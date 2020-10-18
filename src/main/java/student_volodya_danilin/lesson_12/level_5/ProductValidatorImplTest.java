package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImplTest {

    ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();

    ProductValidatorImpl validator = new ProductValidatorImpl(titleValidationRule,
            priceValidationRule, descriptionValidationRule);
    List<ValidationException> returnedExceptions = new ArrayList<>();

    public static void main(String[] args) {

        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.testTitleRules();

    }

    void testTitleRules() {
        Product product = new Product("&^", 100, "desc");
        returnedExceptions = validator.validate(product);
        for (ValidationException exception : returnedExceptions) {
            exception.printExceptionInfo();
        }
    }

}
