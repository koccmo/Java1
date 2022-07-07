package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ValidationException;


public class ProductTitleValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        titleMustBeFilledUp(product);
        titleNotShorterThreeSymbols(product);
        titleNotLongerThanHundredSymbols(product);
        titleMustContainEnglishLetterAndNumberOnly(product);
    }

    private void titleMustBeFilledUp(Product product) throws ValidationException {
        if (product.getTitle() == null  || product.getTitle().equals("")) {
            throw new ValidationException("titleMustBeFilledUp", "Product Title Can't be Empty", "title");
        }
    }

    private void titleNotShorterThreeSymbols(Product product) throws ValidationException {
        if (product.getTitle().length() < 3) {
            throw new ValidationException("titleNotShorterThreeSymbols", "Product Title Can't be shorter than 3 symbols", "title");
        }
    }

    private void titleNotLongerThanHundredSymbols(Product product) throws ValidationException {
        if (product.getTitle().length() > 100) {
            throw new ValidationException("productTitleNotLongerThan100Symbols", "Product Title can't be longer than 100 symbols", "title");
        }
    }

    private void titleMustContainEnglishLetterAndNumberOnly(Product product) throws ValidationException{
        if (!containsLettersAndNumbersOnly(product.getTitle())) {
            throw new ValidationException("titleMustContainEnglishLettersAndNumbers", "Title must contain only English letters and numbers", "title");
        }
    }

    private boolean containsLettersAndNumbersOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!onlyEnglishLetters(text.charAt(i)) && !(Character.isDigit(text.charAt(i))) && !(Character.isSpaceChar(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean onlyEnglishLetters(Character character) {
        return ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
    }


}
