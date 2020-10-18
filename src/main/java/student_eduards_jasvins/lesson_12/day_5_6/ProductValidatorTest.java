package student_eduards_jasvins.lesson_12.day_5_6;

import java.util.List;

public class ProductValidatorTest {
    public static void main(String[] args) {
        ProductValidatorTest test = new ProductValidatorTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule1_v3();
        test.rule1_v4();
        test.rule1_v5();
        test.rule1_v6();
        test.rule1_v7();
        test.rule1_v8();


    }

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
            new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    void checkResult(boolean condition, String name) {
        if (condition) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }
    void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 1.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 1"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Title can't be empty"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Test.");
    }

    void rule1_v2() {
        Product product = new Product("Wa", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 2.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 2"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Title can't be shorter than 3 symbols"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Test.");
    }

    void rule1_v3() {
        Product product = new Product(manyString, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 3.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 3"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Title can't be longer than 100 symbols"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Test.");
    }

    void rule1_v4() {
        Product product = new Product("Cow:D", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 4.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 4"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Title should contain only number and letters"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Test.");
    }

    void rule1_v5() {
        Product product = new Product("Meow", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 5.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 5"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be empty"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "Test.");
    }

    void rule1_v6() {
        Product product = new Product("Meow", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 6.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 6"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be zero"), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "Test.");
    }

    void rule1_v7() {
        Product product = new Product("Meow", 1, manyString);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 7.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 7"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Description must be smaller than 2000 symbols."), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "Test.");
    }

    void rule1_v8() {
        Product product = new Product("Meow", 1, "dfgag:;'");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 8.");
        checkResult(exceptions.get(0).getRuleName().equals("Rule - 8"), "Test.");
        checkResult(exceptions.get(0).getDescription().equals("Description contain only letter or numbers."), "Test.");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "Test.");
    }





    private String manyString = "OOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +
            "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ";
}

