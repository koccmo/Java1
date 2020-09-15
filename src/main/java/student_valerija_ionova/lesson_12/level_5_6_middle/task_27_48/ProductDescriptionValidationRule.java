package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//- RULE-7: не должно быть длиннее 2000 символов
//- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы

class ProductDescriptionValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getDescription().length() > 2000) throw new ValidationException("RULE-7",
                "Description must contain less than 2000 symbols", "description");

        if (!containsOnlyLettersAndNumbers(product.getDescription())) throw new ValidationException("RULE-8",
                "Description can contain only letters and numbers", "description");
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
