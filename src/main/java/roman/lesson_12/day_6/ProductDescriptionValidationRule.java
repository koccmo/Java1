package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ValidationException;

public class ProductDescriptionValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {
        descriptionMustBeLessThanTwoThousand(product);
        descriptionOnlyEnglishLetterAndNumbers(product);
    }

    private void descriptionMustBeLessThanTwoThousand(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("descriptionMustBeLess2000Symbols", "Description Must Be Less 2000 Symbols!",
                    "description");
        }
    }

    private void descriptionOnlyEnglishLetterAndNumbers(Product product) throws ValidationException {
        if (!englishLetterAndNumbersOnly(product.getDescription())) {
            throw new ValidationException("descriptionMustContainEnglishLettersAndNumbers",
                    "Description must contain only English letters and numbers",
                    "description");
        }
    }

    private boolean englishLetterAndNumbersOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!onlyEnglishLetters(text.charAt(i)) && !Character.isDigit(text.charAt(i)) && !Character.isSpaceChar(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean onlyEnglishLetters(Character character) {
        return ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
    }


}
