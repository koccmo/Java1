package student_igors_bartkevics.lesson_12.homework.level_6_middle;

import java.util.Objects;

class ValidationException extends Exception {

    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;

    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fieldName;

    // создайте конструктор
    ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    // создайте только get

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fieldName, that.fieldName);
    }

}