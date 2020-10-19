package student_eduards_jasvins.lesson_12.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        //- RULE-1: не должно быть пустым
        rule_1(product);
        // - RULE-2: не должно быть короче 3 символов
        rule_2(product);
        //  - RULE-3: не должно быть длиннее 100 символов
        rule_3(product);
        //  - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
        rule_4(product);

    }


    private void rule_1(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("Rule - 1", "Title can't be empty", "title");
        }
    }

    private void rule_2(Product product) throws ValidationException {
        int titleLength = product.getTitle().length();
        if ((titleLength > 0) && (titleLength < 3)) {
            throw new ValidationException("Rule - 2", "Title can't be shorter than 3 symbols", "title");
        }
    }

    private void rule_3(Product product) throws ValidationException {
        int titleLength = product.getTitle().length();
        if (titleLength > 100) {
            throw new ValidationException("Rule - 3", "Title can't be longer than 100 symbols", "title");
        }
    }

    private void rule_4(Product product) throws ValidationException {
       if (!containsLetterAndNumber(product.getTitle())) {
            throw new ValidationException("Rule - 4", "Title should contain only number and letters", "title");
        }
    }
    private boolean containsLetterAndNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!(Character.isLetter(text.charAt(i))) && (!(Character.isDigit(text.charAt(i))))) {
                return false;
            }
        }
        return true;
    }

}
