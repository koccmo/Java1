package student_igors_bartkevics.lesson_12.homework.level_6_middle_task_35_to_48;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        //- RULE-5: цена продукта не должна быть пустой
        rule_5(product);
        //- RULE-6: цена продукта должна быть больше 0
        rule_6(product);

    }

    //- RULE-5: цена продукта не должна быть пустой
    private void rule_5(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }
    }

    //- RULE-6: цена продукта должна быть больше 0
    private void rule_6(Product product) throws ValidationException {
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price has to be greater than 0", "price");
        }
    }

}
