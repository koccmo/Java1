package student_anvars_intezars.home_tasks.lesson_12.level_5;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);
}
