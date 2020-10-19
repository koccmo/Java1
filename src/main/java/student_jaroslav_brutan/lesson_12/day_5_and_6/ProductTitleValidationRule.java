package student_jaroslav_brutan.lesson_12.day_5_and_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductTitleValidationRule implements FieldValidationRule{

    public void validate(Product product) throws ValidationException {
        if (product.isTitleNull() || product.getTitle().equals(""))
            throw new ValidationException("Rule-1", "Title can't be empty", "title");
        if (product.getTitle().length() < 3)
            throw new ValidationException("Rule-2", "Title should be 3 or more symbols", "title");
        if (product.getTitle().length() > 100)
            throw new ValidationException("Rule-3", "Title can't be more than 100 symbols", "title");
        if (!textContainsOnlyLettersAndNumbers(product.getTitle()))
            throw new ValidationException("Rule-1","Title should contain only letters and numbers","title");
    }

    private boolean textContainsOnlyLettersAndNumbers(String text){
        for (int i = 0; i < text.length(); i++){
            if ((Character.isLetter(text.charAt(i))) && (Character.isDigit(text.charAt(i)))){
                return true;
            }
        } return false;
    }
}
