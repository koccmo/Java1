package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task40
//Если срабатывает одно из правил, то создавайте объект ValidationException,
//заполняйте его правильными данными и кидайте его.

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.isTitleNull()) throw new ValidationException("RULE-1", "Title can not be empty", "title");

        if (product.getTitle().equals("")) throw new ValidationException("RULE-1", "Title can not be empty", "title");

        if (product.getTitle().length() < 3) throw new ValidationException("RULE-2",
                "Title should be at least 3 symbols", "title");

        if (product.getTitle().length() > 100) throw new ValidationException("RULE-3",
                "Title should be less than 101 symbols", "title");

        if (!containsOnlyLettersAndNumbers(product.getTitle())) throw new ValidationException("RULE-4",
                "Title should contain only number and letters", "title");
    }

    private boolean containsOnlyLettersAndNumbers (String text){
        for (int i = 0; i < text.length(); i++){
            if (!(Character.isLetter(text.charAt(i))) && !(Character.isDigit(text.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}
