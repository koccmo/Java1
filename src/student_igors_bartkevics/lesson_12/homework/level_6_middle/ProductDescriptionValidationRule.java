package student_igors_bartkevics.lesson_12.homework.level_6_middle;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        //- RULE-7: не должно быть длиннее 2000 символов
        rule_7(product);
        //- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
        rule_8(product);
    }

    //- RULE-7: не должно быть длиннее 2000 символов
    private void rule_7(Product product) throws ValidationException {
        int descriptionLength = product.getDescription().length();
        if (descriptionLength > 2000) {
            throw new ValidationException("RULE-7", "Description can not be longer than 2000 symbols", "description");
        }
    }

    //- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
    private void rule_8(Product product) throws ValidationException {
        StringFieldValueValidator validator = new StringFieldValueValidator();
        if (!validator.stringContainsLettersSpaceAndNumbers(product.getDescription())) {
            throw new ValidationException("RULE-8", "Description can contain only english letters and numbers", "description");
        }
    }

}
