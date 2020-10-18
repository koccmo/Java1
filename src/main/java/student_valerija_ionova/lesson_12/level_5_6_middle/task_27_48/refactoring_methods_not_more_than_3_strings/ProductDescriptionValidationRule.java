package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (descriptionLongerThan2000Symbols(product.getDescription()))
            throw new ValidationException("Rule_7", "Description can't be longer than 2000 symbols", "Price");

        if (!descriptionContainsOnlyDigitsAndLetters(product.getDescription()))
            throw new ValidationException("Rule_8", "Description can contain only letters and digits", "Price");
    }

    private boolean descriptionLongerThan2000Symbols(String description) {
        return description.length() > 2000;
    }

    private boolean descriptionContainsOnlyDigitsAndLetters(String description) {
        for (int i = 0; i < description.length(); i++) {
            if (!(Character.isLetter(description.charAt(i))) && !(Character.isDigit(description.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}