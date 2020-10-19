package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductPriceValidationRule implements ProductValidator {

    List<FieldValidationRule> priceRules = new ArrayList<>();
    PriceRule1 priceRule1 = new PriceRule1();
    PriceRule2 priceRule2 = new PriceRule2();
    PriceRule3 priceRule3 = new PriceRule3();

    @Override
    public List<ValidationException> validate(Product product) {

        priceRules.add(priceRule1);
        priceRules.add(priceRule2);
        priceRules.add(priceRule3);

        List<ValidationException> exceptions = new ArrayList<>();

        for (FieldValidationRule rule : priceRules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}

class PriceRule1 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5: ",
                    "Price is not specified!",
                    " found in Product Price");
        }
    }
}

class PriceRule2 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String price = product.getPrice().toString();
        if (!price.matches("\\d+")) {
            throw new ValidationException("RULE-6: ",
                    "Price can only contain numbers!",
                    " found in Product Price");
        }
    }
}

class PriceRule3 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice().equals(0)) {
            throw new ValidationException("RULE-7: ",
                    "Price can't be 0!",
                    " found in Product Price");
        }
    }
}