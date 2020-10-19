package student_eduards_jasvins.lesson_12.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductPriceValidationRule {

    public void validate(Product product) throws ValidationException {

        // - RULE-5: цена продукта не должна быть пустой
        rule_5(product);
        // - RULE-6: цена продукта должна быть больше 0
        rule_6(product);
    }

    private void  rule_5(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("Rule - 5", "Price can't be empty", "price");
        }
    }

    private void  rule_6(Product product) throws ValidationException {
        if (product.getPrice() <= 0) {
            throw new ValidationException("Rule - 6", "Price can't be zero", "price");
        }
    }
 }
