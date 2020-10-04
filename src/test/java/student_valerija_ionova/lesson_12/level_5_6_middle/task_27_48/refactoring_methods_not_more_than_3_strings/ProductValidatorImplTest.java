package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductValidatorImplTest {

    ProductValidator productValidator = new ProductValidatorImpl(new ProductTitleValidationRule(),
            new ProductPriceValidationRule(), new ProductDescriptionValidationRule());


    @Test
    public void testRule1(){
        Product product = new Product("", 100, "SweetMilk");
        ValidationException validationException = new ValidationException("Rule_1", "Empty title", "Title");
        assertTrue(productValidator.validate(product).contains(validationException));
        assertTrue(productValidator.validate(product).size() == 1);
    }

    @Test
    public void testRule1Null(){
        Product product = new Product(null, 100, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_1", "Empty title", "Title"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule2(){
        Product product = new Product("Mi", 100, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_2", "Title must be at least 3 symbols", "Title"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule3(){
        Product product = new Product(longName, 100, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_3", "Title must be at least 3 symbols", "Title"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule4(){
        Product product = new Product("Milk:)", 100, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_4", "Title can contain only digits and letters", "Title"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule5(){
        Product product = new Product("Milk", null, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_5", "Empty price", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule6(){
        Product product = new Product("Milk", 0, "SweetMilk");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_6", "Price can't be 0", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule7(){
        Product product = new Product("Milk", 3, longName);
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_7", "Description can't be longer than 2000 symbols", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRule8(){
        Product product = new Product("Milk", 8, "Description:)");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_8", "Description can contain only letters and digits", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 1);
    }

    @Test
    public void testRuleValid(){
        Product product = new Product("Milk", 2, "Description");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 0);
    }

    @Test
    public void testRule1And5(){
        Product product = new Product(null, null, "Description");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_1", "Empty title", "Title"));
        exceptionsExpected.add(new ValidationException("Rule_5", "Empty price", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 2);
    }

    @Test
    public void testRule3And6(){
        Product product = new Product(longName, 0, "Description");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_3", "Title must be at least 3 symbols", "Title"));
        exceptionsExpected.add(new ValidationException("Rule_6", "Price can't be 0", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 2);
    }

    @Test
    public void testRule4And7(){
        Product product = new Product("Milk:)", 2, longName);
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_4", "Title can contain only digits and letters", "Title"));
        exceptionsExpected.add(new ValidationException("Rule_7", "Description can't be longer than 2000 symbols", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 2);
    }

    @Test
    public void testRule3And5And8(){
        Product product = new Product(longName, null, "Description:)");
        List<ValidationException> exceptionsExpected = new ArrayList<>();
        exceptionsExpected.add(new ValidationException("Rule_3", "Title must be at least 3 symbols", "Title"));
        exceptionsExpected.add(new ValidationException("Rule_5", "Empty price", "Price"));
        exceptionsExpected.add(new ValidationException("Rule_8", "Description can contain only letters and digits", "Price"));
        assertEquals(exceptionsExpected, productValidator.validate(product));
        assertTrue(exceptionsExpected.size() == 3);
    }

    String longName = "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
}
