package student_volodya_danilin.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {

        String description = product.getDescription();

        if (rule7(description)) {
            throw new ValidationException("Rule 7",
                    "Description is too long! Max 2000 characters!",
                    "Product Description");
        }

        if (rule8(description)) {
            throw new ValidationException("Rule 8",
                    "Description can only contain English and numbers!",
                    "Product Description");
        }

    }

    boolean rule7(String description) {
        return description.length() > 2000;
    }

    boolean rule8(String description) {
        return !description.matches("^\\w+$");
    }
}
