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
package student_igors_bartkevics.lesson_12.homework.level_6_middle;

import java.util.List;

class ProductValidatorImplTest {

    ProductValidator validator = new ProductValidatorImpl();

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4_v1();
        test.rule4_v2();
        test.rule4_v3();
        test.rule5();
        test.rule6();
        test.rule7();
        test.rule8_v1();
        test.rule8_v2();
        test.rule8_v3();


        // тесты на остальные правила допишите по аналогии
        // тестов будет много! напишите их все!
        // они пишутся легко, и если вы напишите их все то ваше решение будет полностью протестировано!
    }
    //RULE-1: название не должно быть пустым
    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    //RULE-2: название не должно быть короче 3 символов
    public void rule2() {
        Product product = new Product("ti", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "rule2");
    }

    //RULE-3: название не должно быть длиннее 100 символов
    public void rule3() {
        String title = "This is very long product title value that exceeds hundred words and matches the rule number three condition";
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "rule3");
    }

    //RULE-4: название должно содержать только английские буквы и цифры, другие символы не допустимы
    public void rule4_v1() {
        String title = "Название";
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain only english letters and numbers"), "rule4");
    }

    public void rule4_v2() {
        String title = "Title_1";
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain only english letters and numbers"), "rule4");
    }

    public void rule4_v3() {
        String title = "Title.1";
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain only english letters and numbers"), "rule4");
    }

    //RULE-5: цена не должна быть пустой
    public void rule5() {
        Product product = new Product("title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    //RULE-6: цена должна быть больше 0
    public void rule6() {
        Product product = new Product("title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price has to be greater than 0"), "rule6");
    }

    //RULE-7: описание не должно быть длиннее 2000 символов
    public void rule7() {
        String description = "This is very long product description value that exceeds 2000 words and matches the rule number three condition " +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition" +
                "This is very long product description value that exceeds 2000 words and matches the rule number three condition";

        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 symbols"), "rule7");
    }

    //RULE-8: описание должно содержать только английские буквы и цифры, другие символы не допустимы
    public void rule8_v1() {
        String description = "Описание";
        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only english letters and numbers"), "rule4");
    }

    public void rule8_v2() {
        String description = "Description_1";
        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only english letters and numbers"), "rule4");
    }

    public void rule8_v3() {
        String description = "Description?";
        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only english letters and numbers"), "rule4");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
