package student_aleksandra_maksimovic.lesson_12.level_5_6;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    /*
    К описанию продукта выдвигаются следующие требования:
    - RULE-7: не должно быть длиннее 2000 символов
    - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
     */

    @Override
    public void validate(Product product) throws ValidationException {
        String description = product.getDescription();

        if (description.length() > 2000) {
            throw new ValidationException("RULE-7", "Should not exceed 2000 symbols", "Description");
        }

        if (!StringUtils.isEnglishOrNumericString(description)) {
            throw new ValidationException("RULE-8", "Only english letters or numbers allowed", "Description");
        }
    }
}
