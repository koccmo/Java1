package roman.lesson_12.day_5;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
