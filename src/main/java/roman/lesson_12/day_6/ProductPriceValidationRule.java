package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ValidationException;

public class ProductPriceValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {
        productPriceNotEmpty(product);
        productPriceMustBeOverZero(product);
    }

    private void productPriceNotEmpty(Product product) throws ValidationException{
        if (product.getPrice() == null) {
            throw new ValidationException("productPriceNotEmpty", "Price can't be empty", "price");
        }
    }

    private void productPriceMustBeOverZero(Product product) throws ValidationException {
        if (product.getPrice() <= 0) {
            throw new ValidationException("productPriceMustBeOverZero", "Price is Lower than Zero!", "price");}
    }


}
