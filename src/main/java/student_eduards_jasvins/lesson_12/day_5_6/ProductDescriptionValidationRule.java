package student_eduards_jasvins.lesson_12.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDescriptionValidationRule {

    public void validate(Product product) throws ValidationException {

        //- RULE-7: не должно быть длиннее 2000 символов
        rule_7(product);
        //- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
        rule_8(product);

    }

    private void rule_7(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("Rule - 7", "Description must be smaller than 2000 symbols.", "description");
        }
    }

    private void rule_8(Product product) throws ValidationException {
        if (!containsLetterAndNumber(product.getDescription())) {
            throw new ValidationException("Rule - 8", "Description contain only letter or numbers.", "description");
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