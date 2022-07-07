package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ValidationException;

public interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
