package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();

        test.rule1_null();
        test.rule1_0symbols();

        test.rule2_2symbols();

        test.rule3_101symbols();

        test.rule4_not_correct_symbols();

        test.rule5_null();

        test.rule6_0_price();
        test.rule6_0_price_negative();

        test.rule7_too_long_description();

        test.rule8_contains_not_correct_symbols();

        test.rules_ok();

        test.rule1and5();
        test.rule2and6();
        test.rule3and7();
        test.rule4and6();

    }

    //- RULE-1: Название не должно быть пустым
    public void rule1_null() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_null");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_null");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1_null");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_null");
    }

    public void rule1_0symbols() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_null");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_0symbols");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1_0symbols");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_0symbols");
    }

    //- RULE-2: не должно быть короче 3 символов
    public void rule2_2symbols() {
        Product product = new Product("Ca", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2_2symbols");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2_2symbols");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2_2symbols");
        checkResult(exceptions.get(0).getDescription().equals("Title should be at least 3 symbols"),
                "rule2_2symbols");
    }

    //- RULE-3: не должно быть длиннее 100 символов
    public void rule3_101symbols() {
        Product product = new Product(longString, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3_101symbols");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3_101symbols");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3_101symbols");
        checkResult(exceptions.get(0).getDescription().equals("Title should be less than 101 symbols"),
                "rule3_101symbols");
    }

    //- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
    public void rule4_not_correct_symbols() {
        Product product = new Product("Milk:)", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4_not_correct_symbols");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4_not_correct_symbols");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4_not_correct_symbols");
        checkResult(exceptions.get(0).getDescription().equals("Title should contain only number and letters"),
                "rule4_not_correct_symbols");
    }

    //- RULE-5: цена не должна быть пустой
    public void rule5_null() {
        Product product = new Product("Milk", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5_null");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5_null");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5_null");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5_null");
    }

    //- RULE-6: должна быть больше 0
    public void rule6_0_price() {
        Product product = new Product("Milk", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6_0_price");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6_0_price");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6_0_price");
        checkResult(exceptions.get(0).getDescription().equals("Price must be bigger than 0"), "rule6_0_price");
    }

    public void rule6_0_price_negative() {
        Product product = new Product("Milk", -25, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6_0_price_negative");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6_0_price_negative");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6_0_price_negative");
        checkResult(exceptions.get(0).getDescription().equals("Price must be bigger than 0"), "rule6_0_price_negative");
    }

    //- RULE-7: не должно быть длиннее 2000 символов
    public void rule7_too_long_description() {
        Product product = new Product("Milk", 1, longString);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7_too_long_description");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7_too_long_description");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7_too_long_description");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain less than 2000 symbols"), "rule7_too_long_description");
    }

    //- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
    public void rule8_contains_not_correct_symbols() {
        Product product = new Product("Milk", 1, "description:)");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8_contains_not_correct_symbols");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8_contains_not_correct_symbols");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8_contains_not_correct_symbols");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only letters and numbers"),
                "rule8_contains_not_correct_symbols");
    }

    public void rules_ok() {
        Product product = new Product("Milk", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 0, "rules_ok");
    }

    public void rule1and5() {
        Product product = new Product(null, null, "IDontKnowWhatIsIt");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1and5");

        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")),
                "rule1and5");
        checkResult(exceptions.contains(new ValidationException("RULE-5", "Price can not be empty","price")),
                "rule1and5");
    }

    public void rule2and6() {
        Product product = new Product("Br", 0, "IDontKnowWhatIsIt");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule2and6");

        checkResult(exceptions.contains(new ValidationException("RULE-2",
                "Title should be at least 3 symbols", "title")), "rule2and6");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be bigger than 0", "price")),
                "rule2and6");
    }

    public void rule3and7() {
        Product product = new Product(longString, 2, longString);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule3and7");

        checkResult(exceptions.contains(new ValidationException("RULE-3",
                "Title should be less than 101 symbols", "title")), "rule3and7");
        checkResult(exceptions.contains(new ValidationException("RULE-7",
                        "Description must contain less than 2000 symbols", "description")),
                "rule3and7");
    }

    public void rule4and6() {
        Product product = new Product("Smile:)", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule4and6");

        checkResult(exceptions.contains(new ValidationException("RULE-4",
                "Title should contain only number and letters", "title")), "rule4and6");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be bigger than 0", "price")),
                "rule4and6");
    }

    public void rule5and8() {
        Product product = new Product("Smile", null, "description:)");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule5and8");

        checkResult(exceptions.contains(new ValidationException("RULE-5", "Price can not be empty","price")), "rule5and8");
        checkResult(exceptions.contains(new ValidationException("RULE-8",
                        "Description can contain only letters and numbers", "description")),
                "rule5and8");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    private String longString = "1111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
            "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
            "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
            "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
            "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
}