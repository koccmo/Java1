package student_aleksandra_maksimovic.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> result = new ArrayList<>();
        result.addAll(validateTitle(product.getTitle()));
        result.addAll(validatePrice(product.getPrice()));
        result.addAll(validateDescription(product.getDescription()));
        return result;
    }


    boolean isEnglishOrNumericString(String string)
    {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean isNumber = c >= '0' && c <= '9';

            if (!isLetter && !isNumber) {
                return false;
            }
        }

        return true;
    }

    /*
    К названию продукта выдвигаются следующие требования:
    - не должно быть пустым
    - не должно быть короче 3 символов
    - не должно быть длиннее 100 символов
    - должно содержать только английские буквы и цифры, другие символы не допустимы
    */
    List<ValidationException> validateTitle(String title)
    {
        List<ValidationException> result = new ArrayList<>();

        if (title.length() == 0) {
            result.add(new ValidationException("Non empty", "Must not be empty", "Title"));
        }

        if (title.length() < 3) {
            result.add(new ValidationException("Min 3 symbols", "Must be at least 3 symbols", "Title"));
        }

        if (title.length() > 100) {
            result.add(new ValidationException("Max 100 symbols", "Should not exceed 100 symbols", "Title"));
        }

        if (!isEnglishOrNumericString(title)) {
            result.add(new ValidationException("English or numbers", "Only english letters or numbers allowed", "Title"));
        }

        return result;
    }

    /*
    К цене продукта выдвигаются следующие требования:
    - не должна быть пустой
    - должна содержать только цифры
    - не может быть 0
    */
    List<ValidationException> validatePrice(Integer price)
    {
        List<ValidationException> result = new ArrayList<>();

        if (price == null)
        {
            result.add(new ValidationException("Non empty", "Must not be empty", "Price"));
        }

        if (price <= 0) {
            result.add(new ValidationException("Positive", "Must be greater then zero", "Price"));
        }

        return result;
    }


    /*
    К описанию продукта выдвигаются следующие требования:
    - не должно быть длиннее 2000 символов
    - должно содержать только английские буквы и цифры, другие символы не допустимы
    */
    List<ValidationException> validateDescription(String description)
    {
        List<ValidationException> result = new ArrayList<>();

        if (description.length() > 2000) {
            result.add(new ValidationException("Max 2000 symbols", "Should not exceed 2000 symbols", "Description"));
        }

        if (!isEnglishOrNumericString(description)) {
            result.add(new ValidationException("English or numbers", "Only english letters or numbers allowed", "Description"));
        }

        return result;
    }
}
