package student_aleksandra_maksimovic.lesson_12.level_5_6;

public class ProductTitleValidationRule implements FieldValidationRule {

    /*
    К названию продукта выдвигаются следующие требования:
    - RULE-1: не должно быть пустым
    - RULE-2: не должно быть короче 3 символов
    - RULE-3: не должно быть длиннее 100 символов
    - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
    */

    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getTitle();

        if (title == null || title.length() == 0) {
            throw new ValidationException("RULE-1", "Must not be empty", "Title");
        }

        if (title.length() < 3) {
            throw new ValidationException("RULE-2", "Must be at least 3 symbols", "Title");
        }

        if (title.length() > 100) {
            throw new ValidationException("RULE-3", "Should not exceed 100 symbols", "Title");
        }

        if (!StringUtils.isEnglishOrNumericString(title)) {
            throw new ValidationException("RULE-4", "Only english letters or numbers allowed", "Title");
        }
    }
}
