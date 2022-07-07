package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ProductValidator;
import roman.lesson_12.day_5.ProductValidatorImpl;
import roman.lesson_12.day_5.ValidationException;

import java.util.List;

public class ValidationRulesDemo {
    public static void main(String[] args) {
        Product box = new Product(null, null, "Plastic Box");

        ProductValidator validator = new ProductValidatorImpl(new ProductPriceValidationRule(),
                new ProductTitleValidationRule(), new ProductDescriptionValidationRule());
        List<ValidationException> ex = validator.validate(box);
        System.out.println(ex.size());
        System.out.println(ex.get(0).getRuleName());
        System.out.println(ex.get(1).getRuleName());
    }
}
