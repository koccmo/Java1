package student_aleksandra_maksimovic.lesson_12.level_5_6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductValidatorImplTest {

    ProductValidator validator;

    @Before
    public void init() {
        List<FieldValidationRule> rules = Arrays.asList(
                new ProductTitleValidationRule(),
                new ProductPriceValidationRule(),
                new ProductDescriptionValidationRule()
        );

        validator = new ProductValidatorImpl(rules);
    }


    /*
    К названию продукта выдвигаются следующие требования:
    - RULE-1: не должно быть пустым
    - RULE-2: не должно быть короче 3 символов
    - RULE-3: не должно быть длиннее 100 символов
    - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

    К цене продукта выдвигаются следующие требования:
    - RULE-5: не должна быть пустой
    - RULE-6: должна быть больше 0

    К описанию продукта выдвигаются следующие требования:
    - RULE-7: не должно быть длиннее 2000 символов
    - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
     */

    @Test
    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Must not be empty", "Title")));
    }

    @Test
    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Must not be empty", "Title")));
    }

    @Test
    public void rule2_v1() {
        Product product = new Product("as", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-2", "Must be at least 3 symbols", "Title")));
    }

    @Test
    public void rule3_v1() {
        Product product = new Product(getLongString(101), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-3", "Should not exceed 100 symbols", "Title")));
    }

    @Test
    public void rule4_v1() {
        Product product = new Product("abczABCZ01239", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertFalse(exceptions.contains(new ValidationException("RULE-4", "Only english letters or numbers allowed", "Title")));
    }

    @Test
    public void rule4_v2() {
        Product product = new Product("abcABC123#", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-4", "Only english letters or numbers allowed", "Title")));
    }

    @Test
    public void rule5_v1() {
        Product product = new Product("abc", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-5", "Must not be empty", "Price")));
    }

    @Test
    public void rule6_v1() {
        Product product = new Product("abc", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-6", "Must be greater then zero", "Price")));
    }

    @Test
    public void rule6_v2() {
        Product product = new Product("abc", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-6", "Must be greater then zero", "Price")));
    }

    @Test
    public void rule7_v1() {
        Product product = new Product("abc", 1, getLongString(2001));
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-7", "Should not exceed 2000 symbols", "Description")));
    }

    @Test
    public void rule8_v1() {
        Product product = new Product("abc", 1, "abczABCZ01239");
        List<ValidationException> exceptions = validator.validate(product);
        assertFalse(exceptions.contains(new ValidationException("RULE-8", "Only english letters or numbers allowed", "Description")));
    }

    @Test
    public void rule8_v2() {
        Product product = new Product("abc", 1, "abczABCZ01239~");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-8", "Only english letters or numbers allowed", "Description")));
    }

    /*
    - не правильно указано название продукта и его цена
    - не правильно указано название продукта и его описание
    - и так далее
    - не правильно указаны все три свойства!
     */

    @Test
    public void multiple_v1() {
        Product product = new Product("", -1, "abc");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Must not be empty", "Title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-6", "Must be greater then zero", "Price")));
    }

    @Test
    public void multiple_v2() {
        Product product = new Product("", -1, "~");
        List<ValidationException> exceptions = validator.validate(product);
        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Must not be empty", "Title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-6", "Must be greater then zero", "Price")));
        assertTrue(exceptions.contains(new ValidationException("RULE-8", "Only english letters or numbers allowed", "Description")));
    }


    String getLongString(int length) {
        String s = "";
        for (int i = 0; i < length; i++) {
            s += 'a';
        }
        return s;
    }
}