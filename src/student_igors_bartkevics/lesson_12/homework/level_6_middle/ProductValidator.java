package student_igors_bartkevics.lesson_12.homework.level_6_middle;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}