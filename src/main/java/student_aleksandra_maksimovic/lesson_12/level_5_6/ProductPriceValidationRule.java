package student_aleksandra_maksimovic.lesson_12.level_5_6;

public class ProductPriceValidationRule implements FieldValidationRule {

    /*
       К цене продукта выдвигаются следующие требования:
            - RULE-5: не должна быть пустой
            - RULE-6: должна быть больше 0
    */

    @Override
    public void validate(Product product) throws ValidationException {
        Integer price = product.getPrice();

        if (price == null) {
            throw new ValidationException("RULE-5", "Must not be empty", "Price");
        }

        if (price <= 0) {
            throw new ValidationException("RULE-6", "Must be greater then zero", "Price");
        }
    }
}
