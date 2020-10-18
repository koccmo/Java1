package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ProductDescriptionValidationRule implements ProductValidator {

    List<FieldValidationRule> descriptionRules = new ArrayList<>();
    DescriptionRule1 descriptionRule1 = new DescriptionRule1();
    DescriptionRule2 descriptionRule2 = new DescriptionRule2();

    @Override
    public List<ValidationException> validate(Product product) {

        descriptionRules.add(descriptionRule1);
        descriptionRules.add(descriptionRule2);

        List<ValidationException> exceptions = new ArrayList<>();

        for (FieldValidationRule rule : descriptionRules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}

class DescriptionRule1 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-8: ",
                    "Description can't be longer than 2000 characters!",
                    " found in Product Description");
        }
    }
}

class DescriptionRule2 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (!product.getDescription().matches("\\w+\\d+")) {
            throw new ValidationException("RULE-9: ",
                    "Description can only contain English and numbers!",
                    " found in Product Description");
        }
    }
}