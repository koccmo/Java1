package student_volodya_danilin.lesson_12.level_5;

class ProductPriceValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {

        Integer price = product.getPrice();

        if (rule5(price)) {
            throw new ValidationException("Rule 5",
                    "Price can't be blank!",
                    "Product Price");
        }

        if (rule6(price)) {
            throw new ValidationException("Rule 6",
                    "Price must be higher than 0!",
                    "Product Price");
        }

    }

    boolean rule5(Integer price) {
        return price == null;
    }

    boolean rule6(Integer price) {
        return price <= 0;
    }

}
