package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (priceIsEmpty (product.getPrice())) throw new ValidationException("Rule_5", "Empty price", "Price");

        if (priceIsZero (product.getPrice())) throw new ValidationException("Rule_6", "Price can't be 0", "Price");
    }

    private boolean priceIsEmpty (Integer price){
        return price == null;
    }

    private boolean priceIsZero (Integer price){
        return price == 0;
    }
}