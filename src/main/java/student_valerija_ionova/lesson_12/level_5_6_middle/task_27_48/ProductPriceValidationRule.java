package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//- RULE-5: не должна быть пустой
//- RULE-6: должна быть больше 0

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductPriceValidationRule implements FieldValidationRule{


    @Override
    public void validate(Product product) throws ValidationException {

        if (product.isPriceNull()) throw new ValidationException("RULE-5", "Price can not be empty","price");

        if (product.getPrice() <= 0) throw new ValidationException("RULE-6", "Price must be bigger than 0", "price");
    }


}