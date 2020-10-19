package student_jaroslav_brutan.lesson_12.day_5_and_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductValidatorImplTest {

        private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
                new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1();
        test.rule1_v2();

    }

    public void rule1(){
        Product product = new Product(null,1,"description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule-1");
        checkResults(exceptions.get(0).getRuleName().equals("Rule-1"),"rule-1");
        checkResults(exceptions.get(0).getFieldName().equals("title"),"rule-1");
        checkResults(exceptions.get(0).getDescription().equals("Title can't be empty"), "rule-1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_v2");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1_v2");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_v2");
    }



    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
