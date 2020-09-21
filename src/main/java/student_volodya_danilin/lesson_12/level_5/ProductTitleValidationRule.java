package student_volodya_danilin.lesson_12.level_5;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        String title = product.getTitle();

        if (rule1(title)) {
            throw new ValidationException("Rule 1",
                    "Title can't be blank!",
                    "Product Title");
        }

        if (rule2(title)) {
            throw new ValidationException("Rule 2",
                    "Title is too short! Minimum - 3 characters!",
                    "Product Title");
        }

        if (rule3(title)) {
            throw new ValidationException("Rule 3",
                    "Title is too long! Max - 100 characters!",
                    "Product Title");
        }

        if (rule4(title)) {
            throw new ValidationException("Rule 4",
                    "Title can only contain English and numbers!",
                    "Product Title");

        }

    }

     private boolean rule1(String title) {
        return title.isBlank();
    }

    private boolean rule2(String title) {
        return title.length() < 3;
    }

    private boolean rule3(String title) {
        return title.length() > 100;
    }

    private boolean rule4(String title) {
        //должно содержать только английские буквы и цифры
        return !title.matches("^\\w+$");
    }
}
