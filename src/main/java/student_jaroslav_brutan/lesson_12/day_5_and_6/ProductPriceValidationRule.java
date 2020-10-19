package student_jaroslav_brutan.lesson_12.day_5_and_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductPriceValidationRule implements FieldValidationRule{

    public void validate(Product product) throws ValidationException {
        if (product.isPriceNull()){
            throw new ValidationException("Rule-5", "Price field can't be empty", "price");
        }
        if (product.getPrice() <= 0){
            throw new ValidationException("Rule-6", "Price should ne more than zero", "price");
        }
    }
}
