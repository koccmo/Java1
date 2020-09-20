package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ValidationTests {

    ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();

    ProductValidatorImpl validatorImpl = new ProductValidatorImpl(titleValidationRule,
            priceValidationRule, descriptionValidationRule);

    List<ValidationException> exceptions = new ArrayList<>();

    public static void main(String[] args) {

        ValidationTests tests = new ValidationTests();
        tests.testRule1();
        tests.testRule2();
        tests.testRule3();
        tests.testRule4();
        tests.testRule5();
        tests.testRule6();
        tests.testRule7();
        tests.testRule8();
        tests.testSeveralRules();


    }

    void testRule1() {
        System.out.println("Testing rule 1 ... ");
        Product product = new Product("", 100, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 1");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule2() {
        System.out.println("Testing rule 2 ... ");
        Product product = new Product("12", 100, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 2");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule3() {
        System.out.println("Testing rule 3 ... ");
        String productName = "";
        while (productName.length() <= 100) {
            productName += "ababababa";
        }
        Product product = new Product(productName, 100, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 3");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule4() {
        System.out.println("Testing rule 4 ... ");
        Product product = new Product("яман", 100, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 4");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule5() {
        System.out.println("Testing rule 5 ... ");
        Product product = new Product("name", null, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 5");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule6() {
        System.out.println("Testing rule 6 ... ");
        Product product = new Product("name", 0, "desc");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 6");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule7() {
        System.out.println("Testing rule 7 ... ");
        String description = "";
        while (description.length() <= 2000) {
            description += "ababababa";
        }
        Product product = new Product("name", 100, description);
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 7");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testRule8() {
        System.out.println("Testing rule 8 ... ");
        Product product = new Product("name", 100, "русский");
        exceptions = validatorImpl.validate(product);
        checkForRule("Rule 8");
        printAllCurrentExceptions();
        exceptions.clear();
    }

    void testSeveralRules() {
        System.out.println("Breaking several rules ... ");
        Product product = new Product("я", -100, "$%^!@#");
        exceptions = validatorImpl.validate(product);
        printAllCurrentExceptions();
        exceptions.clear();
        /*
        почему-то видит только по 1 правилу из каждой категории
        (название и слишком короткое и содержит забаненые символы)
         */
    }

    void checkForRule(String ruleName) {
        for (ValidationException value : exceptions) {
            if (value.getRuleName().equals(ruleName)) {
                System.out.println("Test OK");
            }
            else {
                System.out.println("Test FAIL");
            }
        }
    }

    void printAllCurrentExceptions() {
        for (ValidationException value : exceptions) {
            value.printException();
        }
    }

}
