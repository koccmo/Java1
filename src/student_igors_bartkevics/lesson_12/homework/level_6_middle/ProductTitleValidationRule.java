package student_igors_bartkevics.lesson_12.homework.level_6_middle;

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        //- RULE-1: не должно быть пустым
        rule_1(product);
        //- RULE-2: не должно быть короче 3 символов
        rule_2(product);
        //- RULE-3: не должно быть длиннее 100 символов
        rule_3(product);
        //- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
        rule_4(product);
    }

    //- RULE-1: название продукта не должно быть пустым
    private void rule_1(Product product) throws ValidationException{
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
    }

    //- RULE-2: название продукта не должно быть короче 3 символов
    private void rule_2(Product product) throws ValidationException{
        int titleLength = product.getTitle().length();
        if ((titleLength > 0) && (titleLength < 3)) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        }
    }

    //- RULE-3: название продукта не должно быть длиннее 100 символов
    private void rule_3(Product product) throws ValidationException{
        int titleLength = product.getTitle().length();
        if (titleLength > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        }
    }

    //- RULE-4: название продукта должно содержать только английские буквы и цифры, другие символы не допустимы
    private void rule_4(Product product) throws ValidationException{
        StringFieldValueValidator validator = new StringFieldValueValidator();
        if (!validator.stringContainsLettersSpaceAndNumbers(product.getTitle())) {
            throw new ValidationException("RULE-4", "Title can contain only english letters and numbers", "title");
        }
    }

}
