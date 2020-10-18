package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
    // получает продукт и в случае ошибки кидает ошибку в которой
    // указано название правила, описание ошибки и название поля

}
