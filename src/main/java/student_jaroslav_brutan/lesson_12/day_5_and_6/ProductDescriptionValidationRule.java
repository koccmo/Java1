package student_jaroslav_brutan.lesson_12.day_5_and_6;

public class ProductDescriptionValidationRule implements FieldValidationRule{

    public void validate(Product product) throws ValidationException{
        if (product.getDescription().length() > 2000){
            throw new ValidationException("Rule-7","Product description shouldn't be more than 2000 symbols","description");
        }
        if (!textContainsOnlyLettersAndNumbers(product.getDescription()))
            throw new ValidationException("Rule-8","Description text can contain only letters and numbers","description");
    }

    private boolean textContainsOnlyLettersAndNumbers(String text){
        for (int i = 0; i < text.length(); i++){
            if ((Character.isLetter(text.charAt(i))) && (Character.isDigit(text.charAt(i)))){
                return true;
            }
        } return false;
    }

}
