package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

class ProductTitleValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (emptyTitle(product.getTitle()))
            throw new ValidationException("Rule_1", "Empty title", "Title");

        if (titleShorterThan3Symbols(product.getTitle()))
            throw new ValidationException("Rule_2", "Title must be at least 3 symbols", "Title");

        if (titleLongerThan100Symbols(product.getTitle()))
            throw new ValidationException("Rule_3", "Title must be at least 3 symbols", "Title");

        if (!containsOnlyDigitsAndLetters (product.getTitle()))
            throw new ValidationException("Rule_4", "Title can contain only digits and letters", "Title");
    }

    private boolean emptyTitle (String title){
        return (title == null) || (title.equals(""));
    }

    private boolean titleShorterThan3Symbols (String title){
        return title.length() < 3;
    }

    private boolean titleLongerThan100Symbols (String title){
        return title.length() > 100;
    }

    private boolean containsOnlyDigitsAndLetters(String title){
        for (int i = 0; i < title.length(); i++){
            if (!(Character.isLetter(title.charAt(i))) && !(Character.isDigit(title.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
