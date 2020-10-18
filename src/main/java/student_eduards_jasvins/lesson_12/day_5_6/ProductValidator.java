package student_eduards_jasvins.lesson_12.day_5_6;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);
}
