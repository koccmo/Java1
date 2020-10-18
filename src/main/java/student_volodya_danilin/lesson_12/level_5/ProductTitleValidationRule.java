package student_volodya_danilin.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

class ProductTitleValidationRule implements ProductValidator {

    List<FieldValidationRule> titleRules = new ArrayList<>();
    TitleRule1 titleRule1 = new TitleRule1();
    TitleRule2 titleRule2 = new TitleRule2();
    TitleRule3 titleRule3 = new TitleRule3();
    TitleRule4 titleRule4 = new TitleRule4();

    @Override
    public List<ValidationException> validate(Product product) {

        List<ValidationException> exceptions = new ArrayList<>();

        titleRules.add(titleRule1);
        titleRules.add(titleRule2);
        titleRules.add(titleRule3);
        titleRules.add(titleRule4);

        for (FieldValidationRule rule : titleRules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}

class TitleRule1 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle().isBlank()) {
            throw new ValidationException("RULE-1: ",
                    "Title can't be blank!",
                    " found in Product Title");
        }
    }
}

class TitleRule2 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2: ",
                    "Title can't be shorter than 3 characters!",
                    " found in Product Title");
        }
    }
}

class TitleRule3 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3: ",
                    "Title can't be longer than 100 characters!",
                    " found in Product Title");
        }
    }
}

class TitleRule4 implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (!product.getTitle().matches("\\w+\\d+")) {
            throw new ValidationException("RULE-4: ",
                    "Title can only contain English and numbers!",
                    " found in Product Title");
        }
    }
}